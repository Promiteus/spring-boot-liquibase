### Проект Liquibase + Spring Boot  

1. Приложение создано в Spring Boot 3 фреймворке для демонтсрации работы Liquibase - механизма миграции базы данных.
Созданы три модели:  
* User (связи User 1->& Author )
* Author (связи Author 1->& Article )
* Article  

2. Для эксперимета используется база данных H2 и после запустка проекта на нее можно перейти по ссылке http://localhost:8080/h2-console .
3. В каталоге resources/db/changelog проекта находятся файлы миграции, при помощи которых созжаются таблицы базы данных. Файл db.changelog-master.yml описывает файлы миграции по порядку сверху вниз, которые нужно будет запустить.  

#### Запуск проекта  

1. Сборка. Вызвать в корне проекта команду:  
```
mvn clean package
```
При сборке проекта происходит проверка файлов миграций на предмет новых записей и происходит их накат в базу данных.  
2. Запуск приложения.  Вызвать в корне проекта команду:  
```
mvn spring-boot:run
```
3. Перейти по ссылке в браузере для оценки результата: http://localhost:8080/h2-console