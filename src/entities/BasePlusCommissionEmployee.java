package entities;


public class BasePlusCommissionEmployee extends CommissionEmployee
{
    float baseSalary;
    public BasePlusCommissionEmployee(String firstName, String lastName,int id,float grossSales, int commission,float baseSalary)
    {
        super(firstName,lastName,id,grossSales,commission);
        this.baseSalary=baseSalary;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        if(baseSalary<=0)
            throw new IllegalArgumentException("baseSalary");
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee()
    {
        //super();
        baseSalary=0;
    }

    public boolean equals(Object o){
        if(this == o) return true;//if both of them points the same address in memory

        if(!(o instanceof BasePlusCommissionEmployee)) return false; // if "that" is not

        BasePlusCommissionEmployee c = (BasePlusCommissionEmployee)o; // than we can cast it safely

        return super.equals(c) && this.baseSalary==c.baseSalary ;//
    }

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{" +
                "baseSalary=" + baseSalary +
                ", grossSales=" + grossSales +
                ", commission=" + commission +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }

    public double earnings()
    {
        return ((commission/100.0)*grossSales)+baseSalary;
    }
}

