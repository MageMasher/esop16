(ns ^:core.typed demo.example3
  (:import [java.io.File])
  (:require [clojure.core.typed :refer [ann U Str]]))

(ann parent [(U nil File) -> (U nil Str)])
(defn parent [f] (if f (.getParent f) nil))
