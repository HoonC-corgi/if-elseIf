package if_else;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학년을 입력하세요 >> ");
        int grade = scanner.nextInt();
        System.out.print("학점을 입력하세요 >> ");
        int score = scanner.nextInt();

        if(score >= 60) {
            if (grade != 4) {
                System.out.print("합격");
            } else if (score >= 70) {
                System.out.print("합격");
            } else {
                System.out.println("불합격");
            }
        }

        else{
            System.out.println("불합격");
        }
        scanner.close();
    }
}
