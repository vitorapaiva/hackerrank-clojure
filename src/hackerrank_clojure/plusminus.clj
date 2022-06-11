(ns hackerrank-clojure.plusminus)

(defn count-positive [arr]
  (let [qty-positive (atom 0)]
    (doseq [number arr]
      (if (> number 0)
        (swap! qty-positive inc)
        ))
    @qty-positive)
  )
(defn count-negative [arr]
  (let [qty-negative (atom 0)]
    (doseq [number arr]
      (if (< number 0)
        (swap! qty-negative inc)
        ))
    @qty-negative)
  )
(defn count-zero [arr]
  (let [qty-zero (atom 0)]
    (doseq [number arr]
      (if (= number 0)
        (swap! qty-zero inc)
        ))
    @qty-zero)
  )

(defn generate-qty-map! [arr]
  (let [
        arr-qty (atom {})
        qty-positive (count-positive arr)
        qty-negative (count-negative arr)
        qty-zero (count-zero arr)
        ]
    (swap! arr-qty assoc :qty-positive qty-positive)
    (swap! arr-qty assoc :qty-negative qty-negative)
    (swap! arr-qty assoc :qty-zero qty-zero)
    @arr-qty
    )
  )

(defn plusMinus [arr]
  (let [
        arr-size (count arr)
        arr-qty (generate-qty-map! arr)
        ]
    (println (float (/ (get arr-qty :qty-positive) arr-size)))
    (println (float (/ (get arr-qty :qty-negative) arr-size)))
    (println (float (/ (get arr-qty :qty-zero) arr-size)))
    )
  )

(plusMinus [0 -1 2 3 -4 5 6 -7 8 9 0])