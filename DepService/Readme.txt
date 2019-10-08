Инструкци по запуску сервиса отправки заявок в Департамент для проверки валидности услуг

Запустить файл dep_service.cmd (java -jar target/depservice-1.0.jar)

Swagger : http://localhost:8083/swagger-ui.html

POST Запрос http://localhost:8083/api/service/search

1. Формат запроса : 

{
  "name": "string"
}
где :
	"name" - наименование услуги

Формат ответа : 

{
  "errorCode": 0,
}

где :
   "errorCode" - код ошибки
	   "errorCode": 0 - услуга найдена в Департаменте
	   "errorCode": 1 - услуга не найдена в Департаменте

Пример :

{
  "errorCode": 1,
}