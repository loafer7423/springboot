package com.loafer.common;

import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName PagerIDto
 * @Description [分页工具类]
 * @Author wangdong
 * @Date 2019/6/4 17:55
 * @Version V1.0
 **/
public class PagerIDto {
    @ApiModelProperty(value = "页码", required = true)
    private int page;

    @ApiModelProperty(value = "每页条数", required = true)
    private int size;

    public PagerIDto() {
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
