# Write your MySQL query statement below
select w1.id from Weather w1  cross join Weather w2 where w1.temperature>w2.temperature and dateDiff(w1.recordDate,w2.recordDate)=1;