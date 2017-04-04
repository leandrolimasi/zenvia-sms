# ZENVIA-SMS

API for send SMS with Zenvia Framework

## Install

    $ mvn clean install
    
## Setup

### Maven Dependency

    
```xml
    <dependency>
        <groupId>br.com.incodee</groupId>
        <artifactId>zenvia-sms</artifactId>
        <version>1.0</version>
    </dependency>
```


### Property File

Should be created a file zenvia.properties in resources like this:

    zenvia.user=user
    zenvia.password=password
    
   
## Usage

```java

@Inject
private ZenviaSMSManager zenviaSMSManager;


---

zenviaSMSManager.sendSms(...);

---

```

