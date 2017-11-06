package com.seanna.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Page<T> {
    /*
     *记录总数
     */
    private Integer totalSize;
    /*
     *总页数
     */
    private Integer toalPages;
    /*
     *当前页码
     */
    private Integer pageNo;
    /*
    *每页显示多少条数据
     */
    private Integer pageSize;

    /**
     * 当前页的数据
     */
    private List<T> items;
    /**
     * 获取当前页起始行数
     */

    private Integer start;

    /**
     *
     * @param pageNo    当前第n页
     * @param pageSize  每一个页面容纳数据量
     * @param totalSize 总页面数量
     */
    public Page(Integer pageNo,Integer pageSize,Integer totalSize){
        this.pageNo=pageNo;
        this.pageSize=pageSize;
        this.totalSize=totalSize;

        //计算总页数
        toalPages=totalSize/pageSize;
        if(totalSize % pageSize !=0){
            toalPages++;
        }

        if(pageNo > toalPages){
            this.pageNo = toalPages;
        }
        if(this.pageNo <= 0){
            this.pageNo = 1;
        }
    start=(this.pageNo - 1) * pageSize;

    }


}































