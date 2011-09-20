package dk.mwl.maven.startable;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class StartMojoTest {
    private final Launcher launcher = mock(Launcher.class);
    private StartMojo mojo;

    @Test
    public void willCallLauncher() throws Exception {
        mojo = new StartMojo(launcher, "start", null, null, null);
        mojo.execute();
        verify(launcher).start("ID", startableClass, startMethod);
    }
}
