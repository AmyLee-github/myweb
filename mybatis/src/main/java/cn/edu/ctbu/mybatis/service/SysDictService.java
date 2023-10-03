package cn.edu.ctbu.mybatis.service;

import cn.edu.ctbu.mybatis.dao.SysDictDAO;
import cn.edu.ctbu.mybatis.domain.SysDictDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SysDictService {

    @Autowired
    SysDictDAO sysDictDAO;

    public SysDictDO getById(int id){

        List<SysDictDO> sysDicts=sysDictDAO.get(id);
        if(sysDicts.size()>0)
            return sysDicts.get(0);
        else
            return null;

    }

    public void save(String name,String value){
        SysDictDO sysDict=new SysDictDO();
        sysDict.setName(name);
        sysDict.setValue(value);

        sysDictDAO.save(sysDict);
    }
    public List<SysDictDO> listType(){
        return sysDictDAO.listType();
    }
}
