package cat.tecnocampus.multipleselection;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class WebController {

    private DomainController domainController;

    public WebController(DomainController domainController) {
        this.domainController = domainController;
    }

    @GetMapping("/newdocument")
    public String createDocument(Model model) {
        model.addAttribute("document", new Document());
        model.addAttribute("tags", domainController.getTags());
        return "documentForm";
    }

    @PostMapping("/newdocument")
    public String postCreateDocument(Document document) {
        domainController.setDocument(document);
        return "redirect:listdocuments";
    }

    @GetMapping("/listdocuments")
    public String listdocuments(Model model) {
        model.addAttribute("documents", domainController.getDocuments());
        return "listdocuments";
    }
}
