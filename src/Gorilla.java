public class Gorilla implements Mammal {
    private String name;
    private boolean isAlive;
    private String whoIsTheEnemy;
    public Gorilla(){
        name = "Harambe";
        isAlive = false;
        whoIsTheEnemy = "cincy zookeeper";
    }

    public String getName() {
        return name;
    }

    public void setName(String pName) {
        name = pName;
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean pIsAlive) {
        isAlive = pIsAlive;
    }

    public String getWhoIsTheEnemy() {
        return whoIsTheEnemy;
    }
    public void setWhoIsTheEnemy(String pWhoIsTheEnemy) {
        whoIsTheEnemy = pWhoIsTheEnemy;
    }
    @Override
    public void walk() {
        System.out.println("crawl crawl");
    }


    public void eat() {
        System.out.println("chomp chomp");
    }

    @Override
    public void sleep() {
        System.out.println("nzz zzz");
    }
}
