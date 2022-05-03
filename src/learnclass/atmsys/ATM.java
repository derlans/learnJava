package learnclass.atmsys;

import learnclass.atmsys.hard.CashDispenser;
import learnclass.atmsys.hard.DepositSlot;
import learnclass.atmsys.hard.KeyBoard;
import learnclass.atmsys.hard.Screen;
import learnclass.atmsys.transactions.Transaction;

public class ATM {
    private Screen screen;
    private CashDispenser cashDispenser;
    private DepositSlot depositSlot;
    private KeyBoard keyBoard;
    private BankDatabase bankDatabase;
    private Transaction withdraw, deposit,balanceInquiry;
}
