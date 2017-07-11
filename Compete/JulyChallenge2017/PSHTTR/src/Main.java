
/*
 * Created by Thomas Boulbes
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main {

	/**
	 * The Class Vertex.
	 */
	public static class Vertex {

		/** The name. */
		public final String name;

		/** The adj. */
		public List<Edge> adj;

		/** The prev. */
		public Vertex prev;

		/** The cost. */
		public int cost = 0;

		/** The is visited. */
		public boolean isVisited = false;

		/**
		 * Sets the visited.
		 *
		 * @param isVisited
		 *            the new visited
		 */
		public void setVisited(boolean isVisited) {
			this.isVisited = isVisited;
		}

		/**
		 * Gets the cost.
		 *
		 * @return the cost
		 */
		public int getCost() {
			return cost;
		}

		/**
		 * Instantiates a new vertex.
		 *
		 * @param argName
		 *            the arg name
		 */
		public Vertex(String argName) {
			name = argName;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#toString()
		 */
		public String toString() {
			return name;
		}

	}

	/**
	 * The Class Edge.
	 */
	public static class Edge {

		/** The target. */
		public final Vertex target;

		/** The weight. */
		public final int weight;

		/**
		 * Instantiates a new edge.
		 *
		 * @param argTarget
		 *            the arg target
		 * @param argWeight
		 *            the arg weight
		 */
		public Edge(Vertex argTarget, int argWeight) {
			target = argTarget;
			weight = argWeight;
		}
	}

	/**
	 * The Class Dijkstra.
	 */
	public static class Dijkstra {

		/** The vertex map. */
		private Map<String, Vertex> vertexMap;

		/** The max cost. */
		private int maxCost;

		/**
		 * Clear all.
		 */
		public void clearAll() {
			for (Entry<String, Vertex> entry : vertexMap.entrySet()) {
				entry.getValue().cost = 0;
				entry.getValue().setVisited(false);
				entry.getValue().prev = null;
			}
		}

		/**
		 * Recursive DFS.
		 *
		 * @param start
		 *            the start
		 * @param end
		 *            the end
		 */
		public void recursiveDFS(Vertex start, Vertex end) {
			if (!start.name.equals(end.name)) {
				start.setVisited(true);
				Iterator<Edge> it = start.adj.iterator();
				while (it.hasNext()) {
					Edge e = it.next();
					Vertex v = e.target;
					if (!v.isVisited) {
						v.prev = start;
						v.cost = (e.weight <= maxCost) ? v.prev.cost ^ e.weight : v.prev.cost;
						recursiveDFS(v, end);
					}
				}
			}
		}

		/**
		 * Sets the vertex map.
		 *
		 * @param vertexMap
		 *            the vertex map
		 */
		public void setVertexMap(Map<String, Vertex> vertexMap) {
			this.vertexMap = vertexMap;
		}

		/**
		 * Sets the max cost.
		 *
		 * @param maxCost
		 *            the new max cost
		 */
		public void setMaxCost(int maxCost) {
			this.maxCost = maxCost;
		}

	}

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static void main(String[] args) throws IOException {
		FastReader rdr = new FastReader();
		PrintWriter stdout = new PrintWriter(System.out);
		int T = rdr.nextInt();
		while (T-- > 0) {
			int n = rdr.nextInt();
			Dijkstra d = new Dijkstra();
			Map<String, Vertex> vertices = new HashMap<String, Vertex>();
			d.setVertexMap(vertices);
			for (int i = 1; i <= n; i++) {
				Vertex vertex = new Vertex(Integer.toString(i));
				vertex.adj = new ArrayList<Edge>();
				vertices.put(Integer.toString(i), vertex);
			}
			for (int i = 0; i < n - 1; i++) {
				Vertex u = vertices.get(Integer.toString(rdr.nextInt())),
						v = vertices.get(Integer.toString(rdr.nextInt()));
				int c = rdr.nextInt();
				u.adj.add(new Edge(v, c));
				v.adj.add(new Edge(u, c));
			}
			int m = rdr.nextInt();
			for (int i = 0; i < m; i++) {
				Vertex u = vertices.get(Integer.toString(rdr.nextInt())),
						v = vertices.get(Integer.toString(rdr.nextInt()));
				int k = rdr.nextInt();
				d.clearAll();
				d.setMaxCost(k);
				d.recursiveDFS(u, v);
				stdout.println(v.getCost());
			}
		}
		stdout.flush();
		stdout.close();
	}

	//////////////////////////////////////////////////
	////////////////// +--------+ ////////////////////
	////////////////// | READER | ////////////////////
	////////////////// +--------+ ////////////////////
	//////////////////////////////////////////////////

	/**
	 * The Class FastReader.
	 */
	static class FastReader {

		/** The br. */
		BufferedReader br;

		/** The st. */
		StringTokenizer st;

		/**
		 * Instantiates a new fast reader.
		 */
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		/**
		 * Next.
		 *
		 * @return the string
		 */
		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		/**
		 * Next int.
		 *
		 * @return the int
		 */
		int nextInt() {
			return Integer.parseInt(next());
		}

		/**
		 * Next long.
		 *
		 * @return the long
		 */
		long nextLong() {
			return Long.parseLong(next());
		}

		/**
		 * Next double.
		 *
		 * @return the double
		 */
		double nextDouble() {
			return Double.parseDouble(next());
		}

		/**
		 * Next line.
		 *
		 * @return the string
		 */
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}