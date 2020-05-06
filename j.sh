#!/bin/bash

cd $HOME/Desktop/agile-testing-master/agile/unit-tests/src 

javac -d ../bin/ test/*.java

cd $HOME/Desktop/agile-testing-master/agile/unit-tests/bin 

java org.junit.runner.JUnitCore test.HeroTest

java org.junit.runner.JUnitCore test.EnemyTest
