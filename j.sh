#!/bin/bash

cd $HOME/Desktop/agile-testing-master/unit-tests/src 

javac -d ../bin/ test/*.java
cd $HOME/Desktop/agile-testing-master/unit-tests/bin 

java org.junit.runner.JUnitCore test.HeroTest
