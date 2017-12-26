package tempo;

import java.util.Arrays;

public class T {
	static int  oddball_sort(int []arr, int len) {// running time of o(nlogn)
		Arrays.sort(arr);// implementation of sort array not  shown here. but there are algorithms who could do it in nlogn running time
		int i, j;
		int foundInner;
		int result = 0;
		// the following for loop runs in o(n)
		for (i = 0; i < len-1; i=i+2) {// the duplicated numbers will be in sequence after sort, so jump in step of 2
			if(arr[i]!=arr[i+1]) return arr[i];// check if the number next to the current number is different. if so, answer found, return it
		}
		return 0;// this should never happen if the answer is guaranteed to exits
		// the totla running time is o(nlogn)
	}


	// The following function runs in o(n) time. It makes use of the popular math equation that says sum of the first n numbers is
	// is given by n(n+1)/2. but if the numbers are duplicated, the sum becomes n(n+1). So we can find the missing number by subtracting from this sum
	// the sum of elements in the array 	
	static	int  oddball(int []arr, int len) {// len is always odd
		int i;
		int n=(len+1)/2;
		int sum_full=n*(n+1);
		int sum_missing=0;
		for(i = 0; i < len; i++){
			sum_missing+=arr[i];
		}
		return sum_full-sum_missing;
	}


	public static void main(String[] args){
		int[] vals=new int[]{1,2,3,4,5,3,1,4,5};
		System.out.println(oddball_sort(vals,vals.length));
		System.out.println(oddball(vals,vals.length));
	}

}
