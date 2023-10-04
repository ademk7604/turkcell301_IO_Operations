package d9_3_SeralizationNesneYazma;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Driver {
	/*
	 * Serilestirme, nesnenin durumunu byte akisina yazma surecidir 
	 * 1) Bir nesne serilestirilecekse ilk olarak SINIF PUBLIC edilmelidir 
	 * 2) Sinif SERIALIZABLE arayuzune IMPELEMNT edilmeli 
	 * 3) Sinifin YAPICI methodunda rguman olamamalidir. 
	 * eger arguman olan bir yapici method var ise ARGUMANTSIZ DEFAULT CONSTRUCTOR olmalidir.
	 * 4) sinifin tum alanlari serilastirilebilmelidir
	 */
	public static void main(String[] args) {
		
		//write();
		read();
	}
	public static void read() {
		File file = new File("student.bin");
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream =null;
		try {
			fileInputStream = new FileInputStream(file);
			objectInputStream = new ObjectInputStream(fileInputStream);
			Student student = (Student) objectInputStream.readObject();
			System.out.println(student);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(fileInputStream !=null) {
					fileInputStream.close();
				}
				if(objectInputStream !=null) {
					objectInputStream.close();
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	public static void write() {
		
		
		Student student = new Student();
		student.setFirstName("Ali");
		student.setLastName("Batur");
		student.setNumber(1);
		student.setSinif("1-A");
		System.out.println(student);

		File file = new File("student.bin");
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(file);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(student);
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			try {
				if (fileOutputStream != null) {
					fileOutputStream.close();
				}
				if (objectOutputStream != null) {
					objectOutputStream.close();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

}
