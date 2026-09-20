-- Write your PostgreSQL query statement below
select distinct author_id As id from Views
where author_id=viewer_id
order by id asc;