// Problem: Convert the Temperature
// Link: https://leetcode.com/problems/convert-the-temperature/
// Date: 2025-06-29
// Approach: Using temperature formula


class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin=celsius + 273.15;
        double fahrenheit=celsius * 1.80 + 32.00;
        double ans[]=new double[2];
        ans[0]=kelvin;
        ans[1]=fahrenheit;       
        return ans;        
    }
}