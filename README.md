![Jenkins](https://img.shields.io/badge/jenkins-%23D24939.svg?style=for-the-badge&logo=jenkins&logoColor=white)
![Groovy](https://img.shields.io/badge/groovy-%234298B8.svg?style=for-the-badge&logo=apachegroovy&logoColor=white)
![Gradle](https://img.shields.io/badge/gradle-%2302303A.svg?style=for-the-badge&logo=gradle&logoColor=white)

# Jenkins Shared Libraries Example

Jenkins Shared Library is a way to share code across multiple Jenkins pipelines or jobs. The shared library is a collection of reusable code that can be accessed from multiple pipelines, instead of duplicating code across multiple pipelines. The Shared Library can be stored in any Git repository, and Jenkins can load the library during pipeline execution.

The Jenkins Shared Library has the following basic structure:

```
jenkins-shared-library/
├── vars/
├── src/
├── resources/
└── README.md
```

Let's take a look at each of these folders:

- **vars/**: This folder contains the reusable functions or variables that can be called from your pipeline scripts. These functions are defined as global variables in your pipeline, and can be called from any pipeline script without importing them.
- **src/**: This folder is optional and is used to organize the actual code that is used by your pipeline scripts. This folder can contain code for building, testing, or deploying applications.
- **resources/**: This folder is also optional and is used to store files that are required by your pipeline scripts, such as configuration files, credentials, or artifacts.
- **README.md**: This file is used to provide documentation for the Shared Library.