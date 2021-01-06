# Java Spring
동아리에서 제휴한 패스트캠퍼스 강의 수강중 

## lec01, lec02 
이부분은 학교수업에서 배운 내용이라 skip 하였음!

## lec03 스프링부트(어드민 페이지)
### 기초 공부용
- Intellij, Mysql 설치 (Mysql root 계정 비밀번호 잃어버려서 고치느라 애먹었다 ^_ㅠ)
- REST API 실습
   - HTTP - GET Method
   - HTTP - POST Method
   - HTTP - PUT/PATCH Method
   - HTTP - DELETE Method
- Lombok 과 JPA
   - Lombok
   - JPA CRUD
   - JPA 연관관계 설정

### 프로젝트
- ERD 설계, Table, Entity 생성
- Repository 생성, 테스트
- 연관관계 설정
- 필요한 Query Method 생성
- JPA 추가기능
- Lombok를 이용한 생성자 패턴
- RestAPI와 CRUD
- 코드 리팩토링
   - JPA Enum 형태 값 관리
   - Null Point 수정
   - 추상화
- 샘플데이터
- 페이징처리   

## lec04 스프링부트(지인정보 관리 시스템)
Iteration(반복주기) 개발로 2-cycle 개발 진행
### 1-cycle
1)JPA : data 관련
- entity 생성 : @Entity => Person, Block(나중에 boolean으로 변경)
- @OneToOne Relation => Block
     - cascadeType
     - FetchType
     - Optional, orphanRemoval

- QueryMethod
     - @Embedded => birthday(@Embeddable)
     - @Valid => birthday(날짜)
     - @Query => customizing된 query 사용
     - @Where (for soft delete) => person의 delete
     - Data.sql => test에서 데이터 이용 

2)SpringMVC : 
 @GetMapping 
 @PostMapping 
 @PutMapping 
 @PatchMapping 
 @DeleteMapping
 @PathVariable 
 @RequestBody 

3)Lombok :
 @Getter
 @Setter
 @ToString
 @Constructor
 @EqualsAndHashCode
 @Data

4)SpringTest : log 콘솔

5)Java8 : Stream,Filter, Map

### 2-cycle
1)SpringMVC : CustomJsonSerializer 

2)SpringTest : MockMvc Test, Matcher, Junit5

3)MockTest : Mockito, CustomArgumentMatcher 

4)Exception Handling : CustomException, ExceptionHandler, GlobalExceptionHandler (@RestControllerAdvice)

5)Parameter Validator : @NotEmpty, @NotBlank, @Valid 

6)Paging : Pageable, Page<T>


## lec05 스프링부트(레스토랑 예약 사이트)

## lec06 스프링 프레임워크 실습 및 프로젝트


