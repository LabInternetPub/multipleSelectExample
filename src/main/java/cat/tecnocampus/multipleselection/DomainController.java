package cat.tecnocampus.multipleselection;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class DomainController {
    private List<Tag> tags;
    private List<Document> documents;

    public DomainController() {

        String[] arrayTags = {"one", "two", "three", "four", "five"};
        tags = Arrays.stream(arrayTags).map(n -> new Tag(n)).collect(Collectors.toList());

        List<Reviwer> reviwers = new ArrayList<>();
        reviwers.add(new Reviwer("Josep", "Pepe"));
        reviwers.add(new Reviwer("Natalia", "Lopez"));
        reviwers.add(new Reviwer("Maria", "Josefa"));

        Document document = new Document();
        document.setContent("Hard-coded document");
        document.setReviwers(reviwers);

        document.setTags(tags.subList(0,3));
        documents = new ArrayList<>();
        documents.add(document);
    }

    public void setTag (Tag tag) {
        this.tags.add(tag);
    }

    public void setDocument(Document document) {
        documents.add(document);
    }

    public List<Tag> getTags() {
        return tags;
    }

    public List<Document> getDocuments() {
        return documents;
    }
}
