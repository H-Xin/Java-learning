import java.util.Scanner;
class Test{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in); 
		boolean is = true;
		while(is){
			int a = scanner.nextInt();
			switch(a){
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				is = false;
				break;
			case 3:
				System.out.println("3");
				break;
			}
		}
	}
}