package containPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContainPracticeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count1 = 0;
		int index = 0;

		/*
		//文字列の入力
		String line1 = sc.nextLine();

		//@の個数を数える
		while(true){
			index = line1.indexOf("@", index) + 1;
			if(index == 0){
				break;
			}
			count1++;
		}
		System.out.println("index:" + index);
		System.out.println("count:" + count1);
		*/
		/* ------------------------- */

		/*
		//ArrayListを用いて列ごとに判断したい場合
		System.out.println("列の個数を整数値で入力してください");
		int countNum = sc.nextInt();

		List<String> column = new ArrayList<String>();
		List<Integer> countColumn = new ArrayList<Integer>();

		//検索したい文字の設定
		System.out.println("検索したい文字を入力してください");
		String search = sc.next();

		//文字列の設定
		System.out.println("先ほど入力した文字が含まれているか検索したい文字列を "+ countNum + " 回入力してください");
		for(int i = 0; i < countNum; i++){
			column.add(sc.next());
		}

		//回数を数えるカウントの設定
		for(int i = 0; i < column.size(); i++){
			countColumn.add(0);
		}

		//出てきた回数を記録
		for(int i = 0; i < column.size(); i++){
			while(true){
				index = column.get(i).indexOf(search, index) + 1;
				if(index == 0){
					break;
				}
				countColumn.set(i, countColumn.get(i) + 1);
			}
		}

		//含まれている個数の出力
		for(int i = 0; i < column.size(); i++){
			System.out.println(countColumn.get(i));
		}

		*/


		//ArrayListを用いてエリアごとに判断したい場合
		System.out.println("列の個数を整数値で入力してください");
		int countNum = sc.nextInt();

		List<String> column = new ArrayList<String>();
		List<Integer> countColumn = new ArrayList<Integer>();

		//検索したい文字の設定
		System.out.println("検索したい文字を入力してください");
		String search = sc.next();


		//文字列の設定


		System.out.println("先ほど入力した文字が含まれているか検索したい文字列を "+ countNum + " 回入力してください");
		for(int i = 0; i < countNum; i++){
			System.out.println("文字列を入力してください");
			String newLine = sc.next();
			System.out.println("何文字目までで区切りをつけたいかを入力してください");
			int sepNum = sc.nextInt();
			String firstHalf = newLine.substring(0, sepNum);
			String secondHalf = newLine.substring(sepNum);
			column.add(firstHalf);
			column.add(secondHalf);

		}



		//回数を数えるカウントの設定
		for(int i = 0; i < column.size()*2; i++){
			countColumn.add(0);
		}

		//出てきた回数を記録
		for(int i = 0; i < column.size(); i++){
			while(true){
				index = column.get(i).indexOf(search, index) + 1;
				if(index == 0){
					break;
				}
				countColumn.set(i, countColumn.get(i) + 1);
			}
		}

		//前半後半の文字列と含まれている個数の出力
		for(int i = 0; i < countNum*2; i++){
			if(i % 2 == 0){
				System.out.println( "前半：" + column.get(i));
			}else{
				System.out.println( "後半:" + column.get(i));
			}
			System.out.println(search + "が含まれている個数：" + countColumn.get(i) + "個");
		}

	}
}

