package rennsyuu2020_12_11;

/**問題集：http://www.kitako.tokyo/lib/JavaExercise.aspx?id=3 Java問題集
 *@author Maro2
 *問3-4 int 型の変数 x、y にそれぞれ数値を入力し、x が ｙ より大きい場合には
 *“xはyより大きい”、x が y より小さい場合には“xはyより小さい”、
 *x と y が等しい場合には“xとyは等しい”と表示するプログラムを作成しなさい。
 */
import java.util.Scanner;
public class rennsyuu04_3 {
	public static void main(String [] args) {
		System.out.println("数字を2つ入力してください");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		scanner.close();

		if ( x > y ) {
			System.out.println("xはyより大きい");
		} else if ( y > x ) {
			System.out.println("xはyより小さい");
		} else if ( x == y ) {
			System.out.println("xとyは等しい");
		}
	}
}