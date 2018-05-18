object TestBuild : BuildType({
    extId = "TestBuild"
    name = "Test Build"
    steps {
        script {
            scriptContent = """echo hello"""
        }
    }
})
