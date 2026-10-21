# Student 2 接手说明

本文保留本次练习的操作步骤供复查。Student 2 已使用自己的账号上传绿色功能，实际分支名保留为 feature-green-button-main。冲突证据、解决决定和测试记录请看 RESOLUTION.zh-CN.md。

## 从正确的初始版本开始

接受仓库邀请后，在红色 PR 合并前克隆仓库：

```bash
git clone https://github.com/xyh929/GitConflictDemo-Practical4.git
cd GitConflictDemo-Practical4
git switch -c feature-green-button-main initial-app
```

`initial-app` 标签保留了两人共用的初始版本（包含配置修正，按钮仍是初始颜色）。即使红色 PR 已经合并，也从这个标签创建绿色分支。不要从红色版本创建绿色分支。

## 修改绿色按钮

1. 用 Android Studio 打开项目，确认初始应用可运行。
2. 打开 `app/src/main/res/layout/activity_main.xml`。
3. 将两个按钮的 `android:backgroundTint="#607D8B"` 都改为 `android:backgroundTint="#4CAF50"`。
4. 构建，在模拟器确认两个按钮都是绿色、点击有反馈。
5. 确认本地 Git 的姓名和邮箱属于 Student 2，再提交和推送：

```bash
git add app/src/main/res/layout/activity_main.xml
git commit -m "Change button color to green"
git push -u origin feature-green-button-main
```

## 制造并解决冲突

1. Student 1 先合并红色 PR，保留红色分支。
2. Student 2 创建 `feature-green-button-main` 到 `main` 的 PR。
3. 对 GitHub 的冲突提示截图，作为作业证据保存。
4. 在绿色分支合入最新主分支，查看同一 XML 的冲突：

```bash
git fetch origin
git switch feature-green-button-main
git merge origin/main
```

此时本地 `HEAD` 指绿色分支，合入的一侧是红色的 `origin/main`。判断颜色时要阅读代码，不要仅凭冲突标记的名字选择。

5. 两人决定最终颜色，编辑 XML，删除所有冲突标记。
6. 先构建并在模拟器运行确认，再提交解决结果：

```bash
git add app/src/main/res/layout/activity_main.xml
git commit -m "Resolve button color merge conflict"
git push
```

7. 回到绿色 PR，确认冲突消失后合并，保留绿色分支。
8. 两人分别更新 `main`，确认最终版本构建、运行正常。
9. 每个人都在自己的 Canvas 提交同一个仓库链接。

截图可以放在 `docs/evidence/`；最终说明应记录真实的冲突处理和测试结果。
