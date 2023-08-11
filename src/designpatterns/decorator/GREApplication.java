package designpatterns.decorator;

public class GREApplication extends GPAApplication {
	protected float greScore;
	GREApplication(float gpaScore, float greScore) {
		super(gpaScore);
		this.greScore = greScore;
	}
	public float getGre() {
		return this.greScore;
	}
}
