package d9_4_SerializableLab;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Driver {
	public static void main(String[] args) {
		Car car = new Car();
		car.setMarka("Audi");
		car.setModel("A4");
		car.setPlaka("24Ing");
		car.setYil(2021);
		
		Motor motor = new Motor();
		motor.setHacim(2200);
		car.setMotor(motor); // motor nesnesini bir field olarak car sinifina ekledigim zaman set edebiliyorum.
		
		//System.out.println(car);
	
		carInputStream();
		
		
		File file = new File("car.bin");
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(file);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(car);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(fileOutputStream != null) {
					fileOutputStream.close();
				}
				if(objectOutputStream != null) {
					objectOutputStream.close();
				}
				
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

	public static void carInputStream() {
		File file =new File("car.bin");
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		try {
			fileInputStream =new FileInputStream(file);
			objectInputStream = new ObjectInputStream(fileInputStream);
			Car car = (Car) objectInputStream.readObject();
			System.out.println(car);
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fileInputStream != null) {
					fileInputStream.close();
				}
				if(objectInputStream != null) {
					objectInputStream.close();
				}
				
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}


}
