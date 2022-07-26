import java.util.Scanner;
public class Methods {
    static void methods(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = (a * a);
        System.out.print(result+"//"+(result+2));
    }
    static void methods2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("input number");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
      static void methods3(){
        Scanner sc = new Scanner(System.in);
        double A = sc.nextInt();
        double B = 3;
        double C = Math.pow(A,B);
        System.out.println(C);


    }
     static int methods4(int A, int B) {
         int result = 1;
         for (int i = 1; i <= B; i++) {
             result = result * A;
         }
         return result;
     }
        public static void main (String[] args){
        methods2();
        methods();
        methods3();

        System.out.print(methods4(3,2)+methods4(2,6));





    }
}



