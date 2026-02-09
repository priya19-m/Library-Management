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



