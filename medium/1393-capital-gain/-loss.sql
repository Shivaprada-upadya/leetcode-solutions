--Problem link: https://leetcode.com/problems/capital-gainloss/

SELECT stock_name, SUM(if(operation='Buy',-price,price)) AS capital_gain_loss 
FROM Stocks
GROUP BY stock_name;
