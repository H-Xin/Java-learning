//个人日常消费记录
class Account{
	public static void main(String[] args){
		int money = 10000;             //初始余额         
		boolean isFlag = true;
		String details = "收支情况\t收支金额\t情况说明\t所剩余额\n";
		while(isFlag){
			System.out.println("----------------------日常消费情况----------------------");
			System.out.println("                     （1）明细查询");
			System.out.println("                     （2）收入记录");
			System.out.println("                     （3）支出记录");
			System.out.println("                     （4）退    出");
			System.out.println("--------------------------------------------------------");
			System.out.print("请输入您要使用的功能项（1-4）：");
			char selection = MainFunction.readMenuSelection();
			System.out.println();
			switch(selection){
			case '1':
				System.out.println("------------------------账单明细------------------------");
				System.out.println(details);
				System.out.println("--------------------------------------------------------");
				break;
			case '2':
				System.out.print("请输入收入金额（一万之内）：");
				int inMoney = MainFunction.readNumber();
				System.out.print("请输入情况说明（三个字之内）：");
				String inInfor = MainFunction.readString();
				money += inMoney;
				details += ("  收入"+"\t\t"+inMoney+"\t\t"+inInfor+"\t\t"+money+"\n");
				break;
			case '3':
				System.out.print("请输入支出金额（一万之内）：");
				int outMoney = MainFunction.readNumber();
				System.out.print("请输入情况说明（三个字之内）：");
				String outInfor = MainFunction.readString();
				money -= outMoney;
				details += ("  支出"+"\t\t"+outMoney+"\t\t"+outInfor+"\t\t"+money+"\n");
				break;
			case '4':
				System.out.print("请确认是否退出（Y/N）：");
				char isExit = MainFunction.readConfirmSelection();
				if(isExit == 'Y'){
					isFlag = false;
				}
				break;
			}
		}
	}
	
}