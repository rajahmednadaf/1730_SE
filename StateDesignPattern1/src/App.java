
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataconnectionStateContex obj=new DataconnectionStateContex();
		obj.setPresentState(new DataConnectionOffState());
		obj.info();
		
		DataconnectionStateContex obj1=new DataconnectionStateContex();
		obj1.setPresentState(new DataConnectionOnState());
		obj1.info();
		
		
	}

}
