public class nestedif {
    public static void main(String[] args) {
        String address ="Delhi ,India";
        if(address.endsWith ( "India")) {
            if (address.contains("Pune")){
                 System.out.println("Your city is Pune");
            }
            else if (address.contains ( "MUmabai")){
                System.out.println("Your city is Mumbai ");
            }
            else {
                System.out.println(address.split(",")[0]);
            }
        }
        else {
            System.out.println("you are not living in india ");
        }
    }
    
}
