package com.company;

import java.util.Stack;
import java.util.stream.Stream;

/**
 * Created by petenguy1 on 11/28/2016.
 *
 *      https://www.reddit.com/r/dailyprogrammer/comments/5c5jx9/20161109_challenge_291_intermediate_reverse/
 */
public class ReversePolishNotation {

    private static Stack<String> stack = new Stack<>();

    public static void main(String[] args) {

        String rpn = "100 807 3 331 * + 2 2 1 + 2 + * 5 ^ * 23 10 558 * 10 * + + *";
        Stream<String> rpnStream = Stream.of(rpn.split(" "));

        try {
            rpnStream.forEach(element -> evaluate(element));

            if (stack.size() != 1) {
                System.out.print("Invalid expression");
            } else {
                stack.forEach(System.out::print);
            }
        } catch (Exception ex) {
            System.out.print("Invalid expression: " + ex);
        }
    }

    public static void evaluate(String s) {
            if (s.matches("[-+]?\\d+(\\.\\d+)?")) {
                stack.push(s);
            } else {
                switch (s) {
                    case "+":
                        stack.push(operate(stack.pop(), stack.pop(), addition));
                        break;
                    case "-":
                        stack.push(operate(stack.pop(), stack.pop(), subtraction));
                        break;
                    case "*":
                        stack.push(operate(stack.pop(), stack.pop(), multiplication));
                        break;
                    case "/":
                        stack.push(operate(stack.pop(), stack.pop(), division));
                        break;
                    case "//":
                        stack.push(operate(stack.pop(), stack.pop(), intDivision));
                        break;
                    case "%":
                        stack.push(operate(stack.pop(), stack.pop(), modulus));
                        break;
                    case "^":
                        stack.push(operate(stack.pop(), stack.pop(), power));
                        break;
                    case "!":
                        stack.push(operate(stack.pop(), "", factorial));
                        break;
                    default:
                        break;
                }
            }
    }

    interface MathOperation {
        String operation(String a, String b);
    }

    private static String operate (String a, String b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    private static MathOperation addition = (String a, String b) -> Double.toString(Double.parseDouble(b) + Double.parseDouble(a));
    private static MathOperation subtraction = (String a, String b) -> Double.toString(Double.parseDouble(b) - Double.parseDouble(a));
    private static MathOperation multiplication = (String a, String b) -> Double.toString(Double.parseDouble(b) * Double.parseDouble(a));
    private static MathOperation division = (String a, String b) -> Double.toString(Double.parseDouble(b) / Double.parseDouble(a));
    private static MathOperation intDivision = (String a, String b) -> Integer.toString(Integer.parseInt(b) / Integer.parseInt(a));
    private static MathOperation modulus = (String a, String b) -> Double.toString(Double.parseDouble(b) % Double.parseDouble(a));
    private static MathOperation power = (String a, String b) -> Double.toString(Math.pow(Double.parseDouble(b), Double.parseDouble(a)));
    private static MathOperation factorial = (String a, String b) -> Double.toString(factorial(Double.parseDouble(a)));
    private static MathOperation reflection = (String a, String b) -> a;

    private static double factorial(double d) {
        if ( d == 1)
            return d;
        else
            return d*factorial(d-1);
    }

}
