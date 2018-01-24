
import java.util.Arrays;
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
public class C7_26 {

    /**
     *
     * @author Donavon Mitchell
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //boolean lawyer;
        System.out.println("Input length of first list");
        int[] list1 = new int[input.nextInt()];
        System.out.println("Input length of second list");
        int[] list2 = new int[input.nextInt()];
        System.out.println("Input numbers for your first list");
        for (int x = 0; x < list1.length; x++) {
            list1[x] = input.nextInt();
        }
        System.out.println("Input numbers for your second list");
        for (int x = 0; x < list2.length; x++) {
            list2[x] = input.nextInt();
        }
        equals(list1, list2);
        System.out.println(Arrays.toString(list1));
        System.out.println(Arrays.toString(list2));
    }

    public static boolean equals(int[] list1, int[] list2) {
        boolean tracker = true;
        for (int x = 0; x < list1.length; x++) {
            if (list1.length != list2.length) {
                tracker = false;
            }
            try {
                if (list1[x] == list2[x] && tracker == true) {
                    tracker = true;
                } else {
                    tracker = false;
                }
            } catch (Exception e) {
            }
        }
        if (tracker == true) {
            System.out.println("Two lists are strictly identical");
            return true;
        } else {
            System.out.println("Two lists are not strictly identical");
            return false;
        }

        /*if (Arrays.toString(list1) == Arrays.toString(list2))
        {
            System.out.println("Two lists are strictly identical");
            return true;
        }
        else
        {
            System.out.println("Two lists are not strictly identical");
            return false;
        }*/
    }
}
