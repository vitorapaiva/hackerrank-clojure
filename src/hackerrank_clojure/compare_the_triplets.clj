(ns hackerrank-clojure.compare-the-triplets)

;
; Complete the 'compareTriplets' function below.
;
; The function is expected to return an INTEGER_ARRAY.
; The function accepts following parameters:
;  1. INTEGER_ARRAY a
;  2. INTEGER_ARRAY b
;
(defn compareTriplets [a b]
  (let [
        rateA (atom 0)
        rateB (atom 0)
        ]
    (doseq [number (range (count a))]
      (let [
            valA (get a number)
            valB (get b number)
            ]
        (if
          (not= valA valB)
          (if (> valA valB)
            (swap! rateA inc)
            (swap! rateB inc)
            )
          )
        )
      )
    [@rateA @rateB]))