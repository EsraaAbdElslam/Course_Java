package EX11_02;
public class FacultyMember extends emploee{
    protected double offiseHour ;
    protected String rank ;
    FacultyMember(){
        offiseHour = 6.0;
        rank = "Director of the Department";
    }
    FacultyMember(double offiseHour, String rank){
        this.offiseHour = offiseHour ;
        this.rank = rank ;
    }
    public String toString(){
        super.toString();
        return "\nhis working hour are " + offiseHour 
                + " and his rank " + rank ;
    }
}
