(defproject arohner/foam "0.1.6-SNAPSHOT"
  :description "server-side rendering for Om"
  :url "http://github.com/arohner/foam"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [pandect "0.5.4"]]
  :deploy-repositories [["releases" {:url "https://clojars.org/repo"
                                     :creds :gpg}]])
