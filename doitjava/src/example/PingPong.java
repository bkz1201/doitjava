package example;

public class PingPong {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i+" ");
			if (i % 3 == 0)
				System.out.print("Ping");
			if (i % 5 == 0)
				System.out.print("pong");
			System.out.println();
		}
	}
}
