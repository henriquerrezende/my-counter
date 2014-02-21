(ns my-counter.test.number-gen
  (:use clojure.test
        my-counter.number-gen))

(deftest test-number-gen
  (testing "the numbers are incremented by one"
    (is (= (next-number) (dec (next-number))))))