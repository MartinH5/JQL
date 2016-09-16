# JQL


* How did we use persistence in the last semesters?

Text files + input/output writers.
MySQL database.

* How we queried to a relational database.

We used a connector object w. a JDBC driver to connect to the database.

* Pros Cons with ORM framework.

It makes it easier to focus on the Object Orieneted programming, rather than having to fiddly with the sql syntax, 
JPA also adds a lot of tools that make the mapping easier with their prebuild tools. 

The generated tables can end up rather unorganized - the structure wouldn't usually be ideal basically. 
It also requires extra resources, whenever the database changes/grows, which probably becomes a huge issue
if it's database service for thousands for users. 
