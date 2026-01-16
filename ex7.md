# Exercice 7

## mvn clean
La commande `mvn clean` exécute seulement la phase **clean**. 
Celle-ci permet de supprimer les fichiers générés depuis un build précédent. Elle permet notamment de supprimer le répertoire **target/** .

```bash
... BankApplicationMvn % mvn clean
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------< com.imt.mines:BankApplicationMvn >------------------
[INFO] Building BankApplicationMvn 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-clean-plugin/3.2.0/maven-clean-plugin-3.2.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-clean-plugin/3.2.0/maven-clean-plugin-3.2.0.pom (5.3 kB at 16 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/35/maven-plugins-35.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/35/maven-plugins-35.pom (9.9 kB at 215 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/35/maven-parent-35.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/35/maven-parent-35.pom (45 kB at 1.1 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/25/apache-25.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/25/apache-25.pom (21 kB at 555 kB/s)
[INFO] 
[INFO] --- clean:3.2.0:clean (default-clean) @ BankApplicationMvn ---
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.3.4/maven-shared-utils-3.3.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.3.4/maven-shared-utils-3.3.4.pom (5.8 kB at 142 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/34/maven-shared-components-34.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/34/maven-shared-components-34.pom (5.1 kB at 121 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/34/maven-parent-34.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/34/maven-parent-34.pom (43 kB at 974 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.6/commons-io-2.6.pom
Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.6/commons-io-2.6.pom (14 kB at 339 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/42/commons-parent-42.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/42/commons-parent-42.pom (68 kB at 1.4 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/18/apache-18.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/18/apache-18.pom (16 kB at 201 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.3.4/maven-shared-utils-3.3.4.jar
Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.6/commons-io-2.6.jar
Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.6/commons-io-2.6.jar (215 kB at 2.0 MB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.3.4/maven-shared-utils-3.3.4.jar (153 kB at 923 kB/s)
[INFO] Deleting /Users/lennygonzales/Documents/cours/ales/cours/2A/Validation_des_logiciels/BankApplicationMvn/target
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.150 s
[INFO] Finished at: 2026-01-09T11:41:33+01:00
[INFO] ------------------------------------------------------------------------
```

## mvn test
La commande `mvn test` exécute les phases **validate**, **compile**, **test-compile** et **test**.
La phase de test permet de tester le code source compilé à l'aide d'un framework de test. Dans notre cas, c'est **jUnit**.
Elle créer le répertoire **target/** contenant **classes, generated-sources, generated-test-sources,maven-status, test-classes** (classes et tests compilés).
```bash
... BankApplicationMvn % mvn test
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------< com.imt.mines:BankApplicationMvn >------------------
[INFO] Building BankApplicationMvn 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-surefire-plugin/3.2.5/maven-surefire-plugin-3.2.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-surefire-plugin/3.2.5/maven-surefire-plugin-3.2.5.pom (5.3 kB at 25 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire/3.2.5/surefire-3.2.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire/3.2.5/surefire-3.2.5.pom (22 kB at 610 kB/s)
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ BankApplicationMvn ---
[INFO] Copying 0 resource from src/main/resources to target/classes
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ BankApplicationMvn ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 6 source files with javac [debug target 23] to target/classes
[WARNING] location of system modules is not set in conjunction with -source 23
  not setting the location of system modules may lead to class files that cannot run on JDK 23
    --release 23 is recommended instead of -source 23 -target 23 because it sets the location of system modules automatically
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ BankApplicationMvn ---
[INFO] skip non existing resourceDirectory /Users/lennygonzales/Documents/cours/ales/cours/2A/Validation_des_logiciels/BankApplicationMvn/src/test/resources
[INFO] 
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ BankApplicationMvn ---
[INFO] Recompiling the module because of changed dependency.
[INFO] 
[INFO] --- surefire:3.2.5:test (default-test) @ BankApplicationMvn ---
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/3.2.5/maven-surefire-common-3.2.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/3.2.5/maven-surefire-common-3.2.5.pom (6.2 kB at 160 kB/s)
...
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-api/3.2.5/surefire-extensions-api-3.2.5.jar (26 kB at 14 kB/s)
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  5.320 s
[INFO] Finished at: 2026-01-09T11:41:44+01:00
[INFO] ------------------------------------------------------------------------
```

## mvn package
La commande `mvn package` exécute les phases **validate**, **compile**, **test** et **package**..
La phase de package nous a généré le répertoire target/maven-archiver et le fichier jar de notre application dans le répertoire target.
```bash
... BankApplicationMvn % mvn package
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------< com.imt.mines:BankApplicationMvn >------------------
[INFO] Building BankApplicationMvn 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-jar-plugin/3.4.1/maven-jar-plugin-3.4.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-jar-plugin/3.4.1/maven-jar-plugin-3.4.1.pom (7.8 kB at 30 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/42/maven-plugins-42.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/42/maven-plugins-42.pom (7.7 kB at 197 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/42/maven-parent-42.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/42/maven-parent-42.pom (50 kB at 1.2 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/32/apache-32.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/32/apache-32.pom (24 kB at 620 kB/s)
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ BankApplicationMvn ---
[INFO] Copying 0 resource from src/main/resources to target/classes
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ BankApplicationMvn ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ BankApplicationMvn ---
[INFO] skip non existing resourceDirectory /Users/lennygonzales/Documents/cours/ales/cours/2A/Validation_des_logiciels/BankApplicationMvn/src/test/resources
[INFO] 
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ BankApplicationMvn ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- surefire:3.2.5:test (default-test) @ BankApplicationMvn ---
[INFO] 
[INFO] --- jar:3.4.1:jar (default-jar) @ BankApplicationMvn ---
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/file-management/3.1.0/file-management-3.1.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/file-management/3.1.0/file-management-3.1.0.pom (4.5 kB at 64 kB/s)
...
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.14.0/commons-lang3-3.14.0.pom
[INFO] Building jar: /Users/lennygonzales/Documents/cours/ales/cours/2A/Validation_des_logiciels/BankApplicationMvn/target/BankApplicationMvn-1.0-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  7.628 s
[INFO] Finished at: 2026-01-09T11:42:00+01:00
[INFO] ------------------------------------------------------------------------
```

## mvn verify.  
La commande `mvn verify` exécute les phases **validate**, **compile**, **test**, **package** et **verify** (sans `clean`).  
La phase `verify` permet de faire des contrôles sur les résultats des **tests d'intégration** afin de garantir le respect des critères de qualité, contrairement à `test` qui ne fait que les **unit tests**, et à `package` qui **s'arrête au packaging sans tests d'intégration**.
```bash
... BankApplicationMvn % mvn verify
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------< com.imt.mines:BankApplicationMvn >------------------
[INFO] Building BankApplicationMvn 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ BankApplicationMvn ---
[INFO] Copying 0 resource from src/main/resources to target/classes
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ BankApplicationMvn ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ BankApplicationMvn ---
[INFO] skip non existing resourceDirectory /Users/lennygonzales/Documents/cours/ales/cours/2A/Validation_des_logiciels/BankApplicationMvn/src/test/resources
[INFO] 
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ BankApplicationMvn ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- surefire:3.2.5:test (default-test) @ BankApplicationMvn ---
[INFO] 
[INFO] --- jar:3.4.1:jar (default-jar) @ BankApplicationMvn ---
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.503 s
[INFO] Finished at: 2026-01-09T12:02:04+01:00
[INFO] ------------------------------------------------------------------------
```