//ʵ�ֹ��ܣ��鿴��¼����֧��
public class achieve {
	public static void main(String[] args) {
		int fundNum = 10000;
		String detail = "��֧ \t�˻���� \t��֧��� \t˵    ��\n";
		boolean loopFlag = true;
		
		do {
			System.out.println("\n-----------------��ͥ��֧�������-----------------\n");
            System.out.println("                   1 ��֧��ϸ");
            System.out.println("                   2 �Ǽ�����");
            System.out.println("                   3 �Ǽ�֧��");
            System.out.println("                   4 ��    ��\n");
            System.out.print("                   ��ѡ��(1-4)��");
            
            char key = Utility.readMenuSelection();
            switch(key) {
            
            case '1':
            	System.out.println("��ǰ��֧��ϸ \n" + detail);
            	break;
            case '2':
            	System.out.println("���������");
            	int moneyIn = Utility.readNumber();
            	fundNum += moneyIn;
            	System.out.println("����������Դ��");
            	String sourceIn = Utility.readString();
            	detail += "����\t" + "�˻����" + fundNum + "\t" +
            	"������" + moneyIn + "\t" + sourceIn + "\n";
            	System.out.println("��¼���");
            	break;
            case '3':
            	System.out.println("����֧����");
            	int moneyOut = Utility.readNumber();
            	fundNum -= moneyOut;
            	String sourceOut = Utility.readString();
            	detail += "֧��\t" + "�˻����" + fundNum + "\t" +
                    	"֧�����" + moneyOut + "\t" + sourceOut + "\n";
            	System.out.println("��¼���");
            	break;
            case '4':
            	System.out.println("�Ƿ��˳���Y/N��");
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
