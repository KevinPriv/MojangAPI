# HypixelApi4J
Parses the Hypixel API and allows easy access by getters
Now includes full MojangAPI suppport!

Examples: 
-
https://github.com/KevinPriv/HypixelApi4J/tree/master/src/test/java/examples

Downloads
-
https://github.com/KevinPriv/HypixelApi4J/releases  

Gradle
-
```gradle
    allprojects {
        repositories {
            maven { url 'https://jitpack.io' }
        }
    }
```
Adding the dependency:
```gradle
    dependencies {
        compile "com.github.KevinPriv:HypixelApi4J:API-1.5"
        compile group: 'com.google.code.gson', name: 'gson', version: '2.8.2'
        compile 'com.squareup.okhttp3:okhttp:3.9.0'

    }

```
Maven
-
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
      
 ```
 Adding the dependency:
```xml
<dependency>
    <groupId>com.github.KevinPriv</groupId>
    <artifactId>HypixelApi4J</artifactId>
    <version>API-1.5</version>
</dependency>
<dependency>
    <groupId>com.squareup.okhttp3</groupId>
    <artifactId>okhttp</artifactId>
    <version>3.9.0</version>
</dependency>
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.2</version>
</dependency>

```

      
     
