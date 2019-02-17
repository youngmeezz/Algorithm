//HTTP 데이터 저장 서버
//사용자 별로 데이터를 저장할 수 있는 서비스 제공
//코니를 도와 서버 구현

//HTTP Request를 받고,처리하는 API는 다음과 같이 3개의 EndPoint가 있따.


// /users/{UserId}       POST           사용자생성
// /users/{UserId}/data  POST ->data      사용자 데이터 저장
// /users/{UserId}/data  GET        ->data  User ID로 지정된 사용자의 Data를 리턴

//*** */사용자 데이터 생성 API
//?	/users/{UserId}를 Endpoint로 가지며 POST Method를 이용한다.
//POST /users/CONY
//->성공했다면 201
//->존재하는 UserId라면 403
//GET METHOD를 이용하여 REQUEST를 보내는 경우, 405코드와 그에 대응되는 메시지 리턴
/*
201 CREATED
403 FORBIDDEN
405 METHOD_NOT_ALLOWED
*/

//*** */사용자 데이터 저장 API
//?	/users/{UserId}/data Endpoint로 가지며 POST Method를 통하여 사용자 데이터를 저장한다.
//?저장할 Data는 Message Body를 통하여 전달된다.
//value=DATA 형식으로 데이터가 전달된다. 해당 형식을 위반하는 rerquest는 존재하지 않는다.
//Data는 공백과 =이 없는 String이다.
//?	동일 사용자에게 API가 연속적으로 불리면 Overwrite되어 가장 최근 Data만 저장된다.
//POST /users/CONY/data value=TEST_DATA
//->성공했다면 200
//->UserId를 갖는 사용자가 없는 경우 403
//GET Method를 이용하여 Request를 보내는 경우, 405
/*
200 OK
403 FORBIDDEN
405 METHOD_NOT_ALLOWED
*/
//*** */사용자 데이터 조회API
//UserId를 갖는 사용자의 저장된 데이터를 조회하는 API이다.
//사용자 데이터 저장 API와 동일한 /users/{UserId}/data Endpoint를 가지며 GET Method를 통하여 사용자 데이터를 조회한다.
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
