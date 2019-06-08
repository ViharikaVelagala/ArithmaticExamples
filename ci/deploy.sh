#!/bin/bash

export env=$1
export version=$2
JAR_NAME=/home/travis/build/ViharikaVelagala/ArithmaticExamples/target/ArithmaticExamples-${version}.jar
CLASS_NAME="com.examples.Arithmaticoperations"

if [ ${env} = "dev" ] || [ ${env} = "staging" ] || [ ${env} = "prod" ]; then 
    java -cp ${JAR_NAME} ${CLASS_NAME} 3 4
else 
    echo "Invalid Environment"
	exit 1
fi
