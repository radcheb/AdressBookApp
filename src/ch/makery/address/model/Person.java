package ch.makery.address.model;

import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Model class for a Person.
 *
 * @author Radhwane
 */
public class Person {

	private final StringProperty firstName;
	private final StringProperty lastName;
	private final StringProperty street;
	private final IntegerProperty postalCode;
	private final StringProperty city;
	private final ObjectProperty<LocalDate> birthday;

	/**
	 * Default constructor.
	 */
	public Person() {
		this(null, null);
	}

	/**
	 * Constructor with some initial data.
	 *
	 * @param firstName
	 * @param lastName
	 */
	public Person(String firstName, String lastName) {
		this.firstName = new SimpleStringProperty(firstName);
		this.lastName = new SimpleStringProperty(lastName);
		// Some initial dummy data, just for convenient testing.
		this.street = new SimpleStringProperty("some street");
		this.postalCode = new SimpleIntegerProperty(1234);
		this.city = new SimpleStringProperty("some city");
		this.birthday = new SimpleObjectProperty<LocalDate>(LocalDate.of(1999, 2, 21));
	}

	public String getFirstName() {
		return firstName.getValue();
	}

	public String getLastName() {
		return lastName.getValue();
	}

	public String getStreet() {
		return street.getValue();
	}

	public int getPostalCode() {
		return postalCode.getValue();
	}

	public String getCity() {
		return city.getValue();
	}

	public LocalDate getBirthday() {
		return birthday.getValue();
	}

	public void setFirstName(String firstName) {
		this.firstName.set(firstName);
	}

	public void setLastName(String lastName) {
		this.lastName.set(lastName);
	}

	public void setCity(String city) {
		this.city.set(city);
	}

	public void setStreet(String street) {
		this.street.set(street);
	}

	public void setPostalCode(int postalCode) {
		this.postalCode.set(postalCode);
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday.set(birthday);
	}

	public ObjectProperty<LocalDate> birthdayProperty() {
		return birthday;
	}

	public StringProperty lastNameProperty() {
		return lastName;
	}

	public StringProperty firstNameProperty() {
		return firstName;
	}

	public StringProperty streetProperty() {
		return street;
	}
	public IntegerProperty pstalCodeProperty() {
		return postalCode;
	}
	public StringProperty cityProperty() {
		return city;
	}
}
