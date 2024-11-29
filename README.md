# Kubernetes CRUD App with PostgreSQL

## Overview

This project demonstrates the deployment of a CRUD application on Kubernetes with the following components:
- **Spring Boot** for the backend application.
- **PostgreSQL** as the database.
- **Kubernetes** for orchestration, scaling, and management.

## Features
- Kubernetes **Deployments** for the CRUD app and PostgreSQL.
- **Services** for communication between components and external access.
- Persistent storage for PostgreSQL using **PersistentVolumeClaim (PVC)**.
- Horizontal Pod Autoscaling (HPA) for the CRUD app based on CPU usage.

## Prerequisites
To run this project, ensure you have the following installed:
- **Kubernetes** (e.g., Minikube or a cloud provider's Kubernetes service).
- **kubectl**: The command-line tool for managing Kubernetes clusters.
- **Docker**: For building and managing Docker images.

---

## Project Structure


## Setup Instructions

### 1. Clone the Repository
Clone this repository to your local machine:
```bash
git clone https://github.com/<your-github-repo>/kubernetis.git
cd kubernetis/KubernetisFiles
```


### 2. Build the Docker Image
Standard Docker Environment:
```bash
docker build -t crud-app:latest .
```

Using Minikube's Docker Environment:
```bash
eval $(minikube docker-env)
docker build -t crud-app:latest .
```


### 3. Deploy Kubernetes Resources
Apply all Kubernetes configurations in the KubernetisFiles directory:
```bash
kubectl apply -f KubernetisFiles/
```

### 4. Verify the Deployment
Check the status of the pods, services, and deployments:
```bash
kubectl get pods
kubectl get svc
kubectl get deployments
```

### 6. Autoscaling the Application
Swagger to accces the application
```bash
kubectl autoscale deployment crud-app --cpu-percent=50 --min=1 --max=10
```


### 7. Access the Application / bypass the firewall
Swagger to accces the application 
```bash
kubectl port-forward service/crud-service 8083:8083
```

### 8. Test the Application
Simulation Load with a Script in terminal
```bash
for i in {1..1000}; do   (     curl -X POST http://localhost:8083/users       -H "Content-Type: application/json"       -d '{
        "id": '"$i"',
        "username": "user'$i'",
        "password": "pass'$i'",
        "email": "user'$i'@example.com",
        "emailVerified": true,
        "verificationToken": "string",
        "premium": true,
        "admin": true
      }';   ) & done
```

### 9. Monitoring the Application in autoscaling
```bash
    kubectl get hpa -w
 kubectl get pods -w
```


## Enjoy exploring the power of Kubernetes with this CRUD application! 🚀 
``` 
Let me know if you'd like further adjustments!

   ``` 