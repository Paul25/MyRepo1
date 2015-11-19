package com.company;

/**
 * Created by XPS on 31.03.2015.
 */
public class NewProDoor {
    public static void main(String[] args)
    {
        ProDoor door = new ProDoor(2000, 900, true, false);
        String doorInfo = door.toString();
        System.out.println("Door info:\n" + doorInfo);


        ProDoor door2 = new ProDoor(1900, 800, false, true);
        System.out.println("Door info:\n" + door2.toString());

        door.lock();
        System.out.println(door.isLocked);

        door.close();
        System.out.println(door.isClosed);

        System.out.println("Door info:\n" + door.toString());

        door.unlock();
        System.out.println(door.isLocked);

        door.close();
        System.out.println(door.isClosed);

        door.lock();

        door2.open();
        System.out.println(door2.isOpened);

        door2.unlock();

        door2.open();
        System.out.println(door2.isOpened);

        System.out.println("Door info:\n" + door2.toString());

    }



}
