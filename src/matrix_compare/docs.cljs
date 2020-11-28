(ns matrix-compare.docs)

(defn doc-url
  "Create a url to various documentation sites
   Dispatches based on a namespace qualified key where
   the namespace chooses the base url and the name is
   used in the url"
  [fn-key]
  (if (qualified-keyword? fn-key)
    (let [namespace (namespace fn-key)
          name      (name fn-key)]
      (case namespace
        "core.matrix"            (str "https://mikera.github.io/core.matrix/doc/clojure.core.matrix.html#var-" name)
        "core.matrix.linear"     (str "https://mikera.github.io/core.matrix/doc/clojure.core.matrix.linear.html#var-" name)
        "core.matrix.operators"  (str "https://mikera.github.io/core.matrix/doc/clojure.core.matrix.operators.html#var-" name)
        "clojure.core"           (str "https://clojuredocs.org/clojure.core/" name)
        "numpy"                  (str "https://numpy.org/doc/stable/reference/generated/numpy." name ".html")
        "numpy.linalg"           (str "https://numpy.org/doc/stable/reference/generated/numpy.linalg." name ".html")
        "scipy.linalg"           (str "https://docs.scipy.org/doc/scipy/reference/generated/scipy.linalg." name ".html")
        "python.control-flow"    (str "https://docs.python.org/3/tutorial/controlflow.html#" name)
        "python.data-structures" (str "https://docs.python.org/3/tutorial/datastructures.html#" name)
        "MATLAB"                 (str "https://www.mathworks.com/help/matlab/ref/" name ".html")
        "math.js"                (str "https://mathjs.org/docs/reference/functions/" name ".html")
        ""))
    nil))