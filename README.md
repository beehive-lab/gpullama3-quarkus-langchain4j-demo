Summarization Service Quarkus application

inspired by : https://docs.quarkiverse.io/quarkus-langchain4j/dev/quickstart-summarization.html#

### Environment
1) Java 21
```bash
sdk use java 21.0.2-open
```
2) TornadoVM
``` bash
sdk use tornadovm 2.2.0-opencl
```

### Build
Build all demos:
```bash
mvn clean install
```

### Run:
Run chat-demo:
``` bash
java @$TORNADOVM_HOME/tornado-argfile -jar demos/chat-demo/target/quarkus-app/quarkus-run.jar
```

Run streaming-demo:
``` bash
java @$TORNADOVM_HOME/tornado-argfile -jar demos/streaming-demo/target/quarkus-app/quarkus-run.jar
```