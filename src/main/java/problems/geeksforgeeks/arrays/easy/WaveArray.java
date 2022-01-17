package problems.geeksforgeeks.arrays.easy;

import java.util.Arrays;

public class WaveArray {
	
	/**
	 * Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array and return it
	 *	In other words, arrange the elements into a sequence such that arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4]..... 
	 */
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		convertToWave(arr);
		System.out.println(Arrays.toString(arr));	
	}
	
	/**
	 * Logic:
	 * 
	 * Since we have sorted array and all elements occur only once in given array(distinct),
	 * we have arr[0] < arr[1] < arr[2] < arr[3] ...
	 * 
	 * To form a wave we simply need to swap elements at following pairs represented by index:
	 * 	0,1
	 *  2,3
	 *  4,5
	 *  6,7
	 *  ...
	 * 
	 * We continue doing this from index 0..n-2 and increment by 2 our counter
	 * 
	 * T.C --> O(n)
	 * A.S.C --> O(1)
	 * 
	 * @param array of integers
	 * 
	 */
	public static void convertToWave(int arr[]) {

		for (int i = 0; i < arr.length - 1; i = i + 2) {
			int temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}
	}
}
