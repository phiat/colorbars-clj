# colorbars-clj

A Clojure library designed to make rpg-style stat bars, using clansi for coloring.

You want pretty, colored, terminal-outputted stat bars for your rogue-like game? Try this...

## Usage

[Leiningen](https://github.com/technomancy/leiningen) users add this to your :dependencies in `project.clj`:

    [colorbars-clj "0.2.0-SNAPHOT"]

then use like this:
```clojure

(use 'colorbars-clj)
(def hp 9)      ;; verbose for example
(def mhp 10)
(def width 20)

(hp-bar hp mhp width)
```

 <img src="http://i.imgur.com/tKil606.png" alt="a pretty hit point bar" title="hp bar" />


see [intro](https://github.com/phiat/colorbars-clj/blob/master/doc/intro.md) for more

*suggestions welcomed!*

## License

Copyright © 2013 Patrick Ryan - phiat

Distributed under the Eclipse Public License, the same as Clojure.
