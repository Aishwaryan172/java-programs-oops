package oopsconcept.inheritance;
class one{
    int sal=100000;
}
class two extends one{
    int age=21;
}
class three extends two{
    String name="WOMAN";
}
class four extends two{
    String USN="4GH20EC001";
}
    
public class HybridExample {
    public static void main(String[] args) {
        four fr=new four();
        // note - \n is used to 
        System.out.println("USN:"+fr.USN+"\n"+"Age:"+fr.age+"\n"+"Salary:"+fr.sal);
        System.out.println("----------------------------------");
        three th=new three();
        System.out.println("Name:"+th.name+"\n"+"Age:"+th.age+"\n"+"Salary:"+th.sal);
    }	  
}
