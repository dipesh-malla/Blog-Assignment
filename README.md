#  Internship Assignment

This repository contains two parts for the Intuji Backend Intern assignment:

1. **Blog API** – A Spring Boot-based RESTful API for basic blog operations.
2. **Array Pair Finder** – A standalone Java program to find pairs in an array that sum to a target.

---

## 🛠️ Technologies Used

- Java 21 (with preview features enabled)
- Spring Boot
- PostgreSQL (Port: `5444`, DB: `intuji_db`, Username: `intuji`, Password: `intuji`)
- Maven
- Postman (for API testing)

---

## 📁 Project Structure
```
project-root/
├── blog-api/ # Spring Boot project
│ ├── src/ # Contains Java and resource files
│ └── ...
├── array-pair-task/ # Plain Java solution for array pair 
│ └── ArrayPair.java
├── Blog.postman_collection.json
```




---

## 🚀 How to Run

### 1. Clone the Repository

```
git clone https://github.com/dipesh-malla/Blog-Assignment.git
```
### 2.  Set Up PostgreSQL with Docker
```
docker run --name postgressintuji \
  -e POSTGRES_USER=intuji \
  -e POSTGRES_PASSWORD=intuji \
  -e POSTGRES_DB=intuji_db \
  -p 5444:5432 \
  -d postgres```
```
### 3. configure Application.yml
```
uncomment username and password and use intuji as username and password

username: intuji
password: intuji
```
### 3. configure Application.yml
  Task 1 (BlogAPI)
    
       cd blog-api
      ./mvnw spring-boot:run

       or you can choose the main file and run it using any IDE
  
  Task 2 (Array-pair)
  ```
    cd array-pair-task
    javac ArrayPair.java
    java ArrayPair
  
    or youo can choose the file and run it using any IDE
  ```


📝 Notes

  Make sure your IDE supports Java 21 with preview features.
  If port 5444 is occupied, change it in both application.yml and your Docker run command.




