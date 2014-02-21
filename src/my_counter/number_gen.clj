(ns my-counter.number-gen)

(def number (atom 0))

(defn next-number [] (swap! number inc))