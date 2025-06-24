/* USING IF Method

UPDATE Salary
SET sex=IF(sex='m','f','m');

*/

#USING CASE Method
UPDATE Salary
SET sex=
CASE sex
    WHEN 'm' THEN 'f'
    ELSE 'm'
END

