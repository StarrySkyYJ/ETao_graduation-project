package cn.space.tao.items.vo;

import java.util.Date;

/**
 * 物品 实体对象
 * @author SPACE
 *
 */
public class Items {
	private Integer id ;
	private String itemsname ;
	private double price ;
	private Integer num ;
	private Integer ishot ;
	//cid 二级分类的外键：使用二级分类的对象。
	private String describes;
	private String ioinfo ;
	//uid 用户表的外键.
	private Date times;
	private String image;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getItemsname() {
		return itemsname;
	}
	public void setItemsname(String itemsname) {
		this.itemsname = itemsname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public Integer getIshot() {
		return ishot;
	}
	public void setIshot(Integer ishot) {
		this.ishot = ishot;
	}
	public String getDescribes() {
		return describes;
	}
	public void setDescribes(String describes) {
		this.describes = describes;
	}
	public String getIoinfo() {
		return ioinfo;
	}
	public void setIoinfo(String ioinfo) {
		this.ioinfo = ioinfo;
	}
	public Date getTimes() {
		return times;
	}
	public void setTimes(Date times) {
		this.times = times;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
}
