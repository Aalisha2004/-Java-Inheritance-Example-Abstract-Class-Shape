# -Java-Inheritance-Example-Abstract-Class-Shape

This project demonstrates the use of abstract classes, inheritance, and method overriding in Java by defining a base class Shape and its two concrete subclasses: Triangle and Rectangle.

🧱 Classes Overview
Shape (abstract)
Represents a generic shape with common properties:

side: the base length or one side of the shape.

area and perimeter: computed values.

Abstract methods:

calculateArea()

calculatePerimeter()

Concrete method display() prints area and perimeter.

Triangle (extends Shape)
Represents an equilateral triangle:

Uses side as the base and an additional height.

Implements area using 0.5 * base * height.

Assumes all sides are equal for perimeter (3 * side).

Overrides display() to include class label.

Rectangle (extends Shape)
Represents a rectangle:

Uses side as length and additional width.

Implements area using length * width.

Perimeter is calculated as 2 * (length + width).

Overrides display() to include class label.

TestShape (main class)
Instantiates and tests the Triangle and Rectangle objects:

Calls calculateArea(), calculatePerimeter(), and display().

🧪 Sample Output
makefile
Copy
Edit
Traingle:
Area:3.0
Perimeter:9.0
Rectangle:
Area:6.0
Perimeter:10.0
🛠️ Key Concepts Demonstrated
Abstract classes and methods

Inheritance and constructor chaining (super)

Method overriding (display, calculateArea, calculatePerimeter)

Object-oriented design for geometric shapes

