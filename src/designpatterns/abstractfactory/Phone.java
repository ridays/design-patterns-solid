package designpatterns.abstractfactory;

public interface Phone {
	public MotherBoard createMotherboard();
	public Case createCase();
	public Processor createProcessor();
	public Screen createScreen();
	public Battery createBattery();
}
