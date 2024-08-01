package oopsconcept.libraries;

public class Compere {
    String brand="hello";
    public static void main(String[] args) {
        Compere c=new Compere();
        Compere c1=new Compere();
        System.out.println(c.equals(c1));
    }
    public boolean equals(Compere that){
        if (this.brand.equals(that.brand) && this.brand.equals(that.brand)) {
            return true;
        }
        else
        return false;
    }
}
