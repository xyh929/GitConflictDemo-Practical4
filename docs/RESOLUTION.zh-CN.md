# Practical 4 冲突解决记录

## 项目与真实分工

- Student 1：`xyh929`，红色分支 `feature-red-button`，功能提交 `5872eba`，字体预览修复 `000b089`。
- Student 2：`hhtt1206`，上传绿色分支 `feature-green-button-main`，功能提交 `eec4c50`（原提交信息 `GREEN BOTTON`）。
- 共同初始版本：`86e772d`，标签 `initial-app`。
- 绿色分支名称为 `feature-green-button-main`。
- 红色 PR #1 先合并；绿色 PR #2 由 Student 1 账号代表小组创建，冲突解决提交也使用 Student 1 的真实 Git 身份。保留 Student 2 原始提交及作者，没有重写其历史。

## 真实冲突与证据

红色分支把两个按钮改为 `#F44336`，绿色分支把同一个 XML 文件中相同两行改为 `#4CAF50`。

红色 PR 合入 `main` 后，GitHub 对绿色 PR 返回 `mergeable: false`、`mergeable_state: dirty`。

- [GitHub 原始冲突状态记录](evidence/green-pr-conflict.json)：包含采集时间、PR 地址、两个分支的提交 SHA 和冲突状态。
- [实际 git merge 输出](evidence/git-merge-conflict.txt)：记录本地执行合并后发生的冲突。
- [带原始冲突标记的 XML 副本](evidence/activity_main.conflicted.xml.txt)：只用于取证，未放入 Android 编译资源目录。

本地在绿色分支执行 `git merge --no-commit origin/main`。此时 `HEAD` 是绿色实现，`origin/main` 是已合并的红色实现；两个按钮均产生冲突。

## 采用的解决方案

保留两个绿色按钮 `#4CAF50`，手动移除两组冲突标记，保留从主分支合入的 `sans-serif` 字体修复。绿色提交附带的构建工具升级不属于按钮功能，最终统一回此前验证过的 Android Gradle Plugin 9.3.2 和 Gradle 9.5.0。

最终 XML 已解析检查：两个按钮都是绿色，应用源文件没有遗留的 Git 冲突标记。

## 提交解决结果前的验证

1. `gradlew.bat --offline assembleDebug lintDebug`：通过，lint 报告 `No issues found.`。
2. 在 Pixel 6 模拟器安装并启动最终 APK：成功。
3. 点击 Button One：显示 `Button One pressed`。
4. 点击 Button Two：显示 `Button Two pressed`。
5. 截图检查两个按钮均为绿色。

真实测试输出保存在 [final-green-runtime-test.txt](evidence/final-green-runtime-test.txt)，运行截图为 [final-green-buttons.png](evidence/final-green-buttons.png) 和 [final-green-button-feedback.png](evidence/final-green-button-feedback.png)。

完成以上验证后，以 `Resolve button color merge conflict` 提交解决结果，再推送绿色分支并完成 PR #2。GitHub PR 页面保留最终合并状态，两条功能分支均保留。

## 提交到 Canvas

每位学生分别在自己的 Canvas 提交同一个仓库链接：

https://github.com/xyh929/GitConflictDemo-Practical4
