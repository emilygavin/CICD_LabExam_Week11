public class Employee {

    String name;
    String pps;

    public Employee() {
    }

    public Employee(String name, String pps) {
        this.name = name;
        this.pps = pps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() < 5 || name.length() > 22){
            System.out.println("Invalid name entered");
        }
        else {
            this.name = name;
        }
    }

    public String getPps() {
        return pps;
    }

    public void setPps(String pps) {
        if(pps.length() == 6) {
            this.pps = pps;
        }
        else{
            System.out.println("Invalid PPS entered (Must be 6 characters)");
        }
    }
}









