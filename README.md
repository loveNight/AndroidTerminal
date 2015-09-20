# Android-Terminal
Android中运行命令行程序的APP

写这个APP的目的是因为[Wifi连接Android手机调试](http://blog.csdn.net/kinglearnjava/article/details/46794737)时，每次都要输一大串命令，于是想到干脆自己写个APP自动运行命令。

##如何用Wifi连接Android手机调试
1. 在手机上安装终端App，开启Root权限，打开App，输入以下命令：
```
su  
setprop service.adb.tcp.port 5555  
stop adbd  
start adbd  
```
其中，su表示获取root权限

在连接的Wifi上单击，获取手机的IP地址。电脑上打开CMD，输入如下命令：
```
adb connect 手机IP地址  
```

## 使用前手机必须已连上WIFI ##

##难点
- 1.手机必须root，带来安全隐患。
我目前用的手机ROM是MIUI 7 开发版，可以仅给指定APP root权限。懒得为其他手机作root适配，所以目前仅实现自己需要的上述功能。将来有需求再补充。
