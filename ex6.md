# Exercice 6

```bash
... BankApplicationMvn % mvn compile
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
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 6 source files with javac [debug target 23] to target/classes
[WARNING] location of system modules is not set in conjunction with -source 23
  not setting the location of system modules may lead to class files that cannot run on JDK 23
    --release 23 is recommended instead of -source 23 -target 23 because it sets the location of system modules automatically
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.582 s
[INFO] Finished at: 2026-01-09T11:36:11+01:00
[INFO] ------------------------------------------------------------------------
```

```bash
... BankApplicationMvn % tree
 BankApplicationMvn % tree
.
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── imt
│   │   │           └── mines
│   │   │               ├── ACHService.java
│   │   │               ├── ACHServiceImpl.java
│   │   │               ├── Bank.java
│   │   │               ├── BankAccount.java
│   │   │               ├── BankAccountApp.java
│   │   │               └── Person.java
│   │   └── resources
│   └── test
│       └── java
└── target
    ├── classes
    │   └── com
    │       └── imt
    │           └── mines
    │               ├── ACHService.class
    │               ├── ACHServiceImpl.class
    │               ├── Bank.class
    │               ├── BankAccount.class
    │               ├── BankAccountApp.class
    │               └── Person.class
    ├── generated-sources
    │   └── annotations
    └── maven-status
        └── maven-compiler-plugin
            └── compile
                └── default-compile
                    ├── createdFiles.lst
                    └── inputFiles.lst

21 directories, 15 files
```