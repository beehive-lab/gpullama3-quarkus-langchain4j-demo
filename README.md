Summarization Service Quarkus application

inspired by : https://docs.quarkiverse.io/quarkus-langchain4j/dev/quickstart-summarization.html#

### Java
Install Java 25:
```aiignore
sdk use java 25.0.2-open
```

### Ollama
1) Install Ollama:
```bash
curl -fsSL https://ollama.com/install.sh | sh
ollama --version # ollama version is 0.19.0
```
2) Pull the model (Llama3.2, 1B, Q8_0):
``` bash
ollama pull llama3.2:1b-instruct-q8_0
```
3) Export Ollama local server URL:
```
export OLLAMA_API_BASE=http://127.0.0.1:11434
```
4) Setup Ollama local server: 
```bash
ollama serve llama3.2:1b-instruct-q8_0
```

### Quarkus-langchain4j
```bash
git clone https://github.com/quarkiverse/quarkus-langchain4j.git
cd ~/quarkus-langchain4j/model-providers/ollama
mvn clean install -DskipTests
```
### Build
Build all demos:
```bash
cd ~/Quarkus-Langchain4j-GPULlama3-Demos
mvn clean install
```

### Run:
Run chat-demo:
``` bash
java -jar demos/chat-demo/target/quarkus-app/quarkus-run.jar
```

Run streaming-demo (not tested):
``` bash
java -jar demos/streaming-demo/target/quarkus-app/quarkus-run.jar
```