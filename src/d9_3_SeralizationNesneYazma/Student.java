package d9_3_SeralizationNesneYazma;

import java.io.Serializable;

public class Student implements Serializable{
	private int number;
	private String firstName;
	private String lastName;
	private String sinif;

	public Student() {

	}

	public Student(int number, String firsName, String lastName, String sinif) {
		this.number = number;
		this.firstName = firsName;
		this.lastName = lastName;
		this.sinif = sinif;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firsName) {
		this.firstName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSinif() {
		return sinif;
	}

	public void setSinif(String sinif) {
		this.sinif = sinif;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student student = (Student)obj;
		return this.number == student.number;
		// iki ogrencinin numarasi esitse bunlar ayni ogrencidir. parametre ile geleni kontrol ediyoruz
	}
	

	@Override
	public String toString() {
		return " firstname: " + getFirstName() + " lastname: " + getLastName() + " number: " + getNumber() + " sinif: "
				+ getSinif();
	}

}
