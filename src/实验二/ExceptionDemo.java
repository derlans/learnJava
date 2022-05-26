package 实验二;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a interger：");
        try {
            int number = scanner.nextInt();
            System.out.println("The number entered is：" + number);
        }catch (InputMismatchException e){
            System.out.println("输入错误");
        }

    }
}
