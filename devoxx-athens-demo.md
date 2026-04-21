sdk use java 25.0.2-open

sdk use tornadovm 4.0.0-jdk25-ptx

origin: orion, branch: feat/tool-calling
cd ~/GPULlama3.java && ./mvnw clean install -DskipTests -q

origin: orion, branch: feat/tool-calling
cd ~/quarkus-langchain4j && mvn install -pl model-providers/gpu-llama3/runtime,model-providers/gpu-llama3/deployment -am -DskipTests -q

origin: beehive, branch : feat/tool-calling-demos
cd ~/quarkus-langchain4j/samples/weather-agent && mvn quarkus:dev
cd ~/Quarkus-Langchain4j-GPULlama3-Demos/demos/tool-demo-ls && mvn quarkus:dev -Dquarkus.args="Show me what is inside /home/orion/Desktop"
cd ~/Quarkus-Langchain4j-GPULlama3-Demos/demos/java-coder-demo && mvn quarkus:dev -Dquarkus.args="A HelloWorld Java program"
cd ~/Quarkus-Langchain4j-GPULlama3-Demos/demos/java-coder-demo && mvn quarkus:dev -Dquarkus.args="write a matmul in java"
cd ~/Quarkus-Langchain4j-GPULlama3-Demos/demos/java-coder-iterative && mvn quarkus:dev -Dquarkus.args="write a matmul in java"