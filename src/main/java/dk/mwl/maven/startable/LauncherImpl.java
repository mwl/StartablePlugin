package dk.mwl.maven.startable;

import java.util.HashMap;
import java.util.Map;

public class LauncherImpl implements Launcher {
    private volatile static Launcher instance;
    private final Map<String, Object> launcherMap = new HashMap<String, Object>();

    private LauncherImpl() {
    }

    public static Launcher getInstance() {
        if (instance == null) {
            instance = new LauncherImpl();
        }
        return instance;
    }

    public void start() {
    }

    public void stop() {
    }
}
