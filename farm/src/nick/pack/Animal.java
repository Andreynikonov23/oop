package nick.pack;

public class Animal {
    private String name;
    private int age;
    private int weight;

    public void setData(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getWeight(){
        return weight;
    }
}
