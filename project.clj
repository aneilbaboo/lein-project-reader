(defproject net.clojars.aneilm/lein-project-reader "0.0.2"
  :description "Provides access to the Leiningen project definition"
  :url "https://github.com/aneilbaboo/lein-project-reader"
  :license {:name "MIT"
            :url  "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :repositories [["releases" {:url   "https://repo.clojars.org"
                              :creds :gpg}]]
  :repl-options {:init-ns lein-project-reader.core})
