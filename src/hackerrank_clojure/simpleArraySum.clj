;problem link: https://www.hackerrank.com/challenges/simple-array-sum/problem?isFullScreen=true
(ns hackerrank-clojure.simpleArraySum)

(defn simpleArraySum [ar]
  (reduce + ar)
  )