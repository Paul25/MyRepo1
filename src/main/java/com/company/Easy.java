package com.company;

/**
 * Created by XPS on 06.04.2015.
 */
public class Easy {
    public static void main(String[] args){
        /*1System.out.println(sum(5,7));
    }
        */
        compare(sum(10,20),30);
        compare(sum(-10,100),90);
        if(sum(10,20)==30){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test failed");
        }
        if(sum(-10,-20)==-30){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test failed");
        }

    }
    public static int sum(int k, int u){
        int res=k+u;
        return res;}

    public static void compare(int o, int p){
        if(o==p){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test failed");
        }
    }
    }

