package cn.edu.ctbu.mybatis.service;

import cn.edu.ctbu.mybatis.domain.SysDictDO;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class SysDictServiceTest {

    @Autowired
    SysDictService sysDictService;

    @Test
    public void getById(){
        SysDictDO sysDictDO=sysDictService.getById(1);
        System.out.println(sysDictDO);
    }

    @Test
    public void save(){
        sysDictService.save("王五","3");
    }

    @Test
    public void listType(){
        List<SysDictDO> sysDictDOS=sysDictService.listType();

        System.out.println(sysDictDOS);
    }
}