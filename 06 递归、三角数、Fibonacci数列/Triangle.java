package ch06;
/**
 * 三角数字实现：数列中第n向是由第n-1加n得到的
 * @author liuyu
 *
 */
public class Triangle {
	
	public static int getNumber(int n) {
		int total= 0;
		while(n > 0) {
			total = total + n;
			n--;
		}
		return total;
	}
	
	public static int getNumberByRecursion(int n) {
		if(n == 1) {
			return 1;
		} else {
			return n + getNumberByRecursion(n - 1);
		}
	}
}
