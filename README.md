# CleverSandBoxApi
Playing with Clever SandBoxApi to figure out Average number of Students per Section.

I wrote a Java Project using the Apache http_core, fluent and gson. 
I looked at the districts api it looks like
only one district was provided with the demo and so I directly got the sections and proceeded.

I connected to the Sections Api and got the JSon for Sections, Wrote the POJO classes for the Response,used the GSON library to deserialize JSON to object.
Iterated over the object and calculated the total students and sections and calculated the Average Number of Students/ Section.

It was fun to work with Clever's Api's.

Quick Answer:
Total Students = 2180
Total Sections = 100
Average Number of Students/Section = 21.8
