package main;

import config.ProjectConfiguration;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var comment = new Comment("YNNAD", "This world i love to live in");
        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
