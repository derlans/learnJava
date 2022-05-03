package learnclass.atmsys.transactions;

import learnclass.atmsys.hard.CashDispenser;
import learnclass.atmsys.hard.KeyBoard;

public class WithDrawal extends Transaction {
    private CashDispenser cashDispenser;
    private KeyBoard keyBoard;

    @Override
    public void execute() {
        double count= this.getCount();
        if (count < this.bankDatabase.amount) {
            this.screen.showMessage("Withdrawal Successful: " + count);
            this.cashDispenser.dispenseCash(count);
        }else {
            this.screen.showMessage("Withdrawal Failed");
        }
    }

    private double getCount() {
        return this.keyBoard.getCount();
    }

}
