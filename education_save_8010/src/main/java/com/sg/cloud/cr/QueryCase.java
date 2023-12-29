package com.sg.cloud.cr;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * QueryCase
 *
 * @author Hao
 * @since 2023/12/29 10:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryCase {
    private String safeType;
    private String safeTitle;
    private String safeContent;
}
