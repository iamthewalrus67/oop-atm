package atm;

public class DefaultBill implements Bill {
    private int billAmount;
    private Bill next;

    protected DefaultBill(int amount) {
        billAmount = amount;
    }

    @Override
    public void setNext(Bill bill) {
        next = bill;
    }

    @Override
    public void process(int amount) {
        if (next != null) {
            next.process(amount % billAmount);
        } else if (amount % billAmount != 0) {
            throw new IllegalArgumentException();
        }

        if (amount/billAmount != 0) {
            System.out.printf("Please receive %d of %d UAH bills%n", amount / billAmount, billAmount);
        }
    }
}
