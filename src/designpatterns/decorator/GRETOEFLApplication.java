package designpatterns.decorator;

public class GRETOEFLApplication extends GREApplication {
	protected float toeflScore;
	GRETOEFLApplication(float gpaScore, float greScore, float toeflScore) {
		super(gpaScore, greScore);
		this.toeflScore = toeflScore;
	}
	public float getToefl() {
		return this.toeflScore;
	}
}
