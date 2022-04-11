package learnclass;

public class Doctor extends  Person {
    public String specialty;
    public float officeFee;
    public Doctor(String name,String specialty,float officeFee){
        super(name);
        this.specialty = specialty;
        this.officeFee = officeFee;
    }
    public void printDoctor() {
        System.out.println("Doctor name is " + this.name);
        System.out.println("Doctor specialty is " + this.specialty);
        System.out.println("Doctor office fee is " + this.officeFee);
    }
}
