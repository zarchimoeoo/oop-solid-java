package com.bejourney.leetcode;

public class PivotIndex {
    public int pivotIndex(int [] nums){
        int res = 0;
        int startValue= nums[0];
        int endValue = nums[nums.length-1];
        for(int j= startValue-1; j<nums.length-1; j++){
            res = nums[j];
        }
        if(res == startValue){
            System.out.println("The pivot index is 0");
        }

        int midIndex = nums.length/2;
        int midNum = nums[midIndex];


        for(int i=0; i< midIndex; i++){
             res += nums[i];
        }
        System.out.println(res);
        if(res == midNum){
            System.out.println("The pivot index is " + midNum);
        }else{
            for(int i=midIndex; i< nums.length; i++){
                res += nums[i];
            }
            if (res == midNum){
                System.out.println("The pivot index is " + midNum);
            }else {
                System.out.println("The pivot index is " + -1);
            }
        }
        return 1;
    }

}
