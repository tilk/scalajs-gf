lazy val root = project.in(file(".")).enablePlugins(ScalaJSPlugin)

name := "Scala.js GF"

normalizedName := "scalajs-gf"

version := "0.0.1"

organization := "org.tilk"

scalaVersion := "2.11.8"

licenses += ("LGPL 3.0", url("https://opensource.org/licenses/LGPL-3.0"))

scmInfo := Some(ScmInfo(
    url("https://github.com/tilk/scalajs-gf"),
    "scm:git:git@github.com:tilk/scalajs-gf.git",
    Some("scm:git:git@github.com:tilk/scalajs-gf.git")))

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

pomExtra := (
  <developers>
    <developer>
      <id>tilk</id>
      <name>Marek Materzok</name>
      <url>https://github.com/tilk/</url>
    </developer>
  </developers>
)

pomIncludeRepository := { _ => false }

