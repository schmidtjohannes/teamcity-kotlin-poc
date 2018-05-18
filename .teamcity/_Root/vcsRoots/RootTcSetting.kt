package _Root.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object RootTcSetting : GitVcsRoot({
    uuid = "1944b519-031b-43bf-a147-c0924dac6f64"
    id = "RootTcSetting"
    name = "root-tc-setting"
    url = "https://github.com/schmidtjohannes/teamcity-kotlin-poc.git"
    pushUrl = "https://github.com/schmidtjohannes/teamcity-kotlin-poc.git"
    authMethod = password {
        userName = "schmidtjohannes"
        password = "zxxdf449d5bf3ebe45edd74b1cbab95def2"
    }
})
