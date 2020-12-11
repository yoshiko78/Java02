package rennsyuu2020_12_11;

/**問題集：http://www.kitako.tokyo/lib/JavaExercise.aspx?id=3 Java問題集
 *@author Maro2
 *問3-6 整数値を入力し、以下の４つの分類から該当するものを表示するプログラムを作成しなさい。
 *“正の偶数”、“正の奇数”、“負の偶数”、“負の奇数”
 */
import java.util.Scanner;
public class rennsyuu06_3 {
	public static void main(String [] args) {
		System.out.println("数字を入力してください");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();
		
		if ((x%2) == 0) {
			if(x >= 0) {
				System.out.println("正の偶数");
			} else {
				System.out.println("負の偶数");
			}
		} else {
			if(x >= 0) {
				System.out.println("正の奇数");
			} else {
				System.out.println("負の奇数");
			}
			}
		}
}
