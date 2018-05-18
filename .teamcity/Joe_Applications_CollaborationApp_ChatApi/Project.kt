package Joe_Applications_CollaborationApp_ChatApi

import Joe_Applications_CollaborationApp_ChatApi.buildTypes.*
import Joe_Applications_CollaborationApp_ChatApi.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project

object Project : Project({
    uuid = "389fff48-742b-48cc-b04c-c6d49800179f"
    id = "Joe_Applications_CollaborationApp_ChatApi"
    parentId = "Joe_Applications_CollaborationApp"
    name = "Chat API"

    vcsRoot(Joe_Applications_CollaborationApp_ChatApi_CollaborationAppChatApi)

    buildType(Joe_Applications_CollaborationApp_ChatApi_PostgresBuild)
})
