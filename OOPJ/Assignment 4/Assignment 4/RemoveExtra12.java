class RemoveExtra12{
	public static void main(String args[]){
		StringBuilder sb = new StringBuilder("Please read - Do not disturb");
		sb.delete(12,28);
		System.out.println(sb);
	}
}