package pr5;

import java.util.*;

public class Example4 {
   public static void main(String[] args) {
      double leftOperand, result, rightOperand;
      String leftString, operator, rightString;
      StringTokenizer tokenizer;
      Scanner in = new Scanner(System.in);

      System.out.println("Enter expressions:");

      String input = in.nextLine();
      StringTokenizer expressions = new StringTokenizer(input, " ");

      while (expressions.hasMoreTokens()) {
         String currentExpr = expressions.nextToken();
         tokenizer = new StringTokenizer(currentExpr, "+-*/", true);

         try {
            leftString = tokenizer.nextToken();
            operator = tokenizer.nextToken();
            rightString = tokenizer.nextToken();
            try {
               leftOperand = Double.parseDouble(leftString);
            } catch (NumberFormatException nfe) {
               System.out.println("Left operand '" + leftString + "' is not a number");
               continue;
            }
            try {
               rightOperand = Double.parseDouble(rightString);
            } catch (NumberFormatException nfe) {
               System.out.println("Right operand '" + rightString + "' is not a number");
               continue;
            }
            if (operator.equals("+"))
               result = leftOperand + rightOperand;
            else if (operator.equals("-"))
               result = leftOperand - rightOperand;
            else if (operator.equals("*"))
               result = leftOperand * rightOperand;
            else if (operator.equals("/"))
               result = leftOperand / rightOperand;
            else
               result = 0.0;

            System.out.println("Result of " + currentExpr + ": " + result);

         } catch (NoSuchElementException nsee) {
            System.out.println("Invalid syntax in: " + currentExpr);
         }
      }
   }
}

