# [level 0] qr code - 181903 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181903) 

### 성능 요약

메모리: 9.09 MB, 시간: 0.12 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 01월 20일 13:56:40

### 문제 설명

<p style="user-select: auto !important;">두 정수 <code style="user-select: auto !important;">q</code>, <code style="user-select: auto !important;">r</code>과 문자열 <code style="user-select: auto !important;">code</code>가 주어질 때, <code style="user-select: auto !important;">code</code>의 각 인덱스를 <code style="user-select: auto !important;">q</code>로 나누었을 때 나머지가 <code style="user-select: auto !important;">r</code>인 위치의 문자를 앞에서부터 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">0 ≤ <code style="user-select: auto !important;">r</code> &lt; <code style="user-select: auto !important;">q</code> ≤ 20</li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">r</code> &lt; <code style="user-select: auto !important;">code</code>의 길이 ≤ 1,000</li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">code</code>는 영소문자로만 이루어져 있습니다.</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">q</th>
<th style="user-select: auto !important;">r</th>
<th style="user-select: auto !important;">code</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">"qjnwezgrpirldywt"</td>
<td style="user-select: auto !important;">"jerry"</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">"programmers"</td>
<td style="user-select: auto !important;">"programmers"</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">예제 1번의 <code style="user-select: auto !important;">q</code>와 <code style="user-select: auto !important;">r</code>은 각각 3, 1이고 인덱스와 그 값을 <code style="user-select: auto !important;">q</code>로 나눈 나머지가 잘 보이도록 표로 만들면 다음과 같습니다.</li>
</ul>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;"><code style="user-select: auto !important;">code</code></th>
<th style="user-select: auto !important;">q</th>
<th style="user-select: auto !important;">j</th>
<th style="user-select: auto !important;">n</th>
<th style="user-select: auto !important;">w</th>
<th style="user-select: auto !important;">e</th>
<th style="user-select: auto !important;">z</th>
<th style="user-select: auto !important;">g</th>
<th style="user-select: auto !important;">r</th>
<th style="user-select: auto !important;">p</th>
<th style="user-select: auto !important;">i</th>
<th style="user-select: auto !important;">r</th>
<th style="user-select: auto !important;">l</th>
<th style="user-select: auto !important;">d</th>
<th style="user-select: auto !important;">y</th>
<th style="user-select: auto !important;">w</th>
<th style="user-select: auto !important;">t</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">index</td>
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">5</td>
<td style="user-select: auto !important;">6</td>
<td style="user-select: auto !important;">7</td>
<td style="user-select: auto !important;">8</td>
<td style="user-select: auto !important;">9</td>
<td style="user-select: auto !important;">10</td>
<td style="user-select: auto !important;">11</td>
<td style="user-select: auto !important;">12</td>
<td style="user-select: auto !important;">13</td>
<td style="user-select: auto !important;">14</td>
<td style="user-select: auto !important;">15</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;"><code style="user-select: auto !important;">q</code>로 나눈 나머지</td>
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">0</td>
</tr>
</tbody>
      </table><div class="highlight" style="user-select: auto !important;"><pre class="codehilite" style="user-select: auto !important;"><code style="user-select: auto !important;">`q`로 나눈 나머지가 1인 인덱스의 문자들을 앞에서부터 순서대로 이어 붙이면 "jerry"가 되므로 이를 return 합니다.
</code></pre></div>
<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">예제 2번의 <code style="user-select: auto !important;">q</code>와 <code style="user-select: auto !important;">r</code>은 각각 1, 0이고 인덱스와 그 값을 <code style="user-select: auto !important;">q</code>로 나눈 나머지가 잘 보이도록 표로 만들면 다음과 같습니다.</li>
</ul>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;"><code style="user-select: auto !important;">code</code></th>
<th style="user-select: auto !important;">p</th>
<th style="user-select: auto !important;">r</th>
<th style="user-select: auto !important;">o</th>
<th style="user-select: auto !important;">g</th>
<th style="user-select: auto !important;">r</th>
<th style="user-select: auto !important;">a</th>
<th style="user-select: auto !important;">m</th>
<th style="user-select: auto !important;">m</th>
<th style="user-select: auto !important;">e</th>
<th style="user-select: auto !important;">r</th>
<th style="user-select: auto !important;">s</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">index</td>
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">5</td>
<td style="user-select: auto !important;">6</td>
<td style="user-select: auto !important;">7</td>
<td style="user-select: auto !important;">8</td>
<td style="user-select: auto !important;">9</td>
<td style="user-select: auto !important;">10</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;"><code style="user-select: auto !important;">q</code>로 나눈 나머지</td>
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">0</td>
</tr>
</tbody>
      </table><div class="highlight" style="user-select: auto !important;"><pre class="codehilite" style="user-select: auto !important;"><code style="user-select: auto !important;">`q`로 나눈 나머지가 1인 인덱스의 문자들을 앞에서부터 순서대로 이어 붙이면 "programmers"가 되므로 이를 return 합니다.
</code></pre></div>

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges