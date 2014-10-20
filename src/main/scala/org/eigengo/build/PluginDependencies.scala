package org.eigengo.build

private[build] object PluginDependencies {
  import sbt._

  val sbtDependencyGraph = "net.virtual-void" % "sbt-dependency-graph" % "0.7.4"
  val sbtStats = "com.orrsella" % "sbt-stats" % "1.0.5"
  val jacoco4sbt = "de.johoop" % "jacoco4sbt" % "2.1.6"
  val scalastyle = "org.scalastyle" %% "scalastyle-sbt-plugin" % "0.5.0"
  val sbtAssembly = "com.eed3si9n" % "sbt-assembly" % "0.11.2"
  val sbtMultiJvm = "com.typesafe.sbt" % "sbt-multi-jvm" % "0.3.8"

  val all = Seq(sbtDependencyGraph, sbtStats, jacoco4sbt, scalastyle, sbtAssembly, sbtMultiJvm)

}