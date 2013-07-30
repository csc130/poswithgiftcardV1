package pointOfSale;

public class Giftcard {
	private String number;
	private String firstName;
	private String lastName;
	private String amount;
	private static long count;
	/**
	 * @param number
	 * @param firstName
	 * @param lastName
	 * @param amount
	 */
	public Giftcard(String number, String firstName, String lastName,
			String amount) {
		this.number = number;
		this.firstName = firstName;
		this.lastName = lastName;
		this.amount = amount;
		count++;
		this.number = Long.toString(count);
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

}
