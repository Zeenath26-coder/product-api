package uk.ac.westminster.products_api;

public class Customer {
    public Long id ;
    public String name ;
    public String email;
    public Address address;

    public Customer() { }

    public Customer(Long id , String name , String email, Address address){
        this.id = id;
        this.name=name;
        this.email=email;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    public Address getAddress(){
        return address;
    }
}
