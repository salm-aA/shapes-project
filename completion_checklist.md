# IY4101 Assignment 2 Completion Checklist

## Java Classes

- [ ] `Coordinates` stores `x` and `y`.
- [ ] `Coordinates.distance` calculates the distance between two points.
- [ ] `Coordinates.translate` changes `x` and `y`.
- [ ] `Coordinates.scale` multiplies or divides coordinates using integer division.
- [ ] `Shape` is abstract.
- [ ] `Shape` contains shared position and number-of-sides attributes.
- [ ] `Rectangle`, `Square`, `Circle`, and `Triangle` extend `Shape`.
- [ ] Every subclass overrides `getArea`, `getPerimeter`, `scale`, and `display`.
- [ ] `Triangle` stores `vertex2` and `vertex3`.
- [ ] `Triangle.translate` moves all three vertices.
- [ ] `Triangle.getArea` uses Heron's Formula.
- [ ] `ShapeList` uses `ArrayList<Shape>`.
- [ ] `ShapeList` validates positions before getting or removing shapes.
- [ ] `ShapeManagement` provides the required menu options.
- [ ] The main loop exits by changing a loop condition, not by using `break`, `continue`, or `System.exit()` to escape the loop.

## Testing

- [ ] Add the triangle from the brief.
- [ ] Add the rectangle from the brief.
- [ ] Add the circle from the brief.
- [ ] Add the square from the brief.
- [ ] Add three extra shapes.
- [ ] Show area and perimeter for the second shape.
- [ ] Display all shapes.
- [ ] Remove the third shape.
- [ ] Translate all shapes by `x = 20`, `y = 25`.
- [ ] Scale all shapes by factor `5`.
- [ ] Test invalid removal, such as position `30`.
- [ ] Test invalid area request, such as position `110`.
- [ ] Record actual results only after running the program.

## Report

- [ ] 500-800 words excluding code and references.
- [ ] Arial 11, single spacing.
- [ ] Digital UML diagram included.
- [ ] Test plan includes expected and actual results.
- [ ] Reflection explains encapsulation, abstraction, inheritance, and polymorphism.
- [ ] Java source code is copied into the appendix.
- [ ] References are in Harvard style if used.

## Submission

- [ ] Program files and report are placed in a zip file.
- [ ] Source code is in Git, GitHub, or another VCS.
- [ ] Repository link is shared with your tutor as required.
- [ ] Spell check and proof-reading are complete.
- [ ] Submitted through the VLE/Turnitin before the deadline.
