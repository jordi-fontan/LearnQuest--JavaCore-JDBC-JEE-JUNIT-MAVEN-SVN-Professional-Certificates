## Collections

 ### Slide 1
 
- Collections offer an alternative to arrays that is more flexible and more powerful
  	- One of the main limitations of an array is that its lenght is fixed when it is created
  	- Collections will grow to hold more elemens automatically
- Collections rely heavily on interfaces to provide common behaviour.
- There are three major types of Collections ( each one for different porpuses):
    - **Sets**  : exclude duplicates , extend Collection
    - **Lists** : include duplicates , extend Collection
    - **Maps** : key value pair access, doesn't extend Colletion

---

 ### Slide 2
 
 - A Collection can hold any Java object.
    - Collections can NOT hold
        - Primitives 
        - Arrays
        > (They will be retrieved as instances of the Wrapper, but autoboxing still hides that ddetail for the most part) 
 
 * With  the use of `generics` we can specify wht type of objects are being put into the collection
   *  **Type Safety** is assured by the compiler when objects are retrieved from the collection.
   *  If not for generics, java would upcast everything to object, 
        *    forcing us to filter out undesired types,
        *    and downcast desired objects to their original types

---

 ### Slide 3
 
 1.  We'll use the `ArrayList` class, it stores objects in much the same way an array does.
 2.  In an  `ArrayList` each list is indexes by an `int`
 3.  We can add elements by specifiying a numeric position. If we don't specify it's put in the next available number.
 4. Use generics to specify what type of object is baing placed (improves safety).
 5. We'll pass the ArraList to a method that will set speeds to 50 to each car.
 
 ```
 
      public class MyCars  {
          
          public static void main (String[] args) {
          
          // create the ArraList to hold types of Cars
          // Notice the rerefence type is the most genaral INTERFACE
          List<Car> a = new ArrayList<>();
          
          
           a.add(new SUV());
           a.add(new SportsCar());
           a.add(new StationWagon());
          
          }
      
      }
 
 
 ```

---

 ### Slide 4 
 
 -  we can pass the `ArrayList` to the  setAllSpeeds() method.
 -  Notice the for-each style to access the objects 

``` 
   private static void setAllSpeeds (ArrayList<Car> a) {
         for (Car car: a) car.setSpeed(55);
     }
     
  ```
  
  > Java 8 added a default `ForEach` merthod to the  `Iterable` Interface.

   >>  Example: 
      ```   a.forEach(car->setSpeed(55)) ``` 
      
  - Generics guarantees that everything in the Colection is a Car so everything is **safe, short and clean**     

   
   >> Changed  `ArraryList` to   `List`  for better design

``` 
   private static void setAllSpeeds (List<Car> a) {
         for (Car car: a) car.setSpeed(55);
     }
     
  ```
---

### Slide 5




![Collections Framework](https://user-images.githubusercontent.com/63612112/194017934-0ee13b87-21b4-40cc-a0c4-f9db04548e59.png)


  #### Iterable
  
  
> Related to these, there's also `Iterable` from java.lang. 
> `Collection` implements `Iterable `, `Map` does not

---



### Slide 6 : The Collection Interface

* There are 3 Abstract classes than implements Collection. 
  These are just abstract classes that group commom methods
    * AbstractCollection
      * AbstractList
      * AbstractSet
 * The ACTUAL implemtations are
     * List
        * ArrayList
        * LinkedLIst
        * Vector (reworked in Java5)
     * Set
       *  HashSet
       *  LinkedHashSet
       *  TreeSet
  
  * SubInterfaces of Colecction

      * BeanContext
      * BeanContextServices
      * List
      * Set
      * SortedSet
      etc..

