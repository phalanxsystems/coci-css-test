(set-env!
  :source-paths #{"src"}
  :dependencies '[[coci-css                                 "0.1.0"]
                  [deraen/boot-sass                         "0.2.0"] ])

(require
  '[deraen.boot-sass    :refer [sass]]
  )


(task-options!
  pom    {:project 'coci-css
          :version "0.1.0"
          :description "common css for chabad on campus projects"}
  speak  {:theme "woodblock"}
  )


