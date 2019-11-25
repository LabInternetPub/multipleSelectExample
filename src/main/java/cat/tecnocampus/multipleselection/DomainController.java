package cat.tecnocampus.multipleselection;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DomainController {
    private List<String> tags;
    private List<Document> documents;

    public DomainController() {
        tags = Arrays.asList("one", "two", "three", "four", "five");

        Document document = new Document();
        document.setContent("First document");
        document.setTags(Arrays.asList("one", "two"));
        documents = new ArrayList<>();
        documents.add(document);
        System.out.println("tags: " + document.getTags());
    }

    public void setTag (String tag) {
        this.tags.add(tag);
    }

    public void setDocument(Document document) {
        documents.add(document);
    }

    public List<String> getTags() {
        return tags;
    }

    public List<Document> getDocuments() {
        return documents;
    }
}
