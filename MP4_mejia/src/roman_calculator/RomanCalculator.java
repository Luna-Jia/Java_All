package roman_calculator;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanCalculator {
    public static Scanner kbInput = new Scanner(System.in);

    public static String doMath(char operator, int firstNum, int secondNum) {
        /*
         * This method will perform the arithmetic
         * indicated by the operator (+ -* /),
         * invoke convertToRoman to convert answer to Roman number,
         * then return answer
         * */
        int result=0;
        switch (operator) {
            case '+':
                result = firstNum + secondNum;
                break;
            case '-':
                result = firstNum - secondNum;
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            case '/':
                result = firstNum / secondNum;
                break;
        }
        return convertToRoman(result);
    }
    public static char getOperator() {
        System.out.println("please choose an operator: +, - , * , or /");
        return kbInput.nextLine().charAt(0);
    }

    public static int getOperands() {
	/*This routine should prompt the user to enter Roman number.
	  convertFromRoman needs to be invoked to convert the Roman number to an integer.
	  If the input is invalid (-1 returned from convertFromRoman)
	  then complain and prompt the user again.
	*/
        String userInput;
        int operand;

        do {
            System.out.println("Please enter a Roman Number:");
            userInput = kbInput.nextLine();
            operand = convertFromRoman(userInput);
        }while (operand == -1);
        return operand;
    }

    public static int convertFromRoman(String romanNum) {
        /*
         * This method will convert Roman number to integer
         * return -1 when input is invalid
         *
         * */
        String validationStr = "IVXLCDM";
        int index;
        int total = 0;
        for (int i=0;i<romanNum.length();i++){
            index = validationStr.indexOf(romanNum.toUpperCase().charAt(i));
            if (index==-1) {
                return -1;
            }

            switch (romanNum.toUpperCase().charAt(i)){
                case 'I':
                    total +=1;
                    break;
                case 'V':
                    total +=5;
                    break;
                case 'X':
                    total +=10;
                    break;
                case 'L':
                    total +=50;
                    break;
                case 'C':
                    total +=100;
                    break;
                case 'D':
                    total +=500;
                    break;
                case 'M':
                    total +=1000;
                    break;
            }
        }
        return total;

    }
    public static String convertToRoman(int num) {
        /*
         * This method will convert integer to Roman number
         * */
        String myStr="";
        while (num >= 1000) {
            myStr +="M";
            num-=1000;
        }
        while (num >= 500) {
            myStr += "D";
            num -= 500;
        }
        while (num >= 100) {
            myStr += "C";
            num -= 100;
        }
        while (num >= 50) {
            myStr += "L";
            num -= 50;
        }
        while (num >= 10) {
            myStr += "X";
            num -= 10;
        }
        while (num >= 5) {
            myStr += "V";
            num -= 5;
        }
        while (num >= 1) {
            myStr += "I";
            num -= 1;
        }
        return myStr;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String result;
        do {
            result = doMath(getOperator(), getOperands(),getOperands());

            System.out.println(result);
            System.out.println("do you want to continue? y/n");

        } while (kbInput.nextLine().charAt(0) == 'y');
        System.out.println("Have a nice day!");
    }

}