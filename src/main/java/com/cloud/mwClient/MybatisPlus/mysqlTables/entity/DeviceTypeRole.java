package com.cloud.mwClient.MybatisPlus.mysqlTables.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("device_type_role")
public class DeviceTypeRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 角色key
     */
    @TableField("value")
    private String value;

    /**
     * 角色名称
     */
    @TableField("label")
    private String label;

    /**
     * 角色说明
     */
    @TableField("remark")
    private String remark;


}
