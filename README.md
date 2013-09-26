# colorbars-clj

A Clojure library designed to make rpg-style stat bars, using clansi for coloring.


## Usage

You want pretty, colored, terminal-outputted stat bars for your rogue-like game? Try this...

```clojure
(use 'colorbars-clj)
(def hp 9)      ;; verbose for example
(def mhp 10)
(def width 20)

(hp-bar hp mhp width)
```

 <img src="http://i.imgur.com/tKil606.png" alt="a pretty hit point bar" title="hp bar" />


see [intro.md](https://github.com/phiat/colorbars-clj/edit/master/docs/intro.md) for more

## License

Copyright © 2013 Patrick Ryan

Distributed under the Eclipse Public License, the same as Clojure.
