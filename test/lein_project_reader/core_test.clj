(ns lein-project-reader.core-test
  (:require [clojure.test :refer :all]
            [lein-project-reader.core :refer :all]))

(deftest reader-test
  (testing "It should read the current project"
    (let [proj (read-project)]
      (is (= 'net.clojars.aneilm/lein-project-reader (:name proj)))
      (is (= (System/getProperty "lein-project-reader.version") (:version proj))))))
