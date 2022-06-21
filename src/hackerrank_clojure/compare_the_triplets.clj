(ns hackerrank-clojure.compare-the-triplets)

;
; Complete the 'compareTriplets' function below.
;
; The function is expected to return an INTEGER_ARRAY.
; The function accepts following parameters:
;  1. INTEGER_ARRAY a
;  2. INTEGER_ARRAY b
;
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