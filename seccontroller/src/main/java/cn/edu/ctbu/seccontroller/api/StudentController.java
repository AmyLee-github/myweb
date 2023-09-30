package cn.edu.ctbu.seccontroller.api;

import cn.edu.ctbu.seccontroller.core.domain.AjaxResult;
import cn.edu.ctbu.seccontroller.vo.StudentVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/student")
@Tag(name="学生信息")
public class StudentController {
    //Mock data - replace with database queries later
    private static final List<StudentVo> students=new ArrayList<>(Arrays.asList(
            new StudentVo(1,"Alice",20),
            new StudentVo(2,"Bob",21),
            new StudentVo(3,"Charlie",22)
    ));
    //Get /StudentVos - get all students
    @GetMapping("")
    @Operation(summary = "取所有的学生信息")
    public AjaxResult getAllStudents(){
        return AjaxResult.success(students);
    }
    //GET /StudentVos/{id} - get a student by id
    @GetMapping("/{sno}")
    @Operation(summary = "取单个的学生信息")
    public AjaxResult getStudentBySno(@PathVariable Integer sno){
        for(StudentVo s:students){
            if(s.getSno()==sno){
                return AjaxResult.success(s);
            }
        }
        return AjaxResult.error("没有找到对应的学生！"); // Return null if student not found
    }
    // POST /students - create a new student
    @PostMapping("")
    @Operation(summary = "添加学生信息")
    public AjaxResult createStudent(StudentVo student){
        students.add(student);
        return AjaxResult.success(); // 或者根据需要返回其他消息
    }

    //PUT /students/{sno} - update an existing student
    @PutMapping("/{sno}")
    @Operation(summary = "更新学生信息")
    public AjaxResult updateStudent(@PathVariable Integer sno, StudentVo updateStudent){
        for(int i=0;i<students.size();i++){
            if(students.get(i).getSno()==sno){
                students.set(i,updateStudent);
                return AjaxResult.success(); // 或者根据需要返回其他消息
            }
        }
        return AjaxResult.error("没有找到对应的学生！"); // 或者返回适当的异常
    }
    // DELETE /students/{sno} - delete a student by id
    @DeleteMapping("/{sno}")
    @Operation(summary = "删除学生信息")
    public AjaxResult deleteStudentById(@PathVariable Integer sno){
        for(int i=0;i<students.size();i++){
            if(students.get(i).getSno()==sno){
                students.remove(i);
                return AjaxResult.success(); // 或者根据需要返回其他消息
            }
        }
        return AjaxResult.error("没有找到对应的学生！"); // 或者返回适当的异常
    }

}
