package operator;

import java.util.Scanner;

public class PrintingA {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();         
        char key = scanner.next().charAt(0); 

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }

            System.out.print(key);

            if (num % 2 == 0 && i == num / 2) {
                for (int j = 0; j < num; j++) {
                    if(j%2==1){
                        System.out.print(" ");
                    }
                    else{
                    System.out.print(key);}
                }
            } else if (num % 2 == 1 && i == num / 2) {

                for (int j = 0; j < num - 1; j++) {
                    if(j%2==1){
                        System.out.print(" ");
                    }
                    else{
                    System.out.print(key);}
                }
            } else {
                for (int j = 0; j < i * 2; j++) {
                    System.out.print(" ");
                }
            }

            if (i != 0) {
                System.out.print(key);
            }

            System.out.println();
        }
    }
}
