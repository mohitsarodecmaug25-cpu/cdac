import java.util.*;
class PaymentProcess25{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Amount as String: ");
		String s = sc.nextLine();
		System.out.print("Additional amount to add: ");
		int n1 = sc.nextInt();
		int a = Integer.parseInt(s);
		int add = n1+a;
		System.out.print(n1 + " + " + a + " = " + add);
	}
}