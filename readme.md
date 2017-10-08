# HypixelApi4J
Parses the Hypixel API and allows easy access by getters

Examples: 
-
Getting Guild Data
```java
public class GuildExample {
      public static final String API_KEY = "PUT_YOUR_KEY_HERE";
  
      public static void main(String[] args) {
          try {
              // Creates an instance of the Hypixel API
              HypixelAPI api = new HypixelAPI(API_KEY);
              // Stores the GUILD_ID as a String
              String guildID = api.getGuildID("TheDestinyPig");
              // Gets GUILD from the GUILD_ID
              Guild guild = api.getGuild(guildID);
              System.out.println("Guild Name: " + guild.getName());
              System.out.println("Guild Coins: " + guild.getCoins());
              System.out.println("Guild Members: " + guild.getMembers().size());
              guild.getMembers().forEach(member -> System.out.println("Member UUID: " + member.getUuid()));
          } catch (IOException e) {
              // Error getting JSON from URL
              e.printStackTrace();
          } catch (InvalidPlayerException e) {
              // PLAYER NAME WAS INVALID
          } catch (APIException e) {
              // EITHER API KEY IS INVALID OR THE KEY IS THROTTLED
          }
  
      }
}
```  
Getting Player Data
```java
public class PlayerExample {
    public static final String API_KEY = "PUT_YOUR_KEY_HERE";

    public static void main(String[] args) {
        try {
            // Creates an instance of the Hypixel API
            HypixelAPI api = new HypixelAPI(API_KEY);
            // Creates an instance of the player
            Player player = api.getPlayer("Sk1er");
            System.out.println("Name: " + player.getPlayername());
            System.out.println("Level: " + player.getNetworkLevel());
            System.out.println("Last Version: " + player.getMcVersionRp());
            System.out.println("Youtube: " + player.getSocialMedia().getLinks().getYoutube());
        } catch (IOException e) {
            // Error getting JSON from URL
            e.printStackTrace();
        } catch (InvalidPlayerException e) {
            // PLAYER NAME WAS INVALID
        } catch (APIException e) {
            // EITHER API KEY IS INVALID OR THE KEY IS THROTTLED
        }

    }
}
```
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
        compile "com.github.KevinPriv:HypixelApi4J:API-1.0"
        // https://mvnrepository.com/artifact/com.google.code.gson/gson
        compile group: 'com.google.code.gson', name: 'gson', version: '2.8.2'
        // https://mvnrepository.com/artifact/org.apache.httpcomponents/httpclient
        compile group: 'org.apache.httpcomponents', name: 'httpclient', version: '4.5.3'
        // https://mvnrepository.com/artifact/org.apache.httpcomponents/httpcore
        compile group: 'org.apache.httpcomponents', name: 'httpcore', version: '4.4.7'

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
    <version>API-1.0</version>
</dependency>
<!-- https://mvnrepository.com/artifact/com.google.code.gson/gson -->
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.2</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.apache.httpcomponents/httpclient -->
<dependency>
    <groupId>org.apache.httpcomponents</groupId>
    <artifactId>httpclient</artifactId>
    <version>4.5.3</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.apache.httpcomponents/httpcore -->
<dependency>
    <groupId>org.apache.httpcomponents</groupId>
    <artifactId>httpcore</artifactId>
    <version>4.4.7</version>
</dependency>



```

      
     
