public class User {
	
	private int pin;
	private String name;
	private String dob;
	private String address;
	
	/**
	 * Constructor for User class.
	 * 
	 * @param name
	 * @param dob
	 * @param address
	 */
	
	public User(int pin, String name, String dob, String address) {
		this.pin = pin;
		this.name = name;
		this.dob = dob;
		this.address = address;
	}
	
	/////////////////////////////////// GETTERS AND SETTERS ///////////////////////////////////
	
	/**
	 * Retrieves the user's PIN.
	 * 
	 * @return pin
	 */
	
	public int getPIN() {
		return pin;
	}
	
	/**
	 * Retrieves the user's name.
	 * 
	 * @return name
	 */
	
	public String getName() {
		return name;
	}
	
	/**
	 * Retrieves the user's date of birth.
	 * 
	 * @return dob
	 */
	
	public String getDOB() {
		return dob;
	}
	
	/**
	 * Retrieves the user's address.
	 * 
	 * @return address
	 */
	
	public String getAddress() {
		return address;
	}
	
	/**
	 * Sets the value of the user's PIN.
	 * 
	 * @param pin the new PIN
	 */
	
	public void setPIN(int pin) {
		this.pin = pin;
	}
	
	/**
	 * Sets the value of the user's name.
	 * 
	 * @param name the new name
	 */
	
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Sets the value of the user's date of birth.
	 * 
	 * @param dob the new date of birth
	 */
	
	public void setDOB(String dob) {
		this.dob = dob;
	}
	
	/**
	 * Sets the value of the user's address.
	 * 
	 * @param address the new address
	 */
	
	public void setAddress(String address) {
		this.address = address;
	}
}