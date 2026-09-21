# Write your MySQL query statement below
select s.student_id, s.student_name,se.subject_name, count(e.student_id) as attended_exams
from Students s 
cross join Subjects se
left join Examinations e
on e.student_id=s.student_id
and e.subject_name=se.subject_name
group by s.student_id,
s.student_name,
se.subject_name

order by s.student_id,
se.subject_name;
