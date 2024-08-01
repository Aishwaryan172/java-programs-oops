package oopsconcept.inheritance;

class Parents{
	public void greeting() {
		System.out.println("Hello World");
	}
}
class SubParent extends Parents{
	public void welcome() {
     System.out.println("Welcome");
     SubParent sub=new SubParent();
     sub.greeting();
	}
}

public class MultileveInheritanceExample extends SubParent{
    public static void main(String[] args) {
        MultileveInheritanceExample m = new MultileveInheritanceExample ();
        m.welcome();
    }
}
