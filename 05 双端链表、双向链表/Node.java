package ch05;
/*
 * 链表结点
 */
public class Node {
	//数据域
	public long data;
	//指针域
	public Node next;
	public Node previous;
	
	public Node(long value) {
		this.data = value;
	}
	
	/**
	 * 显示方法
	 */
	public void display() {
		System.out.print(data + " ");
	}
}
