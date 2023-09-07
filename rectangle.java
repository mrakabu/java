class rectangle
{
    int length;
    int width;
    void get_data(int l,int w)
    {
        length=l;
        width=w;
    }
void calculate_area()
{
    System.out.println("area of rectangle is="+length*width);
}
}
class testrectangle
{
    public static void main(String args[])
    {
        rectangle r1=new rectangle();
        rectangle r2=new rectangle();
        r1.get_data(10,15);
        r2.get_data(10,8);
        r1.calculate_area();
        r2.calculate_area();
    }
}
