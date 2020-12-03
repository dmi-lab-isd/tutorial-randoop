## Prima di eseguire Randoop è necessario generare il jar del progetto
## mvn package
##
## Per generare i test (verranno generati in src/test/java):
## ./randoop.sh --gen 
##
## Per eliminare i test generati (iniziano con RNDP_)
## ./randoop.sh --clean

RANDOOP_ZIP="randoop-4.2.5.zip"
RANDOOP_PATH="randoop-4.2.5"
RANDOOP_JAR="${RANDOOP_PATH}/randoop-all-4.2.5.jar"
MY_CLASSPATH="target/classes" # se si usano altre dipendenze (es. da maven) bisogna aggiungerle al classpath
TIME_BUDGET=60 #sec
TEST_LIMIT=100
OUTPUT_DIR="src/test/java"
PROJECT_JAR="target/randoop-tutorial-1.0-SNAPSHOT.jar"

COMMAND=$1

if [ $# -lt 1 ]; then
	echo "usage: $0 (--gen|--clean)"
	exit 1
fi

## Unzip 
if [ ! -d $RANDOOP_PATH ]; then
	echo " [*] Unzip $RANDOOP_ZIP"
	unzip $RANDOOP_ZIP
fi

if [ "$COMMAND" == "--gen" ]; then
	## Generate
	echo " [*] Generate Tests in $OUTPUT_DIR"
	java -Xmx3000m \
		-classpath ${MY_CLASSPATH}:${RANDOOP_JAR} randoop.main.Main gentests \
		--output-limit=${TEST_LIMIT} \
		--time-limit=${TIME_BUDGET} \
		--junit-output-dir=${OUTPUT_DIR} \
		--error-test-basename="RNDP_ErrorTest" \
		--regression-test-basename="RNDP_RegressionTest" \
		--testjar=${PROJECT_JAR}
	
	exit 0
fi

if [ "$COMMAND" == "--clean" ]; then
	rm ${OUTPUT_DIR}/RNDP_*Test*.java
	
	exit 0
fi