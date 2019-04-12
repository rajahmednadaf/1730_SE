
public class Kid {
	int age;
	public kidState kid;
	
	
	
	void play() {
		kid.play();
	}
	
	void eat() {
		kid.eat();
	}
	
	public void setState(int age) {
		this.age=age;
		if(age==1) {
			kid=new firstYearKid();
		}
		if(age==2) {
			kid=new secoundYearKid();
		}
	}

}
