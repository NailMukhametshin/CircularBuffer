package ru.itpark;

public class Main {
    public static void main(String[] args) {

        CircularBuffer circularBuffer = new CircularBuffer();

        circularBuffer.add(1);
        circularBuffer.add(2);
        circularBuffer.add(3);
        circularBuffer.add(4);
        circularBuffer.add(5);
        circularBuffer.add(6);
        circularBuffer.add(7);
        circularBuffer.add(8);
        circularBuffer.add(9);
        circularBuffer.add(10);
        circularBuffer.add(11);
        circularBuffer.add(12);
        circularBuffer.add(13);

        System.out.println(circularBuffer.getcBuffer());
    }
}
