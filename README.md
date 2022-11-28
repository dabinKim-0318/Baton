<br />
<p align='center'>
🏋️‍♀️안쓰는 헬스권, 내 근처에서 Baton Touch🏋️‍
 </p>

 
<p align='center'>
<img width="800" alt="01" src="https://user-images.githubusercontent.com/84564695/186646495-fda84301-59b8-4707-838c-22c72eac14a9.png">
 </p>
 

<p align='center'>
    <img src="https://img.shields.io/badge/kotlin-v1.6.21-blue?logo=kotlin"/>
    <img src="https://img.shields.io/badge/Retrofit2-v2.9.0-green?logo=Retrofit2"/>
    <img src="https://img.shields.io/badge/Hilt-v2.40.5-yellow?logo=Hilt"/>
 </p>
<p align='center'>
    <img src="https://img.shields.io/badge/Moshi-v1.12.0-brightgreen?logo=Moshi"/>
    <img src="https://img.shields.io/badge/Lifecycle-v2.4.1-blue?logo=Lifecycle"/>
    <img src="https://img.shields.io/badge/OkHttp-v4.9.2-orange?logo=OkHttp"/>
    <img src="https://img.shields.io/badge/Timber-v5.0.1-blue?logo=Ttimber">
</p>

<br>


# 📌 [목차](#index) <a name = "index"></a>

- [프로젝트 동기](#reason)
- [아이디어/개요](#outline)
- [아키텍처](#structure)
- [사용한 기술에 대한 근거](#why)
- [결과물](#outputs)
- [회고 및 배운점](#learn)
- [프로젝트 이후 리팩토링](#update)

# 📌Documents
- [API문서](https://baton.yonghochoi.com/search/swagger-ui/#/)  
- [인프라](https://yongho.gitbook.io/baton/) 
- [와이어프레임](https://www.figma.com/file/P0YfFNnvjwTpKJqDC4epC8/%F0%9F%A4%9D%EB%94%94%ED%94%84%EB%A7%8C_6%EC%A1%B0-%EB%B0%94%ED%86%B5?node-id=14430%3A3)
- [디자인](https://www.figma.com/file/P0YfFNnvjwTpKJqDC4epC8/%F0%9F%A4%9D%EB%94%94%ED%94%84%EB%A7%8C_6%EC%A1%B0-%EB%B0%94%ED%86%B5?node-id=15658%3A18578)  
- [디자인 시스템](https://www.figma.com/file/P0YfFNnvjwTpKJqDC4epC8/%F0%9F%A4%9D%EB%94%94%ED%94%84%EB%A7%8C_6%EC%A1%B0-%EB%B0%94%ED%86%B5?node-id=1901%3A31812) 
- [기획서](https://www.notion.so/depromeet/03-26-3b658740d7084b65b393520fff67f34a)

***

# 📌함께하는 사람들

| [김다빈](https://github.com/dabinKim-0318)                | [신승민](https://github.com/greedy0110)                | [김효민](https://github.com/HyomK)                | 
| ------------------------------------------------------- | -------------------------------------------------------- | --------------------------------------------------------- |
| <img src="https://user-images.githubusercontent.com/84564695/190450439-e798897d-8049-421e-b54c-919a582a6c5d.png" width="100"> | <img src="https://avatars.githubusercontent.com/u/16049092?v=4" width="100"> | <img src="https://avatars.githubusercontent.com/u/78139690?v=4" width="100"> | 

<br />

✔ 본 README는 [dabinKim-0318(김다빈)](https://github.com/dabinKim-0318)이 프로젝트를 회고하며,      
공부하고 배운점을 기록하기 위해 작성된 README입니다.    
upstream repository는 [이곳](https://github.com/depromeet/Baton)을 참고해주세요😊    


<br />

# 0️⃣ 프로젝트 동기 <a name = "reason"></a>
<details>
   <summary> Click 🙋‍♀️</summary>
<br />



프로젝트를 할 때마다 실제 현업에서 사용되는 기술을 프로젝트에 적용해보고,   
현업 개발자분의 코드리뷰를 통해 한걸음 더 성장하고 싶다는 생각을 했습니다.   
그래서 대학생과 현업자가 협업하는 동아리 ‘디프만’에서 안드로이드 개발자로 참여했습니다.      
개발자로서의 마인드셋, 더 좋은 코드를 짜기 위한 방법 등 프로젝트를 시작하기 전보다  
훨씬 많이 배우고 좋은 사람들도 알아갈 수 있었던 소중한 시간이었습니다.  

 </details>

<br>

# 1️⃣ 아이디어/개요 <a name = "outline"></a>

<details>
   <summary> Click 🙋‍♀️</summary>
<br />
   
![Menu tree](https://user-images.githubusercontent.com/84564695/186642867-5df08cb4-8015-4c64-ada0-76e9e1a772d4.png)


바통은, 사용하지 않는 회원권은 빠르게 판매하고  
평소 눈여겨 보던 우리 동네 헬스장 회원권을 저렴한 가격에 양도받을 수 있는 서비스 입니다.

현재 제공 되는 4가지 핵심 기능은 다음과 같습니다.

✔ 우리 동네 매물 보기: 집, 회사 근처에 올라온 PT/필라테스/요가 등의 양도권 매물을 확인합니다.    
✔ 판매글 등록하기: 헬스장 위치, 분위기, 옵션 등 구매자가 자주 묻는 정보를 일일이 작성하지 않고 태그를 통해 쉽게 등록합니다.  
✔ 맞춤형 검색필터: 원하는 기간, 가격, 헬스장 정보까지 설정하고, 원하는 회원권을 빠르게 찾아볼 수 있습니다.  
✔ 문의하고 구매하기: 딱맞는 매물을 찾았다면 판매자에게 문의하고 양도권을 구매할 수 있습니다.   


</details>

<br>

# 2️⃣ 아키텍처  <a name = "structure"></a>

<details>
   <summary> Click 🙋‍♀️</summary>
<br />

### ✔ 안드로이드 권장 아키텍쳐
<p align='center'>
 <img width="500" src = "https://user-images.githubusercontent.com/84564695/185730946-f5577906-2be8-4f9c-9b2b-1b40a3f38a15.png" />
 </p>

안드로이드 공식문서에서 [권장 앱 아키텍쳐 다이어그램](https://developer.android.com/jetpack/guide?hl=ko)이 달라진 걸 알게되었습니다. 팀원끼리 프로젝트 아키텍쳐에 대해 논의했고, 모바일 앱 사용자 환경을 올바르게 제공하기 위해 안드로이드 권장 아키텍쳐를 공부하고 프로젝트에 적용하기로 했습니다.  data / domain / presentation 로 layer를 나누고 패키징을 통해 관심사를 분리했습니다.  특히 권장 아키텍쳐에서 강조하는 2가지 원칙인 "UI 기반 클래스를 가볍게 하기",  "UI와 Model(모델)을 분리하기" 규칙을 잘 지키고 있는가?를 생각하며 설계하기 위해 노력했습니다. 디자인 패턴으로는, Repository Pattern 을 사용해 DataSource 캡슐화했습니다. ViewModel, LiveData 등의 Jetpack Component를 활용해 UI Controller의 과도한 책임을 막고 역할을 분리했습니다.

<p align='center'>
 <img width="900" src = "https://user-images.githubusercontent.com/84564695/187017988-ac6d085d-e9b9-4ffd-81f5-f4d64f44fade.png" />
 </p>
이전 프로젝트에서는 단순히 MVVM을 "사용"했다는 것에 그쳤던 것 같았습니다. 그래서 바통 프로젝트에서는 안드로이드 공식문서를 보고 제 나름의 언어로 해석하고 이해하며 세부적인 항목까지 공부해보고 싶다는 생각이 들었고, 아키텍쳐의 중요 개념들을 조직화하고 정리해봤습니다. 특히 UI Layer 구조, UI Layer에서 사용되는 단어의 개념을 깊게 고찰하고 고민했던 부분이 가장 기억에 남습니다. "stateHolders"는 UI State를 생성하는 역할을 하며 공식문서에서 ViewModel을 예로 들고 있습니다. "ViewModel은 StateHolders이다" 와 같은 단어의 개념을 아는게 사소한 일이라고 생각했습니다. 하지만 ViewModel안에서 정의될 UI state 개념과도 관련이 있어 전체적인 구조를 이해하는 데 매우 중요하고 개발자들 사이에서의 커뮤니케이션을 위해서도 반드시 숙지하고 있어야 하는 부분이라는 걸 깨달았습니다. 

</br>


### ✔ 멀티모듈을 도입한 이유 
<p align='center'>
<img width="600" src = "https://user-images.githubusercontent.com/84564695/185730960-5b22e438-97b3-4e79-a6a9-36333cfa9a73.png" />   

 </p>
 
</br>

 바통 프로젝트는 MutiModule (app, map, chatting, bds)로 구성되어있습니다.  "사용하지 않는 회원권은 빠르게 판매하고 평소 눈여겨 보던 우리 동네 헬스장 회원권을 저렴한 가격에 양도할 수 있는 서비스"라는 아이디어가 나온 이후 1차 MVP에 대해 논의하던 중 서비스가 커지면 매장 사장님들이 직접 회원권을 등록하는 "사장님 전용 바통앱"으로 확장할 수 있겠다는 의견이 있었습니다. 기존 바통 앱의 기능들을 모듈로 분리하면 이후 사장님 전용 바통앱에서도 해당 모듈들을 재사용할 수 있을 것이라 생각했고, 안드로이드 팀원들에게 멀티모듈을 도입해 보자고 제안했습니다. 감사하게도 팀원들이 흔쾌히 동의해주었고 회의를 통해 바통이 제공하는 기능을 나눠보았을 때, 크게 매장을 찾기 위한 지도, 양도권 문의, 디자인 시스템이라는 3가지 기능으로 분리할 수 있었습니다. 해당 기능들은 사장님 전용 바통 앱에서도 이용될 가능성이 있었기 때문에 app, map, chatting, bds 모듈로 분리해보기로 했습니다. 부가적으로 멀티모듈이 가진 장점 중 각 기능별 의존성을 줄이고 독립된 작업이 가능하다는 효과도 얻을 수 있었습니다. 결론적으로 app모듈이 map, chatting, bds 모듈에 의존하는 바통 아키텍쳐를 완성시킬 수 있었습니다.

<br>

#### 👉공부하며 작성했던 블로그 포스팅입니다!
| Bolg Link | 
| ------ |
| [[안드로이드 공식문서 파헤치기] 클린 아키텍쳐의 모든 것!](https://url.kr/8m15qg) | 
| [[안드로이드] 멀티모듈](https://url.kr/8m15qg) | 


</details>

<br>

# 3️⃣ 사용한 기술에 대한 근거  <a name = "why"></a>

<details>
   <summary> Click 🙋‍♀️</summary>
<br />

#### 👉각 Stack의 링크를 클릭하시면 공부하며 작성했던 포스팅으로 이동합니다!

| Category | Stack  | Reason |
|:---|:---|:---|
| Jetpack Components |[LiveData](https://velog.io/@dabin/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-%EA%B3%B5%EC%8B%9D%EB%AC%B8%EC%84%9C-%ED%8C%8C%ED%97%A4%EC%B9%98%EA%B8%B0-LiveData%EC%9D%98-%EB%AA%A8%EB%93%A0-%EA%B2%83) | 최신 data가 생명주기에 따라 자동으로 업데이트 되도록하기 위해 LiveData를 사용했습니다  |
|  |StateFlow | 검색 결과 data를 지속적으로 collect하기 위해 사용했습니다. 하지만 StateFlow를 제대로 알고 사용할 수 있는 수준은 아닙니다.  Rxjava, Flow에 대한 공부가 선행되어야 한다고 생각해서  "잘 모르지만 동작하니 그냥 넘어갔던 부분"들을 제대로 공부하기 위해 프로젝트가 끝나고 하나씩 정리하고 있습니다. 해당 부분을 먼저 공부하고 StateFlow의 장단점, 동작원리 등을 깊게 공부할 계획입니다  |
| |[ViewModel](https://velog.io/@dabin/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9CviewModel-%EC%83%9D%EC%84%B1%EC%97%90-%EB%8C%80%ED%95%9C-%EA%B3%A0%EC%B0%B0) | 인스턴스가 소멸된 후 다시 onCreate 가 호출되며 인스턴스로 새로 생성되어도 데이터가 초기화되지 않도록 ViewModel을 사용했습니다. onSaveInstanceState()로 UI Data를 저장할 수도 있었겠지만, 대량의 UI Data를 복원하기에 적합하지 않다고 판단했습니다. 또한 서버, 데이터베이스에 접근하는 코드를 UI Controller와 분리하기 위해 ViewModel을 사용했습니다.
| |[DataBinding](https://velog.io/@dabin/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9CDataBinding) | findViewById 메서드에 비해, null safety, type safety 부분에서 장점이 있는 DataBinding을 사용했습니다. ViewBinding이 DataBinding보다 퍼포먼스 효율, 용량 측면에서 장점이 있지만 DataBinding은 ViewBinding역할을 할 수 있을 뿐더러, 레이아웃에서 데이터 연결 작업을 통한 역할 분리를 위해 DataBinding을 선택했습니다. |
| Dependency Injection | Hilt | 클래스간 결합도를 낮추고 원활한 리팩토링을 위해 DI를 적용했습니다. ViewModel에 대한 의존성 주입을 구현하기 편리하고 각 컴포넌트의 라이프 사이클을 자동으로 관리해주는 Hilt를 DI Framework로 활용했습니다. Hilt가 Dagger2를 기반으로 만들어졌기 때문에 Hilt에 대한 이해를 높이기 위해 Dagger2도 함께 공부할 계획입니다 |
| Network | [Retrofit2](https://velog.io/@dabin/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-Android-%ED%86%B5%EC%8B%A0-%EB%9D%BC%EC%9D%B4%EB%B8%8C%EB%9F%AC%EB%A6%AC%EC%9D%98-%EC%97%AD%EC%82%AC#%EA%B3%B5%EB%B6%80%EB%B0%B0%EA%B2%BD) | 안드로이드 통신 라이브러리의 역사를 공부하면서 Deprecated된 라이브러리들과(HttpClient 등) Volley, OkHttp, Retrofit의 장단점을 비교하며 공부했습니다. 그 결과 개인적으로는 Annotation으로 HTTP 메소드를 정의해서 사용하는 Retrofit이 전체 구조를 파악하기 더 좋은 것 같아 Retrofit을 선택했습니다. JSON을 파싱해주는 Converter 연동을 지원해주기 때문에 Moshi 라이브러리와 함께 사용하기 위해 선택했습니다.    |
|  |[OkHttp3](https://velog.io/@dabin/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-Android-%ED%86%B5%EC%8B%A0-%EB%9D%BC%EC%9D%B4%EB%B8%8C%EB%9F%AC%EB%A6%AC%EC%9D%98-%EC%97%AD%EC%82%AC#android-%ED%86%B5%EC%8B%A0-%EB%9D%BC%EC%9D%B4%EB%B8%8C%EB%9F%AC%EB%A6%AC%EC%9D%98-%EC%97%AD%EC%82%AC) |  Intercepter를 통해 API가 통신되는 모든 활동을 모니터링하고, 서버 통신 시간을 조절하기 위해 사용했습니다. 또한 Retrofit2을 사용했기 때문에, Retrofit2가 의존하는 OkHttp3를 함께 사용하는게 좋겠다고 생각했습니다. |
| Asynchronous Processing | Coroutine | api요청 시 비동기 처리를 하기 위해 Coroutine을 사용했습니다. 구글에서 권장하는 비동기 처리 방식이기도 하고, 직관적인 함수 사용을 통해 코드의 가독성도 높일 수 있었습니다 |
| Third Party Library |  Glide | 이미지를 빠르고 효율적으로 불러올 수 있게 도와주는 Glide를 사용했습니다. 하지만 단순히 Glide가 메이저하게 사용된다는 이유로 해당 라이브러리를 고민없이 선택했다는 점에서 스스로에게 아쉬움이 남습니다. 프로젝트 이후, 이미지 처리를 위한 사전 개념인 Bitmap, Cache처리 등을 함께 하면서 Glide의 동작원리, 장단점 등을 꼼꼼히 공부할 계획입니다.  |
|  |Moshi |  JSON convert를 위해 Moshi를 사용했습니다. 기존 프로젝트에선 Gson을 사용했는데 Moshi가 제공하는 부가적 기능(JSON 문서를 읽는 중 오류가 발생하거나 형식이 잘못된 경우 java.io.IOException 발생, 타입 포맷과 일치하지 않으면 JsonDataException이 발생)이 매우 편리하다고 느껴 Moshi를 선택했습니다 |
|  |Balloon | tooltip을 간단하게 구현하기 위해 Balloon 라이브러리를 사용했습니다. 사용자가 정의한 layout을 background로 사용할 수 있어 선택했습니다  |
|  |Flexbox | 복잡한 연결관계 없이 view의 순서를 유연하게 배치하기 위해 Flexbox Layout을 사용했습니다.  |
|  | Social Login | 사용자의 회원가입 과정의 번거로움을 피하기 위해 네이버, 카카오 SDK를 사용해 소셜 로그인을 구현했습니다. |
|  | Lottie | 스플래시 화면에서 애니메이션 처리가 필요했고, 고품질 애니메이션을 처리할 때 발생할 수 있는 OOM을 피하기 위해 애니메이션 라이브러리를 사용하기로 결정했습니다. 그중 백터 기반이라 용량이 적고 적용이 간단한 Lottie라이브러리를 활용했습니다. |
|  |Timber | 릴리즈 버전에서 로그를 출력하지 않고, 태그를 별도로 입력하지 않아도 되는 Timber을 사용해 Log를 남겼습니다 |
| CI/CD | GitHub Action| Github Action으로 Build 과정을 검사했습니다. develop 브랜치로 병합 이후 발생한 손상을 즉시 해결 함으로 추후 손상을 해결하는 시간을 줄였습니다. |
| Other Tool | Slack, Notion, Figma, Swagger | 팀원간 이슈 알림을 위해 Slack을 사용했고, 작업 진행상황공유와 디자인 작업, 백엔드 파트원과의 커뮤니케이션 등을 위해 해당 Tool들을 사용했습니다 |

</details>


<br>

# 4️⃣ 결과물  <a name = "outputs"></a>

<details>
   <summary> Click 🙋‍♀️</summary>
<br />
 
### ✔ PreView
 ![Group 3696](https://user-images.githubusercontent.com/84564695/187882678-eeae7a97-4786-4465-bd68-92edae041c6d.png)


### ✔ 회원가입

<img width="198" src = "https://user-images.githubusercontent.com/84564695/187882930-5a58f2fa-df33-4d4c-a95a-629755ea86f0.png" /> <img width="200" src = "https://user-images.githubusercontent.com/84564695/187873414-7413c648-446a-4062-9675-5eba8f171fcd.png" /> <img width="200" src = "https://user-images.githubusercontent.com/84564695/187873830-439d5577-92ce-4074-a29b-49c740bef285.png" /> <img width="200" src = "https://user-images.githubusercontent.com/84564695/187873443-67cdd392-4f30-4ebf-9ac2-dd2c12c8dae7.png" />
  
 - Naver, Kakao 소셜로그인
 - 이름, 전화번호, 계좌설정
 - 위치 설정, 상세주소 설정

 ### ✔ 홈
<img width="200" src = "https://user-images.githubusercontent.com/84564695/187870678-232b3e08-dd14-4fe6-b346-6cb3443e1cf4.png" /> <img width="200" src = "https://user-images.githubusercontent.com/84564695/187874319-b137ddb7-6cf8-41b8-88c5-b803c72bd0c6.png" />
 
  - 위치 정보 등록하러가기
  - Quick link로 이동하기
  - 바통 사용 설명서 보기
  - 검색화면으로 이동하기
  - 필터링된 양도권 보기
 
 <br/><br/>  


  ### ✔ 위치정보 등록
<img width="200" src = "https://user-images.githubusercontent.com/84564695/187874696-53e3ebe8-20b7-46ad-ab5c-b008747fae17.png" /> <img width="200" src = "https://user-images.githubusercontent.com/84564695/187871514-522458b1-8104-49c8-b069-3329a0a6f928.png" /> <img width="200" src = "https://user-images.githubusercontent.com/84564695/187871577-a70bea3a-1e9c-4ad0-a288-c9bb0a52cc0e.png" /> <img width="200" src = "https://user-images.githubusercontent.com/84564695/187871645-0dfd875d-b281-4f8b-9807-b4c47e2d3e81.png" />
 
  - 내 위치 보기
  - 위치 검색하기
  - 위치 검색하기
  - 양도권 매장 최대거리 설정하기
 
 <br/><br/>  
 
### ✔ 양도권 필터링
<img width="200" src = "https://user-images.githubusercontent.com/84564695/185732806-9eb30927-8065-4d01-bbca-5ff4ea5cad3d.png" /> <img width="620" src = "https://user-images.githubusercontent.com/84564695/185732607-7827cd21-3923-45f5-b157-2f6b75231b22.png" />

  - BottomSheet에서 원하는 조건 필터링
  - 양도권 종류, 기간, 가격, 가래방법, 추가옵션, 해시태그 선택
  - 필터 선택시마다 필터링된 매물 개수 실시간 확인

   <br/><br/>  
  
 
### ✔ 맞춤 양도권 보기
<img width="200" src = "https://user-images.githubusercontent.com/84564695/185732955-c61ab2a8-a41a-4203-b0c1-940604201006.png" /> <img width="170" src = "https://user-images.githubusercontent.com/84564695/185732951-e892df8f-a7a4-43b4-890a-67ac6ae4d46e.png" />
 
  - 필터링된 양도권 상세 정보 확인
  - 위치, 가격, 남은 기간 등
  - 양도권 상세 설명
  - 관심있는 양도권 찜하기
  - 내 주변 양도권 추천받기
  - 판매자에게 문의하기 버튼
  
 <br/><br/>  


### ✔ 판매글 작성하기
<img width="198" src = "https://user-images.githubusercontent.com/84564695/187875147-212a2746-d2ec-4fc9-be31-6db2cacee2a2.png" /> <img width="200" src = "https://user-images.githubusercontent.com/84564695/185733180-d279156c-d1d2-40c8-822c-bb7d0251be53.png" /> <img width="200" src = "https://user-images.githubusercontent.com/84564695/185733181-94280c5d-96c6-42ad-80e6-757dffe0dca4.png" /> <img width="200" src = "https://user-images.githubusercontent.com/84564695/185733182-010fe2cf-ed76-478d-9bc9-d25610a4c3d2.png" />
  

  - 장소 등록
  - 사진 등록(5개 까지)
  - 거래방법 선택
  - 설명글 작성
  
   <br/><br/>  

### ✔ 문의하기
 <img width="198" src = "https://user-images.githubusercontent.com/84564695/187880307-20fc5a7d-2d5e-4620-9e49-c83aeb94445b.png" /> <img width="198" src = "https://user-images.githubusercontent.com/84564695/185733086-e047066e-5204-46b8-a0e6-58d4da950ec7.JPG" /> <img width="200" src = "https://user-images.githubusercontent.com/84564695/185733087-b6ead31d-33fc-4585-9969-d5e65bddcada.JPG" />  

  - 판매자에게 문의하기
  - 받은 문의 바로 보기
 
  <br/><br/>  
 
### ✔ 마이페이지  

 <img width="198" src = "https://user-images.githubusercontent.com/84564695/187878912-6268162f-f850-407a-abaf-d0558b951e80.png" /> <img width="200" src = "https://user-images.githubusercontent.com/84564695/185733349-b8936770-b3bf-4edf-bee0-a84dc77b2318.JPG" /> <img width="200" src = "https://user-images.githubusercontent.com/84564695/187879491-c78191e0-b70a-4494-9a0a-bda5373ccfbd.png" /> <img width="200" src = "https://user-images.githubusercontent.com/84564695/187879501-8ea67d77-a2c0-4321-a1a0-70534c92cb86.png" />
  
  - 정보 수정하기
  - 판매내역, 구매내역, 관심상품 보기
  - 알림, 계좌 설정하기
  - 로그아웃
  - 회원탈퇴
    <br/><br/>
 
### ✔ 브랜딩
 
 <p align='center'>
<img width="400" alt="01" src="https://user-images.githubusercontent.com/84564695/187881865-7a6aed02-d0aa-4f89-92a8-053d883165c9.png"> <img width="200" src = "https://user-images.githubusercontent.com/84564695/187881405-53a35346-abe7-425c-a445-02d9a005bf13.png" /> 
 </p>
 
![그림1](https://user-images.githubusercontent.com/84564695/187885064-7f88d3cd-1aa2-48e2-bb76-e4a391819aa4.png)

</details>



<br>

# 5️⃣ 회고 및 배운 점 <a name = "learn"></a>
<details>
   <summary> Click 🙋‍♀️</summary>
<br />


## ✔ 커뮤니케이션 부분
### ◼ 현업자, 대학생들이 함께한 프로젝트
<img width="300" src = "https://user-images.githubusercontent.com/84564695/186438143-9eef5ba2-5289-4ff2-843a-b2fba2a50817.JPG" /><img width="500" src = "https://user-images.githubusercontent.com/84564695/190887138-a7d22be8-ba16-4cb1-8c6f-77ad536fd190.png" />

이번 프로젝트는 3년차 안드로이드 개발자이신 팀원분과 함께 프로젝트를 해볼 수 있는 소중한 기회였습니다. 코드리뷰를 통해 제가 작성한 코드의 문제점을 개선하고 다시 PR을 올리는 등 "더 나은 코드"를 작성하기 위한 경험을 할 수 있었습니다. 특히 개발을 시작하기 전 "본인이 개발할 화면의 구조에 대한 큰 그림을 먼저 그리는게 좋다"와 같은 의미있는 조언도 해주셔서 지금까지 생각해보지 못했던 부분들을 고민해볼 수 있었습니다. 더불어 안드로이드 파트 뿐만아니라 백엔드, 디자인 파트의 다양한 팀원들과 함께하면서 서로 소통하는 법을 배울 수 있었습니다. 특히 팀원 간 작업할 수 있는 시간이 달라 바로 피드백을 주지 못하는 상황이 있을 수 있어서 회의 일정 조율이나 진행 사항을 [칸반보드](https://www.notion.so/depromeet/860e70db2c134a67a56decbecf791e98)를 통해 관리하여 효율적인 작업이 가능하도록 했습니다. 

<br>

## ✔ 기술적인 부분
### ◼ 디자인 시스템 경험
 <img width="200" src = "https://user-images.githubusercontent.com/84564695/185736269-8b99b2ab-f7c1-434f-b106-441d5bef4344.JPG" /><img width="600" src = "https://user-images.githubusercontent.com/84564695/185736276-3e7475c1-7c1b-4953-966f-0beb6c3ec439.png" /><img width="400" src = "https://user-images.githubusercontent.com/84564695/186436858-d4504c9e-8bd4-46d7-8d1d-b796f8357615.JPG" /><img width="400" src = "https://user-images.githubusercontent.com/84564695/186437007-2c189399-dd0f-4b8d-8bf8-6789e00fe059.JPG" />
 
프로젝트를 하면서 [디자인 시스템](https://www.figma.com/file/P0YfFNnvjwTpKJqDC4epC8/%F0%9F%A4%9D%EB%94%94%ED%94%84%EB%A7%8C_6%EC%A1%B0-%EB%B0%94%ED%86%B5?node-id=1901%3A31812)을 처음 적용해봤습니다. 통일된 디자인과 원활한 컴포넌트 관리를 위해 도입하게 되었습니다. 디자이너분들과 상의를 통해 [쏘카의 디자인시스템](https://tech.socarcorp.kr/design/2020/06/23/socar-design-system-01.html)을 차용해서 바통만의 디자인 시스템을 구축해나갔습니다. 컴포넌트의 활성화 여부를 state(focused/disabled/read only), 하위 컴포넌트, 파운데이션 단계는 Primary, Secondary로 구분했습니다. 네이밍이나 variation규칙 등을 함께 고민하면서 더 편리한 UX를 위해 고민한 계기가 되기도 하였고, 디자이너분들과 소통하는 방법도 배울 수 있었습니다. 특히 디자인 시스템을 사용한 덕분에 디자인 통일성, 재사용 측면에서 큰 효과를 볼 수 있었고 네이밍 등의 규칙이 잘 지켜져 있어 유지보수에도 도움이 됐습니다. 

<br>

### ◼ 멀티 모듈 사용

<img width="800" src = "https://user-images.githubusercontent.com/84564695/186440735-40242265-c6da-478f-b89d-724d8f1634a2.JPG" />
   
 
바통은 매장 사장님들을 위한 전용 어플리케이션으로 확장될 수 있다는 초기 아이디어를 기반으로, 앱, 디자인시스템 모듈, map 모듈, 채팅 모듈로 나뉘 개발되었습니다.멀티모듈을 사용하면서 기능 별 의존성을 줄이고 관심사를 분리할 수 있는 멀티모듈의 장점을 느낄 수 있었습니다. 특히 app모듈에서 관련없는 파일들을 관리하지 않을 수 있어서 매우 편리했고 디자인시스템 모듈을 통해 필요한 리소스를 빠르게 찾을 수 있었습니다. 더불어 이후 사장님들을 위한 "바통 사장님전용 어플리케이션"까지 만들어진다면, 각 모듈을 재사용해 개발 시간을 단축하고 통일성 있는 아키텍쳐를 구성할 수 있을거라 생각합니다.
  
  <br>
  
### ◼ 아쉬운 점- Custom View에 대한 이해
재사용 가능한 컴포넌트로 만들고, 사용의 편리성을 높이기 위해 디자인 컴포넌트를 모두 Custom View로 구성했습니다. 개발 효율성을 위해 한 팀원이 전담해서 컴포넌트로 사용되는 Custom View 를 만들기로 했습니다. CustomView를 만들고 사용해본 경험이 없었기 때문에 막막했는데 중간, 최종발표까지 빠르게 컴포넌트를 사용해야 했기 때문에 layout에 대한 정확한 이해없이 Custom View를 사용했습니다. 이렇게 만들어진 컴포넌트들을 가져다 사용했을 땐 정말 편리하고 작업 시간도 단축할 수 있었지만 속성, 스타일, 테마, View, View가 그려지는 과정 등에 대한 깊은 이해없이 그저 동작하는 코드를 작성하고 사용하고 있다는 생각이 들었습니다. CustomView가 만들어지는 과정을 제대로 알지 못하면 잘 사용하고 응용할 수도 없을 것이라고 생각했고, 현재 바통 프로젝트를 리팩토링하면서 부족했던 부분을 공부하고 있습니다. 
  
  <br>
  
### ◼ 아쉬운 점- StateFlow에 대한 이해
UI Data의 data holding과 업데이트를 위해 자주 사용하던 LiveData가 아닌 StateFlow를 사용해본 프로젝트입니다. 하지만 StateFlow의 동작 방식을 깊게 알지 못하고 Rxjava, Flow와 비교했을때의 장단점 등을 제대로 설명할 수 있는 수준이 아니기에 StateFlow에 대한 이해도가 낮은 상태입니다. 바통 프로젝트를 돌아보면서 단순히 빠르게 새롭고 어려운 기술을 적용할 수 있다는 것에 만족하고 뿌듯해했던 제 모습을 반성하게 되었고, 내가 무엇을 모르는지 알고 "꼼꼼히" 공부하며 "제대로" 성장해야 겠다는 생각을 했습니다. 

<br>

## ✔ 개인적인 성장
### ◼ 새로운 기술들에 대한 도전과 반성  
Flow, CustomView 등 이전엔 사용해보지 못한 기능들을 새롭게 접해볼 수 있는 프로젝트였습니다. 데드라인에 맞춰 빠르게 배우고 적용해 볼 수 있는 기회였지만 그만큼 제대로 이해하지 못했기 때문에 아직 완전히 "제가 사용할 수 있는 기술 stack입니다"라고 말할 수는 없습니다. 하지만 현업에서 사용되는 기술들을 알 수 있었던 소중한 시간이었고 프로젝트 이후 차근차근 공부해 나가겠다는 새로운 목표가 생기기도 했습니다. 또한 처음보고 사용해본 적 없는 기술이라 할지라도 사용법에 초점을 맞춰 구현하는 법을 배울 수 있었습니다.

<br>

### ◼ Usability Test
디프만(디자이너와 프로그래머가 만나면)는 프론트, 백엔드, 디자이너 포지션으로 이루어져있기 때문에 PM없이 하나의 서비스를 만들어야했습니다. 개발자와 디자이너 모두 기획에 참여하기 때문에 기획단계에서 저절로 기능구현의 난도와, 기간 내에 구현할 수 있는지와 같은 가능성을 고려하며 프로젝트에 임했습니다. 이전에는 어느정도 완성된 와이어프레임, IA를 보면서 더 '나은' 기획 방향을 고민하는 철저한 개발자 포지션이었다면, 이번 프로젝트에서는 아이디어 도출 즉, 맨바닥부터 '함께' 기획해야했기 때문에 기획, UI&UX에 대한 지식이 필요하다고 생각했습니다. 개발만 했다면 몰랐을 '사용자 편의성', '유저이탈을 방지하는 디자인' 등을 고민할 수 있는 계기였습니다.

<img width="600" src = "https://user-images.githubusercontent.com/84564695/186641825-b45541f1-26e3-41bc-9b47-5f2a670a4254.png" />
    
저희 팀은 사용 편의성을 높이기 위해 기획단계에서 Maze를 이용해 약 30명의 인원들에게 Usability Test를 진행하였습니다. 기존엔 "정렬"필터가 필터 리스트에 있었는데 하위 항목으로 "가까운 거리" 필터링과 슬라이드 형식으로 거리최댓값을 지정하는 필터가 함께 있었기 때문에 중복되는 기능으로 인해 혼란스럽다는 의견이 있었습니다. 따라서 "정렬순" 필터를 필터 리스트에서 떼어내고, 순서만 바꿔서 보여주는 정렬 기능을 필터링 기능과 혼동되지 않도록 기획했습니다.

<img width="600" src = "https://user-images.githubusercontent.com/84564695/186641665-8327560f-0096-44bc-ad6e-ff3387a9b070.png" />


필터 리스트 상단에 바로 검색바가 있었는데 해당 검색창에서 검색을 통해 필터링을 하는 것으로 인식된다는 의견이 있었습니다. 그래서 필터를 화면 상단에 노출시켜 필터 기능을 부각시키고 상단에 검색 창이 아닌 검색 아이콘만 노출시켜 검색화면으로 이동될 수 있게 하였습니다. 팀원들과 함께 UX부분을 고민하면서 개발자도 유저 플로우를 함께 생각하고 더 좋은 사용자 경험을 제공하기 위해 노력해야겠다고 생각했습니다. 

<br>

### ◼ 사용자 관점에서  코드 작성하기

<img width="600" src = "https://user-images.githubusercontent.com/84564695/190887159-370f4278-22e6-4bce-a2b9-f1e641994cd2.png" />

개발을 하면서 단순히 기능구현에만 목적을 두고 코드를 작성하기 보다 '내가 사용자라면 이부분이 불편하지 않을까?', '여기를 개선하면 조금 더 편리하게 사용할 수 있지 않을까?'같은 생각을 하면서 개발에 임했습니다. 아이템을 정렬하는 BottomSheetDialog에서 항목 선택을 마친 후 X를 누를 때 딜레이되는 순간이 없어서 마지막에 어떤 항목을 선택했는 지 확인하기 힘들었습니다. 그래서 BottomSheetDialog가 dismiss될 때 약간의 딜레이가 되는 기능을 추가하는 등 사소한 부분이라도 사용자 관점에서 고민하며 더 나은 방법을 고민했습니다.

<br>

### ◼ 팔로워로서의 역할
바통 프로젝트 이전에 IT동아리 SOPT에서 장기 해커톤APPJAM의 리더를 맡아 일정관리, 회의진행 등의 역할을 했었습니다. 이번 프로젝트에서는 프론트, 백엔드, 디자이너 파트의 현업자분들이 팀리더 역할을 해주셨습니다. 제가 리더를 맡았을 때 회의를 진행하는 동안 다른 팀원이 회의록을 작성해준다던가, 유용한 아티클이나 라이브러리를 공유해주는 등 제가 놓친 부분을 챙겨주고 도와주었을 때 큰힘이 되었었습니다. 그래서 저도 정리되지 않은 칸반보드 일정을 업데이트한다던가, 먼저 적극적으로 의견을 제시하는 등 팔로워 입장에서  팀에 도움이 되기 위해 노력했습니다. 리더와 팔로워의 역할을 모두 해보면서 개발은 혼자하는 것이 아니라는 것을 다시 한번 깨달을 수 있었고 팀원 간 시너지가 프로젝트 결과에도 유의미한 영향을 끼친다는 것을 알게되었습니다.

<br>

### 👉결과적으로 바통 프로젝트는..
저에게 이번 프로젝트는 "안드로이드 권장 아키텍쳐"에 대한 이해도를 완전히 끌어올려 주었다는 점, 새로운 시도를 통해 기술적 성장을 했다는 점에선 성공적인 프로젝트였습니다. 하지만 사용한 기술 스택을 완전히 알고 이용한 게 아니라는 점에선 아쉬운 프로젝트입니다. 프로젝트가 끝나고 아쉬웠던 부분들을 앞으로의 "공부 목차"로 삼고 하나씩 깊게 공부해보자는 목표가 생겼습니다. 이젠 "잘 모르지만 동작하니 그냥 넘어갔던 부분"들을 제대로 공부하기 위해 정리 중입니다. 특히 RxJava를 알아야 Coroutine Flow의 등장 배경, 장단점을 잘 이해할 수 있고 Flow를 사용해보고 불편한 점을 몸소 깨달아야 StateFlow의 장점에 공감할 수 있다고 생각했습니다. 따라서StateFlow(반응형 프로그래밍 전반)에 대한 정확한 이해없이 구현에만 급급했던 것을 반성하고, 속도가 조금 느려도 꼼꼼히 공부하며 리팩토링하고 있습니다! 
   
#### 👉공부하며 작성했던 블로그 포스팅입니다!
| Bolg Link | 
| ------ | 
| [반응형 프로그래밍 개괄 - 큰 그림부터 그려보기!](https://url.kr/xdaogh) |
| ㅡㅡㅡㅡㅡTODOㅡㅡㅡㅡㅡ |
| Bitmap, BitmapFactory |
| View의 수명주기 | 
| View가 렌더링 되는 과정  | 
| 렌더링되는 View의 내부구조  | 
| RxJava | 
| Flow |
| StateFlow | 
</details>

<br>


# 6️⃣ 프로젝트 이후 리팩토링 <a name = "update"></a>

<details>
   <summary> Click 🙋‍♀️</summary>
<br />

## ✔ StickyScrollView 라이브러리를 걷어낸 이유

![](https://velog.velcdn.com/images/dabin/post/8a4fec36-af3b-4f4b-be5a-534f0b3b6516/image.gif)

- 홈화면에 양도권item을 보여주는 RecyclerView의 아이템이 많아지면 로딩이 버벅거리는 현상이 있었습니다. 원인을 고민했는데, 해당 화면을StickyScrollView(amarjain07:StickyScrollView라이브러리) 안에 RecyclerView를 중첩해서 구현했었던 게 떠올랐습니다. 혹시 해당 라이브러리가 NestedScrollView를 상속받아 만든 CustomView라서 한번에 ViewHolder를 그리느라 버벅거리나? 라는 생각이 들었습니다. 확인해보니 제가 사용한 라이브러리는 정말 NestedScrollView의 하위 클래스로 구현되었고, 이때문에 아이템 개수만큼 ViewHolder를 한번에 Create하고 있었습니다. 해당 문제를 해결하기 위해 고민한 과정을 기록하며 공부했습니다.

![녹화_2022_09_09_19_11_54_123](https://user-images.githubusercontent.com/84564695/189340359-ece4eb58-6f55-4a0f-b24d-276ae36a9566.gif)
- NestedScrollView, ScrollView의 하위 커스텀뷰로 감싸 사용하면 각각 재활용문제, 중첩 스크롤 문제가 있었습니다. 그래서 외부 라이브러리를 걷어내고 RecyclerView컴포넌트를 응용해서 문제를 해결하기로 했습니다
-  화면을 여러 ViewType을 가진 RecyclerView로 구현했습니다. 이후 ItemDecoration의 하위 클래스를 만들고 아래와 같은 로직을 생각했습니다
  - 1. 현재 RecyclerView에서 맨 위에 보이는 view를 얻은 view의 position을 얻는다
  - 2. position에 해당하는 view가 헤더가 필요한 뷰인지 아닌지를 판단한다
  - 3. 헤더가 필요한 뷰라면 헤더뷰를 그린다
  - 4. 필요하지 않은 뷰라면 그리지 않는다
- 이후 위 영상처럼 ViewHolder가 생성되는 횟수와 재활용되는 횟수를 로그로 남겨보았고, ViewHolder가 재활용됨을 확인할 수 있었습니다.

#### 👉공부하며 작성했던 블로그 포스팅입니다!
| Bolg Link | 
| ------ | 
| [[안드로이드 공식문서 파헤치기] ScrollView, NestedScrollView, ConcatAdapter의 모든 것!](https://velog.io/@dabin/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-%EA%B3%B5%EC%8B%9D%EB%AC%B8%EC%84%9C-%ED%8C%8C%ED%97%A4%EC%B9%98%EA%B8%B0-ScrollView-NestedScrollView%EC%9D%98-%EB%AA%A8%EB%93%A0-%EA%B2%83) | 


#### 👉문제 해결 과정을 담은 블로그 포스팅입니다!
| Bolg Link | 
| ------ | 
| [[안드로이드] 라이브러리없이 RecyclerView에 Sticky Header를 구현해보자](https://velog.io/@dabin/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-%EA%B3%B5%EC%8B%9D%EB%AC%B8%EC%84%9C-%ED%8C%8C%ED%97%A4%EC%B9%98%EA%B8%B0) | 


  <br/><br/>  
 
## ✔ 불필요한 bind() 처리 제거
```kotlin
    //변경 전
    class TicketItemViewHolder(private val binding: ItemTicketBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: FilteredTicket, scrollType: String, clickListener: (FilteredTicket) -> Unit) {
            with(binding) {
                binding.ibtnItemTicket.clipToOutline = true //bind() 호출시마다 불필요하게 처리됨 
                ...
             }
          }
        
     //변경 후
     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TicketItemViewHolder {
        binding.ibtnItemTicket.clipToOutline = true
          ...
    }
```
- item view의 꼭짓점을 round 처리하기 위해 clipToOutline 속성을 true로 설정하는 코드를 bind() 안에서 실행하고 있었습니다. data가 bind될 때마다 불필요한 연산이 처리되는 것이므로 ViewHolder를 create하는 부분에서 처리되도록 변경했습니다.

  <br/><br/>  

## ✔  RecyclerView ViewHolder inner class 변경
```kotlin
    //변경 전
    inner class TicketItemViewHolder(private val binding: ItemTicketBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: FilteredTicket, position: Int) {
        ...
     }

    //변경 후
     class TicketItemViewHolder(private val binding: ItemTicketBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: FilteredTicket, position: Int, scrollType: String, clickListener: (FilteredTicket) -> Unit) {
        ...
     }
```
- 메모리 누수에 대해 공부하던 중 inner class 사용 시 불필요한 outer class 참조로 메모리 누수가 발생할 수 있다는 것을 알게되었습니다
- RecyclerView의 ViewHolder를 inner class로 정의하고 있었는데 반드시 inner class로 사용할 이유가 없었기 때문에 nested class로 변경했습니다
  <br/><br/>  


## ✔  inflater 중복 생성 방지
```kotlin
   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyLikePolicyAdapter.MyLikePolicyHomeViewHolder {
        val binding = ItemInterastedPolicyBinding.inflate(LayoutInflater.from(parent.context), parent, false)
      
        return MyLikePolicyHomeViewHolder(binding)
    }

```
- RecyclerView를 사용하던 중 ViewHolder가 Create될 때 마다 inflater가 매번 생성되는 것을 개선할 수 있겠다고 생각했습니다

```kotlin
 private lateinit var inflater: LayoutInflater //전역 변수로 선언

   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyLikePolicyAdapter.MyLikePolicyHomeViewHolder {
          if (!::inflater.isInitialized) //변수를 객체로 엑세스하여 객체에 대한 속성 참조
            inflater = LayoutInflater.from(parent.context)
            
        val binding = ItemTicketBinding.inflate(inflater, parent, false)
      
        return MyLikePolicyHomeViewHolder(binding)
    }

```
- 코틀린 표준 라이브러리에서 제공하는 함수인 isInitialized을 사용해 지연 초기화 속성이 초기화되었는지 검사했습니다.
- inflater의 할당 여부를 확인하고, 중복 생성을 방지했습니다.


  <br/><br/>  

</details>

