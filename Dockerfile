# base image - an image with openjdk 17
FROM openjdk:17

# working directory inside docker image
WORKDIR /home/sd

# copy the jar created by assembly to the docker image
COPY target/*jar-with-dependencies.jar sd2223.jar

# run Discovery when starting the docker image
CMD ["java", "-cp", "/home/sd/sd2223.jar", "sd2223.aula9.mastodon.CreatePost", "/test-dir-sd2223"]
