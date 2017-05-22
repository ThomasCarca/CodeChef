/*
 * Created by Thomas Boulbes
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main {
	
	/**
	 * To RPN.
	 *
	 * @param expr the expr
	 * @return the string
	 */
	public static String toRPN(char[] expr) {
		int i = 0;
		while (i < expr.length) {
			
		}
		
		return "";
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter stdout = new PrintWriter(System.out);
		int T = sc.nextInt();
		while(T-- > 0){
			String s = sc.next();
			LinkedList<Character> op = new LinkedList<>();
			for(int i = 0; i<s.length(); i++){
 
				char c = s.charAt(i);
				if(c == '('){
				}else if(c == ')'){
					System.out.print(op.pop());
				}else if(c == '+' || c == '-' || c == '*' || c == '/' || c == '^'){
					op.push(c);
				}else{
					System.out.print(c);
				}
			}
			System.out.println();
		}
		sc.close();
		stdout.flush();
		stdout.close();
	}

}