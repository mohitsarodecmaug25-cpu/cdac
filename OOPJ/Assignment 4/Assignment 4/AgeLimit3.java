import java.util.*;

class AgeLimit3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age: ");
		String age = sc.nextLine();
		try{
		int i = Integer.parseInt(age);
		System.out.println("User enter age: " + i);
		}catch(NumberFormatException e){
			System.out.println("Invalid Number format");
		}
	}
}