(defproject ch.deepimpact/flowgic.graph "0.1.1-SNAPSHOT"
  :description "Graph your flow logic"
  :url "https://github.com/DEEP-IMPACT-AG/flowgic.graph"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [ch.deepimpact/flowgic "0.1.1"]
                 [rhizome "0.2.5"]]
  :profiles {:dev {:dependencies [[org.clojure/tools.namespace "0.2.11"]]
                   :source-paths ["dev"]}})
