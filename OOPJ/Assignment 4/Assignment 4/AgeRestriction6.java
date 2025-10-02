import java.util.*;

class AgeNotValidException extends Exception{
	AgeNotValidException(){
	super("AgeNotValidException:Age must be >= 18");
	}
}

class AgeRestriction6{
	static void ageValidation(int age) throws AgeNotValidException{
	if (age >= 18){
		System.out.println(age + " Valid Age");
	}else{
		throw new AgeNotValidException();
	}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		
		try{
			ageValidation(age);
		}catch(AgeNotValidException e){
			System.out.println(e.getMessage());
		}
	}
}
