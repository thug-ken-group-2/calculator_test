public class Application01 {
    public static void main(String[] args) {
        // 스캐너로 데이터 입력
        Calculator.add(4, 7);



    }


    // 사칙연산


    public static class Calculator{
        public static void add(int x, int y){

            return 0;
        }

        public static void subtract(int x, int y){

        }

        public static void multiply(int x, int y){

        }


        public static void division(int x, int y) throws IllegalArgumentException{
            int ret =0;
            try{
               ret = x/y;
            } catch (IllegalArgumentException e){
                e.printStackTrace();
            }


        }
        public static void modulor(int x, int y) throws IllegalArgumentException{
            int ret =0;
            try{
                ret = x/y;
            } catch (IllegalArgumentException e){
                e.printStackTrace();
            }
        }

    }



}

