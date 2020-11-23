static def call () {

    pipeline {
        agent {
	    label 'master'
	    docker {
                image 'alpine:3.12'
            }
        }
    }
    stages {
        stage("Test") {
            steps {
                script {
                    echo "Function test"
                }
            }
        }
    }

}
