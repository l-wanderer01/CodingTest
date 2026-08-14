# SELECT
#     CAR_ID,
#     CASE
#         # 여러 대여 기록 중 단 한 번이라도 대여 중인 상태(1)가 있다면 그 차의 최종값을 1로 만듦
#         WHEN MAX(
#             # 2022-10-16일에 걸쳐있는 대여 기록은 1, 아니면 0으로 만듦
#             CASE
#                 WHEN START_DATE <= '2022-10-16' AND END_DATE >= '2022-10-16' THEN 1
#                 ELSE 0
#             END
#         ) = 1 THEN "대여중"
#         ELSE "대여 가능"
#     END AS AVAILABILITY
# FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
# GROUP BY CAR_ID
# ORDER BY CAR_ID DESC

SELECT 
    CAR_ID,
    CASE 
        -- 만약 CAR_ID가 (서브쿼리 결과) 안에 존재한다면(IN)
        WHEN CAR_ID IN (
            SELECT CAR_ID
            FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
            WHERE '2022-10-16' BETWEEN START_DATE AND END_DATE
        ) THEN '대여중'
        ELSE '대여 가능'
    END AS AVAILABILITY
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
GROUP BY CAR_ID  -- 자동차 번호가 중복해서 나오지 않도록 하나로 묶어줌
ORDER BY CAR_ID DESC;
