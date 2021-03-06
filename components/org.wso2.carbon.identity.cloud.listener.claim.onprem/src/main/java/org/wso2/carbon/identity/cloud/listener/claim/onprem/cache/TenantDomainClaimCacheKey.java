/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.cloud.listener.claim.onprem.cache;

import org.wso2.carbon.identity.application.common.cache.CacheKey;

/**
 * Cache key of ClaimDomainCache.
 */
public class TenantDomainClaimCacheKey extends CacheKey {
    private static final long serialVersionUID = -5671481946716831542L;
    private String domainName;

    public TenantDomainClaimCacheKey(String domainName) {
        this.domainName = domainName;
    }

    public String getDomainName() {
        return domainName;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TenantDomainClaimCacheKey)) {
            return false;
        }
        return this.domainName.equals(((TenantDomainClaimCacheKey) o).getDomainName());
    }

    @Override
    public int hashCode() {
        return domainName.hashCode();
    }
}
