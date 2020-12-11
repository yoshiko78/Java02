package rennsyuu2020_12_11;

/**問題集：http://www.kitako.tokyo/lib/JavaExercise.aspx?id=3 Java問題集
 *@author Maro2
 *問3-5 正の整数値を入力し、それが偶数か奇数かを判定するプログラムを作成しなさい。
 */
import java.util.Scanner;

public class rennsyuu05_3 {
	public static void main(String [] args) {
		System.out.println("数字を入力してください");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();

		//÷2して余りが出なかったら偶数

		if ((x % 2) == 0) {
			System.out.println("偶数です");
		} else {
			System.out.println("奇数です");
		}
	}

}
