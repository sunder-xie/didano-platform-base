package cn.didano.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.didano.base.dao.Hand_MailList_listMapper;
import cn.didano.base.model.Hand_parent4mailList;
import cn.didano.base.model.Hand_staff4MailList;
import cn.didano.base.model.Hand_student4MailList;
import cn.didano.base.model.Hand_student4MailListHasParent;
import cn.didano.base.model.Tb_deleteParentDate;
import cn.didano.base.model.Hand_mailList_list;
import cn.didano.base.model.Tb_relation;
import cn.didano.base.model.Tb_staff4List;
import cn.didano.base.model.Tb_staff4MailList;
import cn.didano.base.model.Tb_staffData;
import cn.didano.base.model.Tb_student;
import cn.didano.base.model.Tb_studentData;
@Service
public class MailListService {

	@Autowired
	private Hand_MailList_listMapper mailList_listMapper;
	
	/**
	 * 通过员工id查询该班级
	 */
	public Tb_staffData findClassIdBySid(Integer id){
		return mailList_listMapper.findClassIdBySid(id);
	}
	/**
	 * 通过家长id删除家长
	 */
	public int deleteparentByid(Tb_deleteParentDate date){
		return mailList_listMapper.deleteparentByid(date);
	}
	/**
	 * 通过家长id查询家长
	 */
	public Hand_parent4mailList findParentByPid(Integer id){
		return mailList_listMapper.findParentByPid(id);
	}
	/**
	 *  查询学校
	 */
	public Tb_staff4MailList selectSchoolBystaffId(Integer id){
		return mailList_listMapper.selectSchoolBystaffId(id);
	}
	/**
	 * 查询
	 */
	public Tb_staff4MailList findbystaffbyid(Integer id){
		return mailList_listMapper.findBystaffbyId(id);
	}
	
	/**
	 * 通过小朋友id删除父母信息
	 */
	public int deleteparent(Integer id){
		return mailList_listMapper.deleteparent(id);
	}
	/**
	 * 通过关系id查询关系名称
	 */
	public Tb_relation findrealtionById(byte id){
		return mailList_listMapper.findrelationById(id);
	}
	/**
	 * 查询家长关系
	 * 
	 */
	public List<Tb_relation> findrelation(){
		return mailList_listMapper.findrelation();
	}
	/**
	 * 通过名字查询小朋友
	 */
	public List<Hand_mailList_list> findByname(Tb_studentData data){
		return mailList_listMapper.findByName(data);
	}
	/**
	 * 通过名字班级查询小朋友
	 */
	public List<Hand_mailList_list> findBynameClass(Tb_studentData data){
		return mailList_listMapper.findByNameClass(data);
	}
	/**
	 * 通过学校查询所有老师
	 */
	public List<Hand_staff4MailList> findteacherByschool(Integer id){
		return mailList_listMapper.findteacherByschool(id);
	}
	/**
	 * 通过学校查学生
	 */
	public List<Hand_student4MailList> findStudentByschool(Integer id){
		return mailList_listMapper.findStudentByschool(id);
	}
	/**
	 * 通过学生的ic_number进行查询学生的信息
	 * 杨
	 */
	public Tb_student findStudentByIcNumber(Tb_student tb_student){
		return mailList_listMapper.findStudentByIcNumber(tb_student);
	}
	
	/**
	 * 通过该家长的ic_number进行查询家长的信息
	 * 杨
	 */
	public Hand_student4MailListHasParent findParentByIcNumber(Tb_student tb_student){
		return mailList_listMapper.findParentByIcNumber(tb_student);
	}
	/**
	 * 通过学校查询
	 */
	public List<Hand_mailList_list> findBySchool(Integer id){
		return mailList_listMapper.findByschool(id);
	}
	/**
	 * 编辑老师
	 */
	public int UpdateTeacher(Hand_staff4MailList teacher){
		return mailList_listMapper.UpdateTeacher(teacher);
	}
	/**
	 * 通过班级查询该班的老师
	 */
	public List<Hand_staff4MailList> findTeacherByClass(Integer id){
		return mailList_listMapper.findTeacherByClass(id);
	}
	/**
	 * 通过名字班级查询该班的老师
	 */
	public List<Tb_staff4List> findTeacherByNameClass(Tb_staffData data2){
		return mailList_listMapper.findTeacherByNameClass(data2);
	}
	/**
	 * 通过班级查询该班的所有小朋友
	 */
	public List<Hand_mailList_list> findByClass(Integer id){
		return mailList_listMapper.findByClass(id);
	}
	/**
	 * 通过小朋友id编辑父母信息
	 */
	public int UpdateParent(Hand_parent4mailList parent){
		return mailList_listMapper.UpdateParent(parent);
	}
	/**
	 * 通过小朋友id删除其以及其父母信息
	 */
	public int delete(Integer id){
		return mailList_listMapper.delete(id);
	}
	/**
	 * 通过小朋友id查找其所有父母联系方式
	 */
	public List<Hand_parent4mailList> findparent(Integer id){
		return mailList_listMapper.findParentById(id);
	}
	/**
	 * 通过小朋友id查找其所有父母联系方式
	 */
	public List<Hand_parent4mailList> findParentByStudentId(Integer id){
		return mailList_listMapper.findParentByStudentId(id);
	}
	
	
	/**
	 * 编辑小朋友信息
	 */
	public int Update(Hand_mailList_list list){
		return mailList_listMapper.Update(list);
	}
	/**
	 * 通过学生id查询小朋友及其家长信息
	 */
	public Hand_mailList_list findById(Integer id){
		return mailList_listMapper.findById(id);
	}
	/**
	 * 通过老师id查询该班上所有学生及其家长信息
	 * @param id
	 * @return
	 */
	public List<Hand_mailList_list> findByTeacher(Integer id){
		return mailList_listMapper.findByTeacher(id);
	}
	
	/**
	 * 查询所有孩子及其家长信息
	 */
	public List<Hand_mailList_list> findAll(){
		return mailList_listMapper.findAll();
	}
}
