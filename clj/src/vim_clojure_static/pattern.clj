(ns vim-clojure-static.pattern
  (:import (java.util.regex Pattern)))

(defn test-patterns! []
  (Pattern/compile "C[cfnos]")
  (Pattern/compile "C(?:c|f|n|o|s)"))
