class OnlineShopping5{
	static void calculateTotal(double[] price ,int index, int unitp){
        try{
			double pc = price[index];
			try{
				if(unitp <= 0){
					throw new ArithmeticException("Invalid Quantity");
				}
				double total = pc * unitp;
				System.out.println("Total Price: " + total);
			}catch(ArithmeticException e){
				System.out.println("Arithmetic Exception Caught");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index Exception");
		}
		
	}
	public static void main(String args[]){
		double[] price = {299.99, 499.99, 199.99};
		calculateTotal(price,0,3);
		calculateTotal(price,1,0);
		calculateTotal(price,5,5);
}
}