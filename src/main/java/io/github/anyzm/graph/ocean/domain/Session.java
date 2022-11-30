/* Copyright (c) 2022 com.github.anyzm. All rights reserved.
 *
 * This source code is licensed under Apache 2.0 License,
 * attached with Common Clause Condition 1.0, found in the LICENSES directory.
 */
package io.github.anyzm.graph.ocean.domain;


import com.vesoft.nebula.client.graph.data.ResultSet;
import io.github.anyzm.graph.ocean.domain.impl.QueryResult;
import io.github.anyzm.graph.ocean.exception.NebulaExecuteException;

import java.util.Collections;
import java.util.Map;

/**
 * Description  Session is used for
 *
 * @author Anyzm
 * Date  2021/7/16 - 17:39
 * @update xiaobenma020
 * @version 1.0.0
 */
public interface Session {

    /**
     * 执行更新操作
     *
     * @param statement 执行语句
     * @return 执行结果
     * @throws NebulaExecuteException 执行异常
     */
    default int execute(String statement) throws NebulaExecuteException {
        return executeWithParameter(statement, Collections.emptyMap());
    }

    /**
     * 执行更新操作
     *
     * @param statement 执行语句
     * @param paramMap  参数map
     * @return 执行结果
     * @throws NebulaExecuteException 执行异常
     */

    int executeWithParameter(String statement, Map<String, Object> paramMap) throws NebulaExecuteException;


    /**
     * 执行查询
     *
     * @param statement 语句
     * @return 查询结果
     * @throws NebulaExecuteException nebula执行异常
     */
    default ResultSet executeQuery(String statement) throws NebulaExecuteException {
        return executeQueryWithParameter(statement, Collections.emptyMap());
    }

    /**
     * 执行查询
     *
     * @param statement 语句
     * @param paramMap  参数列表
     * @return 查询结果
     * @throws NebulaExecuteException nebula执行异常
     */
    ResultSet executeQueryWithParameter(String statement, Map<String, Object> paramMap)
            throws NebulaExecuteException;

    /**
     * 执行查询
     *
     * @param statement 执行语句
     * @return 执行结果集
     * @throws NebulaExecuteException 执行异常
     */
    default QueryResult executeQueryDefined(String statement) throws NebulaExecuteException {
        return executeQueryDefined(statement, Collections.emptyMap());
    }

    /**
     * 执行查询（失败返回默认值）
     *
     * @param statement 执行语句
     * @param paramMap 参数map
     * @return 执行结果集
     * @throws NebulaExecuteException 执行异常
     */
    QueryResult executeQueryDefined(String statement, Map<String, Object> paramMap)
            throws NebulaExecuteException;

    /**
     * 释放session
     */
    void release();

    /**
     * Need server supported, v1.0 nebula-graph doesn't supported
     *
     * @return ping服务器
     */
    boolean ping();

}
