package designpatterns.abstractfactory;

// Yea, I know. Bad name
public class IphonePhone implements Phone {
	@Override
	public MotherBoard createMotherboard() {
		return new IphoneMotherBoard();
	}

	@Override
	public Case createCase() {
		return new IphoneCase();
	}

	@Override
	public Processor createProcessor() {
		return new IphoneProcessor();
	}

	@Override
	public Screen createScreen() {
		return new IphoneScreen();
	}

	@Override
	public Battery createBattery() {
		return new IphoneBattery();
	}
}
