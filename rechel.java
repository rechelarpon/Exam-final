import java.util.Scanner;

public class rechel {
    public static void main(String[] args) {
        Scanner rechel = new Scanner(System.in);
        System.out.print("Annual Salary             : ");
        float rechel1 = rechel.nextFloat();

        if(rechel1 < 250000){

            float MonthlyRate = rechel1 / 12;
            float DailyRate = MonthlyRate / 22;
            float HourlyRate = DailyRate / 8;
            Double AnnualTaxDeduction = 0.00;
            Double MonthlyTaxDeduction = 0.00;
            Double NetPay = MonthlyRate - MonthlyTaxDeduction;
                              
            System.out.println("Your Monthly Rate         : " + String.format("%.2f", MonthlyRate));
            System.out.println("Your Daily Rate           : " + String.format("%.2f", DailyRate));
            System.out.println("Your Hourly Rate          : " + String.format("%.2f", HourlyRate));
            System.out.println("Your Annual Tax Deduction : " + String.format("%.2f", AnnualTaxDeduction));
            System.out.println("Your Monthly Tax Deduction: " + String.format("%.2f", MonthlyTaxDeduction));
            System.out.println("Your Net Pay              : " + String.format("%.2f", NetPay));

        }
        else if(rechel1 >= 250000 && rechel1 < 400000){

            Double tax_deduction = rechel1 - 250000 * .20;

            float MonthlyRate = rechel1 / 12;
            float DailyRate = MonthlyRate / 22;
            float HourlyRate = DailyRate / 8;
            Double AnnualTaxDeduction = tax_deduction;
            Double MonthlyTaxDeduction = AnnualTaxDeduction / 12;
            Double NetPay = MonthlyRate - MonthlyTaxDeduction;

            System.out.println("Your Monthly Rate         : " + String.format("%.2f", MonthlyRate));
            System.out.println("Your Daily Rate           : " + String.format("%.2f", DailyRate));
            System.out.println("Your Hourly Rate          : " + String.format("%.2f", HourlyRate));
            System.out.println("Your Annual Tax Deduction : " + String.format("%.2f", AnnualTaxDeduction));
            System.out.println("Your Monthly Tax Deduction: " + String.format("%.2f", MonthlyTaxDeduction));
            System.out.println("Your Net Pay              : " + String.format("%.2f", NetPay));

        }
        else if(rechel1 >= 400000 && rechel1 < 800000){

            float tax_excess = rechel1 - 400000;
            Double tax_deduction = 0.25 * tax_excess + 30000;

            float MonthlyRate = rechel1 / 12;
            float DailyRate = MonthlyRate / 22;
            float HourlyRate = DailyRate / 8;
            Double AnnualTaxDeduction = tax_deduction;
            Double MonthlyTaxDeduction = AnnualTaxDeduction / 12;
            Double NetPay = MonthlyRate - MonthlyTaxDeduction;

            System.out.println("Your Monthly Rate         : " + String.format("%.2f", MonthlyRate));
            System.out.println("Your Daily Rate           : " + String.format("%.2f", DailyRate));
            System.out.println("Your Hourly Rate          : " + String.format("%.2f", HourlyRate));
            System.out.println("Your Annual Tax Deduction : " + String.format("%.2f", AnnualTaxDeduction));
            System.out.println("Your Monthly Tax Deduction: " + String.format("%.2f", MonthlyTaxDeduction));
            System.out.println("Your Net Pay              : " + String.format("%.2f", NetPay));

        }
        else if(rechel1 >= 800000 && rechel1 < 2000000){

            float tax_excess = rechel1 - 800000;
            Double tax_deduction = 0.30 * tax_excess + 130000;

            float MonthlyRate = rechel1 / 12;
            float DailyRate = MonthlyRate / 22;
            float HourlyRate = DailyRate / 8;
            Double AnnualTaxDeduction = tax_deduction;
            Double MonthlyTaxDeduction = AnnualTaxDeduction / 12;
            Double NetPay = MonthlyRate - MonthlyTaxDeduction;

            System.out.println("Your Monthly Rate         : " + String.format("%.2f", MonthlyRate));
            System.out.println("Your Daily Rate           : " + String.format("%.2f", DailyRate));
            System.out.println("Your Hourly Rate          : " + String.format("%.2f", HourlyRate));
            System.out.println("Your Annual Tax Deduction : " + String.format("%.2f", AnnualTaxDeduction));
            System.out.println("Your Monthly Tax Deduction: " + String.format("%.2f", MonthlyTaxDeduction));
            System.out.println("Your Net Pay              : " + String.format("%.2f", NetPay));

        }
        else if(rechel1 >= 2000000 && rechel1 < 8000000){

            float tax_excess = rechel1 - 2000000;
            Double tax_deduction = 0.32 * tax_excess + 490000;

            float MonthlyRate = rechel1 / 12;
            float DailyRate = MonthlyRate / 22;
            float HourlyRate = DailyRate / 8;
            Double AnnualTaxDeduction = tax_deduction;
            Double MonthlyTaxDeduction = AnnualTaxDeduction / 12;
            Double NetPay = MonthlyRate - MonthlyTaxDeduction;

            System.out.println("Your Monthly Rate         : " + String.format("%.2f", MonthlyRate));
            System.out.println("Your Daily Rate           : " + String.format("%.2f", DailyRate));
            System.out.println("Your Hourly Rate          : " + String.format("%.2f", HourlyRate));
            System.out.println("Your Annual Tax Deduction : " + String.format("%.2f", AnnualTaxDeduction));
            System.out.println("Your Monthly Tax Deduction: " + String.format("%.2f", MonthlyTaxDeduction));
            System.out.println("Your Net Pay              : " + String.format("%.2f", NetPay));

        }
        else if(rechel1 >= 8000000){

            float tax_excess = rechel1 - 8000000;
            Double tax_deduction = 0.35 * tax_excess + 2410000;

            float MonthlyRate = rechel1 / 12;
            float DailyRate = MonthlyRate / 22;
            float HourlyRate = DailyRate / 8;
            Double AnnualTaxDeduction = tax_deduction;
            Double MonthlyTaxDeduction = AnnualTaxDeduction / 12;
            Double NetPay = MonthlyRate - MonthlyTaxDeduction;

            System.out.println("Your Monthly Rate         : " + String.format("%.2f", MonthlyRate));
            System.out.println("Your Daily Rate           : " + String.format("%.2f", DailyRate));
            System.out.println("Your Hourly Rate          : " + String.format("%.2f", HourlyRate));
            System.out.println("Your Annual Tax Deduction : " + String.format("%.2f", AnnualTaxDeduction));
            System.out.println("Your Monthly Tax Deduction: " + String.format("%.2f", MonthlyTaxDeduction));
            System.out.println("Your Net Pay              : " + String.format("%.2f", NetPay));

        }
    }
}
