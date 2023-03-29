# hasura-spring-boot-graphql

A repository for use with the [hasura-quick-start](https://github.com/Adron/hasura-quick-start) repository to show how to integrate Hasura for use with a Spring Boot based GraphQL API.

## Setup & Deploy This Repo Locally

NOTE: This is done after you've cloned the [hasura-quick-start repository](https://github.com/Adron/hasura-quick-start) and launched that environment once. Follow these steps to add this GraphQL API and deploy it alongside the Hasura GraphQL API.

### Reference Material

Dockerfile documentation for Spring Boot: https://spring.io/guides/topicals/spring-boot-docker/

### Errors & Troubleshooting

Some of the things that came up during the development of this repo and its integration with Hasura include the following. I've provided links to references and resolutions in addition to descriptions of the problem.

Docker Build Error - "=> ERROR [internal] load metadata for docker.io/library/eclipse-temurin:17-jdk-alpine"

Using the answer here, to turn off the buildkit resolved this issue.

https://stackoverflow.com/questions/73812700/docker-error-internal-load-metadata-for-docker-io

