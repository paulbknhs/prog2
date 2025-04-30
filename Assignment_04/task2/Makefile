# Name der Hauptklasse
MAIN_CLASS=Marketplace

# Finde alle Java-Dateien im aktuellen Verzeichnis
SOURCES=$(wildcard *.java)

# Erzeuge zugehörige .class-Dateien
CLASSES=$(SOURCES:.java=.class)

# Standard-Ziel: Kompilieren
all: $(MAIN_CLASS).class

$(MAIN_CLASS).class: $(SOURCES)
	javac $(SOURCES)

# Ausführen des Programms
run: all
	java $(MAIN_CLASS)

# Aufräumen: löscht alle .class-Dateien
clean:
	rm -f *.class
	rm -f offerings/*.class
	rm -f auth/*.class
