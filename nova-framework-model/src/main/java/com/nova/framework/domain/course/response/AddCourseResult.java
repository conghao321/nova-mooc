package com.nova.framework.domain.course.response;

import com.nova.framework.model.response.ResponseResult;
import com.nova.framework.model.response.ResultCode;
import lombok.Data;
import lombok.ToString;

/**
 * @Author: HaoCong
 * @Description:
 * @Modified By:
 */
@Data
@ToString
public class AddCourseResult extends ResponseResult {
    public AddCourseResult(ResultCode resultCode,String courseid) {
        super(resultCode);
        this.courseid = courseid;
    }
    private String courseid;

}
