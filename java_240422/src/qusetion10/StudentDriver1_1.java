package qusetion10;

public class StudentDriver1_1 {
	public static void main(String[] args) {
		Student1_1 student1, student2;
		
		student1 = new Student1_1();
		student1.setName("갑돌");
		student1.setNumber(100);
		student1.setDepartment("컴퓨터공학과");
		
		System.out.println("이름: "+ student1.getName() + "\n학번: "+ student1.getNumber() 
					+ "\n소속학과: " + student1.getDepartment());
		System.out.println();
		
		student2 = new Student1_1();
		student2.setName("갑순");
		student2.setNumber(200);
		student2.setDepartment("건축학과");
		
		System.out.println("이름: "+ student2.getName() + "\n학번: "+ student2.getNumber() 
					+ "\n소속학과: " + student2.getDepartment());
		System.out.println();
		
		student2.setDepartment("수학과");
		System.out.println("이름: "+ student2.getName() + "\n학번: "+ student2.getNumber() 
					+ "\n소속학과: " + student2.getDepartment());
	}
}