package basepatterns.creationl.abstractfactory.banking;

import basepatterns.creationl.abstractfactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer write Java Code...");
    }
}
