# Task Management Application

The Task Management Application is designed to streamline project and task management, focusing on ease of use and scalability. Built with Java and Spring Boot, the backend interacts with a MySQL database via Spring Data JPA, managing entities such as projects, roles, tasks, and users. With a well-structured security module and authentication features, this application ensures secure access to various parts of the platform.

The APIs are easily accessible and well-documented via Swagger UI, allowing developers to interact with the system efficiently.

# Features  
📝 **Project Management** – Create, update, and track project progress.  
👥 **Role Management** – Define and manage user roles and permissions.  
📋 **Task Management** – Add, update, and track user tasks associated with projects.  
🔑 **Authentication** – Secure login and token-based authentication.  
🔐 **Security** – Protect sensitive endpoints with role-based access control.  
📂 **MVC Architecture** – Clear separation between controllers, services, and repositories.  
📊 **REST API with Spring Boot** – Robust and scalable API endpoints for all entities.  

# Technologies used
- **Java 17**
- **Spring Boot 2.0**
- **Maven**
- **MySQL**
- **Spring Data JPA**
- **Swagger UI**
-  **Spring Security**
-  **JSON Web Tokens (JWT)**
-  **Auth0**

# Running the app
1. Clone the repository:  
   `git clone https://github.com/AssmaGht/Gestion-des-taches.git`
   
2. Import the project into STS:
   - Click **File > Import...**
   - Select **Maven > Existing Maven Projects** and click **Next**
   - Browse to the project directory and click **Finish**

3. Update the values in `application.properties` with your MySQL database connection details.

4. Run the app:  
   Right-click the project in the Package Explorer and click **Run As > Spring Boot App**.

# API Documentation
- API documentation is available via Swagger UI at: http://localhost:8083/swagger-ui/index.html

# Workflow
<img src="https://github.com/user-attachments/assets/bc01b20a-e9da-4a78-892d-ff25a37f8fe0" width="500" />

# Security
- The API is secured using JSON Web Tokens (JWT) handled by Auth0. To access the API, you will need to obtain a JWT by authenticating with the /login endpoint. The JWT should then be passed in the Authorize option available in the Swagger-ui.

  ## Example:
   Authorization: <your_jwt>

## Swagger UI

<img width="1500" alt="Image" src="https://github.com/user-attachments/assets/e66e2fa9-2294-4be4-972a-7a45a4035cf2" />

<img width="1500" alt="Image" src="https://github.com/user-attachments/assets/62e10368-0ace-4936-9d1c-c63f1d3bfb01" />

<img width="1500" alt="Image" src="https://github.com/user-attachments/assets/940bbbd4-ebaf-497b-a16c-5f74456e09c3" />

# API Controllers
<img width="1230" alt="Image" src="https://github.com/user-attachments/assets/4267c31a-4d5c-48c4-97d1-a06a72f08fe9" />

<img width="1217" alt="Image" src="https://github.com/user-attachments/assets/6d1abff6-880c-4bbe-99e7-e544a71d492f" />

<img width="1221" alt="Image" src="https://github.com/user-attachments/assets/5b0329fe-530f-4ba3-843b-8d221a0bcd7d" />

<img width="1221" alt="Image" src="https://github.com/user-attachments/assets/68602ed9-4938-421b-af84-d38527d15250" />


## Stay Tuned for Upcoming Features
The next release will feature enhanced task notifications, priority management, and integration with external project management tools. Stay tuned for more updates!
