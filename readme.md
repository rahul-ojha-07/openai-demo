<p align="center">
  <a href="https://www.bing.com/images/create/ai-drinking-coffee-symbolizing-java/1-66125fc9d0044976aa7664c44d373c29?id=WcSzgznoytAwD2U4FXwzUg%3d%3d&view=detailv2&idpp=genimg&idpclose=1&thId=OIG4.zJHJ722ST6PBDravc1EV&frame=sydedg&FORM=SYDBIC"><img src="https://th.bing.com/th/id/OIG4.zJHJ722ST6PBDravc1EV?pid=ImgGn" width="300" alt="project-logo"></a>
</p>
<p align="center">
    <h1 align="center">OpenAI-Demo</h1>
</p>
<p align="center">
    <em>Powering seamless API interactions with intelligence.</em>
</p>
<p align="center">
	<img src="https://img.shields.io/github/last-commit/rahul-ojha-07/openai-demo?style=default&logo=git&logoColor=white&color=0080ff" alt="last-commit">
	<img src="https://img.shields.io/github/languages/top/rahul-ojha-07/openai-demo?style=default&color=0080ff" alt="repo-top-language">
	<img src="https://img.shields.io/github/languages/count/rahul-ojha-07/openai-demo?style=default&color=0080ff" alt="repo-language-count">
<p>
<p align="center">
	<!-- default option, no dependency badges. -->
</p>

<br><!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary><br>

- [ Overview](#-overview)
- [ Features](#-features)
- [ Repository Structure](#-repository-structure)
- [ Modules](#-modules)
- [ Getting Started](#-getting-started)
  - [ Installation](#-installation)
  - [ Usage](#-usage)
  - [ Tests](#-tests)
- [ Project Roadmap](#-project-roadmap)
- [ Contributing](#-contributing)
- [ License](#-license)
- [ Acknowledgments](#-acknowledgments)
</details>
<hr>

##  Overview

The openai-demo project is a Spring Boot application that showcases chat completion functionality using OpenAI's API. It includes endpoints for processing user input and generating chat responses based on provided prompts. This project facilitates seamless integration with external systems and demonstrates efficient handling of HTTP requests through its well-structured DTOs and service components. Developed with a focus on simplicity and extensibility, openai-demo serves as a valuable demonstration of leveraging AI capabilities in real-world applications.

---

##  Features

|    |   Feature         | Description |
|----|-------------------|---------------------------------------------------------------|
| ⚙️  | **Architecture**  | Microservices architecture leveraging Spring Boot with RESTful APIs. Utilizes DTOs to transfer data and services to process chat completions. |
| 🔩 | **Code Quality**  | Well-structured and clean codebase following Java best practices. Includes Swagger annotations for API documentation. |
| 📄 | **Documentation** | Detailed project setup instructions and API configurations in the application.yaml file. Javadoc comments for class/method documentation. |
| 🔌 | **Integrations**  | Integrates with OpenAI API for chat completion functionality. Dependencies on Java, YAML, and Maven. |
| 🧩 | **Modularity**    | Codebase is modular with separate packages for DTOs, controllers, services, etc., promoting code reusability. |
| 🧪 | **Testing**       | Utilizes JUnit and Spring Boot testing frameworks for unit and integration tests. Contains tests for application context loading and service functionalities. |
| ⚡️  | **Performance**   | Efficient resource usage with optimized RestTemplate for API interactions. Potential for scalability with proper caching mechanisms. |
| 🛡️ | **Security**      | Secure design with error logging, proper HTTP headers handling, and validation of user inputs to prevent security vulnerabilities. |
| 📦 | **Dependencies**  | Dependencies on Java, YAML, and Maven for project setup and execution. Utilizes Lombok for concise code in DTOs. |
| 🚀 | **Scalability**   | Scalable architecture with RESTful services, allowing horizontal scaling to handle increased traffic. Suitable for deploying in cloud environments. |

---

##  Repository Structure

```sh
└── openai-demo/
    ├── mvnw
    ├── mvnw.cmd
    ├── pom.xml
    └── src
        ├── main
        └── test
```

---

##  Modules

<details closed><summary>.</summary>

| File                                                                          | Summary                                                                                                                                                                                                 |
| ---                                                                           | ---                                                                                                                                                                                                     |
| [mvnw](https://github.com/rahul-ojha-07/openai-demo/blob/master/mvnw)         | Enables automated Maven setup and runs projects, ensuring dependencies are successfully downloaded and facilitating consistent project configurations by leveraging a centralized Maven wrapper.        |
| [mvnw.cmd](https://github.com/rahul-ojha-07/openai-demo/blob/master/mvnw.cmd) | Defines Maven Wrapper startup, configures Java environment, locates project base directory, downloads Maven Wrapper if missing, validates its SHA-256 sum, and launches Maven with specified arguments. |

</details>

<details closed><summary>src.test.java.com.example.openaidemo</summary>

| File                                                                                                                                                             | Summary                                                                           |
| ---                                                                                                                                                              | ---                                                                               |
| [OpenaiDemoApplicationTests.java](https://github.com/rahul-ojha-07/openai-demo/blob/master/src/test/java/com/example/openaidemo/OpenaiDemoApplicationTests.java) | Verifies Spring Boot application context loading in the `openai-demo` repository. |

</details>

<details closed><summary>src.main.java.com.example.openaidemo</summary>

| File                                                                                                                                                   | Summary                                                                                                                        |
| ---                                                                                                                                                    | ---                                                                                                                            |
| [OpenaiDemoApplication.java](https://github.com/rahul-ojha-07/openai-demo/blob/master/src/main/java/com/example/openaidemo/OpenaiDemoApplication.java) | Enables Spring Boot application startup and configures a RestTemplate bean for API interactions in the openai-demo repository. |

</details>

<details closed><summary>src.main.java.com.example.openaidemo.controller</summary>

| File                                                                                                                                                                    | Summary                                                                                                                                               |
| ---                                                                                                                                                                     | ---                                                                                                                                                   |
| [ChatCompletionController.java](https://github.com/rahul-ojha-07/openai-demo/blob/master/src/main/java/com/example/openaidemo/controller/ChatCompletionController.java) | Handles chat completion requests by processing user input through the ChatCompletionService. Exposes a POST endpoint at /chat for client interaction. |

</details>

<details closed><summary>src.main.java.com.example.openaidemo.dto</summary>

| File                                                                                                                                                               | Summary                                                                                                                                                                                                                             |
| ---                                                                                                                                                                | ---                                                                                                                                                                                                                                 |
| [ChatCompletionRequestDTO.java](https://github.com/rahul-ojha-07/openai-demo/blob/master/src/main/java/com/example/openaidemo/dto/ChatCompletionRequestDTO.java)   | Defines a data transfer object for chat completion requests, specifying the model, message list, and save history flag. Incorporated with annotations for serialization and validation within the OpenAI Demo repository structure. |
| [MessageDTO.java](https://github.com/rahul-ojha-07/openai-demo/blob/master/src/main/java/com/example/openaidemo/dto/MessageDTO.java)                               | Defines DTO for message with role and content, using Swagger annotations. Encapsulates data for communication in the OpenAI demo projects architecture.                                                                             |
| [UsageDTO.java](https://github.com/rahul-ojha-07/openai-demo/blob/master/src/main/java/com/example/openaidemo/dto/UsageDTO.java)                                   | Defines a data transfer object to encapsulate usage details for the OpenAI demo. Includes fields for prompt tokens, completion tokens, and total tokens.                                                                            |
| [ChatCompletionResponseDTO.java](https://github.com/rahul-ojha-07/openai-demo/blob/master/src/main/java/com/example/openaidemo/dto/ChatCompletionResponseDTO.java) | Defines the data structure for chat completion responses with essential fields and nested structures, enhancing the repositorys communication capabilities with external systems while maintaining data integrity.                  |
| [ChoiceDTO.java](https://github.com/rahul-ojha-07/openai-demo/blob/master/src/main/java/com/example/openaidemo/dto/ChoiceDTO.java)                                 | Defines DTO class for choice data, containing index, message, logprobs, and finish reason fields. Follows the builder pattern and utilizes Lombok annotations for concise code in the openai-demo repositorys DTO package.          |

</details>

<details closed><summary>src.main.java.com.example.openaidemo.service</summary>

| File                                                                                                                                                           | Summary                                                                                                                                                                                                                                                                          |
| ---                                                                                                                                                            | ---                                                                                                                                                                                                                                                                              |
| [ChatCompletionService.java](https://github.com/rahul-ojha-07/openai-demo/blob/master/src/main/java/com/example/openaidemo/service/ChatCompletionService.java) | Implements chat completion service handling requests, saving message history, and processing responses via the OpenAI API. Manages HTTP headers, endpoint configurations, and error logging. Key features include request processing, history management, and response handling. |

</details>

<details closed><summary>src.main.resources</summary>

| File                                                                                                             | Summary                                                                                                                              |
| ---                                                                                                              | ---                                                                                                                                  |
| [application.yaml](https://github.com/rahul-ojha-07/openai-demo/blob/master/src/main/resources/application.yaml) | Defines application and OpenAI API configurations for the openai-demo project in the application.yaml file under src/main/resources. |

</details>

---

##  Getting Started

**System Requirements:**

* **Java**: `version 17`

###  Installation

<h4>From <code>source</code></h4>

> 1. Clone the openai-demo repository:
>
> ```console
> $ git clone https://github.com/rahul-ojha-07/openai-demo
> ```
>
> 2. Change to the project directory:
> ```console
> $ cd openai-demo
> ```
>
> 3. Install the dependencies:
> ```console
> $ mvn clean install
> ```

###  Usage

<h4>From <code>source</code></h4>

> Run openai-demo using the command below:
> ```console
> $ java -jar target/openai-demo.jar
> ```

###  Tests

> Run the test suite using the command below:
> ```console
> $ mvn test
> ```

---

##  Contributing

Contributions are welcome! Here are several ways you can contribute:

- **[Report Issues](https://github.com/rahul-ojha-07/openai-demo/issues)**: Submit bugs found or log feature requests for the `openai-demo` project.
- **[Submit Pull Requests](https://github.com/rahul-ojha-07/openai-demo/blob/main/CONTRIBUTING.md)**: Review open PRs, and submit your own PRs.
- 
<details closed>
<summary>Contributing Guidelines</summary>

1. **Fork the Repository**: Start by forking the project repository to your github account.
2. **Clone Locally**: Clone the forked repository to your local machine using a git client.
   ```sh
   git clone https://github.com/rahul-ojha-07/openai-demo
   ```
3. **Create a New Branch**: Always work on a new branch, giving it a descriptive name.
   ```sh
   git checkout -b new-feature-x
   ```
4. **Make Your Changes**: Develop and test your changes locally.
5. **Commit Your Changes**: Commit with a clear message describing your updates.
   ```sh
   git commit -m 'Implemented new feature x.'
   ```
6. **Push to github**: Push the changes to your forked repository.
   ```sh
   git push origin new-feature-x
   ```
7. **Submit a Pull Request**: Create a PR against the original project repository. Clearly describe the changes and their motivations.
8. **Review**: Once your PR is reviewed and approved, it will be merged into the main branch. Congratulations on your contribution!
</details>

<details closed>
<summary>Contributor Graph</summary>
<br>
<p align="center">
   <a href="https://github.com{/rahul-ojha-07/openai-demo/}graphs/contributors">
      <img src="https://contrib.rocks/image?repo=rahul-ojha-07/openai-demo">
   </a>
</p>
</details>

---

[**Return**](#-overview)

---
