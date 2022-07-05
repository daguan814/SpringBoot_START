开发流程：
标签： ATT ： attention
      IM  :  important

    1. 在pom文件中引入druid 在开始时就要选中springboot，mybatis，jdbc没选中的话就要在pom中引入

    2. 写入yml，在yml中写入多环境开发和druid。多环境可以设置多个不同的数据库配置。

    3. dao， dao中需要包括pojo实体类和实体类对应的Dao接口。
             实体类用lombok（pom需要引用）中的@data即可
         BookDao（接口） ： 头部写@Mapper注解做映射
                        ：： 在方法上面写@Insert （增删改查注解） 
                         *ATT ！除了@select外全部返回int，select一个返回Book，一个返回List<Book>
                              !!参数中，save和updata填的是Book book 这个对象，另外的写Integer id就可
                              ！！！返回值原因：这个方法返回的是它影响的行数，用来判断操作是否成功的
        
    4. service, 包括接口和impl包
                BookServce接口相对于BookDao来说是只改变了返回值，把int变成boolean，原因：见Impl的说明。  
                *IM impl实现类头部写入 @Transactional事务
                    ！service类标签(一般不建议在接口上)上添加@Transactional，可以将整个类纳入spring事务管理，
                      在每个业务方法执行时都会开启一个事务，不过这些事务采用相同的管理方式。事务在方法失败时可以进行回滚。
                        
                        


