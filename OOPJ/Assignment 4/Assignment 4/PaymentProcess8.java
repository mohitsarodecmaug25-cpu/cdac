class PaymentProcess8{
	static void paymentProcess(){
		try{
			throw new Exception("Paymnet Failed");
		}catch(Exception e){
			System.out.println("Exception occured: " + e.getMessage());
		}finally{
			System.out.println("Cleanup done");
		}
	}
	public static void main(String args[]){
		paymentProcess();
	}
}