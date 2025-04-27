# 📚 Hi~KaoYanCodex

<a href="https://git.io/typing-svg"><img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=19&pause=1000&color=498BF7&center=true&width=600&lines=Hi~KaoYanCodex%EF%BC%8C%E4%B8%93%E6%B3%A8%E6%AF%8F%E4%B8%80%E9%81%93%E9%A2%98%EF%BC%8C%E6%88%90%E5%B0%B1%E6%AF%8F%E4%B8%80%E4%B8%AA%E6%A2%A6%E6%83%B3~" alt="Typing SVG" /></a>

## 📖 项目简介

Hi~KaoYanCodex 是一个开源的考研刷题平台，专为考研学生打造，提供高效、系统的题库练习与刷题体验。后端服务采用 Java 开发，提供
RESTful API 接口，支持用户管理、题库管理、错题记录、刷题统计等功能。  
本项目旨在为考研学生提供一站式刷题解决方案，助力高效备考，系统突破。

## ✨ 功能特色

- **👤 用户管理**：支持用户注册、登录、权限管理，保障刷题数据的私密性与安全性。
- **📚 考研题库管理**：涵盖政治、英语、数学、专业课等多个科目，可按科目和知识点分类筛选。
- **📝 智能刷题与练习**：支持顺序刷题、随机练习、错题重练等模式，提升刷题效率。
- **📈 错题本与刷题统计**：自动记录错题，并生成刷题报告，帮助学生精准定位薄弱环节。
- **🔔 通知与提醒系统**：推送刷题进度提醒，保持学习节奏。

## 🛠️ 技术栈

- **☕ Java 17**：项目核心开发语言，稳定高效。
- **🌱 Spring Boot**：构建 RESTful API，快速开发与部署。
- **🔐 Spring Security**：实现用户认证与授权，保护账户数据。
- **💾 MySQL**：存储用户信息、题库、刷题记录等数据。
- **⚡ Redis**：缓存热点数据，提升系统响应速度。
- **🔑 JWT**：用于无状态用户认证，保障接口安全。
- **📑 Swagger**：集成 Swagger UI，便于开发者查看和调试 API 接口。

## 🚀 环境要求

- JDK 17
- Spring Boot 2.7.x
- MySQL 8.0 及以上
- Maven 3.6 及以上
- Redis 6.0 及以上

## 🧑‍💻 本地开发与运行

### 1. 克隆仓库

```bash
git clone https://github.com/your-username/Hi-KaoYanCodex.git
cd Hi-KaoYanCodex
```

### 2. 配置数据库

- 创建 MySQL 数据库：
  ```sql
  CREATE DATABASE kaoyan_codex_db;
  ```
- 在 `src/main/resources/application.yml` 中配置数据库连接：
  ```yaml
  spring:
    datasource:
      url: jdbc:mysql://localhost:3306/kaoyan_codex_db
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

启动后可访问 [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) 查看 API 文档与接口测试。

## 🏗️ 部署指南

### Docker 部署

项目提供了 Docker 配置文件，支持快速部署：

- 构建 Docker 镜像：
  ```bash
  docker build -t hi-kaoyan-codex-backend .
  ```
- 启动容器：
  ```bash
  docker run -d -p 8080:8080 hi-kaoyan-codex-backend
  ```

## ✅ 测试

### 单元测试

本项目使用 JUnit 进行单元测试，执行以下命令运行全部测试：

```bash
mvn test
```

## 🤝 贡献指南

欢迎对 Hi~KaoYanCodex 项目做出贡献，贡献方式包括但不限于：

- 提交新功能
- 发现并修复 Bug
- 优化代码与架构
- 完善项目文档

贡献流程：

1. Fork 本仓库；
2. 创建新分支并进行修改：
    ```bash
    git checkout -b feature/your-feature
    ```
3. 提交并推送修改：
    ```bash
    git commit -m 'Add your feature'
    git push origin feature/your-feature
    ```
4. 创建 Pull Request，描述你的更改内容。

## 📜 许可证

本项目基于 [MIT License](LICENSE) 开源，您可以自由使用、修改和分发代码。

## 👨‍💻 开发者

- **Voyager0587** - [https://github.com/Voyager0587]
- **其他贡献者** - 感谢所有为项目贡献的人！

