package cn.edu.ctbu.mybatis.domain;

import lombok.Data;

@Data
public class SysDictDO {
    /**
     * id，主键，自增
     */
    private Long id;
    /**
     * name，名称
     * */
    private String name;
    /**
     * value，值
     * */
    private String value;
    /**
     * type，类型
     * */
    private String type;
    /**
     * description，描述
     * */
    private String description;
}
