import java.util.ArrayList;
import java.util.List;

 class Hardware {
    private String name ;
    private String contact;
    private String address ;

    public Hardware(String name, String contact, String address){
        this.name= name;
        this.contact = contact;
        this.address = address;
    }
//    getters
     public String getName(){
        return name;
     }

     public String getContact(){
        return contact;
     }

     public String getAddress(){
        return address;
     }

//     setters
    public void setName(String new_name){
        this.name= new_name;
    }

    public void setContact(String new_contact){
        this.contact = new_contact;
    }

    public void setAddress(String new_address){
        this.address = new_address;
    }

    class Products{
        private String name;
        private List < Double > stock;


//        getters
        public String getName() {
            return name;

        }

//        setters
        public void setName(String new_product){
            this.name = new_product;
        }
    }

    public static void main (String[] args){
        Hardware hardware = new Hardware("hardware world", "0773968538", "kisaasi");
        System.out.println(hardware.getAddress());
        System.out.println(hardware.getName());
        System.out.println(hardware.getContact());
    }

}


