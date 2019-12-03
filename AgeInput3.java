import java.util.Scanner;

class AgeInput3{
	public static void main(String [] args){
		int age;
		Scanner s = new Scanner(System.in);
		
		while(true){
			System.out.print("나이를 입력하세요: ");
			age=s.nextInt();
			//탈출조건
			if(age<=150&&age>0)break; // break:반복문 탈출	
			System.out.println("[입력오류]유효한 나이가 아닙니다. 다시 입력바랍니다. ");
		}
		
		System.out.printf("당신의 나이는 : %d세 입니다.\n",age);
}
}