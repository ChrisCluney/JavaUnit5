package com.JavaUnit5.Unit5;

import java.util.HashMap;
import java.util.Stack;

public class balancedBrackets {


    public static boolean balancedBrackets(String word) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> bracketPairs = new HashMap<Character, Character>();
        bracketPairs.put(')', '(');
        bracketPairs.put(']', '[');
        bracketPairs.put('}', '{');
        bracketPairs.put('>', '<');

        for (int i=0; i < word.length(); i += 1) {
            if (bracketPairs.containsValue(word.charAt(i))) {
                stack.push(word.charAt(i));
            } else {
                if (!bracketPairs.containValue(word.charAt(i))) {
                    continue;
                }
                if (stack.isEmpty()) {
                    return false;
                }
                Character mostRecentBracket = stack.pop();
                if (!mostRecentBracket.equals(bracketPairs.get(word.charAt(i)))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
