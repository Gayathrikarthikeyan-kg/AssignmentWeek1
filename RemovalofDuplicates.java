package week1.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovalofDuplicates {

	public static void main(String[] args) {
		int[] arr= new int[]{4,6,4,2,9,4,2,8,8,10};
		duplicateN2(arr,arr.length);
	
	}

	private static void duplicateN2(int[] arr, int len) {
		int[] res=new int[0];
		int k=0;
		for(int i =0; i <len;i++) {
			if(isPresent(arr[i],res)==false) {
				res=Arrays.copyOf(res,res.length+1);
				res[k]=arr[i];
				k++;
			}//else ignore
		}
		
		print(res);
	}

	private static void print(int[] res) {
		System.out.print("[");
		for(Integer o: res) {
			System.out.print(o+",");
		}		
		System.out.println("]");
	}

	private static boolean isPresent(int num, int[] res) {
		for(int i =0; i <res.length; i++) {
			if(res[i]==num) {
				return true;
			}
		}
		return false;
	}

}
