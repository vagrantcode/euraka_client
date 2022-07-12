package com.cloud.mwClient.MybatisPlus;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static com.baomidou.mybatisplus.generator.config.rules.DateType.ONLY_DATE;


public class MpGenerator {
    public static String scanner(String tip) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder help = new StringBuilder();
        help.append("请输入" + tip + "：");
        System.out.println(help.toString());
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            return ipt;
        }
        throw new MybatisPlusException("请输入正确的" + tip + "！");
    }

    /**
     * @param args
     * @Title: main
     * @Description: 生成
     */
    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        final String projectPath = System.getProperty("user.dir") + "";
        String filePath = projectPath + "/autoCode/";
        System.out.println("生成文件 的路径为：" + filePath);
        gc.setOutputDir(filePath);
//        gc.setOutputDir("E://code");
//        gc.setFileOverride(true);
//        gc.setActiveRecord(false);// 不需要ActiveRecord特性的请改为false
//        gc.setEnableCache(false);// XML 二级缓存
//        gc.setBaseResultMap(true);// XML ResultMap
//        gc.setBaseColumnList(false);// XML columList
        gc.setOpen(false);
        gc.setDateType(ONLY_DATE);
        gc.setAuthor("mw");// 作者

        // 自定义文件命名，注意 %s 会自动填充表实体属性！
//        gc.setControllerName("%sAction");
//        gc.setServiceName("%sService");
//        gc.setServiceImplName("%sServiceImpl");
//        gc.setMapperName("%sMapper");
//        gc.setXmlName("%sMapper");
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("name");
        dsc.setPassword("pwd");
        dsc.setDbType(DbType.MYSQL);
        dsc.setUrl("jdbc:mysql://地址/seaport?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=UTC");



        /* dsc.setSchemaName("public");*/
        mpg.setDataSource(dsc);
        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.cloud.mwclient.MybatisPlus.mysqlTables");

        //pc.setController("controller");
        pc.setEntity("entity");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setServiceImpl("serviceImpl");
        pc.setXml("mapperXml");
        mpg.setPackageInfo(pc);
//        pc.setModuleName("");
        //pc.setParent("com.chnenergy.monitoring.supervison.api.dao");
        //以下生成的类类型的map的KEY值，可以去常量类中ConstVal获得，为了省事，直接写了字符串
        Map m = new HashMap();
        // m.put("entity_path", gc.getOutputDir() + File.separator + (pc.getParent().replaceAll("\\.", "\\" + File.separator)) + "/entity");
        //m.put("mapper_path", gc.getOutputDir() + File.separator + (pc.getParent().replaceAll("\\.", "\\" + File.separator)) + "/mapper");
//        m.put("service_path",gc.getOutputDir() + File.separator + (pc.getParent().replaceAll("\\.", "\\" + File.separator)) +"/service");
//        m.put("service_impl_path",gc.getOutputDir() + File.separator + (pc.getParent().replaceAll("\\.", "\\" + File.separator)) + "/service/impl");
//        m.put(ConstVal.CONTROLLER_PATH,gc.getOutputDir() + File.separator + (pc.getParent().replaceAll("\\.", "\\" + File.separator)) + "controller");
//                m.put(ConstVal.XML_PATH,gc.getOutputDir() + File.separator + (pc.getParent().replaceAll("\\.", "\\" + File.separator)) + "/xml");

        //pc.setPathInfo(m);
        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };


        cfg.setFileOutConfigList(null);
        mpg.setCfg(cfg);
        mpg.setPackageInfo(pc);
        // 配置模板
        TemplateConfig templateConfig = new TemplateConfig();
        templateConfig.setController("");
        // 配置自定义输出模板
        //指定自定义模板路径，注意不要带上.ftl/.vm, 会根据使用的模板引擎自动识别
        // templateConfig.setEntity("templates/entity2.java");
        // templateConfig.setService();
        // templateConfig.setController();
//        templateConfig.setXml(TEMPLATE_XML);
        mpg.setTemplate(templateConfig);
        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setEntityTableFieldAnnotationEnable(true);
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
/*        switch (type) {
            case "oracle":
                break;
            case "oracle2":
                strategy.setSuperServiceImplClass(DataBaseOracle2Ds.class);
                break;
            case "sqlserver":
                strategy.setSuperServiceImplClass(DataBaseDs.class);
                break;
            case "sqlserver2":
                strategy.setSuperServiceImplClass(DataBaseSqlLogDs.class);
                strategy.setSuperServiceClass(ISqlLogService.class);
                //strategy.setSuperEntityClass(LogEntity.class);
                break;
        }*/


//        strategy.setTablePrefix("platform");
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);
        // 写于父类中的公共字段
        //strategy.setSuperEntityColumns("id");
        //strategy.setInclude(scanner("表名，多个英文逗号分割").split(","));
/*        switch (type) {
            case "oracle":
            case "oracle2":
                strategy.setInclude(args);
                break;

        }*/
//        strategy.setControllerMappingHyphenStyle(true);
//        strategy.setTablePrefix(pc.getModuleName() + "_");
        mpg.setStrategy(strategy);
        //mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        // 执行生成
        mpg.execute();

    }
}
