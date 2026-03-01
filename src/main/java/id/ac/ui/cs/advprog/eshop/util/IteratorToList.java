package id.ac.ui.cs.advprog.eshop.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class IteratorToList {
    public static <T> List<T> convertIteratorToList(Iterator<T> iterator) {
        List<T> list = new ArrayList<>();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        return list;
    }
}
