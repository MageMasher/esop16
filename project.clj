(defproject demo "0.1.0-SNAPSHOT"
  :description "Examples for Typed Clojure paper"
  :url "http://frenchy64.github.io/papers/esop16-short.pdf"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/core.typed "0.3.21"]]
  :repositories {"sonatype-oss-public" "https://oss.sonatype.org/content/groups/public/"}
  :injections [(require 'clojure.core.typed)
               (clojure.core.typed/install)])
