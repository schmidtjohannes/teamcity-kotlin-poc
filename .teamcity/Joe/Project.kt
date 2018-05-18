package Joe

import Joe.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project

object Project : Project({
    uuid = "f1bd9d18-b79b-4df8-94a8-51219e063bf4"
    id = "Joe"
    parentId = "_Root"
    name = "Joe"

    vcsRoot(Test_Bla)
})
