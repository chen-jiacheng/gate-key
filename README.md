
# GateKey

GateKey 是一个基于 Spring Boot 和 JWT 的用户认证和权限管理系统。它提供了完整的用户登录、注册和访问控制功能，适用于需要身份验证的 Web 应用程序。

## 功能特性

- 用户登录和注册
- 基于 JWT (JSON Web Token) 的无状态身份验证
- 角色基础的访问控制 (RBAC)
- RESTful API 接口设计
- 前端静态页面展示

## 技术栈

### 后端技术
- **核心框架**: Spring Boot 2.x
- **安全框架**: Spring Security
- **认证机制**: JWT (JSON Web Tokens)
- **构建工具**: Maven
- **其他**: Lombok

### 前端技术
- **HTML/CSS/JavaScript**
- **UI 框架**: Bootstrap 5
- **HTTP 客户端**: Fetch API

## 项目结构

```
src/
├── main/
│   ├── java/
│   │   └── com.chenjiacheng.gatekey/
│   │       ├── config/         # 安全配置和JWT过滤器
│   │       ├── controller/     # 控制器和数据传输对象
│   │       ├── service/        # 业务逻辑接口和实现
│   │       ├── util/           # JWT工具类
│   │       └── GateKeyApplication.java  # 启动类
│   └── resources/
│       ├── static/             # 静态资源文件
│       │   ├── js/             # JavaScript文件
│       │   └── *.html          # HTML页面
│       └── application.properties  # 配置文件
└── test/                       # 测试代码
```
## 快速开始

### 环境要求

- JDK 8 或更高版本
- Maven 3.6 或更高版本

### 构建和运行

1. 克隆项目:
```bash
    git clone <项目地址>
    cd gate-key
```
2. 构建项目:
```bash
  mvn clean package
```
3. 运行应用:
```bash
    mvn spring-boot:run
    # 或
    java -jar target/gate-key-*.jar
```
4. 访问应用:
   打开浏览器访问 `http://localhost:8080`

## API 接口

### 认证相关接口

- `POST /api/auth/login` - 用户登录
- _注册接口尚未完全实现_

### 访问控制

- `/api/auth/**` - 允许匿名访问
- `/api/admin/**` - 仅限 ADMIN 角色访问
- 其他所有接口需要认证后访问

## 配置说明

在 `application.properties` 中配置以下参数:

```
properties
# 服务端口
server.port=8080

# JWT 密钥
jwt.secret=gateKeySecret2025

# JWT 过期时间 (毫秒)
jwt.expiration=3600000
```
## 前端页面

- [index.html](file://D:\workspace\IdeaProjects\gate-key\src\main\resources\static\index.html) - 主页
- [login.html](file://D:\workspace\IdeaProjects\gate-key\src\main\resources\static\login.html) - 登录页面
- [register.html](file://D:\workspace\IdeaProjects\gate-key\src\main\resources\static\register.html) - 注册页面

## 安全机制

1. 使用 JWT 进行无状态认证
2. 基于角色的访问控制
3. Stateless 会话管理
4. 请求头 Authorization: Bearer <token> 验证

## 开发说明

### 主要组件

- [JwtFilter](file://D:\workspace\IdeaProjects\gate-key\src\main\java\com\chenjiacheng\gatekey\config\JwtFilter.java#L18-L44) - JWT 验证过滤器
- [SecurityConfig](file://D:\workspace\IdeaProjects\gate-key\src\main\java\com\chenjiacheng\gatekey\config\SecurityConfig.java#L9-L26) - Spring Security 配置
- [AuthController](file://D:\workspace\IdeaProjects\gate-key\src\main\java\com\chenjiacheng\gatekey\controller\AuthController.java#L14-L27) - 认证相关控制器
- [JwtUtil](file://D:\workspace\IdeaProjects\gate-key\src\main\java\com\chenjiacheng\gatekey\util\JwtUtil.java#L14-L44) - JWT 工具类

### 代码规范

- 使用 Lombok 简化实体类
- 统一的返回结果格式 (`Result<T>`)
- 请求和响应对象分离

## 待完善功能

- [ ] 用户注册接口实现
- [ ] 用户管理功能
- [ ] 更完善的角色权限控制
- [ ] 密码加密存储
- [ ] Token 刷新机制

## 许可证

本项目采用 GNU General Public License v3.0 (GNU GPLv3) 开源许可证。

您可以在 [GNU 官方网站](https://www.gnu.org/licenses/gpl-3.0.html) 查看完整的许可证文本。

## 联系方式

[待添加]
```
