public class Bag {
    Ball b;
	public void addBall(int choice,int radius) {
		if(this.b==null) {
			if(choice==1) {
				b=new BasketBall(radius);
			}
			else if(choice==2) {
				b=new Tennis(radius);
			}
			else {
				System.out.println("Invalid Choice...!");
			}
		}else {
			System.out.println("Bag is Already Full");
		}		
	}
	public void removeBall() {
		if(this.b!=null) {
			this.b=null;
			System.out.println("Ball is Removed");
		}
		else {
			System.out.println("No Ball is Present to Remove");
		}
	}
	public void isBagEmpty() {
		if(this.b!=null) {
			System.out.println("Bag is Not Empty");
		}
		else {
			System.out.println("Bag is Empty");
		}
	}
	public void showGame() {
		if(b!=null) {
			if(b instanceof BasketBall) {
				BasketBall bb=(BasketBall)b;
				System.out.println("Game you can play is "+ bb.getGame());
			}
			else {
				Tennis tb=(Tennis)b;
				System.out.println("Game you can play is "+ tb.getGame());
			}
		}
		else {
			System.out.println("No Ball is present insdide bage= to paly game");
		}
	}
}
