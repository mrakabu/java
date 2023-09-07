class student
{
    int a;
    int b;
    void set_data(int val1,int val2)
    {
        a=val1;
        b=val2;
    }
    void display()
    {
        System.out.println("value of a="+a);
        System.out.println("vslue of b="+b);
    }
    public static void main(String args[])
    {
        student s1=new student();
        student s2=new student();
        s1.set_data(3,4);
        s2.set_data(5,6);
        s1.display();
        s2.display();
        // student s3;
        //s3=s2
        //s3.display();
        //s2=null;
        //s3.display();
        //s3=null;
        //s3.display();
    }
}