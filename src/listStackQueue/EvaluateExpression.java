package listStackQueue;
import java.util.Stack;
public class EvaluateExpression {
    public static void main(String[] args) {
        // Check number of arguments passed
        if (args.length != 1) { // The program takes an expression as a command-line argument in one string.
            System.out.println(
                    "Usage: java EvaluateExpression \"expression\"");
            System.exit(1);
        }

        try {
            System.out.println(evaluateExpression(args[0]));
        }
        catch (Exception ex) {
            System.out.println("Wrong expression: " + args[0]);
        }
    }

    /** Evaluate an expression */
    public static int evaluateExpression(String expression) { // The evaluateExpression method creates two stacks, operandStack and operatorStack
        // Create operandStack to store operands
        Stack<Integer> operandStack = new Stack<>();

        // Create operatorStack to store operators
        Stack<Character> operatorStack = new Stack<>();

        // Insert blanks around (, ), +, -, /, and *
        expression = insertBlanks(expression); // The insertBlanks method is used to ensure that operands, operators, and parentheses are separated by at least one blank

        // Extract operands and operators
        String[] tokens = expression.split(" "); //  and extracts operands, operators, and parentheses delim- ited by space

        // Phase 1: Scan tokens
        for (String token: tokens) { // The program scans each token in the for loop
            if (token.length() == 0) // Blank space //  If a token is empty, skip it
                continue; // Back to the while loop to extract the next token
            else if (token.charAt(0) == '+' || token.charAt(0) == '-') { // If a token is a + or − operator (line 38)， process all the operators from the top of operatorStack，
                // Process all +, -, *, / in the top of the operator stack
                while (!operatorStack.isEmpty() && // if any (lines 40–46),
                        (operatorStack.peek() == '+' ||
                                operatorStack.peek() == '-' ||
                                operatorStack.peek() == '*' ||
                                operatorStack.peek() == '/')) {
                    processAnOperator(operandStack, operatorStack);
                }

                // Push the + or - operator into the operator stack
                operatorStack.push(token.charAt(0)); // and push the newly scanned operator into the stack (line 49).
            }
            else if (token.charAt(0) == '*' || token.charAt(0) == '/') { // If a token is a * or / operator (line 51),
                // Process all *, / in the top of the operator stack
                while (!operatorStack.isEmpty() && // process all the * and / operators from the top of operatorStack, if any (lines 53–57),
                        (operatorStack.peek() == '*' ||
                                operatorStack.peek() == '/')) {
                    processAnOperator(operandStack, operatorStack);
                }

                // Push the * or / operator into the operator stack
                operatorStack.push(token.charAt(0)); // and push the newly scanned operator to the stack (line 60).
            }
            else if (token.trim().charAt(0) == '(') { //If a token is a ( symbol (line 62), push it into operatorStack.
                operatorStack.push('('); // Push '(' to stack
            }
            else if (token.trim().charAt(0) == ')') { //  If a token is a ) symbol (line 65), process all the operators from the top of operatorStack until seeing the ) symbol (lines 67–69) and pop the ) symbol from the stack.
                // Process all the operators in the stack until seeing '('
                while (operatorStack.peek() != '(') {
                    processAnOperator(operandStack, operatorStack);
                }

                operatorStack.pop(); // Pop the '(' symbol from the stack
            }
            else { // An operand scanned
                // Push an operand to the stack
                operandStack.push(new Integer(token));//  If a token is an operand, push it to operandStack
            }
        }

        // Phase 2: process all the remaining operators in the stack
        while (!operatorStack.isEmpty()) { // After all tokens are considered, the program processes the remaining operators in operatorStack (lines 80–82).
            processAnOperator(operandStack, operatorStack);
        }

        // Return the result
        return operandStack.pop();
    }

    /** Process one operator: Take an operator from operatorStack and
     *  apply it on the operands in the operandStack */
    public static void processAnOperator( // The processAnOperator method (lines 90–103) processes an operator.
            Stack<Integer> operandStack, Stack<Character> operatorStack) {
        char op = operatorStack.pop(); // The method pops the operator from operatorStack (line 92)
        int op1 = operandStack.pop(); // and pops two operands from operandStack (lines 93 and 94).
        int op2 = operandStack.pop();
        if (op == '+')
            operandStack.push(op2 + op1); // Depending on the operator, the method performs an operation and pushes the result of the operation back to operandStack (lines 96, 98, 100, and 102).
        else if (op == '-')
            operandStack.push(op2 - op1);
        else if (op == '*')
            operandStack.push(op2 * op1);
        else if (op == '/')
            operandStack.push(op2 / op1);
    }

    public static String insertBlanks(String s) { // The insertBlanks method is used to ensure that operands, operators, and parentheses are separated by at least one blank
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')' ||
                    s.charAt(i) == '+' || s.charAt(i) == '-' ||
                    s.charAt(i) == '*' || s.charAt(i) == '/')
                result += " " + s.charAt(i) + " ";
            else
                result += s.charAt(i);
        }

        return result;
    }
}