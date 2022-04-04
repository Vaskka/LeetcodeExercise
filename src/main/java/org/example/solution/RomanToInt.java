package org.example.solution;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt implements SingleParamSolution<Integer, String> {

    private static final Map<Character, Integer> map = new HashMap<>();

    static {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    @Override
    public Integer solve(String s) {
        int result = map.get(s.charAt(0));
        char[] seq = s.toCharArray();
        int over = 0;
        for (int i = 0, j = 1; j < seq.length; j++, i++) {
            int pre = map.get(seq[i]);
            int next = map.get(seq[j]);
            if (pre < next) {
                over += pre;
            }
            result += next;
        }
        return result - over * 2;
    }
}
