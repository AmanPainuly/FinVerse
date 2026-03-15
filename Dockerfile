FROM openJDK:21
ADD target/finverse.jar finverse.jar
ENTRYPOINT [ "java", "-jar", "finverse.jar" ]