package main;

import proxies.CommentNotificationProxy;
import proxies.EmailCommentNotificationProxy;
import repositories.CommentRepository;
import repositories.DBCommentRepository;
import model.Comment;
import services.CommentService;

public class Driver {

    public static void main(String[] args) {
        CommentRepository commentRepository = new DBCommentRepository();
        CommentNotificationProxy commentNotificationProxy = new EmailCommentNotificationProxy();

        CommentService commentService = new CommentService(commentRepository, commentNotificationProxy);
        // can also declare as: new CommentService(commentRepository, new EmailCommentNotificationProxy());

        Comment comment = new Comment("Daniel", "I love this world");

        commentService.publishComment(comment);
    }
}
