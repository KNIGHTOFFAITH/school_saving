package com.sg.cloud.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import lombok.*;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author hao
 * @since 2023-12-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_score")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class TbScore implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 学号
     */
    private Integer studentId;

    private String studentName;

    private Integer chineseScore;

    private Integer mathScore;

    private Integer englishScore;

    private Integer scienceScore;

    /**
     * 政治成绩
     */
    private Integer politicsScore;

    private String studentClass;

    private String examType;


}
