# JavaSample
### gradle and android sdk

Starting from version 26 of support libraries make sure that the repositories section includes a maven section with the "https://maven.google.com" endpoint.

Something like:
```
allprojects {
    repositories {
        jcenter()
        maven {
            url "https://maven.google.com"
        }
    }
}
```
