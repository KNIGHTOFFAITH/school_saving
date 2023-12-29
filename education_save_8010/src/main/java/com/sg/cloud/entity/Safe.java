package com.sg.cloud.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.Date;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 * 
 * </p>
 *
 * @author hao
 * @since 2023-12-28
 */
@TableName("safe")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Safe implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "safe_id", type = IdType.AUTO)
    private Integer safeId;

    /**
     * 类型
     */
    private String safeType;

    /**
     * 标题
     */
    private String safeTitle;

    /**
     * 内容
     */
    private String safeContent;

    /**
     * 创建时间
     */
    @TableField("safe_createtime")
    private Date safeCreatetime;

    public Integer getSafeId() {
        return safeId;
    }

    public void setSafeId(Integer safeId) {
        this.safeId = safeId;
    }

    public String getSafeType() {
        return safeType;
    }

    public void setSafeType(String safeType) {
        this.safeType = safeType;
    }

    public String getSafeTitle() {
        return safeTitle;
    }

    public void setSafeTitle(String safeTitle) {
        this.safeTitle = safeTitle;
    }

    public String getSafeContent() {
        return safeContent;
    }

    public void setSafeContent(String safeContent) {
        this.safeContent = safeContent;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getSafeCreatetime() {
        return safeCreatetime;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public void setSafeCreatetime(Date safeCreatetime) {
        this.safeCreatetime = safeCreatetime;
    }
}
