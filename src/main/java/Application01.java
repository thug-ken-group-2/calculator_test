import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Application01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int x,y;
        char s;
        while(true){
            System.out.println();
            System.out.println("ex) x + y"); // format
            System.out.println("Exit: 0"); // to exit
            System.out.print("Input: ");
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            if(x == 0) break;
            s = st.nextToken().charAt(0);
            y = Integer.parseInt(st.nextToken());

            System.out.print("Output: ");

            switch(s){
                case '+' :
                    Calculator.add(x,y);
                    break;

                case '-' :
                    Calculator.subtract(x, y);
                    break;

                case '*':
                    Calculator.multiply(x,y);
                    break;

                case '/':
                    Calculator.division(x,y);
                    break;

                case '%':
                    Calculator.modulor(x,y);
                    break;

            }

        }
    }



    public static class Calculator{
        public static void add(int x, int y){
            System.out.println(x + y);

        }

        public static void subtract(int x, int y){

            System.out.println(x - y);

        }

        public static void multiply(int x, int y){

            System.out.println(x * y);

        }


        public static void division(int x, int y) throws IllegalArgumentException{
           if(y == 0){
               throw new IllegalArgumentException("IllegalArgumentException");
           }
            System.out.println(x/y);


        }
        public static void modulor(int x, int y) throws IllegalArgumentException {
            if(y==0){
                throw new IllegalArgumentException("IllegalArgumentException");
            }
            System.out.println(x%y);
        }


    }



}

