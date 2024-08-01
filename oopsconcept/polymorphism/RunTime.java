package oopsconcept.polymorphism;

    class father{
        void display(){
            System.out.println("old man");
        }
    }
    class son extends father{
        void display(){
            System.out.println("new son");
        }
    }
    class doughter extends father{
        void display(){
            System.out.println("new doughter");
        }
    }
    public class RunTime {
        public static void main(String[] args) {
            father s;
            s=new son();
            s.display();
            s=new doughter();
            s.display();
        }
    }
    