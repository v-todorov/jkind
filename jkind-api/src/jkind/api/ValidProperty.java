package jkind.api;

public class ValidProperty extends Property {
	private final int k;

	public ValidProperty(String name, int k) {
		super(name);
		this.k = k;
	}

	public int getK() {
		return k;
	}
}
