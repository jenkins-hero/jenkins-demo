pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJobgroovy'))
            sandbox()
        }
    }
}