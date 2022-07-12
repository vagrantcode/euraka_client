package com.cloud.mwClient.MybatisPlus.mysqlTables.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author mw
 * @since 2022-07-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("device_type_role_rel")
public class DeviceTypeRoleRel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("id")
    private String id;

    /**
     * 设备类型value
     */
    @TableField("dev_type")
    private String devType;

    /**
     * 设备类型可扮演角色value
     */
    @TableField("dev_type_role")
    private String devTypeRole;


}
