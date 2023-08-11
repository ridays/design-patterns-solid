package designpatterns.decorator;

public class GPAEvalDecorator extends ApplicationDecorator {
	private final Application application;
	GPAEvalDecorator(Application application) {
		super(application);
		this.application = application;
	}
	public boolean evaluate() {
		System.out.println("GPAEval called");
		return this.application.getGpa() > 8;
	}
}
