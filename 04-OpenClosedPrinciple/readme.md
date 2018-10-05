# Open Closed Principle

The project demonstrates the popular software design principle i.e. Open Closed Principle. The OCP principle is a part of __S.O.L.I.D.__ principles which represents second letter O. SOLID principle was introduced by **Robert.C Martin** also known as **"Uncle Bob"**. More about [OCP](https://en.wikipedia.org/wiki/Open%E2%80%93closed_principle).

The principle states,

> Software entities like modules, classes, functions should be Open For Extension but Closed for Modification. 

Which means a software entities should be designed in such a way, so the existing code should not be modified rather it can be scaled. That means we must provide abstract implementation rather than concrete such as make use of interfaces.

Before explaining the project, let's take an exampl

The project demonstrates the principle using an example of shapes. There is an interface **ShapeArea** which have a method named calculateArea(). The job of this method is to calculate the area, no matter what kind of shape it is. 

As you can see I have implemented both the services in separate classes i.e. **PlaceOrderService** and **CalculateBillService**. PlaceOrderService receives _OrderBean_ instance as an input and places the order by persisting the database. So the class performs only one task. In other words, it has only one responsibility, just to place the order. Only one responsibility doesn't mean you should have only one method in a single class. If multiple methods are implemented to define a single functionality, such as "Placing the Order". Then the class design does not violate the rules of SRP.

If we talk about beans I have used. they also define only one task i.e. they define their properties and their behavior. There is no other business logic inside them.

Same thing we can say about the controller classes.