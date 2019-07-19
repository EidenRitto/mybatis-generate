# mybatis-generate
mybatis代码生成工具<br/>
使用方法，修改resources下的xml配置文件，author改为自己的名字（这是生成出来的java文件doc注释中author的内容）<br/>
jdbcConnection中设置数据库信息，账号密码等<br/>
javaModelGenerator pojo包目录<br/>
sqlMapGenerator mapper包xml目录<br/>
javaClientGenerator mapper包java目录<br/>
然后给需要生成的表添加table标签<br/>
最后运行Generator的main方法
