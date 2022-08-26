package EX11_02;
class student extends person {
    protected String [] status = {"freshman","sophomore", "junior", "senior"};
    protected String s ;
    student(){
        s = status[0];
    }
    student(int num){
        s = status[num];        
    }
    public String toString(){
        super.toString();
        return "status of person is " + s ;
    }
    
}
