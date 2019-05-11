没有与Spring整合
---
MyBatis文件配置信息：
<?xml version="1.0" encoding="UTF-8" ?>
    <!DOCTYPE configuration
    PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
    "http://mybatis.org/dtd/mybatis-3-config.dtd">

    MyBatis映射文件配置信息:
    <?xml version="1.0" encoding="UTF-8" ?>
            <!DOCTYPE mapper
              PUBLIC "-//mybatis.org/DTD Mapper 3.0"
             "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
             

             <mapper>元素
             在配置文件中，<mappers>元素用于指定MyBatis映射文件位置,一般可以使用一下几种方式：
             ***最常用的一种:1.使用类路径引入
             <mappers>
                <mappser resource = "com/niit/mapper/UserMapper.xml" />
             </mappers>
             2.使用接口类：
             <mappers>
             <mapper class="com.niit.mapper.UserMapper" />
             </mappers>

           -------------------------------------
             MyBatis框架执行流程图
         1.读取MyBatis配置文件mybatis-config.xml。mybatis-config.xml作为MyBatis的全局配置文件，配置
         了MyBatis的运行环境等信息，其中主要内容是获取数据库连接。
         2. 加载映射文件Mapper.xml。Mapper.xml文件即SQL映射文件，该文件中配置了操作数据库的SQL语句,
         需要在mybatis-config.xml中加载才能执行。mybatis-config.xml可以加载多个配置文件，每个
         配置文件对应数据库中的一张表。
         3.构建会话工厂。通过MyBatis的环境等配置信息构建会话工厂SqlSessionFactory。
         4.创建SqlSession对象。由会话工厂创建SqlSession对象，该对象中包含了执行SQL的所有方法。
         5.MyBatis底层定义了一个Executor接口来操作数据库，它会根据SqlSession传递的参数动态地
         生成需要执行的SQL语句，同时负责查询缓存的维护。
        -------------------------------------------------------
          MyBatis操作大致可分为几个步骤
          1.读取配置文件.
          2.根据配置文件构建SqlSessionFacory
          3.通过SqlSessionFactory创建SqlSession
          4.使用SqlSession对象操作数据库(包括查询,添加,修改,删除以及提交事务等.)
          5.关闭SqlSession.
         --------------------------------------------------------
