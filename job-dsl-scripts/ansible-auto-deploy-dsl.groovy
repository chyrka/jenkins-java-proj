job("ansible-auto-deploy") {
	description()
	keepDependencies(false)
	scm {
		git {
			remote {
				github("chyrka/hello-world-java", "https")
				credentials("gcp-jenkins")
			}
			branch("*/master")
		}
	}
	disabled(false)
	concurrentBuild(false)
}
