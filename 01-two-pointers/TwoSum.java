// Pattern: Two Pointers
// Problem: Valid Palindrome
// LeetCode: https://leetcode.com/problems/two-sum/


class  TwoSum{
    public int[] twoSum(int[] nums, int t) {
        int i=0;
        int j=nums.length-1;
        int idx1=-1;
        int idx2=-1;
        while(i<j){
            if(nums[i]+nums[j]>t)j--;
            else if(nums[i]+nums[j]<t)i++;
            else{
                idx1=i+1;
                idx2=j+1;
                break;
            }
            
        }

        return new int[]{idx1,idx2};

        
    }
}
