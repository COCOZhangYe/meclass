package com.zy.meclass.dao;

import com.zy.meclass.entity.Video;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface VideoDao {

    //添加视频
    public int addVideo(Video video);
    //删除视频
    public int deleteVideo(@Param("videoId") Integer videoId);
    //查询所有视频
    public List<Video> searchAllVideo();
    //根据名字查询视频
    public Video getVideoByTitle(@Param("videoTitle") String videoTitle);
    //根据id查询视频
    public Video getVideoById(@Param("videoId") Integer videoId);
    //修改playCount
    public int updateVideo(Video video);
}
