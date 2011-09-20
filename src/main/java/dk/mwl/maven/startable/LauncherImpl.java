package dk.mwl.maven.startable;

import java.util.HashMap;
import java.util.Map;

public class LauncherImpl implements Launcher {
    private volatile static Launcher instance;
    private final Map<String, Object> launcherMap = new HashMap<String, Object>();

    LauncherImpl() {
    }

    public static Launcher getInstance() {
        if (instance == null) {
            instance = new LauncherImpl();
        }
        return instance;
    }

    public void start(String id, String startableClass, String startMethod) {
    }

    public void stop() {
    }
}
