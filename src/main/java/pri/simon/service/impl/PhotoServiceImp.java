package pri.simon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pri.simon.bean.Photo;
import pri.simon.dao.PhotoMapper;
import pri.simon.service.PhotoService;

import java.util.List;

@Service("photoService")
public class PhotoServiceImp implements PhotoService {
    @Autowired
    private PhotoMapper photoMapper;

    @Override
    public int insertPhoto(Photo photo) {
        int flag = photoMapper.insert(photo);
        return flag;
    }

    @Override
    public int deleteByPrimaryKey(Integer photoid) {
        int flag = photoMapper.deleteByPrimaryKey(photoid);
        return flag;
    }

    @Override
    public Photo selectByPrimaryKey(Integer photoId) {
        Photo photo = photoMapper.selectByPrimaryKey(photoId);
        return photo;
    }


    @Override
    public List<Photo> selectAllPhoto() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(Photo record) {
        int flag = photoMapper.updateByPrimaryKey(record);
        return flag;
    }
}
