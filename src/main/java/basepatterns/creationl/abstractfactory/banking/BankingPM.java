package basepatterns.creationl.abstractfactory.banking;

import basepatterns.creationl.abstractfactory.ProjectManager;

public class BankingPM implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
