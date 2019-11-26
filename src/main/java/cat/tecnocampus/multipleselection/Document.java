package cat.tecnocampus.multipleselection;

import java.util.List;
import java.util.stream.Collectors;

public class Document {
    private String content;
    private List<Tag> tags;

    public Document() {
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public String getContent() {
        return content;
    }

    public List<Tag> getTags() {
        return tags;
    }
}
