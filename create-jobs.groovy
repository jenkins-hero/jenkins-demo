pipelineJob('pipeline-job') {
    definition {
        cps {
            script(readFileFromWorkspace('pipeline-job.groovy'))
            sandbox()
        }
    }
}