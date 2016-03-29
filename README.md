# cse231Project

##About:
Team 2 will construct 3 ArrayList<Integer> JCF Data Structures with capacities of (1) 20; (2) 2,000; & (3) 20,000 elements described in the Constructing Data Structures with TDD as described below. Team 2 will use the int[] arrays created by Team 1 to fill each ArrayList<Integer> (PART 1). Team 2 will then sort each Data Structure using the bubble sort and measure the Big O Notation efficiency using elapsed time, where the execution times are returned as longs (PART 2). Team 2 will then search each ArrayList<Integer> for the first 2 odd integers between 400 and 4,000 and measure the Big O Notation efficiency of this search using elapsed time (PART 3).
Team 2 will then post the required data as discussed below.

## Team 2 Lead: Nikole Clarke

Dillon and Corey will work on PART 1.
Damien and Bryan will work on PART 2.
Robin and Nikole will work on PART 3.

## More
The operational concept for the Class Project involves building & filling JCF Data Structures that we have studied in class and comparing them for specific applications. The Final Project Review for all presentations (requirements later) is Thursday, 160414.
+ Each Team will build a different JCF Data Structure and fill it with the Random Arrays constructed by Team 1. Each Team will use Test-Driven Development (TDD) with JUnit to build the Team’s assigned Data Structure in accordance with the instructions for Constructing & Verifying Data Structures using TDD & JUnit discussed below.
+ Each Team will then demonstrate the efficiency of the Team’s JCF Data Structure using Big O Notation. This efficiency will also involve measuring the elapsed time for searching and sorting the Team’s assigned JCF Data Structure (if required).
+ The Team will post its completed JCF Data Structure and results. Team 1 will verify (1) the Team’s JUnit tests to build the Team’s assigned Data Structure; (2) the results of each Team’s efficiency result in Big O Notation, for searching/sorting elapsed time; (3) all necessary Java source code files & screen shots to prove successful execution.

Constructing and Verifying Data Structures Using Test-Driven Development (TDD) with JUnit
+ The philosophy of TDD with JUnit is to (1) “write the test”; then (2) “write the code to pass the test”. Note that Binary Trees are not part of the JCF but are important Data Structures in their own right; but they can & should be built using TDD with JUnit.
+ To implement this TDD strategy with JUnit, Teams need only test the 20 element Data Structure. The larger Data Structures containing more elements follow the same design specifications as the 20 element Data Structure; just more elements for Big O Notation purposes & measurements.
+ Within the JUnit test class, create (or use a helper class to create) a JUnit test (“test”) 20 element int[] array containing an equal number of even and odd integers (ints) within the required range, as specified in the Team instructions above. This can be done either programmatically or manually.
+ Visually inspect this test int[] array to verify that it contains integers of the type (even or odd) and within the specified range given for each Team above. Use the test int[] array to fill the first 20 element Team Data Structure required above.
+ Use selected integers from the test int[] array as the “given” case in a JUnit assert statement. For example, if the Data Structure & data processing must find the first odd integer within a range, use the first odd integer in the test int[] array as “given”.
+ Write the JUnit assert statement to compare the integer returned from the Team’s data processing scheme with the chosen “given” integer from the test int[] array. This test should result in a “green bar”. Now test an integer that clearly will not pass the test, & verify that the Team receives the “red bar”. Submit the JUnit test class and test int[] array with results.
+ The Team should measure the elapsed time for each Data Structure operation as shown in the Derek Banas Big O Notation video (use similar Java code).
+ Final Team submission (posting) should include: (1) Data Structure and data processing Java source code files; (2) JUnit test class & test int[] array Java source code files; (3) Big O Notation elapsed time measuring Java source code files; (4) screen shots of the JUnit GUI and test results (positive and negative as described above).
