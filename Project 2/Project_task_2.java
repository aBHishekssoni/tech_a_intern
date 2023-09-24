import java.util.Scanner;

public class Project_task_2 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the marks between 0 to 100");
        for (int index = 0; index < arr.length; index++) {
            arr[index] = sc.nextInt();
        }
        int total_marks = 0;
        for (int j = 0; j < arr.length; j++) {
            total_marks+= arr[j];
        }
        System.out.println(total_marks +"/" + n*100);
        int Avarage_persentage = total_marks/n;
        System.out.println(Avarage_persentage +"%");
        if (Avarage_persentage>=95) {
            System.out.println("O (outstanding)");
        } else if(Avarage_persentage<95&&Avarage_persentage>=85) {
            System.out.println("A+");
        }
        else if (Avarage_persentage<85&&Avarage_persentage>=75) {
            System.out.println("A");
        }
        else if (Avarage_persentage<75&&Avarage_persentage>=65) {
            System.out.println("B+");
        }
        else if (Avarage_persentage<65&&Avarage_persentage>=55) {
            System.out.println("B");
        }
        else if (Avarage_persentage<55&&Avarage_persentage>=45) {
            System.out.println("C+");
        }
        else if (Avarage_persentage<45&&Avarage_persentage>=35) {
            System.out.println("D");
        }
        else if (Avarage_persentage<30) {
            System.out.println("F (Fail)");
        }
    }
}
