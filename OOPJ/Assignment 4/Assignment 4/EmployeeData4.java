class EmployeeData4{
	static void calculateWage(int[] salary ,int index, int hours){
        try{
			int sal = salary[index];
			try{
				int wage = sal/hours;
				System.out.println("Employee wage: " + wage);
			}catch(ArithmeticException e){
				System.out.println("Divison by zero");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid Index");
		}
		
	}
	public static void main(String args[]){
		int[] salary = {5000, 6000};
		calculateWage(salary,0,5);
		calculateWage(salary,1,0);
		calculateWage(salary,2,5);
		
}
}