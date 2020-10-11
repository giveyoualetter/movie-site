package com.movie.dao.mapper;

import com.movie.model.MovieInfoDO;
import com.movie.model.MovieInfoDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MovieInfoDOMapper {
    int countByExample(MovieInfoDOExample example);

    int deleteByExample(MovieInfoDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MovieInfoDO record);

    int insertSelective(MovieInfoDO record);

    List<MovieInfoDO> selectByExampleWithBLOBs(MovieInfoDOExample example);

    List<MovieInfoDO> selectByExample(MovieInfoDOExample example);

    MovieInfoDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MovieInfoDO record, @Param("example") MovieInfoDOExample example);

    int updateByExampleWithBLOBs(@Param("record") MovieInfoDO record, @Param("example") MovieInfoDOExample example);

    int updateByExample(@Param("record") MovieInfoDO record, @Param("example") MovieInfoDOExample example);

    int updateByPrimaryKeySelective(MovieInfoDO record);

    int updateByPrimaryKeyWithBLOBs(MovieInfoDO record);

    int updateByPrimaryKey(MovieInfoDO record);
}