package d9_4_SerializableLab;

import java.io.Serializable;

public class Motor implements Serializable {
	private int hacim;

	public Motor() {

	}

	public Motor(int hacim) {
		this.hacim = hacim;
	}

	public int getHacim() {
		return hacim;
	}

	public void setHacim(int hacim) {
		this.hacim = hacim;
	}

	@Override
	public String toString() {
		return "Hacim: " + getHacim();
	}

}
