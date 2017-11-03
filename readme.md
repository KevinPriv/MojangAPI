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
Mojang API Requests
```java
public class MojangAPIExample {

    public static void main(String[] args) {
        try {
            System.out.println("--Name History--");
            MojangAPI.getNameHistory("8233b1e5bd74441baa34ee812263cca9").forEach(name -> {
                System.out.println(name.getName());
        });

            System.out.println("--Website Status--");
            MojangAPI.getStatus().forEach((url, status) -> System.out.println(url + " is " + status));

            System.out.println("--Sale Statistics--");
            System.out.println(MojangAPI.getStatistics(MetricKeys.ITEM_COBOLT).getTotal());
            System.out.println(MojangAPI.getStatistics(MetricKeys.ITEM_MINECRAFT).getSaleVelocityPerSeconds());
            System.out.println(MojangAPI.getStatistics(MetricKeys.ITEM_SCROLLS).getLastDay());
            System.out.println(MojangAPI.getStatistics(MetricKeys.PREPAID_MINECRAFT).getLastDay());

            System.out.println("--UUID from Username--");
            System.out.println(MojangAPI.getUUID("TheDestinyPig"));

        } catch(Exception e) {
            e.printStackTrace();
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
        compile "com.github.KevinPriv:HypixelApi4J:API-1.3"
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
    <version>API-1.3</version>
</dependency>

```

      
     
