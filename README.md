# Hospital Management System

This project is a Hospital Management System built with Java Spring Boot, JPA, PostgreSQL, Thymeleaf, and Lombok. It allows managing patients, doctors, and appointments with separate functionalities for admin and users.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup Instructions](#setup-instructions)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)

## Features

### Admin Functionalities

- Manage doctors: list, add, edit, and delete doctors.
- Manage patients: list, add, edit, and delete patients.
- Manage appointments: list, add, edit, and delete appointments.

### User Functionalities

- View and manage their own appointments: list, add, edit, and delete.

## Technologies Used

- Java Spring Boot
- Spring Data JPA
- PostgreSQL
- Thymeleaf
- Lombok
- HTML & Bootstrap

## Setup Instructions

### Prerequisites

- Java 11 or higher
- Maven
- PostgreSQL

### Steps

1. **Clone the repository:**

    ```sh
    https://github.com/shiinedev/Hospital-Manegment-system.git
    cd hospital-management-system
    ```

2. **Configure the database:**

    - Create a PostgreSQL database named `hospital_management`.
    - Update the `application.properties` file with your PostgreSQL credentials:

      ```properties
      spring.datasource.url=jdbc:postgresql://localhost:5432/hospital_management
      spring.datasource.username=yourusername
      spring.datasource.password=yourpassword
      spring.jpa.hibernate.ddl-auto=update
      spring.jpa.show-sql=true
      spring.thymeleaf.cache=false
      ```

3. **Build and run the project:**

    ```sh
    mvn clean install
    mvn spring-boot:run
    ```

4. **Access the application:**

    Open your web browser and navigate to `http://localhost:3000`.

## Usage

### Admin Panel

- **List Patients:** `/patients`
- **Add Patient:** `/patients/new`
- **Edit Patient:** `/patients/{id}/edit`
- **Delete Patient:** `/patients/{id}/delete`

- **List Doctors:** `/doctors`
- **Add Doctor:** `/doctors/new`
- **Edit Doctor:** `/doctors/{id}/edit`
- **Delete Doctor:** `/doctors/{id}/delete`

- **List Appointments:** `/appointments`
- **Add Appointment:** `/appointments/new`
- **Edit Appointment:** `/appointments/{id}/edit`
- **Delete Appointment:** `/appointments/{id}/delete`

### User Panel

- **List Appointments:** `/user/appointments`
- **Add Appointment:** `/user/appointments/new`
- **Edit Appointment:** `/user/appointments/{id}/edit`
- **Delete Appointment:** `/user/appointments/{id}/delete`

### Authentication

- Admin credentials: `admin/admin`
- User credentials: `user/user`

## Contributing

1. Fork the repository.
2. Create a new feature branch: `git checkout -b my-feature-branch`
3. Commit your changes: `git commit -m 'Add some feature'`
4. Push to the branch: `git push origin my-feature-branch`
5. Submit a pull request.

