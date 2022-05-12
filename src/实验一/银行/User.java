package 实验一.银行;

public class User {
    private String name;
    private String password;
    private double amount;
    User(String name, String password, double amount) {
        this.name = name;
        this.password = password;
        this.amount = amount;
    }
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public  void deposit(double count) {
        this.amount += count;
    }
    public void withdraw(double count) {
        this.amount -= count;
    }
}
