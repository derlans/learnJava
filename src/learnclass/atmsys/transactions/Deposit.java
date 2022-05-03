package learnclass.atmsys.transactions;

import learnclass.atmsys.hard.DepositSlot;
import learnclass.atmsys.hard.KeyBoard;

public class Deposit extends Transaction {
    private KeyBoard keyBoard;
    private DepositSlot depositSlot;
    @Override
    public void execute() {
        this.screen.showMessage("Please insert a deposit envelope containing a deposit amount\n");
        double amount = keyBoard.getCount();
        this.depositSlot.deposit(amount);
        this.bankDatabase.addAmount(this.accountNumber,  amount);
    }
}
