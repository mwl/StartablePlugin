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
     * @parameter
     */
    private String initMethod;

    /**
     * Factory class
     *
     * @parameter
     */
    private String startableClass;

    /**
     * @parameter
     */
    private String[] parameters;

    /**
     * @parameter default-value="start"
     */
    private String startMethod;

    public StartMojo() {
        //todo: consider IoC
        this.launcer = LauncherImpl.getInstance();
    }

    public StartMojo(Launcher launcer, String initMethod, String startableClass, String[] parameters, String startMethod) {
        this.launcer = launcer;
        this.initMethod = initMethod;
        this.startableClass = startableClass;
        this.parameters = parameters;
        this.startMethod = startMethod;
    }

    /**
     * @goal start
     */
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().debug("Starting");
        launcer.start();
    }

    private boolean notSet(String s) {
        return s == null || s.equals("");
    }

    
}
