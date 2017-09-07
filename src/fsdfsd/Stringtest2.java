package fsdfsd;
import java.util.*;

public class Stringtest2 {
	public static void main(String[] args){
		String str;
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("문자열을 입력  :  ");
			str = sc.next();
			if(str.equals("quit")==true) {
				System.out.println("종료합니다"); break;
			}
			if(str.matches("^www\\.(.+)")){
				System.out.println(str + " 은 'www'로 시작합니다");				
			}
			else{
				System.out.println(str + " 은 'www'로 시작하지 않습니다");
			}
		}
	}
}
