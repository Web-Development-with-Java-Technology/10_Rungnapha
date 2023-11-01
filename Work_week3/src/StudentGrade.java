import java.util.Scanner;
public class StudentGrade{
    public static void main(String[]args) throws Exception {
       /* 
        //workshop1 เขียนโปรแกรมแสดงข้อความออกทางจอภาพ
        System.out.println("Nakhon Pathom Vocational Collage");
        System.out.println("Name : Rungnapha Aiamchukun");
        System.out.println("Nickname : Benz");
        System.out.println("Student ID : 65309010012");

        //ไวยากรณ์
        String name = "BBBBB";
        System.out.println("Name : " + name + (8*8));
        
        
        //การรับค่าผ่านทางแป้นพิมพ์
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter your number 1 : ");
        int num = kb.nextInt();

        Scanner kb1 = new Scanner(System.in);
        System.out.print("Enter your number 2 : ");
        int num1 = kb1.nextInt();

        kb.close();
        kb1.close();
        System.out.println(num*num1);*/

        //workshop 2.1
        Scanner gpa = new Scanner(System.in);
        System.out.println("Nakhon Pathom Vocational Collage");
        System.out.println("Name : Rungnapha Aiamchukun");
        System.out.println("Nickname : Benz");
        System.out.println("Student ID : 65309010012");
        System.out.println("----------------------------------");
        System.out.print("Enter your GPA : ");
        
        int sum = gpa.nextInt();
        
        System.out.println("Resalt GPA :" + sum);

        if (sum>=80) {
            System.out.println("Grade : A");
        }else if (sum>=70) {
            System.out.println("Grade : B");
        }else if (sum>=60) {
            System.out.print("Grade = C");
        }else if (sum>=50) {
            System.out.print("Grade = D");
        }else{
            System.out.println("Grade : F");
        }

        System.out.print("--------------THANK-YOU-------------");
        gpa.close();

    }
}