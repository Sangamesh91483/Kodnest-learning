import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
	 System.out.println("enter the student first name ");
     String fn = scan.next();
     System.out.println("the name  "+fn);
     System.out.println("enter the student last name ");
     String ln = scan.next();
     System.out.println("the last name  "+ln);
     System.out.println("enter the student age ");
     int age = scan.nextInt();
     System.out.println("the age  "+age);
     System.out.println("enter the student gender");
     String gender = scan.next();
     System.out.println("the gender  "+gender);
     System.out.println("enter the student is married? true or false ");
     boolean married = scan.nextBoolean();
     System.out.println(" is married? "+married);
     System.out.println("enter the student branch ");
     scan.nextLine();
     String branch = scan.nextLine();
     System.out.println("the name  "+branch);
     System.out.println("enter the student height ");
     float height = scan.nextFloat();
     System.out.println("the height "+height);
     System.out.println("enter the student weight ");
     double weight = scan.nextDouble();
     System.out.println("student weight is "+weight);
     
     
     
     
     
	}

}
