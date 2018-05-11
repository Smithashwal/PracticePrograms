package Test;

public class Pair {

	int a, b;

	Pair(int a, int b) {
		this.setA(a);
		this.setB(b);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "(" + this.a + "," + this.b + ")";
	}
}
