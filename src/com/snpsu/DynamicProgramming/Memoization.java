package com.snpsu.DynamicProgramming;

import java.util.Arrays;

public class Memoization {
        static int fib(int n,int[] dp){
            if(n==0 || n==1){
                return n;
            }else{
                //step 3 check if the answer exists or not!
                if(dp[n]!=-1) {
                    return dp[n];
                }
                //step 2 dont return first store!
                dp[n]=fib(n-1,dp)+fib(n-2,dp);
                return dp[n];
            }
        }

        public static void main(String[] args) {
            int n = 100;
            //step 1 - create dp array
            int[] dp=new int[n];
            Arrays.fill(dp,-1);
            for(int i=0; i<n; i++){
                System.out.print(fib(i,dp) + " ");
            }
        }
    }

