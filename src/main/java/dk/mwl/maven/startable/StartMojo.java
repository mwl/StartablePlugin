package dk.mwl.maven.startable;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

public class StartMojo extends AbstractMojo {
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

    /**
     * @goal start
     */
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().debug("Starting");
        Object startable;
        if (notSet(initMethod)) {
            //startable = getClass().getClassLoader().loadClass(factoryClass).newInstance()
        }

    }

    private boolean notSet(String s) {
        return s == null || s.equals("");
    }
}
