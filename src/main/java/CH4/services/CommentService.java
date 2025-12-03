package CH4.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import CH4.proxies.CommentNotificationProxy;
import CH4.repositories.CommentRepository;
import CH4.model.Comment;
//serves as a service to publish a comment

@Service
public class CommentService {


    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    @Autowired
    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        this.commentRepository.storeComment(comment);
        this.commentNotificationProxy.sendComment(comment);
    }
}
