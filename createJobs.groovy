pipelineJob('pipelineJob') {
  definition {
    cps {
      script(readFileFromWorkspace('pipelineJob.groovy'))
      sandbox()
    }
  }
}

pipelineJob('theme-park-job') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url 'https://github.com/bmribeiro/jenkins-demo.git'
          }
          branch 'master'
        }
      }
    }
  }
}