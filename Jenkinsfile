pipeline {
    agent any
    tools {
        maven 'maven_3_5_0'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/MriGun/spring-evenr']])
                bat 'mvn clean install'
            }
        }
        stage('Build docker image') {
            steps{
                script{
                    bat 'docker build -t mrinmoy007/docker-jenkins-integration-sample .'
                }
            }
        }
        stage('Push Image to Hub') {
            steps{
                script{
                    withCredentials([string(credentialsId: 'docker-mri-pass', variable: 'dockerhubpwd')]) {
                        bat 'docker login -u mrinmoy007 -p @Mpass123'
                    }
                    bat 'docker push mrinmoy007/docker-jenkins-integration-sample'
                }
            }
        }
    }
}