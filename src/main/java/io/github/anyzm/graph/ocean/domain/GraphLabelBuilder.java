/* Copyright (c) 2022 com.github.anyzm. All rights reserved.
 *
 * This source code is licensed under Apache 2.0 License,
 * attached with Common Clause Condition 1.0, found in the LICENSES directory.
 */
package io.github.anyzm.graph.ocean.domain;

import io.github.anyzm.graph.ocean.dao.GraphValueFormatter;
import io.github.anyzm.graph.ocean.domain.impl.GraphVertexType;
import io.github.anyzm.graph.ocean.enums.GraphDataTypeEnum;
import io.github.anyzm.graph.ocean.enums.GraphKeyPolicy;

import java.util.List;
import java.util.Map;

/**
 * Description  GraphLabelBuilder is used for
 *
 * @author Anyzm
 * Date  2021/9/13 - 16:08
 * @version 1.0.0
 */
public interface GraphLabelBuilder {

    /**
     * 构造元素名
     *
     * @param graphLabelName 标签名
     * @return 标签构造器
     */
    GraphLabelBuilder graphLabelName(String graphLabelName);

    /**
     * 构造元素对应的类
     *
     * @param labelClass 标签类类型
     * @return 标签构造器
     */
    GraphLabelBuilder labelClass(Class labelClass);

    /**
     * 构造属性格式化map
     *
     * @param propertyFormatMap 属性格式化map
     * @return 标签构造器
     */
    GraphLabelBuilder propertyFormatMap(Map<String, GraphValueFormatter> propertyFormatMap);

    /**
     * 构造数据类型map
     *
     * @param dataTypeMap 字段类型map
     * @return 标签构造器
     */
    GraphLabelBuilder dataTypeMap(Map<String, GraphDataTypeEnum> dataTypeMap);

    /**
     * 构造必要属性
     *
     * @param mustProps 必须属性
     * @return 标签构造器
     */
    GraphLabelBuilder mustProps(List<String> mustProps);

    /**
     * 构造属性字段map
     *
     * @param propertyFieldMap 属性字段map
     * @return 标签构造器
     */
    GraphLabelBuilder propertyFieldMap(Map<String, String> propertyFieldMap);

    /**
     * 构造主键策略
     *
     * @param graphKeyPolicy 逐渐策略
     * @return 标签构造器
     */
    GraphLabelBuilder graphKeyPolicy(GraphKeyPolicy graphKeyPolicy);

    /**
     * 构造id是否作为字段
     *
     * @param idAsField id是否作为字段
     * @return 标签构造器
     */
    GraphLabelBuilder idAsField(boolean idAsField);

    /**
     * 构造id值格式转化器
     *
     * @param idValueFormatter 主键格式转化器
     * @return 标签构造器
     */
    GraphLabelBuilder idValueFormatter(GraphValueFormatter idValueFormatter);


    /**
     * 构造起点id是否作为字段
     *
     * @param srcIdAsField 起点id是否作为字段
     * @return 标签构造器
     */
    GraphLabelBuilder srcIdAsField(boolean srcIdAsField);

    /**
     * 构造目标id是否作为字段
     *
     * @param dstIdAsField 终点id是否作为字段
     * @return 标签构造器
     */
    GraphLabelBuilder dstIdAsField(boolean dstIdAsField);

    /**
     * 构造起点id值格式转化器
     *
     * @param srcIdValueFormatter 起点id格式化器
     * @return 标签构造器
     */
    GraphLabelBuilder srcIdValueFormatter(GraphValueFormatter srcIdValueFormatter);

    /**
     * 构造目标id值格式转化器
     *
     * @param dstIdValueFormatter 终点id格式化器
     * @return 标签构造器
     */
    GraphLabelBuilder dstIdValueFormatter(GraphValueFormatter dstIdValueFormatter);

    /**
     * 构造起点顶点类型
     *
     * @param srcGraphVertexType 起点顶点类型
     * @return 标签构造器
     */
    GraphLabelBuilder srcGraphVertexType(GraphVertexType srcGraphVertexType);

    /**
     * 构造目标顶点类型
     *
     * @param dstGraphVertexType 终点顶点类型
     * @return 标签构造器
     */
    GraphLabelBuilder dstGraphVertexType(GraphVertexType dstGraphVertexType);

    /**
     * 构造出真实的元素
     *
     * @return 标签
     */
    GraphLabel build();

}
