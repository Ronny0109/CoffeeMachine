import java.util.Scanner;

class SimpleCalculator {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double firstNumber = scan.nextDouble();
        char symbol = scan.next().charAt(0);
        double secondNumber = scan.nextDouble();

        switch (symbol){
            case '+':
                sumTwoNumbers(firstNumber,secondNumber);
                break;
            case '-':
                subtractTwoNumbers(firstNumber,secondNumber);
                break;
            case '*':
                multiplyTwoNumbers(firstNumber,secondNumber);
                break;
            case '/':
                if (secondNumber == 0){
                    System.out.println("Division by 0!");
                }else{
                    divideTwoNumbers(firstNumber,secondNumber);
                }
                break;
        }
    }
    // Implement your methods here
    public static void subtractTwoNumbers(double firstNumber, double secondNumber){
        double value = firstNumber - secondNumber;
        int summe = (int)value;
        System.out.println(summe);
    }


    public static void sumTwoNumbers(double firstNumber, double secondNumber){
        double value = firstNumber + secondNumber;
        int summe = (int)value;
        System.out.println(summe);
    }


    public static void divideTwoNumbers(double firstNumber, double secondNumber){
        double value = firstNumber / secondNumber;
        int summe = (int)value;
        System.out.println(summe);
    }


    public static void multiplyTwoNumbers(double firstNumber, double secondNumber){
        double value = firstNumber * secondNumber;
        int summe = (int)value;
        System.out.println(summe);
    }
}