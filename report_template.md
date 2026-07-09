# Practical Programming Assignment 2: Object-Oriented Programming

## 1. Design

Briefly explain that the program uses a superclass called `Shape` and four subclasses: `Rectangle`, `Square`, `Circle`, and `Triangle`. Explain that `Shape` is abstract because a general shape does not have its own area or perimeter.

Insert your digital UML class diagram here. You can generate it from `uml_class_diagram.puml` and then reproduce it using the tool required by your tutor.

Key points to explain in your own words:

- `Coordinates` stores a two-dimensional point and provides movement and scaling methods.
- `Shape` stores the shared position and number of sides.
- Each subclass overrides `getArea`, `getPerimeter`, `scale`, and `display`.
- `Triangle` also overrides `translate` because all three vertices must move.
- `ShapeList` stores polymorphic `Shape` objects in an `ArrayList`.
- `ShapeManagement` provides the menu-driven console interface.

## 2. Implementation Summary

Describe how you implemented each class. Mention how you used inheritance, encapsulation, abstraction, and polymorphism.

You should write this section in your own words after your code is working.

## 3. Test Plan and Results

| Action | Expected result | Actual result |
| --- | --- | --- |
| Add triangle with vertices (60,60), (30,80), (80,80) | Triangle is added to the list and displayed with correct vertices, area and perimeter. | Fill in after running your program. |
| Add rectangle at (110,30), width 20, length 25 | Rectangle is added; area should be width multiplied by length and perimeter should be twice width plus twice length. | Fill in after running your program. |
| Add circle at (90,110), radius 35 | Circle is added; area and perimeter use pi and radius. | Fill in after running your program. |
| Add square at (100,50), side 30 | Square is added; area and perimeter use the side value. | Fill in after running your program. |
| Add three other shapes of your choice | The number of shapes increases by three. | Fill in after running your program. |
| Show area and perimeter of the second shape | Program prints area and perimeter of the shape in position 2. | Fill in after running your program. |
| Display all shapes | Program lists every shape with its current details. | Fill in after running your program. |
| Remove the third shape | Program removes the third shape and does not crash. | Fill in after running your program. |
| Translate all shapes by x=20 and y=25 | Every shape position changes; triangle's three vertices all move. | Fill in after running your program. |
| Scale all shapes by factor 5 | Dimensions and coordinates are multiplied by 5. | Fill in after running your program. |
| Try to remove position 30 | Program handles invalid position gracefully. | Fill in after running your program. |
| Try to get area at position 110 | Program handles invalid position gracefully. | Fill in after running your program. |

## 4. Problems Encountered

Explain any issues you faced, such as menu validation, invalid positions, integer division during scaling, or triangle area calculation.

## 5. Reflection on OOP Principles

Write 1-2 paragraphs explaining:

- Encapsulation: private attributes and public methods protect class data.
- Abstraction: `Shape` defines common behaviour without being directly created.
- Inheritance: each specific shape extends `Shape`.
- Polymorphism: `ShapeList` can store different shapes and call their overridden methods.

## 6. References

Liang, Y.D. (2021) *Introduction to Java Programming and Data Structures*. 12th edn. Pearson.

Oracle (2026) *Java Platform, Standard Edition Documentation*. Available at: https://docs.oracle.com/

## Appendix: Source Code

Paste your final Java source code here after completing and testing it.
