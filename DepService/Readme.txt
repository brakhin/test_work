��������� �� ������� ������� �������� ����� � ���������

��������� ���� dep_service.cmd (java -jar target/depservice-1.0.jar)

Swagger : http://localhost:8082/swagger-ui.html

POST ������ http://localhost:8082/api/service/search

1. ������ ������� : 

{
  "ser": "string"
  "num": "string",
}
��� :
	"ser" - ����� �������� ������� 
	"num" - ����� �������� ������� 

������ ������ : 

{
  "errorCode": 0,
  "errorText": [
    "string"
  ]
}

��� :
   "errorCode" - ��� ������
	   "errorCode": 0 - �������
	   "errorCode": 1 - ������, � ���� "errorText" ����������� �������� ������, �������� : 
	   "errorText" - ���� ������

������ :

{
  "errorCode": 1,
  "passport": null,
  "errorText": [
    "���� ��� : ������� �� ������"
  ]
}