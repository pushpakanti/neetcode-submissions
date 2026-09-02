-- Write your query below

SELECT p.first_name, p.last_name, A.city, A.state
FROM
person as p
LEFT OUTER JOIN address as A
on p.person_id= A.person_id;