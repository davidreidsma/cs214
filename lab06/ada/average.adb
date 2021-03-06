-- average.adb "test-drives" function Average.
-- Precondition: array is an array of numbers.
-- Output: the average of the numbers.
--
-- Begun by: Dr. Adams, CS 214 at Calvin College.
-- Completed by:  David Reidsma
-- Date:          03/12/2020
-----------------------------------------------

with Ada.Text_IO; use Ada.Text_IO;             -- Put(String)
with Ada.Float_Text_IO; use Ada.Float_Text_IO; -- Put(Float)

procedure average is

-- Declare Vector type
type Vector is array ( Positive range <>) of Float;

-- Define array0 as an array containing no values
array0 : Vector := (0.0, 0.0);

-- Define array1 as an array containing 9, 8, 7, 6
array1 : Vector := (9.0, 8.0, 7.0, 6.0);

----------------------------------------------
-- sum() sums the values in an array         -
-- Receive: vec, an array of numbers         -
-- Return: the sum of the values in vec.     -
----------------------------------------------
function sum(vec: Vector) return Float is 
   Total : Float := 0.0; 
begin 
   -- for I in vec'Range 
   for I in 1..vec'Length
   loop 
      Total := Total + vec(I); 
   end loop; 
   return Total; 
end sum; 

-------------------------------------------------------------------------------
-- average() is a method that computes the average of the values in an array. -
-- Receive: vec, an array of doubles.                                         -
-- Return: the average of the values in vec.                                  -
-------------------------------------------------------------------------------
function average(vec: in Vector) return Float is
begin
   if vec'Length <= 0 then
      return 0.0;
   else
      return sum(vec) / Float(vec'Length);
   end if;
end average;


begin
   Put(" average 0 is ");
   Put( average(array0) );
   New_line;
   Put(" average 1 is ");
   Put( average(array1) );
   New_line;
end average;

