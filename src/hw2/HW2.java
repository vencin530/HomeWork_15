package hw2;

public class HW2 {
	public static void main(String[] args) {
		int sum = 0;
//	請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("1~1000的偶數和 = " + sum);
//	請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		System.out.println("======================");
		int answer = 1;
		for (int i = 1; i <= 10; i++) {
			answer *= i;
		}
		System.out.println("1~10的連乘積 = " + answer);
//	請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		System.out.println("======================");
		answer = 1;
		int k = 1;
		while (k <= 10) {
			answer *= k;
			k++;
		}
		System.out.println("1~10的連乘積 = " + answer);
//	請設計一隻Java程式,輸出結果為以下:
//	1 4 9 16 25 36 49 64 81 100
		System.out.println("======================");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i * i + " ");
		}
		System.out.println();
//	阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//	輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		System.out.println("======================");
		int count=0;
		System.out.print("阿文可以選擇的數字: ");
		for (int i = 1; i <= 49; i++) {
			if(i<40&&(i%10!=4)) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("\n總共有"+count+"個");
//	請設計一隻Java程式,輸出結果為以下:
//	1 2 3 4 5 6 7 8 9 10
//	1 2 3 4 5 6 7 8 9
//	1 2 3 4 5 6 7 8
//	1 2 3 4 5 6 7
//	1 2 3 4 5 6
//	1 2 3 4 5
//	1 2 3 4
//	1 2 3
//	1 2
//	1
		System.out.println("======================");
		for(int i=10;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
//	請設計一隻Java程式,輸出結果為以下:
//	A
//	BB
//	CCC
//	DDDD
//	EEEEE
//	FFFFFF
		System.out.println("======================");
		char letter = '\u0041';
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(letter);
			}
			System.out.println();
			letter++;
		}
	}
}


