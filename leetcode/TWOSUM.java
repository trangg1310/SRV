package leetcode;
import java.lang.*;
import java.util.*;
public class TWOSUM {
    public static void main(String[] args) {
        
    }
    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hastt = new HashMap<>();
        int[] x = new int[2];
        for(int i = 0; i<nums.length; i++) {
            int tmp = target - nums[i];
            if(hastt.get(tmp)==null) {
                hastt.put(nums[i], i);
            } else {
                x[0] = hastt.get(tmp);
                x[1] = i;
            }
        }
        return x;
    }
}
