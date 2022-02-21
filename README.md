# lein-project-reader
[![master](https://github.com/aneilbaboo/lein-project-reader/actions/workflows/tests.yml/badge.svg?branch=master&label=master&text=master%20tests&title=master%20tests)](https://github.com/aneilbaboo/lein-project-reader/actions/workflows/tests.yml)

[![Clojars Project](https://img.shields.io/clojars/v/net.clojars.aneilm/lein-project-reader.svg)](https://clojars.org/net.clojars.aneilm/lein-project-reader)
``
Read the Leiningen project file.
## Install
```clojure
[net.clojars.aneilm/lein-project-reader "0.0.1"]
```

## Usage
Given project.clj in project root:
```clojure
(defproject myproject "0.1.0"
  :description "Myproject description"
  ...)
```
Get a map representing the project:
```clojure
(read-project) 
  => {:name myproject, :version "0.1.0", :description "Myproject description" ....}

;; read other project file:
(read-project "/path/to/project.clj")

```
## License

Copyright 2022 Aneil Mallavarapu

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

