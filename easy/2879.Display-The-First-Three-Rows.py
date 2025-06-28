# Problem: Display The First Three Rows
# Link: https://leetcode.com/problems/display-the-first-three-rows/
# Date: 2025-06-28
# Approach: Using head() function

import pandas as pd

def selectFirstRows(employees: pd.DataFrame) -> pd.DataFrame:
    return employees.head(3)