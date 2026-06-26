# Dokumentation

## JAVA HOME und Pfade gesetzt

JAVAHOME hinzugefügt und pfade für Maven und JDK gesetzt

## Version geprüft
„mvn -v“ =  Apache Maven 3.9.16
„java -version“ =  openjdk version “25” 2025-09-16
“javac – version” = javac 25

## Neue branch "init_project"
Branch init_project und maven project erstellt

.idea ordner zu .gitignore hinzugefügt

änderungen mit git add hinzugefügt und mit git commit -m confirmed

Branch ist sichtbar und wurde nun mit main gemerged

## Neue branch "calculator"
Nach dem ausführen von Calculator java wurde der Ordner "target" automatisch erstellt

screenshot erstellt und in resources/images gespeichert ex2_1.png

Beim ändern der Pom.xml konnte ich nur 3.13.0 als aktuellste version aussuchen.

mvn compile erfolgreich und in ex2_2.png gespeichert

In main klasse ausgabe von Vor-Nachname hinzugefügt nochmal mit mvn exec:java ausgeführt und unter ex2_3.png gespeichert

Calculator branch merged mit main

## Neue branch "logging"

 .gitignore erweitert mit *.log
dependencies in pom.xml erweitert
Imports und Logger in main klasse hinzugefügt
2 log nachrichten ausgegeben. 1. Info und 2. Error
in der Konsole wurde nur der error ausgegeben aber nicht info!
Screenshot unter ex2_4.png gespeichert!

Logger in calculater klasse hinzugefügt und bei den Methoden, debug logger hinzugefügt.
log4j2.xml erstellt in main/resources
mit cp log4j2.xml.template erstellt
log4j2.xml in gitignore hinzugefügt
Programm mehrmals ausgeführt für weitere einträge
screenshot von den log einträgen gemacht und unter ex2_5.png gespeichert
Alles in README.md verlinkt

