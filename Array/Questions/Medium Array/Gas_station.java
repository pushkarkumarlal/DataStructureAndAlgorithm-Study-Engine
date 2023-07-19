
//[ Question Link ]https://leetcode.com/problems/gas-station/


// [ Solution ]

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       int totalGas=0,totalCost=0,total=0,start=0;

       for(int i=0;i<gas.length;i++){
           totalGas+=gas[i];
           totalCost+=cost[i];

       }
       if(totalCost>totalGas) return -1;

       for(int i=0;i<gas.length;i++){
           total+=gas[i]-cost[i];

           if(total<0)
           {
               total=0;
               start=i+1;
           }
           
       }
return start;
    }
}
