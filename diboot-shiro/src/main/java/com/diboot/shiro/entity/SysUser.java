package com.diboot.shiro.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.diboot.core.entity.BaseEntity;
import com.diboot.core.util.S;
import com.diboot.shiro.vo.RoleVO;
import lombok.Data;

import java.util.List;

/**
 * @author Yangzhao
 * @version v2.0
 * @date 2019/6/6
 */
@Data
public class SysUser extends BaseEntity {

    private static final long serialVersionUID = 466801280426981780L;

    @TableField
    private Long departmentId;

    @TableField
    private String username;

    @TableField
    private String password;

    @TableField
    private String gender;

    @TableField
    private String salt;

    @TableField(exist = false)
    private List<Role> roleList;

    @TableField(exist = false)
    private List<RoleVO> roleVOList;

    @TableField(exist = false)
    private List<Permission> permissionList;
}
