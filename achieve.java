//实现功能：查看记录收入支出
public class achieve {
	public static void main(String[] args) {
		int fundNum = 10000;
		String detail = "收支 \t账户金额 \t收支金额 \t说    明\n";
		boolean loopFlag = true;
		
		do {
			System.out.println("\n-----------------家庭收支记账软件-----------------\n");
            System.out.println("                   1 收支明细");
            System.out.println("                   2 登记收入");
            System.out.println("                   3 登记支出");
            System.out.println("                   4 退    出\n");
            System.out.print("                   请选择(1-4)：");
            
            char key = Utility.readMenuSelection();
            switch(key) {
            
            case '1':
            	System.out.println("当前收支明细 \n" + detail);
            	break;
            case '2':
            	System.out.println("输入收入金额：");
            	int moneyIn = Utility.readNumber();
            	fundNum += moneyIn;
            	System.out.println("输入收入来源：");
            	String sourceIn = Utility.readString();
            	detail += "收入\t" + "账户金额" + fundNum + "\t" +
            	"收入金额" + moneyIn + "\t" + sourceIn + "\n";
            	System.out.println("收录完成");
            	break;
            case '3':
            	System.out.println("输入支出金额：");
            	int moneyOut = Utility.readNumber();
            	fundNum -= moneyOut;
            	String sourceOut = Utility.readString();
            	detail += "支出\t" + "账户金额" + fundNum + "\t" +
                    	"支出金额" + moneyOut + "\t" + sourceOut + "\n";
            	System.out.println("收录完成");
            	break;
            case '4':
            	System.out.println("是否退出（Y/N）");
            	char choice = Utility.readConfirmSelection();
            	if(choice == 'Y') {
            		break;
            	}else {
            		loopFlag = false;
            	}
            }
		}while(loopFlag);
	}
}
