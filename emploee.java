package EX11_02;
public class emploee extends person{
    protected String office = "";
    protected double salary = 0.0;
//    protected dataHird = MyDate(1,11,1999);
    emploee(){
        office = "Accounting";
        salary = 5000 ;
        MyDate (1,11,1999);
    }
    emploee(String office,double salary){
        this.office = office;
        this.salary = salary ;
    }
    public void MyDate (int D, int M, int Y){
        System.out.println(D + "/" + M + "/" + Y);
    }
    public String toString(){
        super.toString();
        return " \nthe employee works in the " + office 
                + " office with a salary of " + salary 
                + "and he was appointed on " ;
    }
}
