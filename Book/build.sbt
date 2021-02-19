val scala3Version = "3.0.0-RC1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala3-simple",
    version := "0.1.0",

    scalaVersion := scala3Version,
//		scalacOptions ++= Seq("-source future"),
		scalacOptions ++= Seq("-Yexplicit-nulls", "-Ycheck-init"),

    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
  )
