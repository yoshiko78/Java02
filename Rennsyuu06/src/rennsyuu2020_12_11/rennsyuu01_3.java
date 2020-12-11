package rennsyuu2020_12_11;
/**問題集：http://www.kitako.tokyo/lib/JavaExercise.aspx?id=3 Java問題集
 *@author Maro2
 *問3-1 int 型の変数 x、y にそれぞれ数値を入力し、x が y より大きい場合に、
 *“xはyより大きい。”という文を表示するプログラムを作成しなさい。
 */

import java.io.IOException;
import java.util.Scanner;
public class rennsyuu01_3 {

	public static void main(String[] args) throws IOException{
		System.out.println("数字を2つ入力してください");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		scanner.close();
		if ( x > y ) {
			System.out.println("xはyより大きい。");
		}

	}

}
