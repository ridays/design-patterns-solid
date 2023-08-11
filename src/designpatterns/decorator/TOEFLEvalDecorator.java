package designpatterns.decorator;

public class TOEFLEvalDecorator extends GPAEvalDecorator {
	private final Application application;
	TOEFLEvalDecorator(Application application) {
		super(application);
		this.application = application;
	}

	@Override
	public boolean evaluate() {
		return super.evaluate() && this.application.getToefl() > 100;
	}
}
