<img src="http://friendsofgoodshepherd.org/images/fogs/FOGS-logo.png" /> <img src="http://workandjam.com//foto/s190.jpg" />       

[![Build Status](https://travis-ci.org/openmrs/openmrs-core.svg?branch=master)](https://travis-ci.org/openmrs/openmrs-core)


# HOPE HEALTH MEDICAL SOLUTIONS

### About

Hope Health Clinic is a private operated organization that is governed by the friends of the [Good Shepherd Foundation](http://friendsofgoodshepherd.org/about-us) for over 35 years. This non-profitable organization provides health care to over 20,000 low income citizens of the north western region of Jamaica each year.The main issues currently affecting the efficiency and the effectiveness of the services provided by the clinic includes inefficient record retrieval, record keeping is space consuming and the generation of tedious financial reports. 

### Mission

Hope Health Medical Solution focuses on providing a free electronic medical record solution.The mission of HHMS is to improve health care delivery in resource-constrained environments with a robust, scalable, user-driven, open source medical record system platform.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

* Java JDK 
* Java IDE 
* Git 
* Windows/Linux/Mac 

### Development

See instructions to:

- Install Java JDK [here](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

- Install IntelliJ IDEA [here](https://www.jetbrains.com/help/idea/2017.1/installing-and-launching.html).

- Use IntelliJ GitHub Integration [here](https://www.jetbrains.com/help/idea/2017.1/using-github-integration.html).


### Deployment

[On Linux]

You will use `git` the Java compiler `javac` to compile your Java programs and the Java interpreter `java` to run them,assuming already installed. 

Check version:
```
$ javac -version
javac 1.8.0_121

$ java -version
java version "1.8.0_111"
Java(TM) SE Runtime Environment (build 1.8.0_111-b14)
```
Clone repo:
```
$ git clone https://github.com/superrcoop/HHMSystem.git
```
Navigate to directory:
```
$ cd HHMSystem/
```
Compile,create `.jar` file and run:
```
$ javac /src/_hhms_/$(find . -name "*.java")
```
```
$ jar vcfm HHMS.jar src/META-INF/MANIFEST.MF src/_hhms_/$(find . -name "*.class")
```
```
$ java -jar HHMS.jar
```

### Contributing

Cheackout these useful guides:

* [Java SE Oracle documentation](https://docs.oracle.com/javase/tutorial/index.html)

* [Java cheet sheet](http://mindprod.com/jgloss/jcheat.html)

* [Github cheet sheet](https://services.github.com/on-demand/downloads/github-git-cheat-sheet.pdf)

Contributions are very welcome, we can definitely use your help!

## Built With

IntelliJ IDEA 2016.3
