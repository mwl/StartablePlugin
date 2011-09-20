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
                    startables["foo"] = new dk.mwl.Foo()
                    startables["foo"].start()
                 -->
                <id>start-foo</id>
                <phase>pre-integration-test</phase>
                <goals>
                    <goal>start</goal>
                </goals>
                <configuration>
                    <class>dk.mwl.Foo</class>
                </configuration>
            </execution>

            <execution>
                <!--
                    This will result in
                    startables["foo"].stop()
                 -->
                <id>stop-foo</id>
                <phase>post-integration-test</phase>
                <goals>
                    <goal>stop</goal>
                </goals>
            </execution>

            <execution>
                <!--
                    This will result in
                    startables["foo2525"] = new dk.mwl.Far(2525)
                    startables["foo"].start()
                 -->
                <id>start-wiser2525</id>
                <phase>pre-integration-test</phase>
                <goals>
                    <goal>start</goal>
                </goals>
                <configuration>
                    <method>start</method>
                    <class>dk.mwl.Foo</class>
                    <constructorArgs>
                        <arg>2525</arg>
                    </constructorArgs>
                </configuration>
            </execution>

            <execution>
                <!--
                    This will result in
                    startables["foo"].kill()
                 -->
                <id>stop-foo2525</id>
                <phase>post-integration-test</phase>
                <goals>
                    <goal>stop</goal>
                </goals>
                <configuration>
                    <method>kill</method>
                </configuration>
            </execution>

            <execution>
                <execution>
                <!--
                    This will result in
                    startables["bar"] = dk.mwl.Bar.create(true)
                    startables["bar"].boot(2525)
                 -->
                <id>start-bar</id>
                <phase>pre-integration-test</phase>
                <goals>
                    <goal>start</goal>
                </goals>
                <configuration>
                    <class>dk.mwl.Bar</class>
                    <factoryMethod>create</factoryMethod>
                    <method>boot</method>
                    <constructorArgs>
                        <arg>true</arg>
                    </constructorArgs>
                    <args>
                        <arg>2525</arg>
                    </args>
                </configuration>
            </execution>

            <execution>
                <!--
                    This will result in
                    dk.mwl.Bar.killAll(false, 9)
                 -->
                <id>stop-bar</id>
                <phase>post-integration-test</phase>
                <goals>
                    <goal>stop</goal>
                </goals>
                <configuration>
                    <class>dk.mwl.Bar</method>
                    <method>killAll</method>
                    <args>
                        <arg>false</arg>
                        <arg>9</arg>
                    </args>
                </configuration>
            </execution>
        </executions>
    </plugin>
