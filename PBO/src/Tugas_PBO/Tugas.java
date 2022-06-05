package Tugas_PBO;



import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        int i = 1;

        int totalInput;
        int totalValid;
        float average;
        int sum = 0;

        totalInput = totalValid = 0;

        System.out.printf("Total min : ");
        int min = inputUser.nextInt();
        System.out.printf("Total max : ");
        int max = inputUser.nextInt();

        while (i != -999 && totalInput < 100) {
            totalInput++;
            if (i >= min && i <= max) {
                totalValid++;
                sum = sum + i;
            } else {
            }
            i++;
        }
        System.out.println(sum);
        System.out.println(totalValid);
        if (totalValid > 0) {
            average = (float) sum / (float) totalValid;
        } else  {
            average = -999;
        }
        System.out.println(average);
    }
}
