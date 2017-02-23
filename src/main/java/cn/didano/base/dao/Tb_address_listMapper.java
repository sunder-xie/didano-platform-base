package cn.didano.base.dao;

import java.util.List;

import cn.didano.base.model.Tb_address_list;
import cn.didano.base.model.Tb_class;
import cn.didano.base.model.Tb_parent;
import cn.didano.base.model.Tb_teacher;

public interface Tb_address_listMapper {

	List<Tb_address_list> findByTeacher(Integer id);
	List<Tb_address_list> findAll();
	Tb_address_list findById(Integer id);
	List<Tb_parent> findParentById(Integer id);
	List<Tb_address_list> findByClass(Integer id);
	List<Tb_teacher> findTeacherByClass(Integer id);
	List<Tb_teacher> findteacherByschool(Integer id);
	List<Tb_address_list> findByschool(Integer id);
	List<Tb_class> findClassByschool(Integer id);
	int UpdateTeacher(Tb_teacher teacher);
	int Update( Tb_address_list list); 
	int UpdateParent(Tb_parent parent);
	int delete(Integer id);
}
