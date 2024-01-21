import AssemblyKeys._

seq(assemblySettings: _*)

name := "mn2gt"

version := "0.1"

organization := "org.opengeo"

scalaVersion := "2.9.1"

fork in run := true

mainClass in (Compile, run) := Some("me.winslow.d.mn2gt.GUI")

mainClass in assembly := Some("me.winslow.d.mn2gt.GUI")

resolvers += ScalaToolsSnapshots

libraryDependencies ++= Seq(
  "commons-httpclient" % "commons-httpclient" % "3.1"
)

libraryDependencies <+= scalaVersion("org.scala-tools.testing" % "specs" % _)

libraryDependencies <+= scalaVersion("org.scala-lang" % "scala-swing" % _)
