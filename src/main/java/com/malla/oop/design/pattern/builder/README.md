Builder = mutable (you configure it step by step).
Built object = immutable (fixed after construction). After building, the object cannot be modified → ensures thread-safety and correctness.
    Attributes are final.
If you need a slightly changed object, you either:
    Reuse the builder, or Implement a toBuilder() method that initializes a new builder from an existing object.