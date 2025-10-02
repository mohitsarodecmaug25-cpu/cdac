class ExamScore2{
	public static void main(String args[]){
		String arr[] = {"78" , "90", "85"};
		
	try{
		String s1 = arr[2];
		System.out.println("Student 2 having " + s1 + " marks");
		String s2 = arr[5];
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Invalid index accessed");
	}
	}
}