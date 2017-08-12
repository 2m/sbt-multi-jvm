addSbtPlugin("com.dwijnand"          % "sbt-dynver"  % "1.1.1")
addSbtPlugin("me.lessis"             % "bintray-sbt" % "0.3.0")
addSbtPlugin("com.lightbend.paradox" % "sbt-paradox" % "0.2.7")

libraryDependencies += "org.scala-sbt" % "scripted-plugin" % sbtVersion.value
