# hasura-spring-boot-graphql

A repository for use with the [hasura-quick-start](https://github.com/Adron/hasura-quick-start) repository to show how to integrate Hasura for use with a Spring Boot based GraphQL API.

## Setup & Deploy This Repo Locally

NOTE: This is done after you've cloned the [hasura-quick-start repository](https://github.com/Adron/hasura-quick-start) and launched that environment once. Follow these steps to add this GraphQL API and deploy it alongside the Hasura GraphQL API.

Run the following commands (also in the build.sh script but included here for Windows users)

1. Execute `./gradlew build` to get the jar file build. It will then be located in the build/libs directory.
2. Execute `docker build -t adron/hasura-spring-boot-graphql .` to build the docker image locally.
3. To use the image and start a container with the app, run `docker run -p 8080:8080 adron/hasura-spring-boot-graphql`.


### Reference Material

Dockerfile documentation for Spring Boot: https://spring.io/guides/topicals/spring-boot-docker/

### Errors & Troubleshooting

Some of the things that came up during the development of this repo and its integration with Hasura include the following. I've provided links to references and resolutions in addition to descriptions of the problem.

Docker Build Error - "=> ERROR [internal] load metadata for docker.io/library/eclipse-temurin:17-jdk-alpine"

Using the answer here, to turn off the buildkit resolved this issue.

https://stackoverflow.com/questions/73812700/docker-error-internal-load-metadata-for-docker-io

An issue also exists for a Spring API running on localhost.

Referrer-Policy > https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy
