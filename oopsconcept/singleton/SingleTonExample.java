package oopsconcept.singleton;
public class SingleTonExample {
    private void father(){
        System.out.println("hii");
    }
    public static void main(String[] args) {
        SingleTonExample t=new SingleTonExample();
        t.father(); 
    }
}
