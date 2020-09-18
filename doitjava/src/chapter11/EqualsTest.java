package chapter11;

class Student {
	int studentId;
	String studentName;

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public String toString() {
		return studentId + ", " + studentName;
	}
}

public class EqualsTest {
	public static void main(String[] args) {
		Student stLee = new Student(100, "이상원");
		Student stLee2 = stLee;
		Student stSang = new Student(100, "이상원");

		if (stLee == stLee2)
			System.out.println("stLee와 stLee2의 주소는 같습니다.");
		else
			System.out.println("stLee와 stLee2의 주소는 다릅니다.");

		if (stLee.equals(stLee2))
			System.out.println("stLee와 stLee2는 동일합니다.");
		else
			System.out.println("stLee와 stLee2는 동일하지 않습니다..");

		if (stLee == stSang)
			System.out.println("stLee와 stSang의 주소는 같습니다.");
		else
			System.out.println("stLee와 stSang의 주소는 다릅니다.");

		if (stLee.equals(stSang))
			System.out.println("stLee와 stSang는 동일합니다.");
		else
			System.out.println("stLee와 stSang는 동일하지 않습니다.");
		
		if(stLee.studentName==stSang.studentName)
		{
			System.out.println("같다");
		}
		else
			System.out.println("다르다");
	}
}
