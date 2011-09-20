Maven Startable Plugin
----------------------

Usage goal :)

    <plugin>
        <groupId>dk.mwl.maven.startable</groupId>
        <artifactId>maven-startable-plugin</artifactId>
        <version>1.0</version>
        <executions>
            <execution>
                <!--
                    This will result in
                    Object startable = new org.subethamail.wiser.Wiser()
                    startable.start()
                 -->
                <id>start-wiser</id>
                <phase>pre-integration-test</phase>
                <goals>
                    <class>org.subethamail.wiser.Wiser</class>
                    <goal>start</goal>
                </goals>
            </execution>
            <execution>
                <!--
                    This will result in
                    startable.stop()
                 -->
                <id>stop-wiser</id>
                <phase>post-integration-test</phase>
                <goals>
                    <goal>stop</goal>
                </goals>
            </execution>
            <execution>
                <!--
                    This will result in
                    Object startable = new org.subethamail.wiser.Wiser(2525)
                    startable.start()
                 -->
                <id>start-wiser2525</id>
                <phase>pre-integration-test</phase>
                <goals>
                    <goal>start</goal>
                </goals>
                <configuration>
                    <method>start</method>
                    <class>org.subethamail.wiser.Wiser</class>
                    <constructorArgs>
                        <arg>2525</arg>
                    </constructorArgs>
                    <daemon>true</daemon>
                </configuration>
            </execution>
            <execution>
                <!--
                    This will result in
                    startable.stop()
                 -->
                <id>stop-wiser2525</id>
                <phase>post-integration-test</phase>
                <goals>
                    <goal>stop</goal>
                </goals>
                <configuration>
                    <method>stop</method>
                </configuration>
            </execution>
        </executions>
    </plugin>
