package entities;

public class HourlyEmployee extends Employee
{
    int hours;
    float wage;
    public HourlyEmployee(String firstName, String lastName,int id,int hours, float wage)
    {
        super(firstName,lastName,id);
        setHours(hours);
        setWage(wage);
    }
    public HourlyEmployee()
    {
      //  super(), (in deafault it goes to super with no params...)
        hours=0;
        wage=0f;
    }
    //hours Getter
    public int getHours() {
        return hours;
    }
    // Setter
    public void setHours(int newHours) {
        if(newHours<=0)
            throw new IllegalArgumentException("hours are illegal");
        this.hours = newHours;

    }//wage Getter
    public float getWage() {
        return wage;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", hours=" + hours +
                ", wage=" + wage +
                '}';
    }

    // Setter
    public void setWage(float newWage) {
        if(newWage<=0)
            throw new IllegalArgumentException("wage is illegal");
        this.wage = newWage;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;//if both of them points the same address in memory

        if(!(o instanceof HourlyEmployee)) return false; // if "that" is not

        HourlyEmployee c = (HourlyEmployee)o; // than we can cast it safely

        return o.equals(c) && this.hours==c.hours && this.wage==c.wage ;//
    }
    public double earnings()
    {
       return hours*wage;
    }

    @Override
    public String getType() {
        return "HourlyEmployee";
    }
}
