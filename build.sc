import mill._
import mill.scalalib._

import $ivy.`com.disneystreaming.smithy4s::smithy4s-mill-codegen-plugin::0.18.23`
import smithy4s.codegen.mill._

object core extends RootModule with ScalaModule with Smithy4sModule {
  def scalaVersion = "2.13.14"

  def ivyDeps = Agg(
    ivy"com.disneystreaming.smithy4s::smithy4s-core:0.18.23",
    ivy"org.typelevel::cats-core:2.12.0"
  )

  object test extends ScalaTests with TestModule.Munit {
    def ivyDeps = Agg(ivy"org.scalameta::munit::1.0.0")
  }

}
