package cn.didano.base.model;

import java.util.Date;

/**
 * 教职工
 * 扩展签到时间和签退时间翻译
 * @author guitar
 *
 */
public class Tb_staff4MailList extends Tb_staff {
	private String in_time;
	private String out_time;
	private Integer class_id;
	private String title;

	public String getIn_time() {
		return in_time;
	}

	public void setIn_time(String in_time) {
		this.in_time = in_time;
	}

	public String getOut_time() {
		return out_time;
	}

	public void setOut_time(String out_time) {
		this.out_time = out_time;
	}

	public Integer getClass_id() {
		return class_id;
	}

	public void setClass_id(Integer class_id) {
		this.class_id = class_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
}