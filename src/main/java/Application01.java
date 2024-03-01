import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Application01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double x, y;
        int xi, yi;
        char s;
        while (true) {
            System.out.println();
            System.out.println("ex) x + y"); // format
            System.out.println("Exit: 0"); // to exit
            System.out.print("Input: ");


            st = new StringTokenizer(br.readLine());

            try {
                x = Calculator.rightsignal(st.nextToken());
                xi =(int)x;
//                x = Integer.parseInt(st.nextToken());
                if (xi == 0) break;
                s = st.nextToken().charAt(0);
//                y = Integer.parseInt(st.nextToken());
                y = Calculator.rightsignal(st.nextToken());
                yi = (int)y;
                System.out.print("Output: ");

                switch (s) {
                    case '+':
                        Calculator.add(xi, yi);
                        break;

                    case '-':
                        Calculator.subtract(xi, yi);
                        break;

                    case '*':
                        Calculator.multiply(xi, yi);
                        break;

                    case '/':
                        try {
                            Calculator.division(xi, yi);
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                    case '%':
                        try {
                            Calculator.modular(xi, yi);
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }

                        break;
                    default:
                        System.out.println("wrong operation symbol");
                        break;

                }


            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        }
        System.out.println("output : program close");
    }


    public static class Calculator {
        public static void add(int x, int y) {
            System.out.println(x + y);

        }

        public static void subtract(int x, int y) {

            System.out.println(x - y);

        }

        public static void multiply(int x, int y) {

            System.out.println(x * y);

        }


        //        public static void division(int x, int y) throws IllegalArgumentException{
//           if(y == 0){
//               throw new IllegalArgumentException("IllegalArgumentException");
//           }
//            System.out.println(x/y);
//
//
//        }
        public static void division(int x, int y) {
            try {
                System.out.println(x / y);
            } catch (ArithmeticException e) {
                throw new IllegalArgumentException("division by 0 is not allowed try again");
            }
        }
//        public static void modulor(int x, int y) throws IllegalArgumentException {
//            if(y==0){
//                throw new IllegalArgumentException("IllegalArgumentException");
//            }
//            System.out.println(x%y);
//        }

        public static void modular(int x, int y) {
            try {
                System.out.println(x % y);
            } catch (ArithmeticException e) {
                throw new IllegalArgumentException("modular by 0 is not allowed try again");
            }
        }

        public static double rightsignal(String num) {

            try {
                return Double.parseDouble(num);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("wrong input try again");

            }
        }


    }
}





