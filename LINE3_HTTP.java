//HTTP ������ ���� ����
//����� ���� �����͸� ������ �� �ִ� ���� ����
//�ڴϸ� ���� ���� ����

//HTTP Request�� �ް�,ó���ϴ� API�� ������ ���� 3���� EndPoint�� �ֵ�.


// /users/{UserId}       POST           ����ڻ���
// /users/{UserId}/data  POST ->data      ����� ������ ����
// /users/{UserId}/data  GET        ->data  User ID�� ������ ������� Data�� ����

//*** */����� ������ ���� API
//?	/users/{UserId}�� Endpoint�� ������ POST Method�� �̿��Ѵ�.
//POST /users/CONY
//->�����ߴٸ� 201
//->�����ϴ� UserId��� 403
//GET METHOD�� �̿��Ͽ� REQUEST�� ������ ���, 405�ڵ�� �׿� �����Ǵ� �޽��� ����
/*
201 CREATED
403 FORBIDDEN
405 METHOD_NOT_ALLOWED
*/

//*** */����� ������ ���� API
//?	/users/{UserId}/data Endpoint�� ������ POST Method�� ���Ͽ� ����� �����͸� �����Ѵ�.
//?������ Data�� Message Body�� ���Ͽ� ���޵ȴ�.
//value=DATA �������� �����Ͱ� ���޵ȴ�. �ش� ������ �����ϴ� rerquest�� �������� �ʴ´�.
//Data�� ����� =�� ���� String�̴�.
//?	���� ����ڿ��� API�� ���������� �Ҹ��� Overwrite�Ǿ� ���� �ֱ� Data�� ����ȴ�.
//POST /users/CONY/data value=TEST_DATA
//->�����ߴٸ� 200
//->UserId�� ���� ����ڰ� ���� ��� 403
//GET Method�� �̿��Ͽ� Request�� ������ ���, 405
/*
200 OK
403 FORBIDDEN
405 METHOD_NOT_ALLOWED
*/
//*** */����� ������ ��ȸAPI
//UserId�� ���� ������� ����� �����͸� ��ȸ�ϴ� API�̴�.
//����� ������ ���� API�� ������ /users/{UserId}/data Endpoint�� ������ GET Method�� ���Ͽ� ����� �����͸� ��ȸ�Ѵ�.
//GET /users/CONY/data

/*
8
POST /users/CONY
POST /users/BROWN
POST /users/CONY/data value=WHERE_IS_SALLY
GET /users/CONY/data
GET /users/BROWN/data
GET /users/EDWARD/data
GET /abc
GET /users/CONY
*/

/*
201 CREATED
201 CREATED
200 OK
200 OK WHERE_IS_SALLY
404 NOT_FOUND
403 FORBIDDEN
404 NOT_FOUND
405 METHOD_NOT_ALLOWED
*/
