package designpatterns.decorator;

public class GPAApplication implements Application {
	protected float gpaScore;
	GPAApplication(float gpaScore) {
		this.gpaScore = gpaScore;
	}
	public float getGpa() {
		return this.gpaScore;
	}

	public float getGre() {
		return 0;
	}

	public float getToefl() {
		return 0;
	}
}
