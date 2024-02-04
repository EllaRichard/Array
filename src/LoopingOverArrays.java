/*ANNUAL REVENUE:
* The given code declares an array that holds the monthly revenues for a company for a year.
* You need to calculate the average monthly revenue for that year.
* For that, calculate the sum of the revenue for all the months and divide it by the number of items in the array*/
public class LoopingOverArrays {
    public static void main(String[] args) {
        double [] revenue = {88750, 125430, 99700, 14500, 158000, 65000, 99000, 189000, 210000, 42000, 165800,
                258900};
        //looping all the values in the array in order to print
        for (int x=0; x<revenue.length; x++)
        {
            System.out.println(revenue[x]); } //print line
        //System.out.println(revenue.length);
        double sum = 0;
        for (double x : revenue){
            sum += x;
        }
        System.out.println(sum/ revenue.length);

    }
}
