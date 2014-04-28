;; Working through ClojureBridge.org tutorials
;; https://github.com/ClojureBridge/curriculum
(+ 2 3)
(max 2 17 8)

(def my-hometown "Vancouver")

[1 2 3 4 5]
["1" 3 4 "b" :keyword]
[]

; Exercise: Make a vector of places I've lived.
(def homes ["Vancouver" "London" "Seattle" "Santa Barbara"])
(nth homes 0)
(first homes)
(last homes)
(rest homes)

(into {} [[:a 2][:b 4]])

; Exercise: Model yourself in a map.
(def me {:name "Ralph Giles" :nick "rillian"})
(def more-me (merge me {:hometown (first homes)}))
(get more-me :hometown "homeless")
(:hometown more-me)

; Exercise: name formatting.
(defn format-name
  "Make a new string combining first and last names in sort order."
  [first-name last-name]
   (str last-name ", " first-name))
(format-name "Jane" "Gray")

; Exercise: find the average.
(defn average
  "Find the average of numbers in a sequence."
  [seq]
  (/ (reduce + seq) (count seq)))
(average [1 2 1])
(average [2 2 2 2])
(average (range 10))

; Exercise: get names of people.
(defn get-names
  "Return a list of name strings from a sequence of first: last: maps."
  [seq]
  (map (fn [map] (str (:first map) " " (:last map))) seq)
)
(get-names [{:first "Margaret" :last "Atwood"}
            {:first "Doris" :last "Lessing"}
            {:first "Ursula" :last "Le Guin"}
            {:first "Alice" :last "Munro"}])

 ; Exercise: rewrite average using let.
 (defn average2
   "Find the average of a sequence of numbers."
   [numbers]
   (let [count (count numbers)
         total (reduce + numbers)]
     (/ total count)))
 (average2 [1 2 1])
