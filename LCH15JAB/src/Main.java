
/*
 * Created by Thomas Boulbes
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter stdout = new PrintWriter(System.out);
		int T = Integer.parseInt(sc.nextLine().trim());
		while (T-- > 0) {
			String word = sc.nextLine().trim();
			Map<Character, Integer> characterCounts = new HashMap<Character, Integer>();
			int total = word.length();
			for (char character : word.toCharArray()) {
			    Integer characterCount = characterCounts.get(character);
			    if (characterCount == null) {
			        characterCount = 0;
			    }
			    characterCounts.put(character, characterCount + 1);
			}
			boolean hasSameNumberOfOccurence = false;
			List<Character> letters = new ArrayList<Character>(characterCounts.keySet());
			int n = letters.size()-1;
			while (n >= 0 && !hasSameNumberOfOccurence){
				int occurence = characterCounts.get(letters.get(n));
				hasSameNumberOfOccurence = occurence == total - occurence;
				n--;
			}
			stdout.println(hasSameNumberOfOccurence ? "YES" : "NO");
		}
		sc.close();
		stdout.flush();
		stdout.close();
	}

}