package repositories;

import model.Comment;
// stores the comments
public interface CommentRepository {

    void storeComment(Comment comment);
}
