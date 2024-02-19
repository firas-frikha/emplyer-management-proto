import scala.collection.Seq

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

lazy val root = (project in file("."))
  .settings(
    name := "employer-management",
    organization := "com.firas",
    version := "1.0.0"
)

resolvers += "Akka library repository".at("https://repo.akka.io/maven")
libraryDependencies += "com.thesamet.scalapb"       %% "scalapb-runtime"    % scalapb.compiler.Version.scalapbVersion % "protobuf"
enablePlugins(AkkaGrpcPlugin)

val AkkaVersion = "2.6.20"
val AkkaHttpVersion = "10.2.4"


libraryDependencies ++= Seq(
    "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
    "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
    "com.typesafe.akka" %% "akka-http" % AkkaHttpVersion,
    "com.typesafe.akka" %% "akka-discovery" % AkkaVersion,
    "com.typesafe.akka" %% "akka-http2-support" % AkkaHttpVersion,
    "ch.qos.logback" % "logback-classic" % "1.2.10",
)