# 2D Pattern Matching


This program stores a set of 2D patterns, which can be matched against a 2D matrix of variable size. A match is found only if the input matrix contains exactly one pattern where both values and positions are equal.
The program should take an input matrix as predicate and return the name of first matched pattern.

### Examples

The examples below are 2D matrices. Each cell can contain any character. Dots (`.`) represent padding and can be thought of as `null`.

### Patterns

**Cross**
```
F.F
.X.
F.F
```

**Bend**
```
F..
F..
XXX
```

**Arrow**
```
S.W
SW.
SSS
```

### Example Input

Should match **Cross**.
```
................
...F.F..........
....X...........
...F.F..........
```

Should match **Arrow**.
```
.......
.......
.......
.S.W...
.SW....
.SSS...
.......
```

Should match nothing.
```
.......
.....W.
....W..
.S.W...
.SW....
.SSS...
.......
```
