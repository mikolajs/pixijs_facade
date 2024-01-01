import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt.Keys.{libraryDependencies, _}
import sbt.Project.projectToRef
//import  org.scalajs.jsenv.
import sbt._

import scala.language.postfixOps

val apiVersion = "0.7.3.0"
val scalaJsVersion = "3.2.0"

homepage := Some(url("https://github.com/mikolajs/pixijs"))

lazy val root = (project in file(".")).
  enablePlugins(ScalaJSPlugin).
  settings(
    name := "pixijs",
    organization := "org.scalajs",
    description := "Pixi.js v7 bindings for Scala.js",
    version := apiVersion,
    scalaVersion := scalaJsVersion,
    scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature", "-language:implicitConversions", "-Xlint"),
    Compile / doc / scalacOptions ++= Seq("-no-link-warnings"),
      jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv(),
    //scalacOptions += "-P:scalajs:sjsDefinedByDefault",
    autoCompilerPlugins := true,
    // scalaJSModuleKind := ModuleKind.CommonJSModule,
    //mainClass := Some("src/main/scala/org/scalajs/dom/pixijs/Main.scala"),
    libraryDependencies ++= Seq(
      "com.lihaoyi" %%% "utest" % "0.8.2" % "test",
	   "org.scala-js" %%% "scalajs-dom" % "2.8.0" 
  ))
testFrameworks += new TestFramework("utest.runner.Framework")
  //scalaJSUseMainModuleInitializer := true

// loads the Scalajs-io root project at sbt startup
onLoad in Global := (Command.process("project root", _: State)) compose (onLoad in Global).value
