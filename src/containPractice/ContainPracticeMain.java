package containPractice;

import java.util.Scanner;

public class ContainPracticeMain {
	public static void main(String[] args) {
		//文字列の入力
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		int count = 0;
		int index = 0;

		index = line.indexOf("@");
		System.out.println("index:" + index);
		System.out.println("count:" + count);
	}

}

//sc.nextLine();
