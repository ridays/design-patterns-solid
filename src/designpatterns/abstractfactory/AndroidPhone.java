package designpatterns.abstractfactory;

public class AndroidPhone implements Phone {
	@Override
	public Battery createBattery() {
		return new AndroidBattery();
	}

	@Override
	public Case createCase() {
		return new AndroidCase();
	}

	@Override
	public MotherBoard createMotherboard() {
		return new AndroidMotherBoard();
	}

	@Override
	public Processor createProcessor() {
		return new AndroidProcessor();
	}

	@Override
	public Screen createScreen() {
		return new AndroidScreen();
	}
}
