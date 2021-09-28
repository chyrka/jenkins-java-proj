job("Tomcat-freestyle-project") {
	description()
	keepDependencies(false)
	scm {
		git {
			remote {
				github("chyrka/Java_test", "https")
				credentials("gcp-jenkins")
			}
			branch("*/master")
		}
	}
	disabled(false)
	concurrentBuild(false)
	steps {
		shell("""#mvn clean test
#mvn archetype:generate -DarchetypeGroupId=org.glassfish.jersey.archetypes -DarchetypeArtifactId=hello-world-webapp
#javac HelloWorld.java  
#java HelloWorld""")
	}
}
