package Calculator;

public class Calculator2 {

        public int add ( int number1, int number2){
            return (number1 + number2);
        }
        public int subtract ( int number1, int number2){
            return (number1 - number2);
        }
        public int multiply ( int number1, int number2){
            return (number1 * number2);
        }
        public static double divide ( double number1, double number2){
            if (number2 == 0) {
                System.out.println("Error: Cannot divide by zero.");
                return 0;
            }
            return number1 / number2;
        }
}
