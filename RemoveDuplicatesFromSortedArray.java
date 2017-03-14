import java.util.*;
import java.lang.*;
import java.io.*;

// Two pinters technique
class Ideone
{
	
	static int nums[] = {1,1,2};
	
  // Returns the length of array
	public static int removeDuplicates(int[] nums) {
	    if (nums.length == 0) return 0;
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	            i++;
	            nums[i] = nums[j];
	        }
	    }
	    return i + 1;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
	int x = removeDuplicates(nums);
	
	System.out.println(x);
	}

}
