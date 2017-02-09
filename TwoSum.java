package Leet;
import java.util.*;

public class TwoSum {

	public static int[] calculateTwoSumIndex(int a[], int target){
		
		
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++){
			m.put(a[i], i);
		}
		
		for(int i=0;i<a.length;i++){
			int complement = target - a[i];
			
			if(m.containsKey(complement) && m.get(complement)!=i ){
				return new int[] {  i, m.get(complement)};
			}
		}
		
		throw new IllegalArgumentException("No two solution");
	}
	
	public static void main(String args[]){
		
		int a[] = {2,7,11,15};
		int result[] = TwoSum.calculateTwoSumIndex(a, 9);
		
		System.out.println(Arrays.toString(result));
	}
}
