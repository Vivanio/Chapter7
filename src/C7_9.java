
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
public class C7_9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] Dim = new double[10];
        System.out.print("Please input 10 numbers : ");
        for (int x = 0; x < Dim.length; x++) {
            Dim[x] = input.nextDouble();
        }
        min(Dim);
        System.out.println("The Minimum number is " + min(Dim));

    }

    //(int)Math.round(double);
    public static double min(double[] array) {
        double Tiny = 0;
        Arrays.sort(array);
        Tiny = array[0];

        return Tiny;
    }
}
