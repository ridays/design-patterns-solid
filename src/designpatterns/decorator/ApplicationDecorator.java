package designpatterns.decorator;

public class ApplicationDecorator implements Application {
	protected Application application;
	ApplicationDecorator(Application application) {
		this.application = application;
	}
	public float getGpa() {
		return this.application.getGpa();
	}

	public float getGre() {
		return this.application.getGre();
	}

	public float getToefl() {
		return this.application.getToefl();
	}
}
