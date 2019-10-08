Инструкци по запуску сервиса отправки завок в Ведомство

Запустить файл dep_service.cmd (java -jar target/depservice-1.0.jar)

Swagger : http://localhost:8082/swagger-ui.html

POST Запрос http://localhost:8082/api/service/search

1. Формат запроса : 
/
{
  "ser": "string"
  "num": "string",
}
где :
	"ser" - серия паспорта клиента 
	"num" - номер паспорта клиента 

Формат ответа : 

{
  "errorCode": 0,
  "errorText": [
    "string"
  ]
}

где :
   "errorCode" - код ошибки
	   "errorCode": 0 - успешно
	   "errorCode": 1 - ошибка, в поле "errorText" указывается описание ошибки, например : 
	   "errorText" - тест ошибки

Пример :

{
  "errorCode": 1,
  "passport": null,
  "errorText": [
    "База МВД : паспорт не найден"
  ]
}