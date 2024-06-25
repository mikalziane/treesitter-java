# Treesitter in Java for Java unsing Tree Sitter NG

## Links
### Tree-Sitter
https://tree-sitter.github.io/tree-sitter/

### Tree Sitter NG
https://github.com/bonede/tree-sitter-ng?tab=readme-ov-file

## Getting Started
### Gradle Dependencies
```kts
dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("io.github.bonede:tree-sitter:0.22.6")
    implementation("io.github.bonede:tree-sitter-json:0.21.0a")
}
### Simplest Json Parser example from Tree Sitter NG with the imports added
```java
import org.treesitter.TSLanguage;
import org.treesitter.TSNode;
import org.treesitter.TSParser;
import org.treesitter.TreeSitterJson;
import org.treesitter.TSTree;

public class Main {
    public static void main(String[] args) {
        TSParser parser = new TSParser();
        TSLanguage json = new TreeSitterJson();
        parser.setLanguage(json);
        TSTree tree = parser.parseString(null, "[1, null]");
        TSNode rootNode = tree.getRootNode();
        TSNode arrayNode = rootNode.getNamedChild(0);
        TSNode numberNode = arrayNode.getNamedChild(0);
    }
}
```



