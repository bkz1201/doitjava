package chapter13.stream;

public class Student implements Comparable<Student> {
	private String name;
	private int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " - " + score;
	}

	@Override
	public int compareTo(Student o) {
		return Integer.compare(this.score, o.score);
	}

	public enum Sex {
		MALE, FEMALE
	}

	public enum City {
		Seoul, Pusan
	}

	private Sex sex;
	private City city;

	public Student(String name, int score, Sex sex) {
		this.name = name;
		this.score = score;
		this.sex = sex;
	}

	public Student(String name, int score, Sex sex, City city) {
		this.name = name;
		this.score = score;
		this.sex = sex;
		this.city = city;
	}

	public Sex getSex() {
		return sex;
	}

	public City getCity() {
		return city;
	}

}
