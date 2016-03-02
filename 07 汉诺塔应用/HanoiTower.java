package ch07;
/**
 * 汉诺塔:所有盘子开始都放在A上，要求将所有的盘子从塔座A移动到塔座C上，
 * 每次只能移动一个盘子，任何盘子不能放在比自己小的盘子上。
 * @author liuyu
 *
 */
public class HanoiTower {
	
	/**
	 * 移动盘子
	 * topN:移动的盘子数
	 * from:起始塔座
	 * inter:中间塔座
	 * to:目标塔座
	 */
	public static void doTower(int topN,char from,char inter,char to) {
		if(topN == 1) {
			System.out.println("盘子1,从"+ from + "塔座到" + to + "塔座");
		} else {
			doTower(topN - 1, from, to, inter);
			System.out.println("盘子" + topN +",从" + from + "塔座到" + to + "塔座" );
			doTower(topN - 1, inter, from, to);
		}
	}
}
