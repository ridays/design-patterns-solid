package designpatterns.decorator;

public class TOEFLApplication extends GPAApplication {
	protected float toeflScore;
	TOEFLApplication(float gpaScore, float toeflScore) {
		super(gpaScore);
		this.toeflScore = toeflScore;
	}
	public float getToefl() {
		return this.toeflScore;
	}
}
