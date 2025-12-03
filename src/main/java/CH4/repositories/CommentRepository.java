package CH4.repositories;

import CH4.model.Comment;
// stores the comments
public interface CommentRepository {

    void storeComment(Comment comment);
}
