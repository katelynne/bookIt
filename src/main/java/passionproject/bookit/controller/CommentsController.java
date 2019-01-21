package passionproject.bookit.controller;

import org.springframework.web.bind.annotation.RestController;
import passionproject.bookit.repository.CommentsRepository;

@RestController
public class CommentsController {

    private CommentsRepository commentsRepository;

    public CommentsController(CommentsRepository commentsRepository) {
        this.commentsRepository = commentsRepository;
    }
}
