let arr : [Int] = [];

// Swift:: Error: cannot use mutating member on immutable value: 'arr' is a 'let' constant
// arr.append(1);
// ^~~
// tmp/GmralRMU3M.swift:2:1: note: change 'let' to 'var' to make it mutable
// let arr : [Int] = [];
// ^~~
// var
arr.append(1);
