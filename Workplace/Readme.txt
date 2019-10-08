��������� �� �������� ������ � ���������

��������� ���� workplace_3.cmd (java -jar target/workplace-1.0.jar)

��������� ������ : 

curl -X POST http://localhost:8081/auth/signin -H "Content-Type:application/json" -d "{\"username\":\"user\", \"password\":\"password\"}"

����� : 
{
  "username" : "user",
  "token" : "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyIiwicm9sZXMiOlsiUk9MRV9VU0VSIl0sImlhdCI6MTU3MDQzMDcyNiwiZXhwIjoxNTcwNDM0MzI2fQ.6FaErdIi_7DEf-ukRhPmlocnaW5MwDxcEB982MHcr4A"
}


1. POST ������ http://localhost:8081/api/request/search - ����� ������ � ����������� ���������� ���������� �� ������ ����

������ ������� : 

curl -X POST "http://localhost:8081/api/request/search" -H "accept: */*" -H "Content-Type:application/json" 
-H "Authorization: Bearer <TOKEN>" 
-d "{ \"date\": \"<value>\", \"fio\": \"<value>\", \"orderIndex\": <value>, \"searchType\": \"<value>\", 
\"service\": \"<value>\", \"state\": \"<value>\"}"

��� :

  "searchType" - ������������ ����, �� �������� ������������ ����� (
	"date" - �� ���� �����, 
	"fio" - �� ��� ������������, 
	"service" - �� ������������ ������, 
	"state" - �� ������� ������
  )
  "date": - �������� ���� ������ ��� ������
  "fio": - ����� ������ ��� ��� ������
  "service": - ������������ ������
  "state": - ������ ������ ("active", "inactive", "all")
  "orderIndex" - ������ ���� ��� ���������� (1..4)

������ ������ : 

{
  "errorCode": 0,
  "errorText": [
    "string"
  ],
  "resultList": [
    {}
  ]
}
��� :
   "errorCode" - ��� ������
	   "errorCode": 0 - �������
	   "errorCode": 1 - ������ � ������ ��� �������� �������, � ���� "errorText" ����������� �������� ������: 
   "errorText" - ���� ������
   "resultList" - ������ ��������� � ��������������� ������

������ 

������ : 

curl -X POST "http://localhost:8081/api/request/search" -H "accept: */*" -H "Content-Type:application/json" 
-H "Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyIiwicm9sZXMiOlsiUk9MRV9VU0VSIl0sImlhdCI6MTU3MDQzMDcyNiwiZXhwIjoxNTcwNDM0MzI2fQ.6FaErdIi_7DEf-ukRhPmlocnaW5MwDxcEB982MHcr4A" 
-d "{ \"orderIndex\": 2, \"searchType\": \"state\", \"state\": \"all\"}"

����� : 

{
  "errorCode": 0,
  "resultList": [
    [
      1,
      "������ � 1",
      "2019-10-07",
      "�������� ����� ���������",
      "�������"
    ],
    [
      3,
      "������ � 3",
      "2019-10-05",
      "��������� ������ ���������",
      "�������"
    ],
    [
      2,
      "������ � 2",
      "2019-10-06",
      "������ ���� ��������",
      "�������"
    ]
  ],
  "errorText": null
}

2. GET ������ http://localhost:8081/api/request/api/request/detailed - ����������� ������

������ ������� : 

curl -X GET "http://localhost:8081/api/request/detailed" -H "accept: */*" -H "Content-Type:application/json" 
-H "Authorization: Bearer <TOKEN>" 
-d "{ \"id\": <value>}"

��� :

  "id" - ������������� ������

������ ������ : 

{
  "errorCode": 0,
  "errorText": [
    "string"
  ],
  "result": {
    "attachments": [
      {
        "description": "string",
        "name": "string"
      }
    ],
    "date": "string",
    "id": 0,
    "passport": {
      "code": "string",
      "depname": "string",
      "issuedate": "string",
      "lastname": "string",
      "name": "string",
      "number": 0,
      "pat": "string",
      "ser": 0
    },
    "serviceName": "string",
    "terminated": true
  }
}

������

������:

curl -X GET "http://localhost:8081/api/request/detailed" -H "accept: */*" -H "Content-Type:application/json" 
-H "Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyIiwicm9sZXMiOlsiUk9MRV9VU0VSIl0sImlhdCI6MTU3MDQzMDcyNiwiZXhwIjoxNTcwNDM0MzI2fQ.6FaErdIi_7DEf-ukRhPmlocnaW5MwDxcEB982MHcr4A" 
-d "{ \"id\": 1}"

�����:

{
  "errorCode": 0,
  "result": {
    "id": 1,
    "date": "07-10-2019",
    "terminated": false,
    "passport": {
      "ser": 2804,
      "number": 352379,
      "depname": "��� ������������ ������ �. ����������",
      "code": "232-005",
      "issuedate": "02.04.1998",
      "lastname": "��������",
      "name": "�����",
      "pat": "���������"
    },
    "serviceName": "������ � 1",
    "attachments": [
      {
        "name": "8eb3a28e-cf8d-4e21-a7f8-6502644b8384.jpg",
        "description": "�������� � 2"
      },
      {
        "name": "381d01ef-4448-4570-8da0-e0399d5ee891.jpg",
        "description": "�������� � 1"
      }
    ]
  },
  "errorText": null
}

3. POST ������ http://localhost:8081/api/request/terminate - ���������� ������

������ ������� : 

curl -X GET "http://localhost:8081/api/request/terminate" -H "accept: */*" -H "Content-Type:application/json" 
-H "Authorization: Bearer <TOKEN>" 
-d "{ \"id\": <value>}"

��� :

  "id" - ������������� ������

������ ������ : 

{
  "errorCode": 0,
  "errorText": "string"
}

������

������:

curl -X GET "http://localhost:8081/api/request/terminate" -H "accept: */*" -H "Content-Type:application/json" 
-H "Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyIiwicm9sZXMiOlsiUk9MRV9VU0VSIl0sImlhdCI6MTU3MDQzMDcyNiwiZXhwIjoxNTcwNDM0MzI2fQ.6FaErdIi_7DEf-ukRhPmlocnaW5MwDxcEB982MHcr4A" 
-d "{ \"id\": 1}"

�����:

{
  "errorCode": 0,
  "errorText": "������ �������������"
}