package com.company;

/**
 * Created by XPS on 30.03.2015.
 */
public class MainDoor {
    public static void main(String[] args)
    {
        Door k = new Door(100);
        Door l = new Door(190);
        System.out.println("k height is"+ k.height);
        if(k.isOpened){
            System.out.println("k is Opened");
        }else{
            System.out.println("k is Closed");
        }
        k.height=500;
        System.out.println("k height is"+ k.height);
        k.close();
        if(k.isOpened) {
            System.out.println("k is Opened");
        }else{
            System.out.println("k is Closed");
        }
    }
}
