package ch06;
/**
 * Fibonacci数列实现：
 * 	数列的第一项为0，第二项为1，第n项为n-1项加n-2项
 * @author liuyu
 *
 */
public class Fibonacci {
	public static int getNumber(int n) {
		if(n == 1) {
			return 0;
		} else if(n == 2){
			return 1;
		} else {
			return getNumber(n - 1) + getNumber(n - 2);
		}
	}
}
