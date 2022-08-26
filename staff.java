package EX11_02;
public class staff extends emploee{
    protected String title ;
    staff(){
        title = "Boss";
    }
    staff(String title){
        this.title = title ;
    }
    public String toString(){
        super.toString();
        return "his title is " + title ;
    }
}
