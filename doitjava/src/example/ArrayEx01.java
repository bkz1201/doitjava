package example;

public class ArrayEx01 {
	public static void main(String[] args) {
		char[] alp = new char[26];
		char flag = 97;
		for (int i = 0; i < alp.length; i++) {
			alp[i] = flag++;
			// alp[i]=char('a'+i);
		}
		System.out.println(alp);
	}
}
