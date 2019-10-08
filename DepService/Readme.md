# Инструкция по запуску сервиса отправки заявок в Департамент для проверки валидности услуг

Запустить файл dep_service.cmd (java -jar target/depservice-1.0.jar)

Swagger : http://localhost:8083/swagger-ui.html

POST Запрос http://localhost:8083/api/service/search

<b>Формат запроса : </b>

{
  "name": "string"
}
где :
	"name" - наименование услуги

<b>Формат ответа : </b>

{
  "errorCode": 0,
}

где :
   "errorCode" - код ошибки
	   "errorCode": 0 - услуга найдена в Департаменте
	   "errorCode": 1 - услуга не найдена в Департаменте

<b>Пример :</b>

{
  "errorCode": 1,
}