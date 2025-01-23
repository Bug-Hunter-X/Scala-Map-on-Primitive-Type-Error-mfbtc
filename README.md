# Scala Map on Primitive Type Error
This example shows a common error in Scala when using the `map` function on a primitive type (Int) instead of a collection type (List, Seq, etc.).  The `map` function is defined for collections and iterators, not primitive types.

The solution involves ensuring the data is in a collection before using the `map` function.
