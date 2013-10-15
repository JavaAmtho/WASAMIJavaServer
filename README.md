WAFJavaServer
=================================

Simple Java TCP/HTTP server wired for MYSQL and JSON replies

Allows you to have a live server wired up for MYSQL, JSON, GET, POST 
in under 2 minutes.


FEATURES
=================================

This server is wired for you to:

1. Connect To MYSQL using JDBC
2. Query MYSQL
3. Manages most object conversions from MSYQL to java objects
4. Listen for GET/POST requests of port 1234
5. Send back a JSON response


QUICK START
=================================
To use WITH MYSQL:

1. Create a MYSQL DB called Sample
2. Create a table called user
3. In user table add three fields: first, last, social
   - Social should be int
   - First, last should be varchar

4. Import project into your favorite IDE
5. Start server
6. Open browser
7. Type in http://localhost:1234/welcome

=================================
To use WITHOUT MYSQL

1. Import project into your favorite IDE
2. Start server
3. Open browser
4. Type in http://localhost:1234/welcome

=================================
For even faster use:

1. Open terminal and type:
2. java -jar WAFSimpleHTTPServer.jar


BUILT IN DEPENDENCIES
=================================
1. GSON
2. Jetty
3. JDBC


ABOUT
=================================
My team and I use this server for various mobile apps and web apps. It is very robust
and has served us well. We figured we could share it with the world because it took a long
time to get right.

We hope it helps everyone get their projects of the ground quickly by showing you how to
use the JDBC driver to connect to MYSQL, and Jetty to actually handle the HTTP requests.
We will add HTTPS support as soon as we can abstract our proprietary information from it
and make it available for everyone.

Server was built and contributed by William Falcon, Sam Frank, Michael Ben-Ami. All of us are studying Computer Science at Columbia University in New York.

Enjoy!!

=================================
REAL USE
=================================
To see this server in action checkout these projects:
Meal Idea iPhone App - http://itunes.com/apps/mealidea

(If you use the server in a live product send me the name and link and we'll add your name here william@mealidea.com)
