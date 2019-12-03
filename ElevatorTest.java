import java.util.Scanner;

class Elevator{
	int floor;
	boolean door;
	
	void SetDoor(boolean door){
		if(door == true){
			System.out.println("문이 열립니다.");
		}
		else	
			System.out.println("문이 닫힙니다.");
	}
	
	void move(int floor) throws Exception{
		SetDoor(false);
		if(-2<=floor && floor<=10){
		if(floor<0){
			System.out.printf("지하 %d층으로 이동합니다.\n",(-1)*floor);
		}
		else if(floor == 0){
			System.out.println("L층으로 이동합니다.");
		}
		else System.out.printf("%d층으로 이동합니다.\n",floor);
		}
		
		else {System.out.printf("유효한 층수(-2이상 10이하)로 입력하세요.");}
		
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
					System.out.printf("지하%d층 입니다.\n",(-1)*this.floor);
					
				}
	    else if(this.floor==0){
					System.out.println("L층 입니다. ");
					
				}
	    else System.out.printf("%d층 입니다.\n",this.floor);
		
		SetDoor(true);
	}
	
} 

class ElevatorTest{
	public static void main(String [] args) throws Exception{
		int floor;
		Elevator E = new Elevator();
		Scanner s = new Scanner(System.in);
		
		System.out.print("몇층으로 갈까요? ");
		floor = s.nextInt();
		
		E.move(floor);
		E.report();
		
		for(;;){
	    System.out.print("몇층으로 갈까요? ");
		floor = s.nextInt();
		
		E.move(floor);
		E.report();
		}
	}
}
