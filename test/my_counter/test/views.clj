(ns my-counter.test.views
  (:use clojure.test
        my-counter.views))

(deftest test-views
  (testing "index-page should return json"
    (with-redefs [my-counter.number-gen/next-number (constantly 1)]
      (is (= (index-page) (str "{\"count\":1}"))))))