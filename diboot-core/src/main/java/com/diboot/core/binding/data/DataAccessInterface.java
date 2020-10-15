/*
 * Copyright (c) 2015-2020, www.dibo.ltd (service@dibo.ltd).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.diboot.core.binding.data;

import java.util.List;

/**
 * 数据权限校验扩展接口
 * @author mazc@dibo.ltd
 * @version v2.1
 * @date 2020/04/24
 */
public interface DataAccessInterface {

    /**
     * 可访问的对象ID
     */
    List<Long> getAccessibleIds(CheckpointType type);

}