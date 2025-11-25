package Exceptions;

public class ThrowException 
{
    static void throwException()
    {
        //throw keyword is used to invoke an exception explicitly.
        throw new RuntimeException("Throwing exception");
    }

    public static void main(String[] args) 
    {
        throwException();
    }

	}


