public class person
{
    String name;
    int age;
    person(String n, int a)
    {
        name=n;
        age=a;
    }
    void display()
    {
        System.out.println("Name ="+ name);
        System.out.println("Age =" + age);
    }
    public static void main(String[] a)
    {
        person p1=new person("Arun",18);
        p1.display();
    }
}
