resolvers += Resolver.url("sbt-plugin-releases",
  new URL("https://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns)

resolvers += Resolver.url("Maven Repository", new URL("https://repo1.maven.org/maven2/"))

resolvers += Resolver.url("Typesafe Ivy Repository", new URL("https://repo.typesafe.com/typesafe/ivy-releases/"))(Resolver.ivyStylePatterns)

resolvers += Resolver.url("ScalaSbt Ivy Snapshots Repository", new URL("https://repo.scala-sbt.org/scalasbt/ivy-snapshots/"))(Resolver.ivyStylePatterns)

resolvers += Resolver.url("ScalaSbt Sbt Plugin Snapshots Repository", new URL("https://repo.scala-sbt.org/scalasbt/sbt-plugin-snapshots/"))(Resolver.ivyStylePatterns)

resolvers += Resolver.url("Sonatype OSS", new URL("https://oss.sonatype.org/content/repositories/snapshots/"))

resolvers += "Local Maven Repository" at "file://" + baseDirectory.value + "../m2/repository"

resolvers += "Local Ivy Repository" at "file://" + baseDirectory.value + "../ivy2/cache"

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.7.3")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.0.0")
