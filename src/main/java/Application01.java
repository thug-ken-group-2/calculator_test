public class Application01 {
    public static void main(String[] args) {
        // 스캐너로 데이터 입력
        Calculator.add(4, 7);



    }


    // 사칙연산


    public static class Calculator{
        public static void add(int x, int y){


        }

        public static void subtract(int x, int y){

        }

        public static void multiply(int x, int y){

        }


        public static void division(int x, int y) throws IllegalArgumentException{
           if(y == 0){
               System.out.println("연산 불가능");
               throw new IllegalArgumentException();
           }
            System.out.println(x/y);


        }
        public static void modulor(int x, int y) throws IllegalArgumentException {
            if(y==0){
                System.out.println("연산 불가능");
                throw new IllegalArgumentException();
            }
            System.out.println(x%y);
        }


    }



}

