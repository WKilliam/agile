#!/bin/bash

cd $HOME/Desktop/agile-testing-master/functional-tests/src 

javac -d ../bin/ test/functional/*.java
cd $HOME/Desktop/agile-testing-master/functional-tests/bin 

java org.junit.runner.JUnitCore test.functional.FunctionalTest