# Mini Liquipedia: VALORANT Masters London 2026 & Stage 2 Regional Tracker

A full-stack tournament database management system heavily inspired by the official Liquipedia wiki and VLR.gg layout. This application provides real-time data tracking, visualization, and administration management for the competitive VALORANT Champions Tour (VCT) 2026 ecosystem, seamlessly covering both **VCT Masters London 2026** and the **Stage 2 Regional Tours (Pacific, EMEA, Americas, China)**.

---

## ⚠️ Disclaimer

This repository and application are developed strictly for **educational and academic assignment purposes** (Universiti Teknologi Malaysia). 
* **Asset Usage:** All tournament logos, team branding, and layout designs used in this project are borrowed from [Liquipedia](https://liquipedia.net/) under fair educational use guidelines.
* **Commercialization:** This project is completely non-commercial, non-profit, and does not generate any revenue. 

---

## 🚀 Key Features

* **Complete CRUD REST API:** Full administrative backend capabilities to **Create, Read, Update, and Delete** team profiles, active rosters, and coaching staffs.
* **Dynamic Regional Navigation:** Multi-stage client-side routing allowing users to seamlessly transition between the global *Masters London 2026* portal and local *Stage 2 Regional Leagues* (Pacific, EMEA, Americas, China).
* **Real-Time Client-Side Filtering:** An instantaneous search bar that filters competing teams in real-time without executing full-page reloads.
* **Aesthetic Liquipedia UI:** High-fidelity dark theme representation featuring context-dependent visual cards, eliminated team grayscale dimming effects, and tabbed roster views (Main Team vs. Coaching Staff).
* **Automated Data Lifecycle Management:** Dynamic categorization logic that automatically groups teams into active tournament brackets (e.g., Playoffs vs. Swiss Stage).

---

## 🛠️ Tech Stack & Architecture

The application is built using a decoupled **Layered Architecture** to enforce separation of concerns, scalability, and code cleanliness:

### Backend (Robust RESTful Core)
* **Framework:** Spring Boot (Java)
* **API Layer:** Spring Web MVC Controllers (`@RestController`) handling REST endpoints (`GET`, `POST`, `PUT`, `@DeleteMapping`).
* **Business Logic Layer:** Service implementation encapsulating data validation and operational workflows.
* **Data Access Layer:** Spring Data JPA Repositories abstraction executing object-relational mapping without manual SQL boilerplate.
* **Database:** H2 In-Memory Database engine (lightweight storage optimized for runtime efficiency).

### Frontend (Responsive Presentation)
* **Technologies:** Semantic HTML5, CSS3 Variables (Liquipedia palette config), and Vanilla JavaScript (ES6+).
* **Data Binding:** Dynamic Fetch API processing asynchronous server payloads into modern UI components.

---

## 🗂️ Project Structure

```text
src/main/java/com/yourgroup/liquipediamini/
│
├── model/
│   └── Team.java               # Core Database Entity definition
├── repository/
│   └── TeamRepository.java     # JpaRepository interface with custom search queries
├── service/
│   └── TeamService.java        # Core Business Logic and CRUD processing
└── controller/
    └── TeamController.java     # REST Endpoints mapping engine
│
src/main/resources/
├── static/
│   ├── index.html              # Main Masters London 2026 view
│   ├── regional.html           # Stage 2 Regional Tour dashboard
│   └── assets/                 # Local media, icons, and favicon assets
└── application.properties      # Framework configurations & H2 console setup