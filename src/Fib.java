import java.util.Scanner;

/**
 * Created by Валентина on 24.05.2017.
 */
public class Fib {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input index of search number");
        int index = scanner.nextInt();
        int fib1 = 1;
        int fib2 = 1;
        int i = 2;
        int fib = 2;
        if (index == 0){
            System.out.println("Search number is "+ 0);
        }
        if (index == 1){
            System.out.println("Search number is "+ 1);
        }
        if (index == 2){
            System.out.println("Search number is "+ 1);
        }

        while(i < index){
            fib = fib1+fib2;
            fib1 = fib2;
            fib2 = fib;
            i++;
        }
        System.out.println("Search number is " + fib);

    }
}

