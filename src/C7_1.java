
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dm0971102
 */
public class C7_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int students;
        System.out.println("Welcome to the Grading Application, please input how many students you have");
        students = input.nextInt();
        System.out.print("Enter " + students + " scores :  \n");
        int[] scores = new int[students];
        for (int x = 0; x < scores.length; x++) {
            scores[x] = input.nextInt();
        }
        Grader(scores);
        System.out.println("Thank you for using this program");
    }

    public static void Grader(int[] scores) {

        int max = scores[0];
        for (int x = 0; x < scores.length; x++) {
            if (max < scores[x]) {
                max = scores[x];
            }
        }
        for (int x = 0; x < scores.length; x++) {
            if (scores[x] >= (max - 10)) {
                System.out.println("Student " + x + "'s score is " + scores[x] + " and the grade is a A");
            } else {
                if (scores[x] >= (max - 20)) {
                    System.out.println("Srudent " + x + "'s score is " + scores[x] + " and the grade is a B");
                } else {
                    if (scores[x] >= (max - 30)) {
                        System.out.println("Student " + x + "'s score is " + scores[x] + " and the grade is a C");
                    } else {
                        if (scores[x] >= (max - 40)) {
                            System.out.println("Student " + x + "'s score is " + scores[x] + " and the grade is a D");
                        } else {
                            System.out.println("Student " + x + "'s score is " + scores[x] + " and the grade is a F");
                        }
                    }
                }
            }

        }
    }
}
