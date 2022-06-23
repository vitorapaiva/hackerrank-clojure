;problem link: https://www.hackerrank.com/challenges/plus-minus/problem?isFullScreen=true
(ns hackerrank-clojure.plusminus)

(defn count-positive [arr]
  (count (filter pos? arr)))

(defn count-negative [arr]
  (count (filter neg? arr)))

(defn count-zero [arr]
  (count (filter zero? arr)))

(defn generate-qty-map [arr]
  (let [
        qty-positive (count-positive arr)
        qty-negative (count-negative arr)
        qty-zero (count-zero arr)
        ]
    {:qty-positive qty-positive
     :qty-negative qty-negative
     :qty-zero     qty-zero} ))

(defn plusMinus [arr]
  (let [
        arr-size (count arr)
        arr-qty (generate-qty-map arr)
        ]
    (println (float (/ (get arr-qty :qty-positive) arr-size)))
    (println (float (/ (get arr-qty :qty-negative) arr-size)))
    (println (float (/ (get arr-qty :qty-zero) arr-size)))
    )
  )

(plusMinus [0 -1 2])