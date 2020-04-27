# Lab 1
## 1.
+ Class : a template to create object. 
    ```java
        public class something{
            String some;
        }
    ```
+ Object: a product built upon a class.
    ```java
        Object something = new Object();
    ```
+ Instatiation of object using "new" keyword
    ```java 
        Object something = new Object();
    ```
+ Visibility (public / private / protected) 
    + ***public :*** can be access from everywhere 
        ```java
            public String data;
        ```
    + ***protected :*** only current class and subclass of the same class can access
        ```java
            pricate String data;
        ```
    + ***pricate :*** only current class can access
        ```java
            protected String data;
        ```
+ Member datas / methods : variable of an object
+ Inheritance : passing properties and behaviors of an parents object to its children
    ```java
        class parent{
            private static String data;
            static String getData(){
                return data;
            }
        }
        class child{
            String parentData = parent.getData();
        }
    ```
+ Interface : Interface is an abstract class, which groups related methods. These methods are empty and are filled when the interface is used in a class for example.
    ```java
        interface interfaceEx{
            void exMethod()
        }
        class exClass implement interfaceEx{
            public void exMethod(){
            }
        }
    ```
+ Polymorphism : perform an action in different ways
    ```java
        public class parent{}
        public interface interfaceEx{}
        public class child extends parents implements interfaceEx{}
    ```
+ Overriding : when a subclass has the same methods declared in parents class
    ```@Override```
+ Abstract classes : is a way to hind how to do only show what it do
    ```java
        abstract class ex{
            abtract void run()
        }
    ```
## 3.
1. Java, C++ and Kotlin
2. apk file is an android package file used to distribute app
3. Android system runs app similiar to the way linux handling multi-users by giving each app an user ID.
4. Android app contains 4 main components : 
+ **Activities:** representing a single screen with user interface.
+ **Service:** runs in the background to for example collect data or play music. It keeps the app alive even though the user doesn’t interact with it, and it doesn’t have an interface.
+ **Broadcast receiver:** allows the app to receive system-wide notifications.
+ **Content provider:** manages access to data. This includes sharing access to an apps data to other applications, sending data to a widget, synchronizing app data etc.
5. Manifest file used to tell the system what does the app has and require to run.
6. App resources are everything that isn't the source code like images, audio files, etc... These things helps the application better optimized and easier to adapt to multiple device configurations.