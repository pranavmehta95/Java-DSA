package Conditional;

import java.util.Scanner;

public class markstograde {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks : ");
        int marks = sc.nextInt();
        if(marks>=90 && marks<=100){    
            System.out.print("Grade A");
        }
        else if(marks>=80 && marks<90){
            System.out.print("Grade B");
        }
        else if(marks>=70 && marks<80){
            System.out.print("Grade C");
        }
        else if(marks>=60 && marks<70){
            System.out.print("Grade D");
        }
        else if(marks>=50 && marks<60){
            System.out.print("Grade E");
        }
        else if(marks>=0 && marks<50){
            System.out.print("Grade F");
        }
        else{
            System.out.print("Invalid Marks");
        }
    }
    
}
