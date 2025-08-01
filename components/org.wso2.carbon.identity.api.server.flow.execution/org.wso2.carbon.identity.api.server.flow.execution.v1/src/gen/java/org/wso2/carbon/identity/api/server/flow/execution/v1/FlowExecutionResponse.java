/*
 * Copyright (c) 2025, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.api.server.flow.execution.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.wso2.carbon.identity.api.server.flow.execution.v1.Data;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;

public class FlowExecutionResponse  {
  
    private String flowId;
    private String flowStatus;

@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

    @XmlEnumValue("VIEW") VIEW(String.valueOf("VIEW")), @XmlEnumValue("REDIRECTION") REDIRECTION(String.valueOf("REDIRECTION")), @XmlEnumValue("INTERNAL_PROMPT") INTERNAL_PROMPT(String.valueOf("INTERNAL_PROMPT")), @XmlEnumValue("WEBAUTHN") WEBAUTHN(String.valueOf("WEBAUTHN"));


    private String value;

    TypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

    private TypeEnum type;
    private Data data;

    /**
    * Unique identifier for the flow execution
    **/
    public FlowExecutionResponse flowId(String flowId) {

        this.flowId = flowId;
        return this;
    }
    
    @ApiModelProperty(example = "3fa85f64-5717-4562-b3fc-2c963f66afa6", required = true, value = "Unique identifier for the flow execution")
    @JsonProperty("flowId")
    @Valid
    @NotNull(message = "Property flowId cannot be null.")

    public String getFlowId() {
        return flowId;
    }
    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    /**
    **/
    public FlowExecutionResponse flowStatus(String flowStatus) {

        this.flowStatus = flowStatus;
        return this;
    }
    
    @ApiModelProperty(example = "INCOMPLETE", required = true, value = "")
    @JsonProperty("flowStatus")
    @Valid
    @NotNull(message = "Property flowStatus cannot be null.")

    public String getFlowStatus() {
        return flowStatus;
    }
    public void setFlowStatus(String flowStatus) {
        this.flowStatus = flowStatus;
    }

    /**
    **/
    public FlowExecutionResponse type(TypeEnum type) {

        this.type = type;
        return this;
    }
    
    @ApiModelProperty(example = "VIEW", required = true, value = "")
    @JsonProperty("type")
    @Valid
    @NotNull(message = "Property type cannot be null.")

    public TypeEnum getType() {
        return type;
    }
    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
    **/
    public FlowExecutionResponse data(Data data) {

        this.data = data;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("data")
    @Valid
    public Data getData() {
        return data;
    }
    public void setData(Data data) {
        this.data = data;
    }



    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlowExecutionResponse flowExecutionResponse = (FlowExecutionResponse) o;
        return Objects.equals(this.flowId, flowExecutionResponse.flowId) &&
            Objects.equals(this.flowStatus, flowExecutionResponse.flowStatus) &&
            Objects.equals(this.type, flowExecutionResponse.type) &&
            Objects.equals(this.data, flowExecutionResponse.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowId, flowStatus, type, data);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class FlowExecutionResponse {\n");
        
        sb.append("    flowId: ").append(toIndentedString(flowId)).append("\n");
        sb.append("    flowStatus: ").append(toIndentedString(flowStatus)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
    * Convert the given object to string with each line indented by 4 spaces
    * (except the first line).
    */
    private String toIndentedString(java.lang.Object o) {

        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n");
    }
}

