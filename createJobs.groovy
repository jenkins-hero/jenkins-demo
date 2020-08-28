pipelineJob('gingerauthenticator-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'git@github.com:jtjoa/onboardapi.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}