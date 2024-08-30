def call(){
    sh 'mvn clean package sonar:sonar --add-opens jdk.compiler/com.sun.tools.javac.processing=ALL-UNNAMED'
}