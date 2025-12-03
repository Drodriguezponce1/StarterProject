package CH4.main;

import CH4.proxies.CommentNotificationProxy;
import CH4.proxies.EmailCommentNotificationProxy;
import CH4.repositories.CommentRepository;
import CH4.repositories.DBCommentRepository;
import CH4.model.Comment;
import CH4.services.CommentService;

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
