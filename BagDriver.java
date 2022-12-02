import java.util.Scanner;

public class BagDriver {
    public static void main(String[] args) {
		Bag b = new Bag();
		
		Scanner sc = new Scanner(System.in);
		boolean exit=true;
		while(exit) {
		System.out.println("Choice Your Option \n1. Add Ball \n2. Remove Ball \n3. Check Bag Is Empty Or Not \n4. Show Game That Can Be Played \n5. Exit");
		int choice =sc.nextInt();
		
			switch(choice) {
			case 1:
			{
				System.out.println("Pick Any Ball \n1. Basket Ball \n2. Tennis Ball");
				int choice1 = sc.nextInt();
				
				switch(choice1) {
				case 1:
				{
					System.out.println("Enter the Radius of Ball");
					int radius=sc.nextInt();
					b.addBall(choice1,radius);
					System.out.println("Basket Ball has been added to bag");
				}
				break;
				case 2:
				{
					System.out.println("Enter the Radius of Ball");
					int radius=sc.nextInt();
					b.addBall(choice1,radius);
					System.out.println("Tennis Ball has been added to bag");
				}
				}			
			}
			break;
			case 2:
			{
				b.removeBall();
			}
			break;
			case 3:
			{
				b.isBagEmpty();
			}
			break;
			case 4:
			{
				b.showGame();
				
			}
			break;
			case 5:
			{
				exit=false;
			}
			break;
			default:
			{
				System.out.println("Invalid Option...Please Retry Again");
			}
			}

		}
	}
}
