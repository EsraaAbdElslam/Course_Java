package EX11_02;
public class person {
    protected String name = "";
    protected String address = "";
    protected String PhoneNum = "";
    protected String email = "";
    person(){
        name = "esraa";
        address = "faisal";
        PhoneNum = "01113925643";
        email = "ganatsoliman19@gmail.com";
    }
    person(String n, String a, String p, String e){
        name = n;
        address = a;
        PhoneNum = p;
        email = e;
    }
    public String toString(){
        return "name " + name + "\naddress " + address 
                + "\nPhoneNum " + PhoneNum + "\nemail " + email;
    }
}
