(ns my-counter.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [my-counter.views :as views]))

(defroutes app-routes
  (GET "/" [] (str (views/index-page)))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
