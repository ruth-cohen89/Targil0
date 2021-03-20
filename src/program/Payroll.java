
/*Ruth Chedva Cohen 315174334*/
package program;

import entities.*;


public class Payroll {

    public static void main(String[] args)
    {
        Employee[] empArray=new Employee[3];
        empArray[0]=new HourlyEmployee("Tanaya" , "Ash", 12858, 70, 40);
        empArray[1]=new CommissionEmployee("John" , "Hot", 5824, 100, 800);
        empArray[2]=new BasePlusCommissionEmployee("Arnold", "schwarzenegger", 102030, 100, 300, 600 );

        for (Employee E : empArray)
        {
            /*in case its BasePlusCommissionEmployee*/
            System.out.println(E.toString());
            if(E.getType() == "BasePlusCommissionEmployee")
            {
                double salary= E.earnings();
                System.out.print("The salary: ");
                System.out.println((0.1 * salary)+salary);
                System.out.println();
            }
            /*otherwise*/
            else
            {
                System.out.println("The salary: " + E.earnings());
                System.out.println();
            }
        }
    }

}

