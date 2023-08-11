package designpatterns.command;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 20, 2011
 * Time: 4:55:07 PM
 * To change this template use File | Settings | File Templates.
 */

import java.util.ArrayList;
import java.util.List;

public class HelloWorldManipulator {
    private List<Command> commandsList = new ArrayList<Command>();

    public void fixManipulate(final String fileName, final String newPath) {
        int cnt = 0;
        commandsList.add(new Creator(fileName, "hello world"));
        commandsList.add(new Updater(fileName, "new hello world"));
        commandsList.add(new Mover(fileName, newPath));

        for(Command command: commandsList) {
            try {
                command.execute();
            } catch (Exception e) {
                command.undo();
                break;
            }
        }
    }

    public void brokenManipulate(String fileName, String newPath) {
        int cnt = 0;
        commandsList.add(new Creator(fileName, "hello world"));
        commandsList.add(new Updater(fileName, "new hello world"));
        commandsList.add(new Mover(fileName, newPath));
        commandsList.add(new Creator(fileName, "hello world"));
        commandsList.add(new Creator(fileName, "hello world"));

        for(Command command: commandsList) {
            try {
                command.execute();
            } catch (Exception e) {
                command.undo();
                break;
            }
        }
    }
}
