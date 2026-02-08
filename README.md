Abstract Classes and Inheritance
1. Abstract Class: Vehicle

Create an abstract class named Vehicle with the following features:

A private instance variable brand of type String

A protected constructor that initializes the brand

A public method getBrand() that returns the brand

An abstract method getMaxSpeed() that returns an int

A concrete method displayInfo() that prints:

2. Subclasses

Create two subclasses that extend the Vehicle class.

a) Car

Contains a private instance variable maxSpeed of type int

Constructor accepts brand and maxSpeed as parameters

Overrides getMaxSpeed() to return the car’s maximum speed

b) Bicycle

Contains a private instance variable maxSpeed of type int

Constructor accepts brand and maxSpeed as parameters

Overrides getMaxSpeed() to return the bicycle’s maximum speed

3. Demo Class

Create a public class named AbstractVehicles that contains the main method.

In the main method:

Create one Car object and one Bicycle object using polymorphism (Vehicle references)

Call displayInfo() and getMaxSpeed() on each object

Print the results in a clear and readable format
