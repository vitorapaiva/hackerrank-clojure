(ns hackerrank-clojure.diagonal-difference)
(defn generateLeftDiagonalIndexes [arrSize]
  (for [i (range arrSize)]
    [i i]
    )
  )

(defn generateRightDiagonalIndexes [arrSize]
  (for [i (range arrSize)]
    [i (- (- arrSize 1) i)]
    )
  )
(defn diagonalDifference [arr]
  (let [
        arrSize (count arr)
        listOfLeftDiagonalIndexes (generateLeftDiagonalIndexes arrSize)
        listOfRightDiagonalIndexes (generateRightDiagonalIndexes arrSize)
        sumOfLeftDiagonal (reduce + (map #(get-in arr %) listOfLeftDiagonalIndexes))
        sumOfRightDiagonal (reduce + (map #(get-in arr %) listOfRightDiagonalIndexes))
        diffDiagonal (- sumOfLeftDiagonal sumOfRightDiagonal)
        ]
    (if (> diffDiagonal 0)
      diffDiagonal
      (* -1 diffDiagonal)
      )
    )
  )