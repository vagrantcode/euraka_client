package com.cloud.mwClient.MybatisPlus.mysqlTables.serviceImpl;

import com.cloud.mwClient.MybatisPlus.mysqlTables.entity.DeviceType;
import com.cloud.mwClient.MybatisPlus.mysqlTables.mapper.DeviceTypeMapper;
import com.cloud.mwClient.MybatisPlus.mysqlTables.service.IDeviceTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mw
 * @since 2022-07-12
 */
@Service
public class DeviceTypeServiceImpl extends ServiceImpl<DeviceTypeMapper, DeviceType> implements IDeviceTypeService {

}
