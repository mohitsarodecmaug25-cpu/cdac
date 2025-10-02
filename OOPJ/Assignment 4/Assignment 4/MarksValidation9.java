import java.util.*;

class MarksValidation9{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the marks: ");
		int marks = sc.nextInt();
		
		try{
			if (marks >= 0){
				System.out.println("Valid Marks");
			}else{
				throw new Exception("Invalid marks");
			}
		}catch(Exception e){
				System.out.println(e.getMessage());
			}
		
	}

}