
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Kid At Age 1");
		Kid kid1=new Kid();
		kid1.setState(1);
		kid1.play();
		kid1.eat();
		System.out.println("Kid At Age 2");
		Kid kid2=new Kid();
		kid2.setState(2);
		kid2.play();
		kid2.eat();
	}

}
