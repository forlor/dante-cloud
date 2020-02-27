/*
 * Copyright 2019-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 * Project Name: luban-cloud
 * Module Name: luban-cloud-component-data
 * File Name: JpaConverterListJson.java
 * Author: gengwei.zheng
 * Date: 2019/11/8 下午6:04
 * LastModified: 2019/10/28 上午11:56
 */

package cn.herodotus.eurynome.component.data.jpa;

import com.alibaba.fastjson.JSON;

import javax.persistence.AttributeConverter;

/**
 * <p>Description: 数据库属性类型与java存储的类型做转换 </p>
 *
 * @author : gengwei.zheng
 * @date : 2020/2/28 7:27
 */
public class JsonDataConverter implements AttributeConverter<Object, String> {

    @Override
    public String convertToDatabaseColumn(Object o) {
        return JSON.toJSONString(o);
    }

    @Override
    public Object convertToEntityAttribute(String s) {
        return JSON.parseArray(s);
    }
}
