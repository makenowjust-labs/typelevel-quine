# typelevel-quine

> A compile-time type-level [quine](https://en.wikipedia.org/wiki/Quine_(computing)) program for Dotty (Scala 3).

## About

```scala
scala> constValue[quine.Quine] == Source.fromFile(new File("src/main/scala/quine.scala")).mkString
res0: Boolean = true
```

## License

MIT License.

2020 (C) TSUYUSATO "MakeNowJust" Kitsune
