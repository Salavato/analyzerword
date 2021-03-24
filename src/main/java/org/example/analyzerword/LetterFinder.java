package org.example.analyzerword;

import java.util.LinkedHashMap;
import java.util.Map;

public class LetterFinder {

    public static Result letterAmount(String s) {

        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                int cnt = map.get(c);
                map.put(c, ++cnt);
            } else {
                map.put(c, 1);
            }
        }

        int temp = 0;
        for (Map.Entry entry : map.entrySet()) {
            Integer v = (Integer) entry.getValue();
            if (v > temp) {
                temp = v;
            }
        }

        Map.Entry<Character, Integer> tempEntry = null;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= temp) {
                tempEntry = entry;
            }
        }

        return new Result(String.valueOf(tempEntry.getKey()), tempEntry.getValue());
    }


}
