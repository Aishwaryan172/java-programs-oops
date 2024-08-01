package oopsconcept.polymorphism;

public class ComplierTime {
        public void display(int a){
            System.out.println(a);
        }
        public void display(int a, double b){
            System.out.println(a+" "+b);
        }
        public void display(double a, int b){
            System.out.println(a+" "+b);
        }
        public void display(int a, int b){
            System.out.println(a+" "+b);
        }
        public static void main(String[] args) {
            ComplierTime mo=new ComplierTime();
            mo.display(1);
            mo.display(2, 2.0);
            mo.display(2.0, 3);
            mo.display(3,3);
        }
    }
