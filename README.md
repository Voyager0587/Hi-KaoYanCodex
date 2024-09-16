# 💼 Hi~面试 

## 📖 项目简介
Hi~面试 是一个开源的面试平台，专为面试者和面试官提供便捷的在线面试工具。后端服务采用 Java 开发，提供 RESTful API 接口，实现用户管理、面试题库、在线面试安排、反馈与评分等功能。本项目旨在为面试流程提供一站式解决方案，帮助面试者高效准备、面试官快捷评估。

## ✨ 功能特色
- **👤 用户管理**：支持用户注册、登录、权限管理等功能。
- **📚 面试题库管理**：包含海量面试题目，可根据职位、技术方向分类筛选。
- **📅 面试安排**：支持在线安排面试，包含面试时间、面试官分配等功能。
- **💬 面试反馈与评分**：面试官可在线为面试者提供评分和反馈，面试者也可查看历史面试记录。
- **🔔 通知系统**：通过邮件或短信向用户发送面试相关通知。

## 🛠️ 技术栈
- **☕ Java 17**：项目核心开发语言，使用最新的 Java 版本提供更好的性能和安全性。
- **🌱 Spring Boot**：用于构建 RESTful API，简化后端服务的开发。
- **🔐 Spring Security**：实现用户认证和授权，保证系统的安全性。
- **💾 MySQL**：关系型数据库，用于存储用户信息、面试题库、面试安排等数据。
- **⚡ Redis**：用于缓存，提升应用的性能和响应速度。
- **🔑 JWT**：用于用户认证，保证 API 调用的安全性和高效性。
- **📑 Swagger**：集成 Swagger UI，用于生成和展示 API 文档，方便开发者调试接口。

## 🚀 环境要求
- JDK 8 
- Spring Boot 2.7.x
- MySQL 8.0 及以上
- Maven 3.6 及以上
- Redis 6.0 及以上

## 🧑‍💻 本地开发与运行

### 1. 克隆仓库
```bash
git clone https://github.com/your-username/Hi-Interview.git
cd Hi-Interview
```

### 2. 配置数据库
- 创建 MySQL 数据库：
  ```sql
  CREATE DATABASE interview_db;
  ```
- 在 `src/main/resources/application.yml` 中配置数据库连接：
  ```yaml
  spring:
    datasource:
      url: jdbc:mysql://localhost:3306/hi-interview_db
      username: your_username
      password: your_password
  ```

### 3. 配置 Redis
在本地或服务器上启动 Redis 服务，并在 `application.yml` 中配置 Redis 连接：
```yaml
spring:
  redis:
    host: localhost
    port: 6379
```

### 4. 启动应用
在项目根目录运行以下命令启动项目：
```bash
mvn spring-boot:run
```

### 5. 访问 Swagger UI
启动后可访问 [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) 查看和调试 API。

## 🏗️ 部署指南

### Docker 部署
项目提供了 Docker 配置文件，可以使用 Docker 快速部署：
- 首先构建 Docker 镜像：
  ```bash
  docker build -t hi-interview-backend .
  ```
- 启动容器：
  ```bash
  docker run -d -p 8080:8080 hi-interview-backend
  ```
  
## ✅ 测试

### 单元测试
本项目使用 JUnit 进行单元测试，运行以下命令执行所有测试：
```bash
mvn test
```

## 🤝 贡献指南
欢迎对 Hi~面试 项目做出贡献，贡献的方式包括但不限于：
- 提交代码改进
- 提出新功能需求
- 进行 Bug 修复
- 完善项目文档

贡献步骤：
1. Fork 项目仓库。
2. 创建分支并进行修改：
    ```bash
    git checkout -b feature/new-feature
    ```
3. 提交并推送修改：
    ```bash
    git commit -m 'Add new feature'
    git push origin feature/new-feature
    ```
4. 创建 Pull Request 并描述您的更改。

## 📜 许可证
本项目基于 [MIT License](LICENSE) 开源，您可以自由使用、修改和分发代码。

## 👨‍💻 开发者
- **Voyager0587** - [https://github.com/Voyager0587]
- **其他贡献者** - 感谢所有为项目作出贡献的人！

