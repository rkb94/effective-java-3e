package chapter7.item43;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

// map.merge를 이용해 구현한 빈도표 - 람다와 메서드 참조 방식 비교
public class Freq {
    public static void main(String[] args) {
        Map<String, Integer> frequencyTable = new TreeMap<>();

        List<String> list = Arrays.asList("A","B","C","A");
        // Java 9에서는 List.of를 사용해서 List의 원소를 주입할 수도 있음...

        // 람다 방식 사용
        for (String s : list)
            frequencyTable.merge(s, 1, (count, incr) -> count + incr);
        System.out.println(frequencyTable);

        for (Map.Entry<String, Integer> entry : frequencyTable.entrySet())
            entry.setValue(0);

        // 메서드 참조 사용
        for (String s : list)
            frequencyTable.merge(s, 1, Integer::sum);
        System.out.println(frequencyTable);

        for (Map.Entry<String, Integer> entry : frequencyTable.entrySet())
            entry.setValue(0);
    }
}
