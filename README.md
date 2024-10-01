# Student-Result-Status
This is a Java servlet-based application designed to process student scores and display their pass/fail status for each subject along with the overall average. The application is built using the Jakarta Servlet API, JSP (JavaServer Pages) for web page generation, and HTML/CSS for frontend presentation.

# Features
1. Processes individual student scores for different subjects.
2. Displays pass/fail status for each subject.
3. Computes and shows the overall average score.
4. Provides a clean and responsive UI with HTML/CSS.

# Technologies Used
1. Jakarta Servlet API: To handle HTTP requests and responses.
2. JSP (JavaServer Pages): To dynamically generate the web pages.
3. HTML/CSS: For the frontend interface.
4. Eclipse IDE: Development environment for the project.

# Prerequisites
1. Java Development Kit (JDK): Ensure JDK 8 or above is installed.
2. Jakarta Servlet API: Must have the required Jakarta Servlet libraries in the classpath.
3. Tomcat Server: A web server like Apache Tomcat to run the servlet-based web application.
4. Eclipse IDE: Project was developed using Eclipse, so having it is recommended.

# How it Works
1. Input Form: The user enters student scores for various subjects on the index.jsp page.
2. Servlet Processing: The data is sent to ScoreProcessorServlet.java, which computes the pass/fail status for each subject and calculates the overall average.
3. Result Page: The results are displayed on result.jsp along with pass/fail information and the overall average score.
