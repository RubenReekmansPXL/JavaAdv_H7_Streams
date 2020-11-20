package be.pxl.ja.oefening7_5;

import java.util.List;

public class LargeList {
    public static int sumLargest(List<List<Integer>> list){
        return list.stream()
                .mapToInt(l -> l.stream().mapToInt(Integer::intValue).max().getAsInt())
                .sum();
    }
}
