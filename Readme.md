**Hängebrücke**
Eine Wandergruppe `(N Personen)` ist noch spätabends unterwegs und auf ihrem Rückweg müssen Sie noch eine Hängebrücke überqueren. 
Da sie mit einem früheren Rückweg rechneten, hat nur eine Person eine Taschenlampe bei sich. Zu jedem Zeitpunkt dürfen sich maximal zwei Personen auf der Hängebrücke befinden und damit sie nicht abstürzen, muss immer die Taschenlampe mit dabei sein. Jede Person der Wandergruppe hat ihre individuelle Laufgeschwindigkeit. Wenn zwei Personen zusammen die Brücke überqueren bestimmt die langsamere die Geschwindigkeit. 
Ihr Auftrag ist es irgendeine optimale Strategie zu finden, damit die Wandergruppe insgesamt in möglichst kurzer Zeit die Brücke überqueren kann. Eingabe Lesen Sie die Eingabe von der Konsole. 
Auf der ersten Zeile steht die Anzahl Testfälle, die Sie lösen müssen. Nach einer Leerzeile folgen die Beschreibungen der einzelnen Testfälle und die Testfälle sind wiederum durch eine Leerzeile getrennt. 

Ein Testfall ist wie folgt aufgebaut: Auf der ersten Zeile steht eine ganze Zahl `N (1 ≤ N ≤ 1000)`. 
Die nachfolgenden N Zeilen enthalten die individuellen Überquerungszeiten pro Person, welche nicht grösser als `100 Sekunden` sind. Ausgabe Schreiben Sie die Ausgabe direkt auf die Konsole. 
Die nachfolgenden Zeilen zeigen dann, welche Personen in welcher Reihenfolge die Brücke überquert haben. Für jede Brückenüberquerung wird eine Zeile ausgegeben. Pro Zeile wird die individuelle Überquerungszeit der Personen auf der Brücke, getrennt durch ein Leerzeichen, ausgegeben. (Obwohl mehrere Personen die gleiche Überquerungszeit haben können, spielt diese Mehrdeutigkeit keine Rolle.) Beachten Sie, dass die Brückenüberquerungen abwechselnd in unterschiedlicher Richtung erfolgen, weil es notwendig ist, die Taschenlampe zurückzubringen, falls noch weitere Personen die Hängebrücke überqueren müssen. 

__Eingabebeispiel 1__
```
4 
1 
2 
5 
10 
```
__Erwartete Ausgabe__
```
17 
1 
2 
1 
5 
10 
2 
1 
2 
```
Weitere Testdaten finden Sie im Ordner `Testdaten`