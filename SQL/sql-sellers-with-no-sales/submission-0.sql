-- Write your query below
SELECT s.seller_name
FROM
seller as s
LEFT OUTER JOIN orders as o
ON s.seller_id = o.seller_id AND EXTRACT(YEAR FROM o.sale_date)=2020
WHERE o.seller_id is NULL
ORDER BY s.seller_name;
