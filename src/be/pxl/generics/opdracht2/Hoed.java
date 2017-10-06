package be.pxl.generics.opdracht2;

public class Hoed<T> {

	static int COUNT;
	Dier dier;

	public Hoed(Dier dier) {
		this.dier = dier;
		COUNT = 0;
	}

	public Dier kijk() {
		if (COUNT == 0) {
			COUNT++;
			return null;
		} else {
			COUNT++;
			return dier;
		}		
	}

}
