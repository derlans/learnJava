package learnclass.atmsys.transactions;

public class Balacelnqulry extends Transaction {
    @Override
    public void execute() {
        this.screen.showMessage("Your balance is: " + this.bankDatabase.amount);
    }
}
