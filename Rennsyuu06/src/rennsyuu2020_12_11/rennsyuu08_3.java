package rennsyuu2020_12_11;

import java.util.Scanner;

/**問題集：http://www.kitako.tokyo/lib/JavaExercise.aspx?id=3 Java問題集
 *@author Maro2
 *問3-5
中間試験と、期末試験の点数（それぞれ 0 ～ 100 点）を入力し、次の条件に従って合格、
不合格を判定するプログラムを作成しなさい。
両方とも 60 点以上の場合、合格
合計が 130 点以上の場合、合格
合計が 100 点以上で、どちらかの試験が 90 点以上であれば合格
上記以外は不合格

 */

public class rennsyuu08_3 {
	public static void main(String [] args) {
		System.out.println("数字を入力してください");
		Scanner scanner = new Scanner(System.in);
		int score1 = scanner.nextInt();
		int score2 = scanner.nextInt();
		scanner.close();

		if( score1 >= 60 && score2 >= 60 )
		    System.out.println( "合格" );
		else if( ( score1 + score2 ) >= 130 )
		    System.out.println( "合格" );
		else if( ( score1 + score2 ) >= 100 && ( score1 >= 90 || score2 >= 90 ) )
		    System.out.println( "合格" );
		else
		    System.out.println( "不合格" );

	}
}
