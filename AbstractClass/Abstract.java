/* 1. Create an abstract class with abstract and non-abstract methods.
2. Create a sub class for an abstract class. Create an object in the child class for the
abstract class and access the non-abstract methods
3. Create an instance for the child class in child class and call abstract methods
4. Create an instance for the child class in child class and call non-abstract methods*/

package AbstractClass;

abstract class Abstract {
    //abstract method 
    abstract void add();

    //non-abstract method(concrete method)
    void sub()
    {
        System.out.println("this is non-abstract method");
    }
}

//subclass for an abstract class
class subclas extends Abstract
{
    //implementation of abstract method
    void add()
    {
        System.out.println("this is abstract method");
    }

    public static void main(String[] args)
    {
        Abstract A = new subclas();
        //accessing the non-abstract methods
        A.sub();

        //instance for the child class
        subclas B = new subclas();
        //calling abstract methods
        B.add();
        //calling non-abstract methods
        B.sub();
    }
}

	
