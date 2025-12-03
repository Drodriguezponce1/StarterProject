package proxies;

import model.Comment;
// service to send an email confirming a published comment
public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}
