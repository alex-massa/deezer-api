# deezer-api
A Java wrapper for the Deezer API.

## Installation
Run the Maven goal `mvn clean install` on the project root containing the `pom.xml` file, then include the artifact's dependency in your project.
```xml
<dependency>
    <groupId>deezer-api</groupId>
    <artifactId>deezer-api</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

## Usage
Simply create a new `DeezerClient` object and use its methods to interact with the API.

Example snippet that retrieves an artist object, then its albums and its first 15 fans:
```java
DeezerClient client = new DeezerClient();
final int artistId = 27;
Artist artist = client.getArtist(artistId);
Albums albums = client.getArtistAlbums(artistId);
Users fans = client.getArtistFans(artistId, 0, 15);
```

### Notices
The wrapper doesn't currently support authentication and thus any actions (methods using `POST` or `DELETE` requests) on the service, but as long as you're concerned about retrieving data from the API, you should be good to go.

The content of the various objects fields may vary depending on the method(s) used to retrieve them. E.g.: an instance of a `Track` object retrieved via a `Chart` will have a value set to its `position` attribute; however, if the instance is retrieved using, for example, the `DeezerClient.getTrack()` method, calling `getPosition()` on the `Track` instance will return `null`.
This applies for multiple objects and methods available throughout the model and it's a consequence of the way the API was designed to behave. Always check if your object's "optional" fields actually hold any values before carrying operations that require them, and, if not, retrieve the object again using alternative ways (for example, by using the object's ID).