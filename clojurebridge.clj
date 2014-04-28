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