# SSM
闲来无聊，自己摸索着使用java语言来搭建自己的服务器；这也是我从事移动端工作以来的梦想。
之前总是从服务器请求数据，觉得会写后台的人特别牛逼，自己也就朝着后台方向发展，大约自学java一个月有余，就尝试着适应Spring＋SpringMVC＋Mybatis来搭建本地的服务器，
目前刚刚实现了简单的注册功能，并且还不是特别完善。后续功能，将进一步完善。。。。


关于无法伤处。idea配置文件的方法
将.idea目录加入ignore清单：
$ echo '.idea' >> .gitignore
2
从git中删除idea：
$ git rm —cached -r .idea
3
将.gitignore文件加入git：
$ git add .gitignore
4
Commit gitignore文件，将.idea从源代码仓库中删除：
$ git commit -m '(gitignore commit and remove .idea)'
5
Push到服务器：
 $ git push
