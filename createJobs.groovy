pipelineJob('gingerauthenticator-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'git@github.com:jtjoa/GingerNASPBackEnd.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}