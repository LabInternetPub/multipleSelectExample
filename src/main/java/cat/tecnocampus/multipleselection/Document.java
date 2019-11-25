package cat.tecnocampus.multipleselection;

import java.util.List;

public class Document {
    private String content;
    private List<String> tags;

    public Document() {
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getContent() {
        return content;
    }

    public List<String> getTags() {
        return tags;
    }
}
