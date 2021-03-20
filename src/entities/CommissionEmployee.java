package entities;


public class CommissionEmployee extends Employee
{
    float grossSales;
    int commission;
    public CommissionEmployee(String firstName, String lastName,int id,float grossSales, int commission)
    {
        super(firstName,lastName,id);
        this.grossSales=grossSales;
        this.commission=commission;
    }
    public CommissionEmployee()
    {
       // super();
        grossSales=0;
        commission=0;
    }
    //grossSales Getter
    public float getGrossSales() {
        return grossSales;
    }
    // Setter
    public void setGrossSales(int newGrossSales) {
        if(newGrossSales<=0)
            throw new IllegalArgumentException("grossSales are illegal");
        this.grossSales = newGrossSales;

    }//commission Getter
    public float getCommission() {
        return commission;
    }
    // Setter
    public void setCommission(int newCommision) {
        if(newCommision<=0)
            throw new IllegalArgumentException("commision is illegal");
        this.commission = newCommision;
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "grossSales=" + grossSales +
                ", commission=" + commission +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;//if both of them points the same address in memory

        if(!(o instanceof CommissionEmployee)) return false; // if "that" is not

        CommissionEmployee c = (CommissionEmployee)o; // than we can cast it safely

        return  super.equals(c) && this.commission==c.commission && this.grossSales==c.grossSales ;
    }//getFirstName().equals(c.getFirstName()) && getLastName().equals(c.getLastName())
    public double earnings()
    {
        return (commission/100)*grossSales;
    }

    @Override
    public String getType() {
        return "BasePlusCommissionEmployee";
    }
}
