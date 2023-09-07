class student
{
    String name;
    int age;
    student(){}
    student(String n, int a)
    {
        name=n;
        age=a;
    }
    student(student s)
    {
        name=s.name;
        age=s.age;
    }
    void display()
    {
        System.out.println("student name is:"+name);
        System.out.println("student age is:"+age);
    }
}
class teststudent
{
    public static void main(String args[])
    {
        student s1=new student("ABU",18);
        student s2=new student("siddik",19);
        s1.display();
        s2.display();
    }
}