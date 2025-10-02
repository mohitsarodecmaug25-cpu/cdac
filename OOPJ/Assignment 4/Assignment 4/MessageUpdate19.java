class MessageUpdate19{
	public static void main(String args[]){
		StringBuffer sb = new StringBuffer("Old Notice");
		sb.replace(0,3, "Updated");
		System.out.println(sb);
	}
}