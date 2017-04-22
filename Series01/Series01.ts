type Value = string | boolean;

let x: Value[] = ['a', false, 'c']

// Fehler:
// let y: Value[] = ['a', false, 1]
// let y: Value[] = 'a'

function odd(b: boolean) : Value {
  if (b)
    return 'a'
  return false
}

alert(odd(true))
alert(odd(false))

// Fehler:
//alert(odd(1))
//alert(odd(x))
