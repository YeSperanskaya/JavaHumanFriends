package service;

import java.util.ArrayList;
import java.util.List;

public class Animals {
    protected String name;
    protected int age;
    protected List<String> commands = new ArrayList<>();

    protected List<String> getCommands() {
        return commands;
    }

    protected void learnCommands(String command) {
        this.commands.add(command);
    }
}
