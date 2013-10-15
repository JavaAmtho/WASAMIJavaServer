WAF-Simple-JAVA-HTTP-MYSQL-Server
=================================

Simple Java TCP/HTTP server wired for MYSQL and JSON replies

Allows you to have a live server wired up for MYSQL, JSON, GET, POST 
in under 2 minutes.

=================================
FEATURES
=================================

This server is wired for you to:

1. Connect To MYSQL using JDBC
2. Query MYSQL
3. Manages most object conversions from MSYQL to java objects
4. Listen for GET/POST requests of port 1234
5. Send back a JSON response

=================================
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
BUILT IN DEPENDENCIES
=================================
GSON
Jetty
JDBC

