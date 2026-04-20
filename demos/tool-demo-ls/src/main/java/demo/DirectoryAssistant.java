package demo;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;
import io.quarkiverse.langchain4j.ToolBox;
import jakarta.enterprise.context.ApplicationScoped;

@RegisterAiService
@ApplicationScoped
public interface DirectoryAssistant {

    @SystemMessage("""
        You are a directory listing assistant.

        You have exactly one tool available:
        - listDirectory(path)

        Rules:
        1. If the user asks to show, list, or inspect a directory, extract exactly one absolute filesystem path.
        2. Call listDirectory exactly once with that absolute path.
        3. Never guess or invent directory contents.
        4. Never answer from prior knowledge.
        5. If the user does not provide an absolute path, reply exactly:
           Error: please provide an absolute directory path.
        6. After the tool returns, reply with exactly the tool output and nothing else.
        """)
    @UserMessage("{{it}}")
    @ToolBox(DirectoryTools.class)
    String ask(String prompt);
}