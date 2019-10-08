Инструкци по запуску сервиса отправки завок в Ведомство

Запустить файл receiver_3.cmd (java -jar target/receiver-1.0.jar)

Swagger : http://localhost:8080/swagger-ui.html

POST Запрос http://localhost:8080/api/request/new

1. Формат запроса : 

{
  "depcode": "string",
  "depname": "string",
  "descriptions": [
    "string"
  ],
  "files": [
    "string"
  ],
  "issuedate": "string",
  "lastname": "string",
  "name": "string",
  "num": "string",
  "pat": "string",
  "ser": "string",
  "service": "string"
}

где :
	"depcode" - код подразделения, выдавшео паспорт 
	"depname" - наименование подразделения, выдавшео паспорт 
	"descriptions" - описания прилагаемых файлов 
	"files" - список контента файлов аттачей в формате Base64 
	"issuedate" - дата выдачи паспорта 
	"lastname" - фамиляи клиента 
	"name" - имя клиента 
	"pat" - отчество клиента 
	"ser" - серия паспорта клиента 
	"num" - номер паспорта клиента 
	"service" - наиемонвание услуги 

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
	   "errorCode": 1 - ошибка в данных при отправки запроса, в поле "errorText" указывается описание ошибки, например : 
	   "errorCode": 2 - системная ошибка
   "errorText" - тест ошибки

Пример :

		{
		  "errorCode": 1,
		  "errorText": [
		    "Не указана услуга",
		    "Не указана фамилия",
		    "Не указано имя",
		    "Не указано отчество",
		    "Не указана серия паспорта",
		    "Не указан номер паспорта",
		    "Не указано подразделение, выдавшее паспорт",
		    "Не указан код подразделения, выдавшего паспорт",
		    "Не указана дата выдачи паспорта"
		  ]
		}

