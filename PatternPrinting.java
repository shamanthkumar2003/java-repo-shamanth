package operator;

import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();         
        char key = scanner.next().charAt(0); 

        for (int i = 1; i <= num - 1; i++) {
            if (i == 1) {
                for (int j = 1; j < num * 2; j++) {
                    System.out.print(key);
                }
            } else {
                
                for (int j = 0; j < num - i + 1; j++) {
                    System.out.print(key);
                }

                for (int j = 0; j < ((i - 1) * 2) - 1; j++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < num - i + 1; j++) {
                    System.out.print(key);
                }
            }
            System.out.println();
        }

        //down part
        for (int i = num; i >= 1; i--) {
            if (i == 1) {
                
                for (int j = 1; j < num * 2; j++) {
                    System.out.print(key);
                }
            } else {
               
                for (int j = 0; j < num - i + 1; j++) {
                    System.out.print(key);
                }

                
                for (int j = 0; j < ((i - 1) * 2) - 1; j++) {
                    System.out.print(" ");
                }

               
                for (int j = 0; j < num - i + 1; j++) {
                    System.out.print(key);
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
