package com.snpsu.basic;

public class iterationFibonacci {
    public static void main(String[]args){
        int n=10;
        int n1=0,n2=1,sum=0;
        System.out.println(n1+" "+n2+" ");
        for(int i=2;i<n;i++){
            sum=n1+n2;
            System.out.println(sum+" ");
            n1=n2;
            n2=sum;
        }
    }
}
