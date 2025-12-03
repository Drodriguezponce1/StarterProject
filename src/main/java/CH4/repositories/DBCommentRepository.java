package CH4.repositories;


import CH4.model.Comment;
import org.springframework.stereotype.Repository;

@Repository
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment to the DB ====> '" + comment.getText() + "'");
    }
}
