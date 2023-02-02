public class balancedParentheses {

    public static boolean balancedParentheses(String word) {
        int numUnclosedOpenParens = 0;
        for (int i = 0; i < word.length(); i += 1) {
            if (word.charAt(i) == '(') {
                numUnclosedOpenParens += 1;
            } else if (word.charAt(i) == ')') {
                numUnclosedOpenParens -= 1;
            }
            if (numUnclosedOpenParens < 0) {
                return false;
            }
        }
        return numUnclosedOpenParens == 0;
    }

}
