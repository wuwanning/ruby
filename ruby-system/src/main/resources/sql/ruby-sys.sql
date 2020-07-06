-- 用户
CREATE TABLE `t_sys_user`
(
    `user_id`     bigint      NOT NULL,
    `username`    varchar(50) NOT NULL COMMENT '用户名',
    `password`    varchar(100) COMMENT '密码',
    `email`       varchar(100) COMMENT '邮箱',
    `mobile`      varchar(100) COMMENT '手机号',
    `user_type`   tinyint COMMENT '用户类型  0：游客 1：系统用户',
    `status`      tinyint COMMENT '状态  0：禁用   1：正常',
    `creator`     bigint(20) COMMENT '创建者',
    `create_time` datetime COMMENT '创建时间',
    `updater`     bigint(20) COMMENT '最后更新人',
    `update_time` datetime COMMENT '更新时间',
    PRIMARY KEY (`user_id`),
    UNIQUE INDEX (`username`)
) ENGINE = `InnoDB`
  DEFAULT CHARACTER SET utf8mb4 COMMENT ='用户表';


-- 角色
CREATE TABLE `t_sys_role`
(
    `role_id`     bigint NOT NULL,
    `role_code`   varchar(40) COMMENT '角色名称',
    `role_name`   varchar(100) COMMENT '角色名称',
    `remark`      varchar(100) COMMENT '备注',
    `creator`     bigint(20) COMMENT '创建者',
    `create_time` datetime COMMENT '创建时间',
    `updater`     bigint(20) COMMENT '最后更新人',
    `update_time` datetime COMMENT '更新时间',
    PRIMARY KEY (`role_id`)
) ENGINE = `InnoDB`
  DEFAULT CHARACTER SET utf8mb4 COMMENT ='角色表';

-- 用户与角色对应关系
CREATE TABLE `t_sys_user_role`
(
    `id`      bigint NOT NULL,
    `user_id` bigint COMMENT '用户ID',
    `role_id` bigint COMMENT '角色ID',
    PRIMARY KEY (`id`)
) ENGINE = `InnoDB`
  DEFAULT CHARACTER SET utf8mb4 COMMENT ='用户角色关系表';

-- 菜单
CREATE TABLE `t_sys_menu`
(
    `menu_id`     bigint NOT NULL,
    `parent_id`   bigint COMMENT '父菜单ID，一级菜单为0',
    `menu_name`   varchar(50) COMMENT '菜单名称',
    `url`         varchar(200) COMMENT '菜单URL',
    `perms`       varchar(500) COMMENT '授权(多个用逗号分隔，如：user:list,user:create)',
    `type`        int COMMENT '类型 0：目录 1：菜单 2：按钮',
    `icon`        varchar(50) COMMENT '菜单图标',
    `order_num`   int COMMENT '排序',
    `creator`     bigint(20) COMMENT '创建者',
    `create_time` datetime COMMENT '创建时间',
    `updater`     bigint(20) COMMENT '最后更新人',
    `update_time` datetime COMMENT '更新时间',
    PRIMARY KEY (`menu_id`)
) ENGINE = `InnoDB`
  DEFAULT CHARACTER SET utf8mb4 COMMENT ='菜单管理表';

-- 角色菜单关系表
CREATE TABLE `t_sys_role_menu`
(
    `id`      bigint NOT NULL,
    `role_id` bigint COMMENT '角色ID',
    `menu_id` bigint COMMENT '菜单ID',
    PRIMARY KEY (`id`)
) ENGINE = `InnoDB`
  DEFAULT CHARACTER SET utf8mb4 COMMENT ='角色菜单关系表';

-- 系统验证码
CREATE TABLE `t_sys_captcha`
(
    `id`          bigint NOT NULL COMMENT 'id',
    `code`        varchar(6) NOT NULL COMMENT '验证码',
    `expire_time` datetime DEFAULT NULL COMMENT '过期时间',
    PRIMARY KEY (`id`)
) ENGINE = `InnoDB`
  DEFAULT CHARACTER SET utf8mb4 COMMENT ='系统验证码表';

-- 系统参数
CREATE TABLE `t_sys_param`
(
    `id`          bigint NOT NULL COMMENT 'id',
    `param_code`        varchar(20) NOT NULL COMMENT '参数代码',
    `param_value`        varchar(255) NOT NULL COMMENT '参数值',
    `memo`        varchar(255) NOT NULL COMMENT '备注',
    PRIMARY KEY (`id`)
) ENGINE = `InnoDB`
  DEFAULT CHARACTER SET utf8mb4 COMMENT ='系统验证码表';