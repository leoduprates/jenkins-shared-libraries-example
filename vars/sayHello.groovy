def call(Map config = [:]) {
    // Any valid steps can be called from this code and combined with groovy and java.
    sh("echo 'Hello, ${config.name}!'")
}