package nick.pack.model;

public class Worker {
    private String name;
    private int age;
    private int salary;

    public void setData(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getSalary(){
        return salary;
    }
    public String toString(){
        String str = String.format("Имя - %s, возраст - %d, зарплата - %d", getName(), getAge(), getSalary());
        return str;
    }
}
