./gradlew build

docker build -t adron/hasura-spring-boot-graphql .
docker run -p 8081:8080 adron/hasura-spring-boot-graphql



# docker container rm adron/hasura-spring-boot-graphql
# docker image rm adron/hasura-spring-boot-graphql -f

