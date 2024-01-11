package hw4;

import java.util.Scanner;

public class HW4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		有個一維陣列如下:{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
		int[] array1 = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;
		for (int i = 0; i < array1.length; i++) {
			sum += array1[i];
		}
		System.out.println("此陣列所有元素的平均值 = " + (sum / array1.length));
		System.out.print("大於平均值的元素有：");
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] > (sum / array1.length)) {
				System.out.print(array1[i] + " ");
			}
		}
		System.out.println();
		System.out.println("=============");

//		請建立一個字串,經過程式執行後,輸入結果是反過來的
//		例如String s = “Hello World”,執行結果即為dlroW olleH
		String s1 = "Hello World";
		for (int i = s1.length(); i > 0; i--) {
			System.out.print(s1.charAt(i - 1));
		}
		System.out.println();
		System.out.println("=============");

//		有個字串陣列如下 (八大行星):
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
		String[] s2 = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		char[] s3 = { 'a', 'e', 'i', 'o', 'u' };
		int count = 0;

		for (int i = 0; i < s2.length; i++) {
			for (int j = 0; j < s2[i].length(); j++) {
				char c1 = s2[i].charAt(j);
				for (int k = 0; k < s3.length; k++) {
					if (c1 == s3[k])
						count++;
				}
			}
		}

		System.out.println(count);
		System.out.println("=============");
		
//		阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共 3 人!」
		int[] empno = { 25, 32, 8, 19, 27 };
		int[] cash = { 2500, 800, 500, 1000, 1200 };
		count = 0;

		System.out.println("小華欲借的金額：");
		int m = sc.nextInt();
		System.out.print("有錢可借的員工編號：");
		for (int i = 0; i < cash.length; i++) {
			if (cash[i] >= m) {
				System.out.print(empno[i]+" ");
				count++;
			}
		}
		System.out.println("共 " + count + " 人!");
		System.out.println("=============");

//		請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//		例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		

		

//		班上有8位同學,他們進行了6次考試,請算出每位同學考最高分的次數
		
		

	}
}
