; problem link: https://www.hackerrank.com/challenges/compare-the-triplets?isFullScreen=true
(ns hackerrank-clojure.compare-the-triplets)

(defn checkIfA [valA valB]
  (if
    (not= valA valB)
    (if (> valA valB)
      1
      0
      )
    0)
  )

(defn checkIfB [valA valB]
  (if
    (not= valA valB)
    (if (< valA valB)
      1
      0
      )
    0)
  )

(defn compareTriplets [a b]
  [(reduce + (map checkIfA a b))
   (reduce + (map checkIfB a b))])

(println (compareTriplets [1 2 3] [2 2 1]))