package q03;

import java.sql.SQLOutput;

public class MainE03 {
    public static void main(String[] args) {

        double grade_one = 7.5;
        double grade_two = 4.5;
        double grade_three = 9.5;

        double grade_mean = (grade_one + grade_two + grade_three) / 3;

        if (grade_mean >= 7) {
            System.out.println("The grade mean is " + grade_mean + ". You are approved!");
        }

        else if (grade_mean < 4) {
            System.out.println("The grade mean is " + grade_mean + ". You are reproved!");
        }

        else {
            System.out.println("The grade mean is " + grade_mean + ". You are on final test!");
        }
    }
}
