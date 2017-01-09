package ua.edu.ucu.smartarr;

import java.util.ArrayList;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {
    public DistinctDecorator(SmartArray smartArr) {
        super(smartArr);
    }

    @Override
    public Object[] toArray() {
        Object[] arr = smartArray.toArray();
        ArrayList<Object> items = new ArrayList<Object>();
        for (int i = 0; i < arr.length; i++) {
            boolean unique = true;
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i].toString()).equals(arr[j].toString())) {
                    unique = false;
                    break;
                }
            }

            if (unique)
                items.add(arr[i]);
        }

        return items.toArray(new Object[items.size()]);
    }

    @Override
    public int size() {
        return toArray().length;
    }

    @Override
    public String operationDescription() {
        return "Removes duplicates from SmartArray";
    }

}