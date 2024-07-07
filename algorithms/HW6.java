package telran.homework.algorithms;

import java.util.Stack;

public class HW6 {

    public static void main(String[] args) {
        String s1 = "([{}])";
        String s2 = "([)]";
        String s3 = "{()}";

        System.out.println(s1 + " is " + (isValid(s1) ? "valid" : "invalid")); // valid
        System.out.println(s2 + " is " + (isValid(s2) ? "valid" : "invalid")); // invalid
        System.out.println(s3 + " is " + (isValid(s3) ? "valid" : "invalid")); // valid
    }
    public class BracketValidator {

        public static boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();

            for (char c : s.toCharArray()) {
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else if (c == ')' || c == '}' || c == ']') {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char top = stack.pop();
                    if ((c == ')' && top != '(') ||
                            (c == '}' && top != '{') ||
                            (c == ']' && top != '[')) {
                        return false;
                    }
                }
            }

            return stack.isEmpty();
        }


    }

}
