package com.java.how2injava.newinjava17;

public sealed interface IShape permits Circle, Rectangle, Triangle {
    double calculateArea();
}
