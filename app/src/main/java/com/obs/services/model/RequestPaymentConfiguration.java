/**
 * Copyright 2019 Huawei Technologies Co.,Ltd.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License.  You may obtain a copy of the
 * License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.obs.services.model;

/**
 * 桶的请求者付费配置
 * 
 * @since 3.20.3
 */
public class RequestPaymentConfiguration extends HeaderResponse
{
    private RequestPaymentEnum payer;
    
    /**
     * 构造函数
     * @param payer 请求者付费状态
     */
    public RequestPaymentConfiguration(RequestPaymentEnum payer)
    {
        this.payer = payer;
    }
    
    public RequestPaymentConfiguration(){
        
    }
    
    /**
     * 获取请求者付费状态
     * @return 请求者付费状态
     */
    public RequestPaymentEnum getPayer()
    {
        return payer;
    }
    
    /**
     * 设置请求者付费状态
     * @param payer 请求者付费状态
     */
    public void setPayer(RequestPaymentEnum payer)
    {
        this.payer = payer;
    }

    @Override
    public String toString()
    {
        return "RequestPaymentConfiguration [payer=" + payer.getCode() + "]";
    }
    
}