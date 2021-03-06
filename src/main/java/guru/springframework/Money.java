package guru.springframework;

public class Money {

	protected int amount;
	protected String currency;

	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public static Money dollar(int amount) {
		return new Dollar(amount, "USD");
	}

	public static Money franc(int amount) {
		return new Franc(amount, "CHF");
	}

	protected String currency() {
		return currency;
	}

	public Money times(int multiplier) {
		return new Money(amount * multiplier, this.currency);
	}

	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount &&
			this.currency.equals(((Money) object).currency);
	}

	@Override
	public String toString() {
		return "Money{" +
			"amount=" + amount +
			", currency='" + currency + '\'' +
			'}';
	}
}
