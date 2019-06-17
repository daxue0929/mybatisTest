package mapper;

import entity.Comment;

public interface CommentMapper {
    public Comment selectOneById(int commentId);
}
