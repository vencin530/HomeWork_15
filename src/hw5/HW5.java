package hw5;

import java.util.Scanner;

public class HW5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//
//		System.out.println("請輸入寬與高：");
//		int width = sc.nextInt();
//		int height = sc.nextInt();
//		starSquare(width, height);

		//
//		System.out.println("本次亂數結果：");
//		randAvg();

		//
//		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
//		double[][] doubleArray = { { 1.3, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
//		System.out.println(maxElement(intArray));
//		System.out.println(maxElement(doubleArray));

		//
		System.out.println("本次隨機產生驗證碼為：");
		genAuthCode();

	}

//	請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形
	public static void starSquare(int width, int height) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}

//	請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
	public static void randAvg() {
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			int com = 0;
			int ran1 = (int) (Math.random() * 100);
			for (int j = 0; j < i; j++) {
				if (ran1 == a[j]) {
					com = 1;
					break;
				}
			}
			if (com == 0) {
				a[i] = ran1;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.printf(a[i] + " ");
		}
		System.out.println();
	}

//	利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
//	可以找出二維陣列的最大值並回傳
	public static int maxElement(int x[][]) {
		int max = x[0][0];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}

	public static double maxElement(double x[][]) {
		double max = x[0][0];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}

//	身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法 genAuthCode(),
//	當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫與數字的亂數組合
	public static void genAuthCode() {
		String[] s = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "a", "b", "c", "d", "e", "f", "g", "h", "i",
				"j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D",
				"E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y",
				"Z" };
		int[] a = new int[8];
		for (int i = 0; i < a.length; i++) {
			int ran1 = (int) (Math.random() * (s.length - 1));
			for (int j = 0; j < i; j++) {
				a[i] = ran1;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.printf(s[a[i]]);
		}
		System.out.println();
	}
	
}