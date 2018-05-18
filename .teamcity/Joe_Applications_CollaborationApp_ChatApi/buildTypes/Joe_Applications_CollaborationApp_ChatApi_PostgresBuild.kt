package Joe_Applications_CollaborationApp_ChatApi.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.exec

object Joe_Applications_CollaborationApp_ChatApi_PostgresBuild : BuildType({
    uuid = "ab2fece3-7a70-4d59-b7b1-64c3c958cb15"
    id = "Joe_Applications_CollaborationApp_ChatApi_PostgresBuild"
    name = "postgres build"

    steps {
        exec {
            name = "Pull image"
            path = "docker"
            arguments = "pull postgres"
        }
        exec {
            name = "tag the image"
            path = "docker"
            arguments = "tag postgres docker-registry.joe.com/collaboration-app-chat-api-db-dev:latest"
        }
        exec {
            name = "Push the image"
            path = "docker"
            arguments = "push docker-registry.joe.com/collaboration-app-chat-api-db-dev:latest"
        }
    }

    requirements {
        equals("teamcity.agent.hostname", "vm-internal-staging")
    }
})
