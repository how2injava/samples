package com.java.how2injava.newinjava21;

public sealed class ShapeClass permits Circle, Square {
    // class definition
}

final class Circle extends ShapeClass {
    // class definition
}

final class Square extends ShapeClass {
    // class definition
}
