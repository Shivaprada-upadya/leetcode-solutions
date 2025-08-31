class Solution {
    
    String conversion(int num)
    {
        String binDate="";
        while(num>0)
        {
            int ld=num%2;
            binDate=ld+binDate;
            num=num/2;
        }
        return binDate;
    }

    public String convertDateToBinary(String date) {
        String format="";
        String arr[]=date.split("-");
        for(int i=0;i<=2;i++)
        {
            int num=Integer.parseInt(arr[i]);
            if(i<=1)
            {
                format=format+conversion(num)+"-";
            }
            else
            {
                format=format+conversion(num);
                break;
            }  
        }
        
        return format;
    }
}