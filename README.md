# WorkForces

# What is Spring Framework?
Spring is one of the most popular frameworks for Java enterprise edition.
Developers all over the world use Spring for developing reliable and high-quality applications.
The spring framework was designed by Rod Johnson.

# Spring Core Concepts - DI, IoC, AOP
<div style="color: cornflowerblue">Dependency Injection</div>- also called as DI, is one of the types of Inversion of Control (IoC).

<div style="color: cornflowerblue">Inversion Of Control</div> - this is the principle of object-oriented programming, in which objects of the program do not depend on concrete implementations of other objects,
but may have knowledge about their abstractions (interfaces) for later interaction.

<div style="color: cornflowerblue">Dependency Injection</div> - is a composition of structural design patterns, in which for each function of the application there is one, a conditionally independent object (service) that can have the need to use other objects (dependencies) known to it by interfaces.
Dependencies are transferred (implemented) to the service at the time of its creation. This is a situation where we introduce an element of one class into another.
In practice, DI is implemented by passing parameters to the constructor or using setters. Libraries that implement this approach are also called IoC containers.

<div style="color: cornflowerblue">Aspect oriented programming</div> - a programming paradigm that allows you to distinguish cross-through (functional) functionality in application.
These functions, which span multiple application nodes, are called cross-cutting concerns and these cross-cutting notes are separated from the immediate business logic of the application. In OOP,
the key unit is the class, while in AOP, the key element is the aspect.
DI helps to separate application classes into separate modules, and AOP helps to separate cross-cutting concerns from the objects they affect.

# Spring Framework Architecture

![computer](https://github.com/mjidelouss/WorkForces/blob/main/spring-framework-architecture.jpg)

