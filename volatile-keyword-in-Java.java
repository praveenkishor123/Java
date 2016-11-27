// Using volatile is another way to make a class thread safe, like we do with synchronized, atomic wrapper.

// Thread safe means that a method or class instance can be used by multiple threads at the same time without any problem.

// Example without volatile keyword
class Shared {
  // Changes made to 'var' in one thread
  // may not immediately reflect in other thread
  static int var = 5;
}
  

// Example with volatile keyword
class Shared {
  // volatile keyword here makes sure that
  // the changes made to 'var' in one thread are 
  // immediately reflected in other thread
  static volatile int var = 6;
}

