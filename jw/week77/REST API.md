- REST API란 무엇인가?
    - 탄생
        - REST는 HTTP의 주요 저자중 한사람인 Roy Fielding의 2000년 논문에 의해서 소개되었습니다. 현재의 아키텍쳐가 웹의 본래 설계의 우수성을 많이 사용하지 못하고 있다고 판단했기 때문에, 웹의 장점을 최대한 활용할 수 있는 네트워크 기반의 아키텍쳐를 소개했는데 그것이 바로 Representational safe transfer (REST)이다.
    - 구성

        ![98101944-FFD7-442C-82F9-E9C1EB47FBA9.jpeg](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c12b8b27-e6b8-4723-8079-c2622322f7c3/98101944-FFD7-442C-82F9-E9C1EB47FBA9.jpeg)

        - 자원(Resource) URI
        - 행위(Verb) HTTP METHOD
        - 표현(Representations)
    - 특징
        - 한정된 인터페이스(Uniform interface)
            - URI로 지정한 리소스에 대한 조작이 통일되고, 한정된 인터페이스로 동작을 수행함.
        - 무상태성(Stateless)
            - 상태정보를 별도로 저장하고 관리하지 않음
        - 캐시가능(Cacheable)
            - Last-Modified태그나 E-Tag를 이용하여 캐싱가능

            ![D7874F18-580B-45CB-BAB5-A6A01938FEEB.jpeg](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5d36eea3-cff0-4f1d-b293-929faceb0ab6/D7874F18-580B-45CB-BAB5-A6A01938FEEB.jpeg)

        - 자체표현구조(Self-descriptiveness)
            - REST API 메세지만 보고도 이를 쉽게 이해 할 수 있는 자체 표현구조로 되어 있음

            ```json
            {"id":1,"name":"잠실역"}
            ```

            ```json
            HTTP/1.1 200 OK
            Content-Type: application/json
            Link:</subways/1/times>; rel="times",
                 </subways/1/detail>; rel="detail"

            {"id":1,"name":"잠실역"}
            ```

        - Client-Server 구조
            - 서버와 클라이언트의 역할이 명확해져서 서로간의 의존성을 줄일 수 있음.

            ![FB820460-2ACD-4A0F-A7A1-51A3B5A65A6E.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a51985ef-b1ec-48ce-85e3-8bb2acb24367/FB820460-2ACD-4A0F-A7A1-51A3B5A65A6E.png)

        - 계층형 구조
            - 클라이언트에서는 단순히 REST API 서버만 호출하지만, 서버는 다중 계층으로 구성할 수 있음. API서버는 순수 비지니스 로직을 수행하고, 그 앞에 사용자 인증, 암호화, 로드밸런싱등을 하는 계층을 추가하여 유연한 구조로 설계가 가능함.
- REST API의 필요성

    ![222C38C3-4CAC-4A80-8ABB-35888C7875CB.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/fa43fd97-7d40-475e-904f-58f50dbabd0a/222C38C3-4CAC-4A80-8ABB-35888C7875CB.png)

    - 애플리케이션 분리 및 통합
        - 애플리케이션의 복잡도가 증가하면서 애플리케이션을 어떻게 분리하고 통합하느냐가 주요 이슈됨
    - 다양한 클라이언트의 등장
        - 모바일 기기와 같은 다양한 클라이언트가 등장하면서 Backend 하나로 다양한 Device를 대응하기 위함.
- 장점
    - HTTP 프로토콜의 인프라를 그대로 사용하므로 REST API 사용을 위한 별도의 인프라를 구축할 필요가 없음
    - HTTP 프로토콜을 따르는 모든 플랫폼에서 사용 가능
    - API 요청이 의도하는 바를 명확하게 나타내므로 쉽게 파악할 수 있음
- 단점
    - 안티패턴으로 설계될 가능성이 높음
    - 표준의 부재
    - RDBMS의 표현에 적합하지 않음
- REST API를 어떻게 적용할것인가?
    - 단계별 적용 ( REST 단계 )

        ![2A70D81F-859B-4D24-8197-BA1811A4D585.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0c27e57a-8230-4b7d-bbb7-341227d2e7d2/2A70D81F-859B-4D24-8197-BA1811A4D585.png)

        - 0단계
            - 웹이 제공하는 다양한 장점을 전혀 사용하지 않고, HTTP를 단순히 원격 통신을 위한 전송시스템으로만 생각하는 단계
            - 단순한 RPC스타일의 시스템
        - 1단계
            - URI설계시 리소스를 도입하여 요청을 단일 서비스 endpoint로 보내는것이 아니라 개별 리소스를 제공하는 형태로 변경.
            - 인자(파라미터값)에 따라서 함수를 호출하고 인자를 넘기는 것이 아니라 정해진 리소스를 URI로 제공받으면 정해진 동작을 하는 형태로 변경.
        - 2단계
            - 1단계의 URI Resources와 HTTP Method를 조합하여 사용하여 동일리소스에 대하여 HTTP Method로 행위가 결정되도록 함.
            - HTTP Status Code로 응답에 대한 결과 처리가 가능해짐.
            - 안전한 오퍼레이션과 안전하지 않은 오퍼레이션 간의 강한 분리를 제공 ( 멱등성 )
        - 3단계
            - HATEOAS의 도입
                - Hypertext As The Engine Of Application State의 약어로, 특정 API를 요청한 뒤 클라이언트 입장에서 이 응답을 받은 다음 단계로 할 수 있는 작업을 알려주는 것을 말함
                - 클라이언트는 다음 단계에 대한 행위를 클라이언트의 관여 없이 서버의 응답으로만 행위를 정의할 수 있게됨
    - 작성 가이드 및 기준정립
