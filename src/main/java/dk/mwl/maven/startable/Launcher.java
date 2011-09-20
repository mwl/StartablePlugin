package dk.mwl.maven.startable;

public interface Launcher {
    void start(String id, String startableClass, String startMethod);

    void stop();
}
