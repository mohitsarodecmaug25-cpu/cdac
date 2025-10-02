class Employee {
private int age;
public void setAge(int age) {
if (age >=18) this.age = age;
else System.out.println("Invalid age");
}
public int getage() { return age; }
}
class P3_Main {
public static void main(String[] args) {
P3_Employee e = new P3_Employee();
e.setage(17);
e.setage(25);
System.out.println("Age = " + e.getAge());
}
}