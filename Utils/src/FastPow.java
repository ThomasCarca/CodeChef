// TODO: Auto-generated Javadoc
/**
 * The Class FastPow.
 */
public class FastPow {
	
	/**
	 * Pow.
	 *
	 * @param a the a
	 * @param b the b
	 * @return the long
	 */
	public static long pow(long a, long b) {
		long re = 1;
		while (b > 0) {
			if ((b & 1) == 1) {
				re *= a;
			}
			b >>= 1;
			a *= a;
		}
		return re;
	}
}