;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.
(ns test)

(str "Hello" " " "World")

(+ 1 1)
(- 2 1)
(* 1 2)
(/ 2 1)

(= 1 1)
(= 2 1)

(not true)

(+ 1 (- 3 2))

(class 1)
(class 1.)
(class "")
(class false)
(class nil)

'(+ 1 2)

(eval '(+ 1 2))

(class [ 1 2 3 ])
(class '(1 2 3))

(coll? '(1 2 3))
(coll? [1 2 3])
(seq? '(1 2 3))
(seq? [1 2 3])
(seq? '[1 2 3])
(class '[1 2 3])

(range 4)
(range)
(take 4 (range))

(cons 4 [1 2 3])
(cons 4 '(1 2 3))

(conj [1 2 3] 4)
(conj [1 2] [3 4])
(cons [1 2] [3 4])
(conj '(1 2 3) 4)

(concat [1 2] '(3 4))

(map inc [1 2 3])
(filter even? [1 2 3])
(filter odd? (range 10))

(reduce + [1 2 3 4])
(reduce conj [] '(3 2 1))

(fn [] "Hello World")
((fn [] "Hello World"))

(def x 1)

(def hello-world (fn [] "Hello World"))
(hello-world)

(defn hellow-world [] "Hello World")
(hello-world)

(defn hello [name]
  (str "Hello " name))
(hello "Goodbye")

(def hello2 #(str "Goodbye " %1))
(hello2 "Hello")

(defn hello3
  ([] "Hello World")
  ([name] (str "Hello " name))
)
(hello3 "Sailor")
(hello3)


(defn count-args [& args]
  (str "You passed " (count args) " args: " args))
(count-args 1 2 3)
(count-args '(1 2 3))
(count-args [3 4 5] 6 7 8)

(class {:a 1 :b 2 :c 3})

(class :a)

(def stringmap (hash-map "a" 1 "b" 2, "c" 3))
stringmap

(def keymap (hash-map :1 1 :b 2 :c 3))
keymap

(stringmap "b")
(keymap :b)
(:c keymap)
("a" stringmap)
(stringmap "s")

(assoc keymap :d 4)
keymap
(dissoc keymap :a :b)

(class #{1 2 3})
(set [1 2 3 1 23 3 2 2 3 4])
(conj #{1 2 3} 4)
(disj #{1 2 3} 1)

(#{1 2 3} 1)
(#{1 2 3} 4)

;;;;;

(if false "a" "b")
(if false "b")

(let [a 1 b 2]
  (> a b))

(do
  (print "Hello")
  "world")

(defn print-and-say-hello [name]
  (println "Saying hello to " name)
  (str "Goodbye " name))
(print-and-say-hello "rillian")

(let [name "Umbriel"]
  (println "Saying hello to" name)
  (str "Farewell" name))

(println (class :name))

(use 'clojure.set)
(intersection #{1 2 3} #{2 3 4})
(difference #{1 2 3} #{2 3 4})

(use '[clojure.set :only [intersection]])
(require 'clojure.string)

(clojure.string/blank? "")

(require '[clojure.string :as str])
(str/replace "This is a test." #"[a-o]" str/upper-case)

(ns test
  (:require
   [clojure.string :as str]
   [clojure.set :as set]))

(import java.util.Date)
(ns test
  (:import java.util.Date
           java.util.Calendar))
(Date.)
(. (Date.) getTime)
(.getTime (Date.))

(System/currentTimeMillis)

(imprt java.util.Calendar)
(doto (Calendar/getInstance)
  (.set 2001 1 1 1 1 1)
  .getTime)
