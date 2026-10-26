package lab4.exercise2;
/**
 * EquationReverser.java
 * Your Name:        Elif Sıla Vangöl
 * Your Student ID:  230444017
 * Your Date:        26.10.2026
 */

public class EquationReverser {

    public static String reverseEquation(String equation) {

        TokenStack stack = new TokenStack();

        int i = 0;

        // TODO 1: Traverse the equation from left to right.
        while (i < equation.length()) {
            char current = equation.charAt(i);

            // TODO 2: If the current character is a digit
            if (Character.isDigit(current)) {
                int start = i;

                while (i < equation.length() && Character.isDigit(equation.charAt(i))) {
                    i++;
                }

                stack.push(equation.substring(start, i));
            }
            // TODO 3: Otherwise, push the operator
            else {
                stack.push(String.valueOf(current));
                i++;
            }
        }

        // TODO 4: Pop all items and append them to a StringBuilder
        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }
}