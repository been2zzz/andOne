package project.and.p001.vo;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

@Component
public class AndP001_d001VO {
	private String one_type;
	private String one_id;
	private String one_category;
	private String one_title;
	private String one_locate;
	private String one_memberMax;
	private String one_totalPrice; //총가격
	private String one_price; // 총가격/인원
	private String one_date;
	private String one_sate;
	private String one_hashTag;
	private String one_time;
	private String one_editor;
	private Timestamp one_editDate;
	
	public AndP001_d001VO() {
	}
	
	public String getOne_price() {
		return one_price;
	}


	public void setOne_price(String one_price) {
		this.one_price = one_price;
	}

	public String getOne_time() {
		return one_time;
	}


	public void setOne_time(String one_time) {
		this.one_time = one_time;
	}


	public String getOne_type() {
		return one_type;
	}

	public void setOne_type(String one_type) {
		this.one_type = one_type;
	}

	public String getOne_id() {
		return one_id;
	}

	public void setOne_id(String one_id) {
		this.one_id = one_id;
	}

	public String getOne_category() {
		return one_category;
	}

	public void setOne_category(String one_category) {
		this.one_category = one_category;
	}

	public String getOne_title() {
		return one_title;
	}

	public void setOne_title(String one_title) {
		this.one_title = one_title;
	}

	public String getOne_locate() {
		return one_locate;
	}

	public void setOne_locate(String one_locate) {
		this.one_locate = one_locate;
	}

	public String getOne_memberMax() {
		return one_memberMax;
	}

	public void setOne_memberMax(String one_memberMax) {
		this.one_memberMax = one_memberMax;
	}

	public String getOne_totalPrice() {
		return one_totalPrice;
	}

	public void setOne_totalPrice(String one_totalPrice) {
		this.one_totalPrice = one_totalPrice;
	}

	public String getOne_date() {
		return one_date;
	}

	public void setOne_date(String one_date) {
		this.one_date = one_date;
	}

	public String getOne_sate() {
		return one_sate;
	}

	public void setOne_sate(String one_sate) {
		this.one_sate = one_sate;
	}

	public String getOne_hashTag() {
		return one_hashTag;
	}

	public void setOne_hashTag(String one_hashTag) {
		this.one_hashTag = one_hashTag;
	}

	public String getOne_editor() {
		return one_editor;
	}

	public void setOne_editor(String one_editor) {
		this.one_editor = one_editor;
	}

	public Timestamp getOne_editDate() {
		return one_editDate;
	}

	public void setOne_editDate(Timestamp one_editDate) {
		this.one_editDate = one_editDate;
	}
}

