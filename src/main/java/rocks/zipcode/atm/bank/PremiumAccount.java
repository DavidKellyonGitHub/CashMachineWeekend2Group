package rocks.zipcode.atm.bank;

/**
 * @author ZipCodeWilmington
 */
public class PremiumAccount extends Account {

    private static final int OVERDRAFT_LIMIT = 100;

    public PremiumAccount(AccountData accountData) {
        super(accountData);
        accountData.setPremium();
    }

    @Override
    protected boolean canWithdraw(double amount) {
        return getBalance() + OVERDRAFT_LIMIT >= amount;
    }
}
