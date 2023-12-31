# WorkForces

# What is Spring Framework?
Spring is one of the most popular frameworks for Java enterprise edition.
Developers all over the world use Spring for developing reliable and high-quality applications.
The spring framework was designed by Rod Johnson.

# Spring Core Concepts - DI, IoC, AOP

# Inversion Of Control 
- This is the principle of object-oriented programming, in which objects of the program do not depend on concrete implementations of other objects,
but may have knowledge about their abstractions (interfaces) for later interaction.

# Dependency Injection
- Also called as DI, is one of the types of Inversion of Control (IoC), is a composition of structural design patterns, in which for each function of the application there is one, a conditionally independent object (service) that can have the need to use other objects (dependencies) known to it by interfaces.
Dependencies are transferred (implemented) to the service at the time of its creation. This is a situation where we introduce an element of one class into another.
In practice, DI is implemented by passing parameters to the constructor or using setters. Libraries that implement this approach are also called IoC containers.

# Aspect oriented programming
- A programming paradigm that allows you to distinguish cross-through (functional) functionality in application.
These functions, which span multiple application nodes, are called cross-cutting concerns and these cross-cutting notes are separated from the immediate business logic of the application. In OOP,
the key unit is the class, while in AOP, the key element is the aspect.
DI helps to separate application classes into separate modules, and AOP helps to separate cross-cutting concerns from the objects they affect.

# Spring Framework Architecture

![computer](https://github.com/mjidelouss/WorkForces/blob/main/spring-framework-architecture.jpg)

# Bean Scopes
Singleton: The default scope. Only one instance of the bean is created and shared across the application context. It remains in memory until the application shuts down or the bean is explicitly destroyed.

Prototype: A new instance of the bean is created every time it is requested from the container. It allows for multiple independent instances of the same bean within the application context.

Request: A new instance of the bean is created for each HTTP request. It is useful for beans that hold request-specific data, ensuring that each request gets its own instance.

Session: A single instance of the bean is created for each user session. The bean is stored in the user's session and shared across multiple requests from the same user.

Application: A single instance of the bean is created for the entire application context. It is shared among all users and requests, making it suitable for global data or shared resources.

WebSocket: A single instance is created for each WebSocket connection. The bean is specific to a WebSocket session and shared among multiple WebSocket messages exchanged within that session.

# BeanFactory:
BeanFactory is the core interface for accessing and managing beans in a Spring application. It provides a basic container for managing bean instances.
The BeanFactory interface supports lazy initialization and access to bean instances, meaning that beans are only created when requested.
This interface provides the basic functionality for bean instantiation, dependency injection, and bean lifecycle management.

# ApplicationContext:
ApplicationContext is a sub-interface of BeanFactory and provides an advanced container with additional features and capabilities.
It extends the BeanFactory interface and adds functionalities like internationalization, event publication, resource loading, and application-specific context functionalities.
ApplicationContext loads bean definitions, creates and manages bean instances, and provides a rich set of features for configuring and managing a Spring application.