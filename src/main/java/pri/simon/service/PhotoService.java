package pri.simon.service;

import org.springframework.stereotype.Service;
import pri.simon.bean.Photo;

import java.util.List;

@Service("photoService")
public interface PhotoService {
    int insertPhoto(Photo photo);

    int deleteByPrimaryKey(Integer photoid);

    Photo selectByPrimaryKey(Integer photoId);

    List<Photo> selectAllPhoto();

    int updateByPrimaryKey(Photo record);
}
