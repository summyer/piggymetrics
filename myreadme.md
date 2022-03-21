# mongodb 服务  需要注意环境变量
>cd mongodb
>docker build -t sqshq/piggymetrics-mongodb .
>docker run  -p 27017:27017  -e 'MONGODB_PASSWORD=123456' sqshq/piggymetrics-mongodb
>docker run  --name piggymetrics-mongodb -p 27017:27017  -e 'MONGODB_PASSWORD=123456' sqshq/piggymetrics-mongodb

# config用户密码
user/123456

# config、registry要替换成localhost
config
localhost:8888

registry
localhost:8761

auth-server:5000
account-server:6000

# 调试
启动
config-service
registry-service
account-service
auth-service
notification-service : TestBean.java
