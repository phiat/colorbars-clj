# colorbars-clj

A Clojure library designed to make rpg-style stat bars, using clansi for coloring

## Usage

```clojure
(use 'colorbars-clj)
(def hp 9)      ;; verbose for example
(def mhp 10)
(def width 20)

(hp-bar hp mhp width)
```
makes a pretty bar graph

## License

Copyright © 2013 Patrick Ryan

Distributed under the Eclipse Public License, the same as Clojure.
