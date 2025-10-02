class SalarySplit1{
	static int bonusSplit(int bonus, int employee){
		int share = bonus/employee;
		return share;
	}
	public static void main(String args[]){
	try{
		System.out.println("Employee will get : " + bonusSplit(10000, 5));
		bonusSplit(10000, 0);
	}catch(ArithmeticException e){
		System.out.println("Error.Division by zero not allowed");
	}
	}
}