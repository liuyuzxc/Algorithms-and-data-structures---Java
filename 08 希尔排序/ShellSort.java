package ch08;
/**
 * 希尔排序
 * 间隔的计算：间隔h的初始值为1，通过h=3*h+1来循环计算，
 * 直到该间隔大于数组的大小时停止。最大间隔为不大于数组大小的最大值。
 * 间隔的减少公式：h=（h-1）/3
 */
public class ShellSort {
	/**
	 * 排序方法
	 */
	public static void sort(long[] arr) {
		//初始化一个间隔
		int h = 1;
		//计算最大间隔
		while(h < arr.length / 3) {
			h = h * 3 + 1;
		}
		
		while(h > 0) {
			//进行插入排序
			long tmp = 0;
			for(int i = h; i < arr.length; i++) {
				tmp = arr[i];
				int j = i;
				while(j > h - 1 && arr[j - h] >= tmp) {
					arr[j] = arr[j - h];
					j -= h;
				}
				arr[j] = tmp;
			}
			//减小间隔
			h = (h - 1) / 3;
		}
	}
}
