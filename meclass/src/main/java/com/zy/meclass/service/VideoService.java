package com.zy.meclass.service;

import com.zy.meclass.entity.Video;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VideoService {
    //添加视频
    public int addVideo(Video video);
    //删除视频
    public int deleteVideo(@Param("videoTitle") String videoTitle);
    //查询所有视频
    public List<Video> searchAllVideo();
    //根据id查询视频
    public   Video getVideoByTitle(@Param("videoTitle") String videoTitle);
}