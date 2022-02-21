(ns lein-project-reader.core)

(defn read-clojure-file [file]
  (read-string (str "[" (slurp file) "]")))

(defn read-project-form
  ([] (read-project-form "project.clj"))
  ([path]
   (first (filter #(-> % first (= 'defproject)) (read-clojure-file path)))))

(defn read-project
  "Returns a map representing the Leiningen project definition. It provides
  :name and :version keys in addition to all the keys provided in the project.clj
  defproject form. Reads project.clj in the current working directory by default."
  ([] (read-project "project.clj"))
  ([path]
   (let [proj (read-project-form path)]
     (merge {:name    (second proj)
             :version (nth proj 2)}
       (apply hash-map (nthrest proj 3))))))