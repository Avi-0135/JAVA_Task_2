import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\tIts a Student Grade Calculator \n");
        System.out.println("You have to give marks for each subject out of 100 :- ");
        System.out.println("Maths : ");
        int m=sc.nextInt();
        System.out.println("English : ");
        int e=sc.nextInt();
        System.out.println("Science : ");
        int s=sc.nextInt();
        System.out.println("Hindi : ");
        int h=sc.nextInt();
        System.out.println("SST : ");
        int ss=sc.nextInt();

        int total = m+e+s+ss+h;
        int average = total/5;
        float avg_per= total/5f;
        char grade=0;


        if(avg_per>90){
            grade='A';
        }
        else if (avg_per>80 && avg_per<=90){
            grade='B';
        }
        else if (avg_per>70&&avg_per<=80){
            grade='C';
        }
        else if (avg_per>60&&avg_per<=70){
            grade='D';
        }
        else if (avg_per>50&&avg_per<=60){
            grade='E';
        }
        else{
            grade='F';
        }

        System.out.println("So based on your marks, your Total is "+total+"/500 ");
        System.out.println("Your Average is "+ average);
        System.out.println("and your Average percentage is "+avg_per+" %");
        System.out.println("Your grade is "+grade);

    }
}
