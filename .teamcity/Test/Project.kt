package Test

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project

object Project : Project({
    uuid = "06c980d8-49cf-46b6-abc8-7e6c9f81746a"
    id = "Test"
    parentId = "_Root"
    name = "test"
    description = "i like teamcity"
})
