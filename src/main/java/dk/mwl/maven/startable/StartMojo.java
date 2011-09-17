package dk.mwl.maven.startable;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

public class StartMojo extends AbstractMojo{
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().debug("Starting");
    }
}
