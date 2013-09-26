(ns colorbars-clj.core
  (:require [clansi.core :as clansi]))

;; minimum width of bar
(def ^:dynamic *min-width* 14)

;; safe divide
(defn safe-div
	"After catching the ArithmeticException, print the error message, 
	and then try and recover by returning some meaningful value. 
	In this case, if x > 0, return +inf, if 0, NaN, otherwise -inf."
	[x y]
  (try (/ x y)
    (catch ArithmeticException _
      (println "Division by zero caught!")
      (cond (> x 0)   Double/POSITIVE_INFINITY
            (zero? x) Double/NaN
            :else     Double/NEGATIVE_INFINITY) )))

;; generic filled bar 
(defn filled-bar 
  "prints a bar with hp/mhp ratio with bg colors c1/c2 and text colors t1/t2"
  [label hp mhp width c1 c2 t1 t2]
	(if (> mhp 0)
	(let [width (if (< width *min-width*) *min-width* width)
		  units (int (safe-div (float width) mhp))
		  ratio (safe-div (float hp) mhp)
		  hplen (int (* ratio width))
		  hplen (if (and (> hp 0) (zero? hplen)) 1 hplen)
		  mhplen (- width hplen)
		  hp-fmt (format "%4s: %3d/%3d" label hp mhp)		  
		  hp-fmt-length (count hp-fmt)
		  text-green (apply str (take hplen hp-fmt))
		  text-red (apply str (drop (count text-green) hp-fmt))]
		(dorun [(print (clansi/style text-green c1 t1))
				(print (clansi/style text-red c2 t2))
			 	(print (clansi/style (apply str (repeat (- hplen hp-fmt-length) " ")) c1))
		 	    (print (clansi/style (apply str (repeat (- mhplen (count text-red)) " ")) c2))]))))
	
;; hp bar	
(defn hp-bar 
	"default hp green/red wrapper"
	[hp mhp width]
	(filled-bar "hp" hp mhp width :bg-green :bg-red :black :black))

;; mp bar
(defn mp-bar 
	"default mp cyan/blue wrapper"
	[hp mhp width]
	(filled-bar "mp" hp mhp width :bg-cyan :bg-blue :black :white))

;; test function to display an Actor map 
(defn display 
	"displays an actor map with bars, ex: {:name \"Joe\" :hp 10 :mhp 15 :mp 20 :mmp 25}"
	[p width] 
	(let [name (:name p) hp (:hp p) mhp (:mhp p) mp (:mp p) mmp (:mmp p)]
		(dorun [(println name)
				(hp-bar hp mhp width) (println)
				(mp-bar mp mmp width) (println)])))

