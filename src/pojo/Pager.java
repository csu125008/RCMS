package pojo;

import java.util.List;

//用于分页的工具类
public class Pager {
	private String opr;// 标识查询类型
	private Integer pageIndex;// 当前页数
	private Integer pageCount;// 总页数
	private Integer pageSize;// 页面大小
	private Integer totalCount;// 总数据量
	private List list;// 数据集合
	private Integer firstData;// 起始数据

	// 计算,格式化数据
	public void count() {
		if (pageSize != null && pageSize != 0) {
			pageCount = totalCount % pageSize == 0 ? totalCount / pageSize
					: totalCount / pageSize + 1;	
		}
		if (pageIndex == null || pageIndex == 0) {
			pageIndex = 1;
		}else if(pageIndex<1){
			pageIndex = 1;
		}else if(pageIndex>pageCount){
			pageIndex=pageCount;
		}
		firstData = (pageIndex - 1) * pageSize;
	}

	// getter/setter
	public Pager(String opr, Integer pageIndex, Integer pageSize) {
		super();
		this.opr = opr;
		this.pageIndex = pageIndex;
		this.pageSize = pageSize;
	}

	public String getOpr() {
		return opr;
	}

	public Pager() {
		super();
	}

	public void setOpr(String opr) {
		this.opr = opr;
	}

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public Integer getFirstData() {
		return firstData;
	}

	public void setFirstData(Integer firstData) {
		this.firstData = firstData;
	}

	@Override
	public String toString() {
		return "Pager [opr=" + opr + ", pageIndex=" + pageIndex
				+ ", pageCount=" + pageCount + ", pageSize=" + pageSize
				+ ", totalCount=" + totalCount + ", list=" + list
				+ ", firstData=" + firstData + "]";
	}

}
