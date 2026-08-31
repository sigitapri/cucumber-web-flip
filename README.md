# Automation-openRMS
This repo for technical test purpose Amartha using Java, Selenium WebDriver
and Cucumber for Behavior-Driven Development (BDD).

## 📖 Table of Contents
- [Prerequisites](#Prerequisites)
- [Installation](#Installation)
- [Usage](#usage)
- [Folder Structure](#folder-structure)


## 🚀 Prerequisites
- Java JDK 11 or higher
- Maven installed
- IDE (IntelliJ IDEA, Eclipse)
- WebDriver (ChromeDriver)


## 🚀 Installation
### Clone this repository

### Navigate to the project directory
cd sauce-demo

### Install dependencies
mvn clean install 


## 🚀 Usage
### Run all tests
mvn clean verify

### Run specific tests using Cucumber tags
mvn test -Dcucumber.filter.tags="@login"
or open src/test/runners/RunCukesTest >> update tag from "regression" to "login"

### Check report
open folder target/cucumber-report-html/cucumber-html-reports/feature-overview.html


## 🚀 Folder structure
### Folder structur readable only in ide
```
.
├── src
│   ├── main
│   │   └── pages                       #  Store locator devided per-class
│   │   └── utils                       #  Property manager
│   └── test
│       ├── java
│       │   └── hooks                   #  Browser config
│       │   └── runners                 #  Test Runners
│       │   └── step_defitions          #  Cucumber Step Definitions
│       │
│       └── resources
│           └── features.regression     #  Cucumber Feature Files
│
├── target
│   └── cucumber-report-html
│       └── cucumber-html-report
│           └── fature-overview.html    #  Report
├── pom.xml                             # Project Configuration (Maven)
└── README.md
```
