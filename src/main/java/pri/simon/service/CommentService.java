package pri.simon.service;

import pri.simon.bean.Comment;
import pri.simon.bean.CommentExample;

import java.util.List;

public interface CommentService {
    int deleteByPrimaryKey(Integer tagId);

    int insertComment(Comment record);

    Comment selectByPrimaryKey(Integer tagId);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);

    List<Comment> selectByExample(CommentExample commentExample);
}
