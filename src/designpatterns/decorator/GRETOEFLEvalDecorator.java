package designpatterns.decorator;

public class GRETOEFLEvalDecorator extends GPAEvalDecorator {
	private final Application application;
	GRETOEFLEvalDecorator(Application application) {
		super(application);
		this.application = application;
	}

	@Override
	public boolean evaluate() {
		return super.evaluate() && this.application.getGre() > 1450 && this.application.getToefl() > 100;
	}
}
