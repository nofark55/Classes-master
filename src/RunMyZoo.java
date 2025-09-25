public class RunMyZoo {
    public static void main(String[] args) {
        System.out.println("Mx. Bradford's ZOOO!!!!!!!!!");
        RunMyZoo r = new RunMyZoo();
    }
    
    void flyinthesky(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println("flap flap flap");
        }
    }

    void flyinthesky(int x, int y) {
        for (int i = 0; i < x * y; i++) {
            System.out.println("flap flap");
        }
    }

    public RunMyZoo() {
        Elephant e = new Elephant();
        System.out.println(e.getTuskLength()); //jsut finds for testing, to make sure its working
        e.eat();
        e.walk();
        Gorilla h = new Gorilla();
        h.walk();
        h.eat();

        Pengiun p = new Pengiun();
        p.fly();

        emu em = new emu();
        em.sleep();
        flyinthesky(3);
        flyinthesky(3, 2);

    }
        
}
