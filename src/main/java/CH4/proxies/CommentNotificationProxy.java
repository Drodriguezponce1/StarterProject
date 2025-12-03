package CH4.proxies;

import CH4.model.Comment;
// service to send an email confirming a published comment
public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}
