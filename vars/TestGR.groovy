def call () {

    pipeline {
        agent {
	        docker { image 'alpine:3.12' }
        }

        stages {
            stage("Test") {
                steps {
                    script {
                        echo "Function tesh"
                    }
                }
            }
        }
    }

}
