package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.LinkedList;
import java.util.List;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {
    private MyPredicate predicate;

    public FilterDecorator(SmartArray smartArray, MyPredicate predicate) {
        super(smartArray);
        this.predicate = predicate;
    }

    @Override
    public Object[] toArray() {
        List<Object> list = new LinkedList<>();
        for(Object obj : smartArray.toArray()) {
            if(predicate.test(obj)) {
                list.add(obj);
            }
        }
        return list.toArray();
    }

    @Override
    public int size() {
        return toArray().length;
    }

    @Override
    public String operationDescription() {
        return "Tests every element and removes it if it doesn't satisfy MyPredicate";
    }
}