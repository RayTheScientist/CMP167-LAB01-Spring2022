# Classes/Type/ADT:A written description of the attributes and behaviors of an object
## Blueprint
# Object: An instance of a class.
## A physical representation of the blueprint
# Fields
# Attributes: Instance Variables
# Behaviors: Instance Methods
## Syntax:

   accessModifier class NameOfClass 
   
   }
   
#Behaviors: Constructors, setters & Getters, equals, toString, compareTo
# Constructors: It is a special method, tat shares the same name as the class, it does not have a return type, it initializes te instance variables and Instantiate
# Setters: Mutators, they modify the values of the instance variables 
# Getters: Accessors, they retrieve the values of the instance variables


# Four Pillars of OOPL: Polymorphism, Encapsulation, Abstraction, inheritance

- Polymorphism: Poly = Multiple, morphism = forms,
- Encapsulation: Limiting the access to data by encapsulate it in private attributes and controlling access through setters and getters

  public class Mammal {
      private int numOfLegs;
      private boolean hasFur;
      private String species;
   
     public Mammal (){
        this.numOfLegs = 2;
        this.hasFur    = true;
        this.species   = "bear"
  }
     
         public Mammal(int numOfLegs, boolean hasFur, String species) {
           this.numOfLegs = numOfLegs;
           this.hasfur    = hasFur;
           this.species   = species;
        }
        
        public void setNumOfLegs (int numOfLegs) {
           this.numOfLegs = numOfLegs;
           }
           
           public int getNumOfLegs()
              return this.numOfLegs;
           }
           
        }   
           
           }