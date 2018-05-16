package Test.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object Test_Bla : GitVcsRoot({
    uuid = "d7649b4d-65f3-4d14-a08a-ff1ac9d03238"
    id = "Test_Bla"
    name = "bla"
    url = "https://github.com/schmidtjohannes/teamcity-kotlin-poc.git"
    authMethod = password {
        userName = "schmidtjohannes"
        password = "zxxdf449d5bf3ebe45edd74b1cbab95def2"
    }
})
