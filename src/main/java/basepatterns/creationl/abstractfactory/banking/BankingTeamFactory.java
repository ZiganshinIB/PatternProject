package basepatterns.creationl.abstractfactory.banking;

import basepatterns.creationl.abstractfactory.Developer;
import basepatterns.creationl.abstractfactory.ProjectManager;
import basepatterns.creationl.abstractfactory.ProjectTeamFactory;
import basepatterns.creationl.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
