# My Logger Library

Простая и удобная библиотека для логирования в Java-приложениях.

## Описание

Эта библиотека предоставляет простой и удобный способ логирования в Java-приложениях. Она позволяет выводить логи в консоль, файл и другие источники.

## Как использовать

1.  **Скачайте JAR-файл:**
    *   Перейдите на страницу [Releases](https://github.com/Vai-U-Vai/my-logger/releases) и скачайте последнюю версию JAR-файла (`my-logger-1.0.0.jar`).

2.  **Добавьте JAR-файл в свой проект:**

    *   **В IntelliJ IDEA:**
        *   File -> Project Structure -> Modules -> Dependencies
        *   Нажмите "+" -> "JARs or directories..."
        *   Выберите скачанный JAR-файл.

    *   **В Maven-проекте (после публикации в Maven Central или с использованием System Scope):**
        *   Добавьте следующую зависимость в ваш `pom.xml`:

        ```xml
        <dependency>
            <groupId>org.example</groupId>
            <artifactId>my-logger</artifactId>
            <version>1.0.0</version>
        </dependency>
        ```
        **Примечание:** Если библиотека еще не опубликована в Maven Central, можно использовать `System Scope` и указать путь к JAR-файлу.

    *   **В Gradle-проекте (после публикации в Maven Central):**
        *   Добавьте следующую зависимость в ваш `build.gradle`:
        ```gradle
        dependencies {
            implementation 'org.example:my-logger:1.0.0'
        }
        ```
        **Примечание:** Если библиотека еще не опубликована в Maven Central, можно использовать `flatDir` и указать путь к JAR-файлу.

    *   **Использование JitPack:**

        *   Добавьте JitPack в свой `pom.xml`:

        ```xml
        <repositories>
            <repository>
                <id>jitpack.io</id>
                <url>https://jitpack.io</url>
            </repository>
        </repositories>
        ```

        *   Или в `settings.gradle.kts`:
        ```kotlin
        dependencyResolutionManagement {
            repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
            repositories {
                mavenCentral()
                maven {
                    setUrl("https://jitpack.io")
                }
            }
        }
        ```

        *   Добавьте зависимость:

        ```xml
        <dependency>
            <groupId>com.github.Vai-U-Vai</groupId>
            <artifactId>my-logger</artifactId>
            <version>v1.0.0</version>
        </dependency>
        ```
        *   Или в `build.gradle.kts`:
        ```kotlin
        dependencies {
            implementation("com.github.Vai-U-Vai:my-logger:v1.0.0")
        }
        ```

### Пример кода

```java
// Пример использования библиотеки
import org.example.LogManager;
import org.example.Logger;

public class MyApp {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(MyApp.class);
        logger.info("Это информационное сообщение");
        logger.error("Это сообщение об ошибке");
    }
}