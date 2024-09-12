# AREP LAB4: Taller de de modularización con virtualización e Introducción a Docker
This workshop consists of creating a small web application using the Spark Java micro-framework (http://sparkjava.com/). Once we have this application, we will proceed to build a Docker container for the application and deploy and configure it on our local machine. Then, we will create a repository on DockerHub and upload the image to the repository. Finally, we will create a virtual machine on AWS, install Docker, and deploy the container we just created.

## Project Architecture
1. **Web Client:**: The user interacts with the system through a Bootstrap-based web interface.
   
2. **Load Balancer (Round Robin)**: A load balancer implementing a Round Robin algorithm to distribute requests across LogService instances.

3. **LogService**: Multiple instances of a REST service that logs messages and retrieves recent entries.

4. **MongoDB**:  A database service that is used to store log messages.

### Components

![image](https://github.com/user-attachments/assets/ab3e792c-bc38-4808-a8e3-f5a9aea8b6fe)

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

Before install and run the project you will need:

1. **Java** (version 17)

2. **Maven**
    - Download Maven from [here](http://maven.apache.org/download.html)
    - Follow the installation instructions [here](http://maven.apache.org/download.html#Installation)

3. **Git**
    - Install Git by following the instructions [here](http://git-scm.com/book/en/v2/Getting-Started-Installing-Git)

4. 4. **Docker**
    - Install Docker by following the instructions [here](https://docs.docker.com/get-docker/).

### Installing

1. **Clone the repository and navigate into the project directory**:
    ```sh
    git clone https://github.com/JuanDavidGarciaPulido/AREP_LAB4.git

    cd AREP_LAB4
    ```

2. **Compile the project**:
   ```sh
   mvn clean install
   ```

3. **Build and run the Docker containers**:
   ```sh
   docker-compose up -d
   ```

4. **Access the web application**:
`http://localhost:8080/index.html`

## Usage

![image](https://github.com/user-attachments/assets/caab921e-65c1-4dd5-b905-d277c803167d)

1. Write something on the input field.
2. Click the submit button to send the message.
3. The page will update with the last 10 logs.

## Author
This project was developed by Juan David García Pulido.

## Date

Wednesday, September 11 - 2024

## License

This project is licensed under the GNU license; See the [LICENSE.txt](LICENSE.txt) file for details.

