import java.util.Scanner;

class AgeInput3{
	public static void main(String [] args){
		int age;
		Scanner s = new Scanner(System.in);
		
		while(true){
			System.out.print("���̸� �Է��ϼ���: ");
			age=s.nextInt();
			//Ż������
			if(age<=150&&age>0)break; // break:�ݺ��� Ż��	
			System.out.println("[�Է¿���]��ȿ�� ���̰� �ƴմϴ�. �ٽ� �Է¹ٶ��ϴ�. ");
		}
		
		System.out.printf("����� ���̴� : %d�� �Դϴ�.\n",age);
}
}