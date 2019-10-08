Инструкци по запуску сервиса отправки завок в МВД для проверки паспортных данных

Запустить файл dep_service.cmd (java -jar target/depservice-1.0.jar)

Swagger : http://localhost:8082/swagger-ui.html

POST Запрос http://localhost:8082/api/service/search

1. Формат запроса : 

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
  "errorCode": 0,
  "passport": {
    "id": 3,
    "ser": "1683",
    "number": "485920",
    "mvd": {
      "id": 3,
      "depname": "ПВС УВД г. Армавира",
      "code": "254-125"
    },
    "issuedate": "2007-09-23T20:00:00.000+0000",
    "lastname": "Пантелеев",
    "name": "Сергей",
    "pat": "Сергеевич",
    "active": false
  },
  "errorText": null
}

{
  "errorCode": 1,
  "passport": null,
  "errorText": [
    "База МВД : паспорт не найден"
  ]
}