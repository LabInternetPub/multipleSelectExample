package cat.tecnocampus.multipleselection;

import java.util.List;

public class Document {
    private String content;
    private List<Tag> tags;
    private List<Reviewer> reviewers;

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

    public List<Reviewer> getReviewers() {
        return reviewers;
    }

    public void setReviewers(List<Reviewer> reviewers) {
        this.reviewers = reviewers;
    }
}
