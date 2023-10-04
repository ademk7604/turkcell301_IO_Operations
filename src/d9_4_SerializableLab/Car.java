package d9_4_SerializableLab;

import java.io.Serializable;

public class Car implements Serializable{

	private String marka;
	private String model;
	private int yil;
	private String plaka;
	private Motor motor; // burda onemli olan butun alanlarin seriablizable interface e implement etmesi bizde Motor clasini imp etmistik
	// bu sekilde motor un hacim ozelligini arabaya kayit edebilirim.

	public Car() {

	}

	public Car(String marka, String model, int yil, String plaka, Motor motor) {
		this.marka = marka;
		this.model = model;
		this.yil = yil;
		this.plaka = plaka;
		this.motor=motor;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYil() {
		return yil;
	}

	public void setYil(int jahr) {
		this.yil = jahr;
	}

	public String getPlaka() {
		return plaka;
	}

	public void setPlaka(String plaka) {
		this.plaka = plaka;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor=motor;
	}

	@Override
	public boolean equals(Object other) {
		Car car = (Car) other;
		return this.plaka.equals(car.plaka);
	}

	@Override
	public String toString() {
		return "Marka: " + getMarka() + ", Model: " + getModel() + ", Jahr: " + getYil() + ", Plaka: " + getPlaka()+", Motor: "+getMotor();
	}

}
