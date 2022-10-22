SELECT MEMBER_ID, MEMBER_NAME, GENDER, DATE(DATE_OF_BIRTH) AS DATE_OF_BIRTH
from MEMBER_PROFILE
WHERE TLNO IS NOT NULL
AND GENDER = 'W'
AND MONTH(DATE_OF_BIRTH) = 03
ORDER BY MEMBER_ID ASC