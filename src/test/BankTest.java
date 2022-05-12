package test;
import 实验一.银行.Bank;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankTest {
    private Bank bank = new Bank();
    @Test
    public void testCreateUser() {
        bank.createUser("张三", "123456");
        bank.createUser("李四", "123456");
        bank.createUser("王五", "123456");
        bank.createUser("赵六", "123456");
        bank.createUser("孙七", "123456");
        bank.createUser("周八", "123456");
        bank.createUser("吴九", "123456");
        bank.createUser("郑十", "123456");
        try {
            bank.createUser("郑十", "123456");
        }
        catch (Exception e) {
            assertEquals("用户已存在", e.getMessage());
        }
    }
    @Test
    public void testDeleteUser() {
        bank.deleteUser("郑十", "123456");
        try {
            bank.deleteUser("郑十", "123456");
        }catch (Exception e) {
            assertEquals("用户不存在", e.getMessage());
        }
    }
    @Test
    public void testDeposit(){
        bank.deposit("张三", "123456", 100);
        assertEquals(100, bank.query("张三", "123456"), 0.001);
    }
    @Test
    public void testWithdraw(){
        bank.withdraw("张三", "123456", 100);
        assertEquals(0, bank.query("张三", "123456"), 0.001);
    }
}
