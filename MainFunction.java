import java.util.Scanner;
//将几个主要的功能封装为方法
public class MainFunction{
	private static Scanner scanner = new Scanner(System.in); 
	//主菜单选项
	public static char readMenuSelection(){
		char c;
		for( ; ; ){
			String str = readKeyBoard(1);    //上限一位数
			c = str.charAt(0);
			if(c != '1' && c != '2' && c != '3' && c != '4'){
				System.out.println("输入有误，请重新输入：");
			}else 
				break;
		}
		return c;
	}
	//收入或支出的金额
	public static int readNumber(){
		int n;
		for( ; ; ){
			String str = readKeyBoard(4);     //上限四位数
			try{
				n = Integer.parseInt(str);
				break;
			}catch(NumberFormatException e){
				System.out.print("输入有误，请重新输入：");
			}
		}
		return n;
	}
	//情况说明
	public static String readString(){
		String str = readKeyBoard(3);                       //上限三个字
		return str;
	}
	//退出确认
	public static char readConfirmSelection(){
		char c;
		for( ; ; ){
			String str = readKeyBoard(1).toUpperCase();
			c = str.charAt(0);
			if(c == 'Y' || c == 'N'){
				break;
			}else{
				System.out.print("输入有误，请重新输入：");
			}
		}
		return c;
	}
	//键盘输入
	private static String readKeyBoard(int limit){
		String line = "";
		while(scanner.hasNext()){
			line = scanner.nextLine();
			if(line.length() < 1 || line.length() > limit){
				System.out.print("输入有误，请重新输入：");
				continue;
			}
			break;
		}
		return line;
	}
}