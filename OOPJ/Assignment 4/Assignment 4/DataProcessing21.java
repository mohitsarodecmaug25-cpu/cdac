class DataProcessing21{
	static void dataProcess(){
		try{
			throw new Exception("Invalid Input");
		}catch(Exception e){
			System.out.println("Exception occured: " + e.getMessage());
		}finally{
			System.out.println("Data Processing completed");
		}
	}
	public static void main(String args[]){
		dataProcess();
	}
}