# Task Management Application

The Task Management Application is designed to streamline project and task management, focusing on ease of use and scalability. Built with Java and Spring Boot, the backend interacts with a MySQL database via Spring Data JPA, managing entities such as projects, roles, tasks, and users. With a well-structured security module and authentication features, this application ensures secure access to various parts of the platform.

The APIs are easily accessible and well-documented via Swagger UI, allowing developers to interact with the system efficiently.

## Features  
📝 **Project Management** – Create, update, and track project progress.  
👥 **Role Management** – Define and manage user roles and permissions.  
📋 **Task Management** – Add, update, and track user tasks associated with projects.  
🔑 **Authentication** – Secure login and token-based authentication.  
🔐 **Security** – Protect sensitive endpoints with role-based access control.  
📂 **MVC Architecture** – Clear separation between controllers, services, and repositories.  
📊 **REST API with Spring Boot** – Robust and scalable API endpoints for all entities.  

## Technologies used
- **Java 17**
- **Spring Boot**
- **Spring Security**
- **Maven**
- **MySQL**
- **Spring Data JPA**
- **Swagger UI**

## Running the app
1. Clone the repository:  
   `git clone https://github.com/AssmaGht/Gestion-des-taches.git`
   
2. Import the project into STS:
   - Click **File > Import...**
   - Select **Maven > Existing Maven Projects** and click **Next**
   - Browse to the project directory and click **Finish**

3. Update the values in `application.properties` with your MySQL database connection details.

4. Run the app:  
   Right-click the project in the Package Explorer and click **Run As > Spring Boot App**.

## API Documentation
- API documentation is available via Swagger UI at: http://localhost:8083/swagger-ui/index.html

## Workflow
<img src="https://github.com/user-attachments/assets/bc01b20a-e9da-4a78-892d-ff25a37f8fe0" width="500" />

## Swagger UI

<img width="1300" alt="Image" src="https://github.com/user-attachments/assets/e66e2fa9-2294-4be4-972a-7a45a4035cf2" />

<img width="1300" alt="Image" src="https://github.com/user-attachments/assets/62e10368-0ace-4936-9d1c-c63f1d3bfb01" />

<img width="1300" alt="Image" src="https://github.com/user-attachments/assets/940bbbd4-ebaf-497b-a16c-5f74456e09c3" />

## API Controllers
- **ProjectController** – Handles project-related endpoints (Create, Update, Delete, List).  
- **RoleController** – Manages user roles and permissions.  
- **TaskController** – Manages tasks linked to projects and users.  
- **AuthController** – Manages user authentication and token generation.

![API Controller](https://github.com/user-attachments/assets/api_controller_example.png)

## Stay Tuned for Upcoming Features
The next release will feature enhanced task notifications, priority management, and integration with external project management tools. Stay tuned for more updates!
