/* Problem link: https://leetcode.com/problems/first-letter-capitalization-ii/
 Write your PL/SQL query statement below */

select content_id, content_text as original_text,
       initcap(LOWER(content_text)) as converted_text
from user_content;