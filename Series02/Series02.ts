function aufgabe1() {
  // TypeScript-Variablendeklaration: Wert kann geändert werden
  let a = 'a'
  a = 'a2'
  // Fehler: Variable kann nicht erneut deklariert werden
  //let a = 'a3'
  if (true) {
    let a3 = 'a3'
  }
  // Fehler: Variable außerhalb ihrer Scope nicht verfügbar
  //alert(a3)

  // Konstantendeklaration: Wert kann nicht geändert werden
  // ansonsten gleiche Einschränkungen wie let
  const b = 'b'
  // Fehler:
  //b = 'b2'

  // JavaScript-Variablendeklaration: Wert kann geändert werden
  // im Gegensatz zu let ist diese Deklaration nicht nur in ihrer Scope sichtbar
  // wie das folgende Beispiel zeigt
  if (true) {
    var c = 'c'
  }
  alert(c)
  // zusätzlich kann die Variable 'shadowed' - also erneut deklariert - werden,
  // auch das ist mit let nicht möglich
  var c = 'c2'
  var c = 'c3'
}

function aufgabe2() {
  const arr : number[] = []
  arr.push(1)
}
