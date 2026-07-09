# Shapes Project

This repository contains my Object Oriented Programming final assessment. The program manages a list of geometrical shapes and performs calculations such as area, perimeter, translation and scaling.

## Project Description

The program is written in Java and uses object-oriented programming principles. It includes an abstract `Shape` class and four subclasses:

- `Rectangle`
- `Square`
- `Circle`
- `Triangle`

The program also includes a `Coordinates` class to store positions, a `ShapeList` class to manage multiple shapes, and a `ShapeManagement` class for the menu-driven console program.

## Main Features

- Add shapes to a list
- Remove a shape by position
- Display information about one shape
- Calculate area and perimeter
- Display all shapes
- Translate all shapes
- Scale all shapes
- Handle invalid positions without crashing

## Object-Oriented Concepts Used

- Encapsulation: class attributes are private and accessed through methods.
- Abstraction: `Shape` is an abstract superclass.
- Inheritance: specific shapes extend the `Shape` class.
- Polymorphism: different shape objects are stored and used through the `Shape` type.

## Project Structure

```text
src/shapes/
  Coordinates.java
  Shape.java
  Rectangle.java
  Square.java
  Circle.java
  Triangle.java
  ShapeList.java
  ShapeManagement.java
```

## How to Run

Compile the program from the project folder:

```bash
javac -d out src/shapes/*.java
```

Run the main program:

```bash
java -cp out shapes.ShapeManagement
```
