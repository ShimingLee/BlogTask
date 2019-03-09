package pri.simon.bean;

import java.util.Date;

public class Comment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.comment_id
     *
     * @mbg.generated
     */
    private Integer commentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.article_id
     *
     * @mbg.generated
     */
    private Integer articleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.comment_date
     *
     * @mbg.generated
     */
    private Date commentDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.comment_user
     *
     * @mbg.generated
     */
    private String commentUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.to_whitch_id
     *
     * @mbg.generated
     */
    private Integer toWhitchId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.comment_text
     *
     * @mbg.generated
     */
    private String commentText;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.comment_id
     *
     * @return the value of comment.comment_id
     *
     * @mbg.generated
     */
    public Integer getCommentId() {
        return commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.comment_id
     *
     * @param commentId the value for comment.comment_id
     *
     * @mbg.generated
     */
    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.user_id
     *
     * @return the value of comment.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.user_id
     *
     * @param userId the value for comment.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.article_id
     *
     * @return the value of comment.article_id
     *
     * @mbg.generated
     */
    public Integer getArticleId() {
        return articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.article_id
     *
     * @param articleId the value for comment.article_id
     *
     * @mbg.generated
     */
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.comment_date
     *
     * @return the value of comment.comment_date
     *
     * @mbg.generated
     */
    public Date getCommentDate() {
        return commentDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.comment_date
     *
     * @param commentDate the value for comment.comment_date
     *
     * @mbg.generated
     */
    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.comment_user
     *
     * @return the value of comment.comment_user
     *
     * @mbg.generated
     */
    public String getCommentUser() {
        return commentUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.comment_user
     *
     * @param commentUser the value for comment.comment_user
     *
     * @mbg.generated
     */
    public void setCommentUser(String commentUser) {
        this.commentUser = commentUser == null ? null : commentUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.to_whitch_id
     *
     * @return the value of comment.to_whitch_id
     *
     * @mbg.generated
     */
    public Integer getToWhitchId() {
        return toWhitchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.to_whitch_id
     *
     * @param toWhitchId the value for comment.to_whitch_id
     *
     * @mbg.generated
     */
    public void setToWhitchId(Integer toWhitchId) {
        this.toWhitchId = toWhitchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.comment_text
     *
     * @return the value of comment.comment_text
     *
     * @mbg.generated
     */
    public String getCommentText() {
        return commentText;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.comment_text
     *
     * @param commentText the value for comment.comment_text
     *
     * @mbg.generated
     */
    public void setCommentText(String commentText) {
        this.commentText = commentText == null ? null : commentText.trim();
    }
}