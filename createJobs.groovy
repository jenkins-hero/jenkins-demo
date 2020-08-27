pipelineJob('gingerauthenticator-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/jtjoa/onboardapi.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}