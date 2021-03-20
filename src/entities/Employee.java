package entities;


public abstract class Employee {
    protected String firstName;
    protected String lastName;
    protected final int id;//can be assigned only here or on ctor
    /*default ctor*/
    public Employee()
    {
        firstName="plony";
        lastName="almony";
        id=0;
    }
    /*ctor with params*/
    public Employee(String firstName, String lastName, int id1)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.id = id1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }

    //firstName Getter
    public String getFirstName() {
        return firstName;
    }
    // Setter
    public void setFirstName(String newName) {
        this.firstName = newName;
    }

    // lastName Getter
    public String getLastName() {
        return lastName;
    }
    // Setter
    public void setLastName(String newName) {
        this.lastName = newName;
    }

    // id Getter
    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;//if both of them points the same address in memory

        if(!(o instanceof Employee)) return false; // if "that" is not

        Employee c = (Employee)o; // than we can cast it
        /* if they have the same name and same age, then the 2 objects are equal unless they're pointing to different memory adresses*/
        return this.firstName.equals(c.firstName) && this.lastName.equals(c.lastName) && this.id == c.id;

    }
    public abstract double earnings();

    public abstract String getType();
}


