package rennsyuu2020_12_11;

/**問題集：http://www.kitako.tokyo/lib/JavaExercise.aspx?id=3 Java問題集
 *@author Maro2
 *問3-2 ２つの整数値を入力し、
 *大きい方（小さくない方）の数を表示するプログラムを作成しなさい。
 */
import java.util.Scanner;
public class rennsyuu02_3 {
	public static void main(String [] args) {
		System.out.println("数字を2つ入力してください");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		scanner.close();

		if (x > y) {
			System.out.println(x);
		} else {
			System.out.println(y);
		}
		}

}
