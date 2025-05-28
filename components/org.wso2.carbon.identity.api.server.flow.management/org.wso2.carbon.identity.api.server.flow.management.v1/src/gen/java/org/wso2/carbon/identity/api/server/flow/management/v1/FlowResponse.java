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

package org.wso2.carbon.identity.api.server.flow.management.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.identity.api.server.flow.management.v1.Step;
import javax.validation.constraints.*;

/**
 * Response payload for retrieving a flow
 **/

import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;
@ApiModel(description = "Response payload for retrieving a flow")
public class FlowResponse  {
  
    private List<Step> steps = null;


    /**
    **/
    public FlowResponse steps(List<Step> steps) {

        this.steps = steps;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("steps")
    @Valid
    public List<Step> getSteps() {
        return steps;
    }
    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

    public FlowResponse addStepsItem(Step stepsItem) {
        if (this.steps == null) {
            this.steps = new ArrayList<Step>();
        }
        this.steps.add(stepsItem);
        return this;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlowResponse flowResponse = (FlowResponse) o;
        return Objects.equals(this.steps, flowResponse.steps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(steps);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class FlowResponse {\n");
        
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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

