package cn.didano.base.json;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 新建
 * 比Vd_channel小
 * @author stephen
 * Created on 2016年12月20日 下午12:52:27 
 */
@ApiModel
public class In_Channel_Search {
	@ApiModelProperty(value = "频道名称",required=false)
	private String name;
	@ApiModelProperty(value = "频道英文名称，用来对应oss路径",required=false)
	private String enName;
	@ApiModelProperty(value = "类型 0/1，监控/直播",required=false)
	private Integer type;
	@ApiModelProperty(value = "学校ID",required=false)
	private Integer schoolId;
	@ApiModelProperty(value = "班级ID，ID=0表明是公共场所",required=false)
	private Integer classId;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEnName() {
		return enName;
	}

	public void setEnName(String enName) {
		this.enName = enName;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	@Override
	public String toString() {
		return "In_Channel_Search [name=" + name + ", enName=" + enName + ", type=" + type + ", schoolId=" + schoolId
				+ ", classId=" + classId + "]";
	}
}
