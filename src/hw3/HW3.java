package hw3;

import java.util.Scanner;

public class HW3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形
		System.out.println("請輸入三個整數：");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a == b && b == c && a != 0 && b != 0 && c != 0) {
			System.out.println("正三角形");
		} else if ((a == b || b == c || a == c) && a != 0 && b != 0 && c != 0) {
			System.out.println("等腰三角形");
		} else if (((a + b > c) || (a + c > b) || (b + c > a)) && a != 0 && b != 0 && c != 0) {
			System.out.println("其它三角形");
		} else {
			System.out.println("不是三角形");
		}

//		請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息
		int ran1 = (int) (Math.random() * 9);
		System.out.println("開始猜數字吧！");
		do {
			int num = sc.nextInt();
			if (num == ran1) {
				System.out.println("答對了！答案就是" + ran1);
				break;
			} else {
				System.out.println("猜錯囉");
			}
		} while (true);
//		
//		阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討厭哪個數字,
//		請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇的號碼與總數
		System.out.println("阿文...請輸入你討厭哪個數字？");
		int num2 = sc.nextInt();
		int num10 = num2 * 10;
		int count = 0;
		for (int i = 1; i <= 49; i++) {
			if ((i % 10 != num2) && ((i - num10 < 0) || (i - num10 > 9))) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("\n總共有" + count + "個可選");

	}
}
