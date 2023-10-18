package hw1;

public class Q3 {
	public static void main(String[] args) {
		int sec=256559;
		System.out.println(sec/(60*60*24));
		sec%=(60*60*24);
		System.out.println(sec/(60*60));
		sec%=(60*60);
		System.out.println(sec/60);
		sec%=60;
		System.out.println(sec);
	}
}
