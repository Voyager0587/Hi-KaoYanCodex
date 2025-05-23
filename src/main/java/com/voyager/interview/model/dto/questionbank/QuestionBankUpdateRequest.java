package com.voyager.interview.model.dto.questionbank;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 更新题库请求
 *
 *
 */
@Data
public class QuestionBankUpdateRequest implements Serializable {

    /**
     * id
     */
    private Long id;
    /**
     * 题库 id
     */
    private Long questionBankId;

    /**
     * 题目 id
     */
    private Long questionId;

    private static final long serialVersionUID = 1L;
}