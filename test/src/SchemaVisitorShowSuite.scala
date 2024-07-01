import munit._

import smithy4s.schema._
import example._

final class SchemaVisitorShowSuite extends FunSuite {

  test("show - string") {
    val result = Schema.string.compile(SchemaVisitorShow).show("test")

    assertEquals(result, "test")
  }

  test("show - structure") {
    val result = Car.schema.compile(SchemaVisitorShow)
      .show(Car(make = "Toyota", model = "Prius"))

    assertEquals(result, "Car(make = Toyota, model = Prius)")
  }

}