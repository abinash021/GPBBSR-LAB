//Write a java program implementing multiple inheritance.


class A
{
    void show()
    {
        System.out.println("A");
    }
}
class B extends A
{
    void show()
    {
        System.out.println("B");
    }
}
class C extends B
{
    void show()
    {
        System.out.println("C");
    }
}
class D extends C
{
    void show()
    {
        System.out.println("D");
    }
}
class E extends D
{
    void show()
    {
        System.out.println("E");
    }
}


class multiple_inheritance
{
    public static void main(String args[])
    {
        E e=new E();
        e.show();
    }
}

