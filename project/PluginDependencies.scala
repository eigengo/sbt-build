package org.eigengo.build

object PluginDependencies {
  import sbt._
  import Keys._

  val sbtDependencyGraph = "net.virtual-void" % "sbt-dependency-graph" % "0.7.4"
  val sbtStats = "com.orrsella" % "sbt-stats" % "1.0.5"
  val scalastyle = "org.scalastyle" % "scalastyle-sbt-plugin" % "0.5.0"
  val sbtAssembly = "com.eed3si9n" % "sbt-assembly" % "0.11.2"
  val sbtMultiJvm = "com.typesafe.sbt" % "sbt-multi-jvm" % "0.3.8"
  val sbtGpg = "com.typesafe.sbt" % "sbt-pgp" % "0.8.3"
}
