import java.lang.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Pass {
    public static void main(String[] args) {
        int[][] p={{1,2,3},
                   {4,5,6},
                   {7,8,9}

    };
        // Display the pattern grid
        ArrayList<Integer> setPass=new ArrayList<Integer>();
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(p[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }

        // Set Pattern
        System.out.println("SET YOUR PATTERN LOCK *press 0 when pattern is set*");
        Scanner setting=new Scanner(System.in);
        int set;
        for(int i=0;i<9;i++){
            set = setting.nextInt();
            if(set==0){
                break;
            }
                else{
                    setPass.add(set);
                }
        }

        // Allow the user 3 attempts to enter the pattern correctly
        int attempts = 0;
        boolean isCorrect = false;

        // User Enters Pattern to unlock
        while(attempts < 3 && !isCorrect) {
            System.out.println("ENTER YOUR PATTERN *press 0 when you have entered your pattern*");
            ArrayList<Integer> userPass = new ArrayList<Integer>();
            Scanner sc = new Scanner(System.in);
            int pw;
            for (int i = 0; i < 9; i++) {
                pw = sc.nextInt();
                if (pw == 0) {
                    break;
                } else {
                    userPass.add(pw);
                }
            }
            System.out.println(userPass);

            // Check both are equal
            isCorrect = (userPass.equals(setPass));
            if (isCorrect) {
                System.out.println("CORRECT PASSWORD");
            } else {
                attempts++;
                if (attempts < 3) {
                    System.out.println("WRONG PASSWORD. Try again. (" + (3 - attempts) + " attempts left)");
                } else {
                    System.out.println("ZERO ATTEMPTS LEFT");
                }
            }
        }
    }

}
