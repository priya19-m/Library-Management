## Library Management System

## Project Overview:
The Library Management System is a Java-based web application developed using Servlets, JDBC, and Object-Oriented Programming (OOP) concepts.
This system helps manage library operations such as adding books, viewing books, managing authors, and handling database connectivity efficiently.
The project follows a layered architecture using Bean, DAO, Service, Servlet, and Utility layers, ensuring clean separation of concerns and easy maintenance.

## Objectives:
The system is designed to:
   1. Add new books with author details
   2. View available books in the library
   3. Maintain author and book information
   4. Perform database operations using JDBC
   5. Handle user requests using Servlets
   6. Provide simple HTML-based user interfaces
   7. Apply DAO pattern and Service layer architecture
      
## Technologies Used:
  1. Programming Language: Java
  2. Web Technologies: HTML, Servlets
  3. Database: Oracle Database
  4. Connectivity: JDBC
  5. IDE: Eclipse IDE
  6. Server: Apache Tomcat

## Project Structure:

``` plaintext
LibraryManagement
├── src/main/java
│   └── com.wipro.book
│       ├── bean
│       │   ├── AuthorBean.java
│       │   └── BookBean.java
│       ├── dao
│       │   ├── AuthorDAO.java
│       │   └── BookDAO.java
│       ├── service
│       │   └── Administrator.java
│       ├── servlets
│       │   ├── MainServlet.java
│       │   └── ViewServlet.java
│       └── util
│           └── DBUtil.java
├── src/main/webapp
│   ├── META-INF
│   ├── WEB-INF
│   ├── AddBook.html
│   ├── ViewBook.html
│   ├── Menu.html
│   ├── Invalid.html
│   └── Failure.html
└── build
```

## Description of Packages:
   1. com.wipro.book.bean
         AuthorBean.java – Stores author details
         BookBean.java – Stores book details
   2. com.wipro.book.dao
         AuthorDAO.java – Performs database operations related to authors
         BookDAO.java – Performs database operations related to books
   3. com.wipro.book.service
         Administrator.java – Acts as the service layer to coordinate DAO operations
   4. com.wipro.book.servlets
         MainServlet.java – Handles requests such as adding books
         ViewServlet.java – Handles viewing of books
   5. com.wipro.book.util
         DBUtil.java – Manages database connection using JDBC

## Features:
Add new books with author information
View all books stored in the database
Input validation for book details
Centralized database connection handling
Simple and user-friendly HTML pages

## Database Details:
Tables Used
   1. BOOK_TABLE – Stores book details
      ## OUTPUT:
      <img width="836" height="409" alt="Screenshot 2026-02-09 110733" src="https://github.com/user-attachments/assets/c2442480-f109-4a67-a695-35b00a425806" />

   2. AUTHOR_TABLE – Stores author details
      ## OUTPUT:
      <img width="609" height="278" alt="Screenshot 2026-02-09 110825" src="https://github.com/user-attachments/assets/387f5e16-1d95-409d-a1b8-6811dc7e195a" />

## How to Run in Eclipse IDE:
## Step 1: Install Required Software
Eclipse IDE
Apache Tomcat Server (v9.0 or above)
Oracle Database
Oracle JDBC Driver (ojdbc8.jar / ojdbc11.jar)

## Step 2: Import Project
Open Eclipse
Go to File → Import → Existing Maven / Dynamic Web Project
Select the LibraryManagement folder
Click Finish

## Step 3: Configure Tomcat Server
Go to Servers tab
Add Apache Tomcat
Configure server runtime environment

## Step 4: Add JDBC Driver
Right-click project → Build Path → Add External Archives
Select ojdbc8.jar

## Step 5: Run the Project
Right-click project
Run As → Run on Server
Choose Tomcat Server

## OUTPUT:
<img width="1174" height="417" alt="Screenshot 2026-02-09 110409" src="https://github.com/user-attachments/assets/d2002da9-b567-4f00-ad17-e3a9f9fcea4a" />
<img width="1919" height="477" alt="Screenshot 2026-02-09 110516" src="https://github.com/user-attachments/assets/6698560b-b231-4646-9e15-5cc033d3a285" />
<img width="807" height="450" alt="Screenshot 2026-02-09 110550" src="https://github.com/user-attachments/assets/23535836-debc-4215-8d13-a16fa98aafb4" />
<img width="1919" height="392" alt="Screenshot 2026-02-09 110610" src="https://github.com/user-attachments/assets/a44a6fcc-eacd-426b-9bac-e86c066f287a" />

## STUDENT DETAILS:
NAME: PRIYADHARSHINI M 
ROLL NO: 717823P141





