# Introduction to colorbars-clj

Pretty stat bars for rpgs and games.

```clojure
(use 'colorbars-clj.core)

;; makes a generic stat bar with "  stat:  12 / 15 " with white/cyan bg and black/black text
(filled-bar "stat" 12 15 25 :bg-white :bg-cyan :black :black) 

;; makes a hit points bar with "  hp: 30 / 30 " with green/red bg and black/black text
(hp-bar 30 30 40)

;; makes a magic points bar with "  mp: 30 / 30 " with cyan/blue bg and black/white text
(hp-bar 30 30 40)

;; displays name, hp/mhp bar, mp/mmp bar of a map.
;; for use with an actor map, ex: 
(def player {:name "Harold of the Rocks" :hp 18 :mhp 60 :mp 9 :mmp 10})
(def width 20)
(display player width)
```
<img src="http://i.imgur.com/WG6hR0b.png" title="Harold's stat bars"/>


Make some dungeon crawlers!  Drain and fill those stat bars!
