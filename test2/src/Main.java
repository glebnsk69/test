import java.util.Scanner;
public class Main {
    public static class Students{
        Students(){
            secName = new String();
            secName = "WWWWWWW";
            System.out.println("Studentd constructor");
        }

        String secName;
        int GPA;
        String spec;
    }
    static Students[] students;

    public static void main(String[] args) {
        students = new Students[3];
        Students sss = new Students();

        System.out.println("Hello world!");
//        students[0].secName="xxxxx";
        //setSD();
    }

    public static void setSD(){
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < students.length; i++) {
            System.out.print("enter fname "+(i+1)+" student: ");
            String fname = scan.nextLine();
            System.out.print("enter GPA "+(i+1)+" student: ");
            int gpa = scan.nextInt();
            System.out.print("enter spec "+(i+1)+" student: ");
            String spec = scan.nextLine();
            students[i].secName=fname;
        }
    }
}