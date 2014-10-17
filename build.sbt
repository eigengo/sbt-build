import org.eigengo.build._

sbtPlugin := true

version in ThisBuild := "1.0.0-SNAPSHOT"

BaseSettings.baseSettings ++ PublishSettings.publishSettings

addSbtPlugin(PluginDependencies.sbtDependencyGraph)

addSbtPlugin(PluginDependencies.sbtStats)

addSbtPlugin(PluginDependencies.scalastyle)

addSbtPlugin(PluginDependencies.sbtAssembly)

addSbtPlugin(PluginDependencies.sbtGpg)