package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {
    private MyComparator comparator;

    public SortDecorator(SmartArray smartArray, MyComparator cmp) {
        super(smartArray);
        this.comparator = cmp;
    }

    @Override
    public Object[] toArray() {
        Object[] objects = smartArray.toArray();
        Arrays.sort(objects, comparator);
        return objects;
    }

    @Override
    public int size() {
        return toArray().length;
    }

    @Override
    public String operationDescription() {
        return "Sorts elements using MyComparator to compare them";
    }
}
