/*
 * Copyright 2021 NAVER Corp.
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
 */

package com.navercorp.pinpoint.metric.web.dao.model;

import java.util.Objects;

/**
 * @author minwoo.jung
 */
public class MetricInfoSearchKey {

    private final String tenantId;
    private final String hostGroupName;
    private final String hostName;

    public MetricInfoSearchKey(String tenantId, String hostGroupName, String hostName) {
        this.tenantId = Objects.requireNonNull(tenantId, "tenantId");
        this.hostGroupName = Objects.requireNonNull(hostGroupName, "hostGroupName");
        this.hostName = Objects.requireNonNull(hostName, "hostName");
    }

    public String getHostGroupName() {
        return hostGroupName;
    }

    public String getHostName() {
        return hostName;
    }

    public String getTenantId() {
        return tenantId;
    }
}
