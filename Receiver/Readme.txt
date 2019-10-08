��������� �� ������� ������� �������� ����� � ���������

��������� ���� receiver_3.cmd (java -jar target/receiver-1.0.jar)

Swagger : http://localhost:8080/swagger-ui.html

POST ������ http://localhost:8080/api/request/new

1. ������ ������� : 

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

��� :
	"depcode" - ��� �������������, �������� ������� 
	"depname" - ������������ �������������, �������� ������� 
	"descriptions" - �������� ����������� ������ 
	"files" - ������ �������� ������ ������� � ������� Base64 
	"issuedate" - ���� ������ �������� 
	"lastname" - ������� ������� 
	"name" - ��� ������� 
	"pat" - �������� ������� 
	"ser" - ����� �������� ������� 
	"num" - ����� �������� ������� 
	"service" - ������������ ������ 

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
	   "errorCode": 1 - ������ � ������ ��� �������� �������, � ���� "errorText" ����������� �������� ������, �������� : 
	   "errorCode": 2 - ��������� ������
   "errorText" - ���� ������

������ :

		{
		  "errorCode": 1,
		  "errorText": [
		    "�� ������� ������",
		    "�� ������� �������",
		    "�� ������� ���",
		    "�� ������� ��������",
		    "�� ������� ����� ��������",
		    "�� ������ ����� ��������",
		    "�� ������� �������������, �������� �������",
		    "�� ������ ��� �������������, ��������� �������",
		    "�� ������� ���� ������ ��������"
		  ]
		}

