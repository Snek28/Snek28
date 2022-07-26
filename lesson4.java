import java.util.Scanner;
public class lesson4 {
    public static void main(String[] args) {
        System.out.println("please input number of hour");
        Scanner scanner = new Scanner(System.in);
        int hour =  scanner.nextInt();
        switch (hour) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                System.out.println("Good Morning");
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                System.out.println("Good day");
                break;
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                System.out.println("Good night");
                break;
            default:
                System.out.println("no hour");

        }
    }
}