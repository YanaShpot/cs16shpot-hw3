package ua.edu.ucu.smartarr;

import java.util.ArrayList;
import java.util.Arrays;

// Base array for decorators
public class BaseArray implements SmartArray{
    private ArrayList<Object> array = new ArrayList<>();

    public BaseArray(Object[] items) {
        for (Object item: items) {
            array.add(item);
        }
    }

    @Override
    public int size() {
        return array.size();
    }

    @Override
    public String operationDescription() {
        return "A basic data container";
    }

    @Override
    public Object[] toArray() {
        return array.toArray();
    }
}
