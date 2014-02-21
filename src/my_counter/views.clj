(ns my-counter.views
  (:require [clojure.data.json :as json]
            [my-counter.number-gen :as number-gen]))

(defn index-page [] (json/write-str {:count (number-gen/next-number)}))