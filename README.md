# 📚 Hi\~KaoYanCodex

<a href="https://git.io/typing-svg"><img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=19&pause=1000&color=498BF7&center=true&width=600&lines=Hi~KaoYanCodex%EF%BC%8C%E4%B8%93%E6%B3%A8%E6%AF%8F%E4%B8%80%E9%81%93%E9%A2%98%EF%BC%8C%E6%88%90%E5%B0%B1%E6%AF%8F%E4%B8%80%E4%B8%AA%E6%A2%A6%E6%83%B3~" alt="Typing SVG" /></a>

## 📖 项目简介

**Hi\~KaoYanCodex** 是一个开源的考研刷题平台，专为考研学生设计，提供高效、智能的题库练习、错题统计和刷题进度分析。
项目基于 **Spring Boot + Next.js 服务端渲染**，采用分布式缓存与搜索技术，支持高并发刷题、分词搜索、刷题记录统计，并内置系统安全与防护机制，助力考研学生系统突破、科学备考。

## ✨ 核心功能

* **用户管理**：支持用户注册、登录、权限管理，保障数据隐私与账户安全。
* **题库管理**：支持多科目（政治、英语、数学、专业课等），可按科目与知识点筛选。
* **智能刷题与练习**：支持顺序、随机、错题重练等模式，提升刷题效率。
* **错题本与刷题统计**：自动记录错题，生成刷题报告、年度刷题日历，帮助精准定位薄弱环节。
* **通知提醒系统**：推送刷题进度与提醒，保持学习节奏。
* **分词搜索引擎**：基于 Elasticsearch + ik 分词，实现灵活、高效的题库搜索。

## 🛠️ 技术架构

* **后端技术**：Java 17、Spring Boot、MyBatis Plus、Spring Security、Spring Data Elasticsearch
* **缓存技术**：Redis（BitMap + Redisson）、Caffeine、本地缓存 + HotKey 热点探测
* **搜索引擎**：Elasticsearch（ik 分词器）
* **分布式与高并发防护**：Sentinel、BloomFilter、Sa-Token、Nacos、Lua 脚本、CompletableFuture
* **数据库**：MySQL 8.0
* **前端技术**：Next.js（SSR）
* **API 文档**：Knife4j、Swagger
* **部署运维**：宝塔面板、Nginx、Docker、Druid

## 💡 技术亮点

* **高性能刷题记录统计**：使用 Redis BitMap + Redisson 实现用户刷题记录存储，相比关系型数据库节省数百倍存储空间，结合本地缓存 + 位运算优化，接口响应时间显著降低。
* **高效分词搜索引擎**：基于 Elasticsearch 搭建题库搜索，集成 ik 分词器支持题目内容与知识点多维度分词检索，采用动静分离策略降低索引更新成本，配合 Kibana + DSL 调试，提升搜索体验。
* **题目批量管理性能提升**：基于 MyBatis 的批处理能力，结合 CompletableFuture 异步并发拆分任务，实现高效批量删除、导入、修改，批处理性能提升超 5 倍；并结合 Druid 优化慢 SQL 监控。
* **高并发场景下系统稳定性保障**：引入 Sentinel 实现接口限流、熔断、热点参数限流，结合 Caffeine 本地缓存 + HotKey 自动缓存热门题目，防止瞬时流量击穿数据库，保障刷题体验稳定顺畅。
* **安全防护与防爬虫机制**：基于 Sa-Token 实现用户认证与同端登录冲突检测，防止账号共享；结合 Redis + Lua 脚本设计反爬虫策略，自动封禁恶意用户，保障题库内容安全。
* **IP 黑名单动态管理**：使用 BloomFilter 快速过滤恶意 IP，结合 Nacos 配置中心动态维护黑名单，支持实时更新，无需重启，提升系统抗攻击能力。
* **年度刷题日历统计**：基于 Redis 位运算与日历算法，支持用户刷题打卡日历展示，帮助用户养成高效学习习惯，提升用户粘性。
* **定时任务与数据同步**：基于 Spring Scheduler 实现题库数据增量同步至 Elasticsearch，通过唯一 ID 校验保证数据同步一致性与准确性。

## 🚀 环境要求

* JDK 17
* Spring Boot 2.7.x
* MySQL 8.0 及以上
* Maven 3.6 及以上
* Redis 6.0 及以上

## 🧑‍💻 本地开发与运行

### 1. 克隆仓库

```bash
git clone https://github.com/your-username/Hi-KaoYanCodex.git
cd Hi-KaoYanCodex
```

### 2. 配置数据库

```sql
CREATE DATABASE kaoyan_codex_db;
```

修改 `src/main/resources/application.yml`：

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/kaoyan_codex_db
    username: your_username
    password: your_password
```

### 3. 配置 Redis

```yaml
spring:
  redis:
    host: localhost
    port: 6379
```

### 4. 启动应用

```bash
mvn spring-boot:run
```

### 5. 访问接口文档

[http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## 🏗️ 部署指南

### Docker 快速部署

```bash
docker build -t hi-kaoyan-codex-backend .
docker run -d -p 8080:8080 hi-kaoyan-codex-backend
```

## ✅ 测试

```bash
mvn test
```

## 🤝 贡献指南

欢迎对 Hi\~KaoYanCodex 项目贡献：

1. Fork 仓库
2. 创建新分支并修改
3. 提交 Pull Request

## 📜 许可证

基于 [MIT License](LICENSE) 开源，自由使用、修改与分发。

## 👨‍💻 开发者

* **Voyager0587** - \[[https://github.com/Voyager0587](https://github.com/Voyager0587)]
* **其他贡献者** - 感谢所有为项目贡献的人！

