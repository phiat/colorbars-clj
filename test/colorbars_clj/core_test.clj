(ns colorbars-clj.core-test
  (:require [clojure.test :refer :all]
            [colorbars-clj.core :refer :all]))

(deftest test-safe-div
  (testing "safe divide by zero"
    (is  (safe-div 5 0))))
