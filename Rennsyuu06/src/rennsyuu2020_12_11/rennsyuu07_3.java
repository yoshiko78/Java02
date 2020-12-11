package rennsyuu2020_12_11;

/**問題集：http://www.kitako.tokyo/lib/JavaExercise.aspx?id=3 Java問題集
 *@author Maro2
 *問3-7 試験の点数を入力し、対応する成績を表示するプログラムを３種類作成しなさい。
 */
import java.util.Scanner;

public class rennsyuu07_3 {
	public static void main(String [] args) {
		System.out.println("点数を入力してください");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		if ( score >= 60) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}

		System.out.println("点数を入力してください");
		Scanner scanner2 = new Scanner(System.in);
		int score2 = scanner.nextInt();
		scanner.close();
		scanner2.close();

		if ( score2 >= 80) {
			System.out.println("優");
		} else if ( score2 >= 60){
			System.out.println("可");
		} else {
			System.out.println("不可");
		}
	}

}
