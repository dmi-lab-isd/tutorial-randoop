# Tutorial: Randoop
Verrà usato randoop 4.2.5 (zip già prsente nel repo per semplicità): https://github.com/randoop/randoop/releases/download/v4.2.5/randoop-4.2.5.zip

Documentazione: https://randoop.github.io/randoop/manual/

## Step
Per semplificare l'uso di Randoop è stato creato uno script (`randoop.sh`)
- `mvn package` (genera il jar del progetto per il quale generare i test)
- `chmod +x randoop.sh`
- `./randoop.sh --gen` (genera i test a partire dal jar)
- `mvn test` (esegue i test e produce il report di copertura con jacoco)
- `open target/site/jacoco/index.html`
- `./randoop.sh --clean` (opzionale: per rimuovere i test generati da randoop)
