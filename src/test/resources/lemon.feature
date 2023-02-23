Feature: 使用chrome浏览器访问百度

  Scenario: 百度搜索testingpai
    Given 打开百度搜索
    When 输入  "testingpai"
    Then 显示 "测试派"