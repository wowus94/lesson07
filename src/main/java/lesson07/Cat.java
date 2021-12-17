package lesson07;

public class Cat {
    private String name;
    private int appetite;

    Cat(String name, int appetite){
        setName(name);
        setAppetite(appetite);
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}