# Classes: Written description of the attributes of the attributes and behaviors of an object
# Attributes: Instance variable
# Behaviors: Instance methods
## Constructors: A special method that shares the same name as the class: intitialize the instance variables, Instantiating the object
## Setters: Changes the value of the instance variables
## Getters: Retrieve the values of the instance variables
## equals: returns true if the values of the instance variables are the same, else returns false
## toString: Returns the string Representation of the object


UML Diagram
-----------------
    Class Name
------------------
- variableName : data type
- variableName : data type
------------------
  + Constructor()
  + setVariableName(  localVariableName: data type) : void
  + setVariableName(  localVariableName: data type) : void
  + getVariableName(): data type
  
------------------------------

_________________________
   Dog
_________________________
   - name : String
   - age  : int
   - species: String
_________________________

  + Constructors()
  + setters & getters
  + equals(obj: Object): boolean
  + toString(): String
  + bark(): void
  _______________________     