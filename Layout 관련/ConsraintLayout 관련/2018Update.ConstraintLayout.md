# ConstraintLayout Sunflower
* 이번에 ConstraintLayout은 2.0으로 발표되었다.
## Helper API
* 화면에 나오지 않은 UI에 대한 설명, 시작, 끝 등을 %등으로 나타내는 가이드라인을 제시해준다. 이 가이드라인은 Component Tree 내에서 간단하게 드래그 후 사용가능하다. 실제 위젯들의 상태들을 Code가 아닌 ConstraintLayout State Xml로 상태 반영이 가능하다. 이렇게 한다면 Code는 생략할 수 있다.
또, 레이아웃이 작아질 때마다 뷰들의 상태가 변화하는 것들도 쉽게 구현이 가능하다. 뷰들의 이동속도 등도 조정이 가능하다.
* 정리: 기존 View의 참조만 소유, Flat gierarchy, View는 복수 Helper에 참조가능, 기본적으로 View에 Tag를 지정해 특정 동작을 사용가능하다.
### Motion Layout
* 사용자의 액션이 따라 뷰들이 모션처럼 변화하는 것이 가능하다. 추가적으로 MotionScene을 정의하여 Scene의 시작과 끝 값을 정의할 수 있다.
* 변화하면서 발생하는 사용자의 터치 등에 따른 반응들도 Xml안에서 정의가 가능하다.
* Keyframe을 사용하면 더욱 편하다.
* Motion Editor가 등장한다면 위에서 나온 모든 액션들을 Xml내에서 정의가 가능할 것이다.
* 정리: MotionLayout은 다양한 View들을 가지고 다른 모든 것을 정의하는 것은 MotionScene에서 가능하다.
### Virtual Layout 기능
* Linear: Helper이면서 LinearLayout과 비슷하다.
* Flow: 아직 비공개이다.
## Post Layout effects
### Layers
* 개발자가 무언가를 넣고 싶다 하였을 때 그에 전반적인 계산 등을 도와주는 기능이다. 특별하게 감싼 것이 아니라 레이어 자체는 따로 고정되어 있다.
### Circular Reveal
* 애니메이션에서 동그랗게 레이아웃이 등장하는 액션이 있는데 이전에는 구현하기 어려운 기능이었다. 하지만 이번에 구글이 간단하게 구현할 수 있도록 기능을 추가 하였다.
### Decorator
* 해당 뷰들은 각각으로 존재하고 움직이지만 뷰들이 움직이면서 서로 합쳐지거나 분할되는 애니메이션을 보여줄 수 있는 기능이다.