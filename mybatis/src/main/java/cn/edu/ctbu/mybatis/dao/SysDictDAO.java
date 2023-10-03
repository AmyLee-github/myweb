package cn.edu.ctbu.mybatis.dao;

import cn.edu.ctbu.mybatis.domain.SysDictDO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SysDictDAO {

    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "name",column = "name"),
            @Result(property = "value",column = "value"),
            @Result(property = "type",column = "type"),
            @Result(property = "description",column = "description")
    })

    @Select("SELECT * FROM sys_dict WHERE id=#{id}")
    public List<SysDictDO> get(int id);

    @Insert("INSERT into sys_dict(name,value)values(#{name},#{value})")
    public void save(SysDictDO sysDictDO);

    public List<SysDictDO> listType();
}
