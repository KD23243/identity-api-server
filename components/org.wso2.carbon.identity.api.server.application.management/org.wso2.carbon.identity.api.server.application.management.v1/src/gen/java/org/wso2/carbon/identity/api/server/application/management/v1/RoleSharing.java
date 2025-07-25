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

package org.wso2.carbon.identity.api.server.application.management.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.identity.api.server.application.management.v1.RoleShareConfig;
import javax.validation.constraints.*;

/**
 * - ALL &#x3D;&gt; share all roles - NONE &#x3D;&gt; share no roles - SELECTED &#x3D;&gt; provide a list of specific roles
 **/

import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;
@ApiModel(description = "- ALL => share all roles - NONE => share no roles - SELECTED => provide a list of specific roles")
public class RoleSharing  {
  

@XmlType(name="ModeEnum")
@XmlEnum(String.class)
public enum ModeEnum {

    @XmlEnumValue("ALL") ALL(String.valueOf("ALL")), @XmlEnumValue("NONE") NONE(String.valueOf("NONE")), @XmlEnumValue("SELECTED") SELECTED(String.valueOf("SELECTED"));


    private String value;

    ModeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ModeEnum fromValue(String value) {
        for (ModeEnum b : ModeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

    private ModeEnum mode;
    private List<RoleShareConfig> roles = null;


    /**
    **/
    public RoleSharing mode(ModeEnum mode) {

        this.mode = mode;
        return this;
    }
    
    @ApiModelProperty(required = true, value = "")
    @JsonProperty("mode")
    @Valid
    @NotNull(message = "Property mode cannot be null.")

    public ModeEnum getMode() {
        return mode;
    }
    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    /**
    * List of roles (required when mode&#x3D;SELECTED)
    **/
    public RoleSharing roles(List<RoleShareConfig> roles) {

        this.roles = roles;
        return this;
    }
    
    @ApiModelProperty(value = "List of roles (required when mode=SELECTED)")
    @JsonProperty("roles")
    @Valid
    public List<RoleShareConfig> getRoles() {
        return roles;
    }
    public void setRoles(List<RoleShareConfig> roles) {
        this.roles = roles;
    }

    public RoleSharing addRolesItem(RoleShareConfig rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(rolesItem);
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
        RoleSharing roleSharing = (RoleSharing) o;
        return Objects.equals(this.mode, roleSharing.mode) &&
            Objects.equals(this.roles, roleSharing.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mode, roles);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class RoleSharing {\n");
        
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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

