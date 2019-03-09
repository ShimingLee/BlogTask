package pri.simon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pri.simon.bean.Comment;
import pri.simon.bean.CommentExample;
import pri.simon.dao.CommentMapper;
import pri.simon.service.CommentService;

import java.util.List;

@Service("commentService")
public class CommentServiceImp implements CommentService {
    @Autowired
    private CommentMapper commentMapper;

    @Override
    public int deleteByPrimaryKey(Integer tagId) {
        int flag = commentMapper.deleteByPrimaryKey(tagId);
        return flag;
    }

    @Override
    public int insertComment(Comment record) {
        int flag = commentMapper.insert(record);
        return flag;
    }

    @Override
    public Comment selectByPrimaryKey(Integer tagId) {
        Comment comment = commentMapper.selectByPrimaryKey(tagId);
        return comment;
    }

    @Override
    public int updateByPrimaryKeySelective(Comment record) {
        int flag = commentMapper.updateByPrimaryKeySelective(record);
        return flag;
    }

    @Override
    public int updateByPrimaryKey(Comment record) {
        int flag = commentMapper.updateByPrimaryKey(record);
        return flag;
    }

    @Override
    public List<Comment> selectByExample(CommentExample commentExample) {
        List<Comment> comments=commentMapper.selectByExample(commentExample);
        return comments;
    }
}
