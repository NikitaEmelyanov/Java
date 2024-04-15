package Java_EE;

/**
 * Урок 1. Введение. HTTP - Request и Response
 */

public class Les1_HTTP_Request_Response {
    public static void main(String[] args) {
        //Java EE == Java Enterprise Edition, предназначен для описания архитектуры серверной
        // платформы для задач средних и крупных предприятий. (Проще говоря позволяет писать код,
        // который будет работать на сервере). Java EE считается низкоуровневой технологией,
        // поскольку тут мы непосредственно сами будем работать с запросами и ответами и ее
        // изучение нужно для понимания работы серверов, сервлетов и прочего. Чаще всего
        // используются фреймворки сильно облегчающие работу. Например, Spring Framework.

        //                              Клиент - сервер
        //       HTTP Request
        //                  \
        //                 Запрос (request)
        // Клиент -------------------------------------> Сервер
        //        <-------------------------------------      URL (Uniform Resource Locator)
        //                 Ответ (response)
        //                                \
        //                                HTTP Response

        //У каждого HTTP запроса есть структура:
        // 1) Headers (Заголовки)
        // 2) Тело запроса
        //Внутри заголовков есть методы, с помощью которых клиент дает понять серверу,
        // что хочет получить

        //Основные HTTP-request Методы:
        // 1) GET - дает понять серверу, что клиент хочет получить данные от сервера, при том ничего
        // не будет меняться на сервере (Обращение к веб странице, Ввод запроса в поисковую строку и тд)
        // 2) POST - Меняем что-то на сервере (Заливка видео, смена персональных данных, смена
        // пароля от учетной записи и тд)

        //HTTP - response (То, что приходит с сервера)
        // 1) Сами запрашиваемые данные (HTML, XML, JSON) (Тело ответа)
        // 2) Ряд заголовков
        // - Content-type - тип возвращаемого значения, который прислал сервер
        // - Status - Статус запроса
        // - Date - Дата
        // - и тд

        //HTTP - response Status
        // 200 - Все ОК
        // 3хх - Редирект (Переход на другую страницу)
        // 4хх - Ошибка клиента
        // 5хх - Ошибка сервера

        //HTTP - response Content-type (Тип содержимого)
        // text/html - обычная html страница
        // text/css - файлы стилей
        // text/xml - xml файлы
        // application/json - json файлы
        // и тд

        //Сервер получает запрос и генерирует ответ от пользователя. Ответ может быть статическим
        // или динамическим.
        //                                                        БД              - Java
        //                                                       //               - Tomcat
        //   Клиент ------> Сервер ------> Серверное приложение (Java код)        - Сервлеты
        //          <------        <------                       \\               - JSP
        //                                                        ???             - JDBC
        //                                                                        - Spring
    }
}
