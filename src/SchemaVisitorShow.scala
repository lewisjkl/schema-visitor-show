import cats.Show
import smithy4s._
import smithy4s.schema.{Schema, _}

object SchemaVisitorShow extends SchemaVisitor[Show] {

  def primitive[P](shapeId: ShapeId, hints: Hints, tag: Primitive[P]): Show[P] = ???

  def option[A](schema: Schema[A]): Show[Option[A]] = ???
  
  def collection[C[_], A](shapeId: ShapeId, hints: Hints, tag: CollectionTag[C], member: Schema[A]): Show[C[A]] = ???
  
  def map[K, V](shapeId: ShapeId, hints: Hints, key: Schema[K], value: Schema[V]): Show[Map[K,V]] = ???
    
  def struct[S](shapeId: ShapeId, hints: Hints, fields: Vector[Field[S, _]], make: IndexedSeq[Any] => S): Show[S] = ???
  
  def union[U](shapeId: ShapeId, hints: Hints, alternatives: Vector[Alt[U, _]], dispatch: Alt.Dispatcher[U]): Show[U] = ???

  def enumeration[E](shapeId: ShapeId, hints: Hints, tag: EnumTag[E], values: List[EnumValue[E]], total: E => EnumValue[E]): Show[E] = ???
  
  def biject[A, B](schema: Schema[A], bijection: Bijection[A,B]): Show[B] = ???
  
  def refine[A, B](schema: Schema[A], refinement: Refinement[A,B]): Show[B] = ???
  
  def lazily[A](suspend: Lazy[Schema[A]]): Show[A] = ???
  
}
