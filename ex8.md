# Exercice 8

## mvn test
- **deposit_happyPath** : Vérifie qu'un dépôt de 200€ augmente le solde de 100€ à 300€.
- **deposit_edgeCase** : Teste qu'un dépôt négatif (-50€) n'altère pas le solde initial.

- **withdraw_happyPath** : Confirme que le retrait de 100€ réduit le solde de 500€ à 400€.
- **withdraw_edgeCase** : Vérifie qu'un retrait excédant la limite (180€ > 150€) échoue sans changer le solde.

```bash
... BankApplicationMvn % mvn test
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
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.imt.mines.BankAccountTest
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.021 s -- in com.imt.mines.BankAccountTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.655 s
[INFO] Finished at: 2026-01-09T14:25:51+01:00
[INFO] ------------------------------------------------------------------------
```