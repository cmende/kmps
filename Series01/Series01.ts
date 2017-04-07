type Value = string | boolean;

let x: Value[] = ['a', false, 'c']

// Fehler:
// let y: Value[] = ['a', false, 1]
// let y: Value[] = 'a'

function odd(x: Value) {
  if (typeof x === "boolean")
    return !x
  return x
}

alert(odd('a'))
alert(odd(false))

// Fehler:
//alert(odd(1))
//alert(odd(x))
