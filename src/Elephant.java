
public class Elephant implements Mammal {
    private int tuskLength;
    private int weight;
    private int length;
    private String name;
    private boolean isAlive;
    private String color;
    public Elephant(){
        tuskLength =0;
        weight = 60;
        length = 1;
        name = "Robert";
        isAlive = true;
        color = "Pink";

    }

    public void setTuskLength(int pTuskLength){
        tuskLength = pTuskLength;
    
    }

public int getTuskLength(){
        return tuskLength;
    }
public int getWeight() {
    return weight;
}

public void setWeight(int pWeight) {
    weight = pWeight;
}

public int getLength() {
    return length;
}

public void setLength(int pLength) {
    length = pLength;
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

public void setAlive(boolean pIsAlive) {
    isAlive = pIsAlive;
}


public void setColor(String pColor) {
    color = pColor;
}

    @Override
    public void walk() {
        System.out.println("step step step");
    }

    @Override
    public void eat() {
        System.out.println("nom nom");
    }

    @Override
    public void sleep() {
        System.out.println("nzz zzz");
    }
}
