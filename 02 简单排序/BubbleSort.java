package ch02;
/**
 * √∞≈›≈≈–Ú
 * @author liuyu
 *
 */
public class BubbleSort {
	
	public static void sort(long[] arr) {
		long tmp = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = arr.length - 1; j > i; j--) {
				if(arr[j] < arr[j - 1]) {
					//Ω¯––Ωªªª
					tmp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = tmp;
				}
			}
		}
	}
}
