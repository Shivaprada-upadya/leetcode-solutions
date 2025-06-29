# Problem: Reshape Data: Concatenate
# Link: https://leetcode.com/problems/reshape-data-concatenate/
# Date: 2025-06-29
# Approach: Using concat function

import pandas as pd

def concatenateTables(df1: pd.DataFrame, df2: pd.DataFrame) -> pd.DataFrame:
    return pd.concat([df1,df2])
    