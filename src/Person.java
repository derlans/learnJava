public class Person {
    public String name;
    public double age;
    public Sex sex;
    protected enum Sex
    {
        男,女;
    }
    public Person(String name,double age){
        this.name=name;
        this.age=age;
    }
    public Person(String name,double age,Sex sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }
    public  void tell(){
        System.out.println("我是"+this.name+"今年"+this.age);
    }
}
