package be.pxl.generics.opdracht2;

public class Hoed<T extends Dier> {

	private int COUNT;
	private T dier;

	public Hoed(T dier) {
		this.dier = dier;
		COUNT = 0;
	}

	public T kijk() {
		if (COUNT == 0) {
			COUNT++;
			return null;
		} else {
			COUNT++;
			return dier;
		}
	}
}
