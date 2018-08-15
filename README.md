# ServerMonitor 服务器监控

- 实现功能：
    - 基于Netty实现了网络通信
    - 基于Netty的IdleStateHandler实现了心跳机制
    - 使用了ProtoBuf建立的通信协议
    - 客户端可以读取到服务器的状态(使用Sigar读取) 
    - 项目基于SSM框架建立
---
- 使用说明：
    - HeartBeatServer 服务端启动类
    - HeartBeatClient 客户端启动类