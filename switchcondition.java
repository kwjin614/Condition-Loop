import java.util.Scanner;

public class switchcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x,y;
		int op;
		Scanner input = new Scanner(System.in);
		System.out.print("�� �Ǽ� �Է�: ");
		x= input.nextDouble(); y= input.nextDouble();
		System.out.println("��ȣ���� 1(+), 2(-), 3(*), 4(/): ");
		op = input.nextInt();
		switch (op){
		case 1:
			System.out.printf("%.2f + %.2f = %.2f\n", x, y, x+y);
			break;
		case 2:
			System.out.printf("%.2f - %.2f = %.2f\n", x, y, x-y);
			break;
		case 3:
			System.out.printf("%.2f * %.2f = %.2f\n", x, y, x*y);
			break;
		case 4:
			System.out.printf("%.2f / %.2f = %.2f\n", x, y, x/y);
			break;
		default:
			System.err.printf("������ ��ȣ�� �߸� �Է��߽��ϴ�.\n");
		
		}

	}

}
