package bytecode;

import java.util.*;

class ArraysTest {
	
	public static void main(String[] args) {
		Integer[] nums = {5,7,2,1,9};
		Arrays.sort(nums);
		for (Object n : nums) {
			System.out.println(n);
		}
	}
	
}