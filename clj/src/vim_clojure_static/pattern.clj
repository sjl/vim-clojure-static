(ns vim-clojure-static.pattern
  (:import (java.util.regex Pattern)))

(defn test-patterns! []
  (Pattern/compile "C[cfnos]?|L[CDlmotu]?")
  (Pattern/compile "C(?:c|f|n|o|s)?|L(?:C|D|l|m|o|t|u)?"))
