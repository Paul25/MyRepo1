package com.company;

/**
 * Created by XPS on 30.03.2015.
 */
public class Door {
    public int height;
    public boolean isOpened;

    public Door(int h) {
        height = h;
        isOpened = true;
    }

     public void close() {
        isOpened = false;
        System.out.println("Closing door");
    }
}
