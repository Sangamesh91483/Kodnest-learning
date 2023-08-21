import java.util.Scanner;

public class Method {

	public static void main(String[] args)
	{
         Scanner scan = new Scanner(System.in);
         System.out.println("enter the name");
         String name = scan.nextLine();
         greet(name);
         System.out.println("enter year of birth");
         int year = scan.nextInt();
         int res = age(year);
         System.out.println("your are "+res +" year old");
       
         
         scan.close();
      
		}
	public static void greet(String name) {
		System.out.println("hello  "+name+"  ...how are you..");
		
	}
	public static int age(int year) {
		
		return 2023-year;

		
	}
}
