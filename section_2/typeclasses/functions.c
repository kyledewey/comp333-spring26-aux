#include "stdio.h"

struct Foo;
struct Bar;
struct Baz;
struct Bar makeBar(int value);
struct Baz makeBaz(double value);
int barGetInt(struct Foo* bar);
int bazGetInt(struct Foo* baz);
int getInt(struct Foo* foo);
void printFoo(struct Foo* foo);
int main(int argc, char** argv);

//     Foo
//      getInt: Int
//     /           \
//    Bar           \
//     getInt: Int   Baz
//                    getInt: Int
struct Foo {
  int (*getInt)(struct Foo*);
};

struct Bar {
  struct Foo foo;
  int barInt;
};

struct Baz {
  struct Foo foo;
  double bazDouble;
};

struct Bar makeBar(int value) {
  struct Foo retvalFoo = { .getInt = &barGetInt };
  struct Bar retval = {
    .foo = retvalFoo,
    .barInt = value
  };
  return retval;
}

struct Baz makeBaz(double value) {
  struct Foo retvalFoo = { .getInt = &bazGetInt };
  struct Baz retval = {
    .foo = retvalFoo,
    .bazDouble = value
  };
  return retval;
}

int barGetInt(struct Foo* bar) { return ((struct Bar*)bar)->barInt; }
int bazGetInt(struct Foo* baz) { return (int)((struct Baz*)baz)->bazDouble; }

int getInt(struct Foo* foo) {
  return foo->getInt(foo);
}

void printFoo(struct Foo* foo) {
  printf("%i\n", getInt(foo));
}

int main(int argc, char** argv) {
  // printFoo(new Bar(2));
  struct Bar bar = makeBar(2);
  printFoo((struct Foo*)&bar);

  // printFoo(new Baz(3.14));
  struct Baz baz = makeBaz(3.14);
  printFoo((struct Foo*)&baz);

  return 0;
}

