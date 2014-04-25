(ns clj-tut.core
  (:require [clj-http.client :as client]))

(defn hello
  "I don't do a whole lot."
  [x]
  (println "Hello," x "!"))

(defn fetch
  "Retrieve and print a given url"
  [url]
  (println (client/get url))
)

(defn -main []
  (hello "Ralph")
  (fetch "https://thaumas.net/")
)

(-main)
