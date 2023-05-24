package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {

        if ((salary <= 10000) && (salary > 0)) {
            double afterTaxAccordings = salary - (salary * 0.15);
                System.out.println(afterTaxAccordings);
            }

        if ((salary > 10000) && (salary <= 20000)) {
                double afterTaxAccordings = salary - (salary * 0.18);
                    System.out.println(afterTaxAccordings);
                }

        if (salary > 20000 && (salary > 0)) {
                double afterTaxAccordings = salary - (salary * 0.20);
                System.out.println(afterTaxAccordings);
                    }
        if (salary < 0) {
            System.out.println("wrong input!");
        }

                }
            public static void main(String[] Args) {
                SalaryCalculator newSalaryCalculatorInstance = new SalaryCalculator();
                newSalaryCalculatorInstance.calculateSalary(150000);

            }

        }





//Implement the program that will consume salary from method argument as input of an employee
// calculate its salary after taxes according to the following:
// Basic Salary <= 10000: taxes - 15%.
// 10000 < Basic Salary <= 20000: taxes - 18%
// Basic Salary > 20000 : taxes - 20%
// Basic salary < 0 -> "wrong input!"

