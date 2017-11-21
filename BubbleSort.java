package bytecode;
import java.util.*;

class BubbleSort {
	
	public static void main(String args[]){
		int[] data = {3,4,7,8,1};		
		//用循环方式实现冒泡排序
		loopWay(data);
		for (int n : data) {
			System.out.print(n + "\t");
		}
	}
	
	static void loopWay(int[] nums) {
		int top = 0;
		int foot = nums.length -1;
		boolean needNext = true;
		while (top<foot && needNext) {
			needNext = false;
			for (int i=foot; i>top; i--) {
				if (nums[i] < nums[i-1]) { //Switch the nums
					needNext = true;
					int temp = nums[i-1];
					nums[i-1] = nums[i];
					nums[i] = temp;
				}
			}
			System.out.println("No. "+top);
			top++;
		}
	}
	
}