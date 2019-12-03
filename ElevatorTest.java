import java.util.Scanner;

class Elevator{
	int floor;
	boolean door;
	
	void SetDoor(boolean door){
		if(door == true){
			System.out.println("���� �����ϴ�.");
		}
		else	
			System.out.println("���� �����ϴ�.");
	}
	
	void move(int floor) throws Exception{
		SetDoor(false);
		if(-2<=floor && floor<=10){
		if(floor<0){
			System.out.printf("���� %d������ �̵��մϴ�.\n",(-1)*floor);
		}
		else if(floor == 0){
			System.out.println("L������ �̵��մϴ�.");
		}
		else System.out.printf("%d������ �̵��մϴ�.\n",floor);
		}
		
		else {System.out.printf("��ȿ�� ����(-2�̻� 10����)�� �Է��ϼ���.");}
		
		print(floor);
		this.floor = floor;
	}

	void print(int floor) throws Exception{
		if(this.floor>floor){
			for(int i=this.floor; i>=floor;i--){
				if(i<0){
					System.out.printf("B%d ",(-1)*i);
					Thread.sleep(1000);
				}
				else if(i==0){
					System.out.print("L ");
					Thread.sleep(1000);
				}
				else System.out.printf("%d ",i);
				Thread.sleep(1000);
			}
			
			System.out.println();
		}
		else{
			for(int i=this.floor; i<=floor;i++){
				if(i<0){
					System.out.printf("B%d ",(-1)*i);
					Thread.sleep(1000);
				}
				else if(i==0){
					System.out.print("L ");
					Thread.sleep(1000);
				}
				else System.out.printf("%d ",i);
				Thread.sleep(1000);
			}
			
			System.out.println();
		}
		
	}
	
	void report(){
		if(this.floor<0){
					System.out.printf("����%d�� �Դϴ�.\n",(-1)*this.floor);
					
				}
	    else if(this.floor==0){
					System.out.println("L�� �Դϴ�. ");
					
				}
	    else System.out.printf("%d�� �Դϴ�.\n",this.floor);
		
		SetDoor(true);
	}
	
} 

class ElevatorTest{
	public static void main(String [] args) throws Exception{
		int floor;
		Elevator E = new Elevator();
		Scanner s = new Scanner(System.in);
		
		System.out.print("�������� �����? ");
		floor = s.nextInt();
		
		E.move(floor);
		E.report();
		
		for(;;){
	    System.out.print("�������� �����? ");
		floor = s.nextInt();
		
		E.move(floor);
		E.report();
		}
	}
}
