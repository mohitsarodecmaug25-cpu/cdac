class Notification11{
	public static void main(String args[]){
		StringBuilder sb = new StringBuilder("Exam postponed");
		//int index = sb.indexOf("postponed");
		sb.replace(5,14, "rescheduled");
		System.out.println(sb);
	}
}