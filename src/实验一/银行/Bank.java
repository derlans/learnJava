package 实验一.银行;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<User> users;
    public  Bank(){
        users = new ArrayList<User>();
    }
    public void  createUser(String name, String password) {
        if (isUserExist(name)) {
            System.out.println("用户已存在");
            throw new RuntimeException("用户已存在");
        }
        User user = new User(name, password,0);
        users.add(user);
    }
    private boolean isUserExist(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    public void deleteUser(String name, String password) {
        if (!isUserExist(name)) {
            System.out.println("用户不存在");
            throw new RuntimeException("用户不存在");
        }
        for (User user : users) {
            if (user.getName().equals(name) && user.getPassword().equals(password)) {
                users.remove(user);
                break;
            }
        }
    }
    public void deposit(String name, String password, int amount) {
        for (User user : users) {
            if (user.getName().equals(name) && user.getPassword().equals(password)) {
                user.deposit(amount);
                break;
            }
        }
    }
    public void  withdraw(String name, String password, int amount) {
        for (User user : users) {
            if (user.getName().equals(name) && user.getPassword().equals(password)) {
                if(user.getAmount()>=amount){
                    user.withdraw(amount);
                }else {
                    System.out.println("余额不足");
                }
                return;
            }
        }
        throw new RuntimeException("用户不存在或者密码错误");
    }
    public double query(String name, String password) {
        for (User user : users) {
            if (user.getName().equals(name) && user.getPassword().equals(password)) {
                System.out.println("余额为"+user.getAmount());
                return user.getAmount();
            }
        }
        throw new RuntimeException("用户不存在或者密码错误");
    }

}
