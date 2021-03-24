package com.fancky.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.io.VFS;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;


@Configuration
public class MybatisPlusDataSourceConfig {
    private String mybatisMapper = "classpath:mapper/**/*.xml";

//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource") //读取的数据源前缀, 跟yml文件对应
//    public DataSource demoDataSource() {
//        return DataSourceBuilder.create().build();
//    }

    /**
     * 配置为了使用mybatisPlus baseMapper里面的方法
     * @param dataSource
     * @return
     * @throws Exception
     */
    @Bean(name = "mybatisPlusDataSource")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("dataSource")DataSource dataSource) throws Exception {
        /**
         * 注意！利用系统自带功能无法正常加载这两个部分配置文件,需要再次手动加载
         */
        PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = pathMatchingResourcePatternResolver.getResources(mybatisMapper);
        MybatisSqlSessionFactoryBean sqlSessionFactoryBean = new MybatisSqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setMapperLocations(resources);
        sqlSessionFactoryBean.setTypeAliasesPackage("com.fancky.model.entity");
      //  sqlSessionFactoryBean.setPlugins(new Interceptor[]{paginationInterceptor()});
        return sqlSessionFactoryBean.getObject();
    }

}
