# My-Portfolio1

# Portfolio Website - Anurag Ghosliya

## Description
This is my personal portfolio website built using **Spring Boot** and **Thymeleaf**. The website showcases my skills, projects, and experience as a Java developer. It also includes a **contact form** with **Java Mail Sender integration**, allowing visitors to send me messages via email. The website follows a professional and modern design, making it easy for recruiters and clients to explore my work.

## Features
- **Dynamic Portfolio Website** using Spring Boot and Thymeleaf
- **Download Resume** feature
- **Java Mail Sender Integration** for contact form
- **SEO-friendly and Responsive Design**
- **Spring Boot MVC Architecture**
- **Embedded Tomcat Server**
- **Privacy Policy and Terms & Conditions Pages**
- **Deployed on Hosting Provider**

## Tech Stack
- **Backend:** Java, Spring Boot, Spring MVC
- **Frontend:** Thymeleaf, HTML, CSS, Bootstrap
- **Database (Optional for future updates):** MySQL
- **Email Service:** Java Mail Sender

## Installation & Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/AnuragGhosliya/portfolio-website.git
   cd portfolio-website
   ```

2. Open the project in **IntelliJ IDEA** or **Eclipse**.

3. Configure application.properties for email sender:
   ```properties
   spring.mail.host=smtp.gmail.com
   spring.mail.port=587
   spring.mail.username=your-email@gmail.com
   spring.mail.password=your-app-password
   spring.mail.properties.mail.smtp.auth=true
   spring.mail.properties.mail.smtp.starttls.enable=true
   ```

4. Build and run the application:
   ```bash
   mvn spring-boot:run
   ```

5. Open your browser and visit:
   ```
   http://localhost:8080
   ```

## Deployment
- The website can be deployed on **Heroku, AWS, or any cloud provider**.
- Ensure SMTP is configured for email services on the deployed server.

## Contact
If you have any questions or suggestions, feel free to reach out at **jatanurag000@gmail.com**.

---
⭐ Star this repository if you found it useful!

