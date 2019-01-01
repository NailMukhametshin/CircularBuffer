package ru.itpark;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class CircularBuffer {

    private Queue<Integer> cBuffer = new ArrayDeque<>(10);

    public void add(int value) {
        cBuffer.add(value);
        if (cBuffer.size() > 10) cBuffer.remove();
    }

    public List<Integer> getcBuffer(){
        return new ArrayList<>(cBuffer);
    }

}