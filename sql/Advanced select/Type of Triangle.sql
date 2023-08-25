select case
    when (A+B<=C or B+C<=A or A+C<=B) then 'Not A Triangle'
    when (A=B and B=c) then 'Equilateral'
    when (A=B AND C<>B) or (B=C AND C<>A) or (A=C AND A<>B) then 'Isosceles'
else 'Scalene'
end 
from TRIANGLES;
