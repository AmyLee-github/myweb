package cn.edu.ctbu.seccontroller.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
* 这是用于显示学生信息的值对象
* */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentVo {
    private Integer sno;
    private String name;
    private Integer age;

}
