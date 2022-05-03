package learnclass.atmsys.transactions;

import learnclass.atmsys.BankDatabase;
import learnclass.atmsys.hard.Screen;

public abstract class Transaction  {
    protected int accountNumber;
    protected Screen screen;
    protected BankDatabase bankDatabase;
    public abstract void execute() ;
}
