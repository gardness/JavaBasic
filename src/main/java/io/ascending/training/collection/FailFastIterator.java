package io.ascending.training.collection;

import java.util.*;

public class FailFastIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");

//        for (String str : list) {
//            if (str.equals("bb")) {
//                list.remove(str);
//            }
//        }

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String s = it.next();

            if (s.equals("bb")) {
                it.remove();
            }
        }

        Map<String, Integer> mymap = new HashMap<>();
        mymap.put("a", 1);
        mymap.put("b", 2);

        Iterator<Map.Entry<String, Integer>> itr = mymap.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<String, Integer> entry = itr.next();
            if (entry.getValue() == 2) {
                mymap.remove(entry.getKey());
            }
        }

        System.out.print(mymap);


    }
}
