package designpatterns.decorator;

public class GREEvalDecorator extends GPAEvalDecorator {
	private final Application application;
	GREEvalDecorator(Application application) {
		super(application);
		this.application = application;
	}

	@Override
	public boolean evaluate() {
		System.out.println("GREEval called");
		return super.evaluate() && this.application.getGre() > 1450;
	}
}
