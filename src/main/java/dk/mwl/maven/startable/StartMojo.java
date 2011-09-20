package dk.mwl.maven.startable;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

public class StartMojo extends AbstractMojo {
    /**
     * default
     */
    private Launcher launcer;

    /**
     * Factory class
     *
     * @parameter
     */
    private String startableClass;

    /**
     * @parameter default-value="start"
     */
    private String startMethod;

    public StartMojo() {
        //todo: consider IoC
        this.launcer = LauncherImpl.getInstance();
    }

    public StartMojo(Launcher launcer, String startableClass, String startMethod) {
        this.launcer = launcer;
        this.startableClass = startableClass;
        this.startMethod = startMethod;
    }

    /**
     * @goal start
     */
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().debug("Starting");
        launcer.start("ID", startableClass, startMethod);
    }
}
