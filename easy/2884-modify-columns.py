# Problem: 2884: Modify Columns
# Link: https://leetcode.com/problems/modify-columns/
# Approach: By Accessing the column and modify the column
# Date : 19-07-2025

import pandas as pd
def modifySalaryColumn(employees: pd.DataFrame) -> pd.DataFrame:
   employees["salary"]*=2
   return employees
    