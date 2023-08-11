package designpatterns.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 6:34:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class PhoneMaker {
    public Case buildPhone(Phone phone) {
        MotherBoard motherBoard = phone.createMotherboard();
        Battery battery = phone.createBattery();
        Processor processor = phone.createProcessor();
        Case phoneCase = phone.createCase();
        Screen screen = phone.createScreen();
        motherBoard.attachBattery(battery);
        motherBoard.attachProcessor(processor);
        phoneCase.attachMotherBoard(motherBoard);
        phoneCase.attachScreen(screen);
        return phoneCase;
    }
}
