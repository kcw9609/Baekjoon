# [level 2] 선인장 숨기기 - 468379 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/468379) 

### 성능 요약

메모리: 161 MB, 시간: 1334.56 ms

### 구분

코딩테스트 연습 > 2025 카카오 하반기 2차

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 03월 18일 19:18:41

### 문제 설명

<p style="user-select: auto !important;"><code style="user-select: auto !important;">m</code>개의 행과 <code style="user-select: auto !important;">n</code>개의 열로 구성된 격자가 주어지며, 이는 사막 지도를 나타냅니다. 사막 지도의 가장 왼쪽 위칸 좌표는 <code style="user-select: auto !important;">(0, 0)</code>, 오른쪽 아래칸 좌표는 <code style="user-select: auto !important;">(m-1, n-1)</code>입니다. 이 사막 어딘가에 가로 <code style="user-select: auto !important;">w</code>, 세로 <code style="user-select: auto !important;">h</code> 크기의 선인장 구역을 조성하려 합니다. 선인장 구역은 격자 축에 맞춘 연속된 <code style="user-select: auto !important;">w</code> × <code style="user-select: auto !important;">h</code> 크기의 부분 격자이며, 회전할 수 없습니다.</p>

<p style="user-select: auto !important;">비구름은 미리 정해진 순서대로 격자의 여러 칸에 비를 뿌립니다. 이때 빗방울이 처음으로 선인장 구역에 포함된 칸에 떨어졌을 때, 그 시점을 선인장이 처음으로 비를 맞는 순간으로 기록합니다. 당신은 선인장이 가능한 한 늦게 비를 맞도록, 선인장 구역의 위치를 정하려고 합니다.</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">선인장이 비를 맞지 않도록 선인장 구역의 위치를 정할 수 있다면 해당 위치가 가장 우선됩니다.</li>
<li style="user-select: auto !important;">가능한 늦게 비를 맞는 선인장 구역 후보가 여러 개라면 그중 가장 위쪽 행, 그래도 여러 개면 가장 왼쪽 열에 위치한 구역을 선택합니다.</li>
</ul>

<p style="user-select: auto !important;">격자의 세로 길이와 가로 길이를 나타내는 정수 <code style="user-select: auto !important;">m</code>, <code style="user-select: auto !important;">n</code>, 선인장 구역의 세로 길이와 가로 길이를 나타내는 정수 <code style="user-select: auto !important;">h</code>, <code style="user-select: auto !important;">w</code>, 그리고 빗방울이 떨어지는 순서대로 칸의 좌표를 담은 2차원 정수 배열 <code style="user-select: auto !important;">drops</code>가 매개변수로 주어집니다. 주어진 조건을 만족하는 선인장 구역에 포함된 가장 왼쪽 위칸의 좌표를 정수 배열로 return 하도록 solution 함수를 완성해 주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">m</code>, <code style="user-select: auto !important;">n</code> ≤ 500,000</li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">m</code> × <code style="user-select: auto !important;">n</code> ≤ 500,000</li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">h</code> ≤ <code style="user-select: auto !important;">m</code></li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">w</code> ≤ <code style="user-select: auto !important;">n</code></li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">drops</code>의 길이 ≤ <code style="user-select: auto !important;">m</code> × <code style="user-select: auto !important;">n</code>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;"><code style="user-select: auto !important;">drops[i]</code>는 [<code style="user-select: auto !important;">r</code>, <code style="user-select: auto !important;">c</code>] 형태입니다.</li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">drops[i]</code>는 <code style="user-select: auto !important;">i + 1</code>번째로 떨어진 빗방울의 좌표를 의미합니다.</li>
<li style="user-select: auto !important;">0 ≤ <code style="user-select: auto !important;">r</code> &lt; <code style="user-select: auto !important;">m</code></li>
<li style="user-select: auto !important;">0 ≤ <code style="user-select: auto !important;">c</code> &lt; <code style="user-select: auto !important;">n</code></li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">drops</code>의 모든 원소는 서로 다른 칸을 나타냅니다.</li>
</ul></li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">테스트 케이스 구성 안내</h5>

<p style="user-select: auto !important;">아래는 테스트 케이스 구성을 나타냅니다. 각 그룹은 하나 이상의 하위 그룹으로 이루어져 있으며, 하위 그룹의 모든 테스트 케이스를 통과하면 해당 그룹에 할당된 점수를 획득할 수 있습니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">그룹</th>
<th style="user-select: auto !important;">총점</th>
<th style="user-select: auto !important;">추가 제한 사항</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">#1</td>
<td style="user-select: auto !important;">30%</td>
<td style="user-select: auto !important;"><code style="user-select: auto !important;">m ≤ 50</code>, <code style="user-select: auto !important;">n ≤ 50</code></td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">#2</td>
<td style="user-select: auto !important;">70%</td>
<td style="user-select: auto !important;">추가 제한 없음</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">m</th>
<th style="user-select: auto !important;">n</th>
<th style="user-select: auto !important;">h</th>
<th style="user-select: auto !important;">w</th>
<th style="user-select: auto !important;">drops</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">5</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">[[0, 0], [3, 1], [1, 3], [2, 4], [1, 1], [2, 2], [2, 3], [0, 4]]</td>
<td style="user-select: auto !important;">[2, 2]</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">[[0, 0], [0, 1], [0, 2], [1, 0]]</td>
<td style="user-select: auto !important;">[1, 1]</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">6</td>
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">[[1, 2]]</td>
<td style="user-select: auto !important;">[0, 0]</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">6</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">[[0, 1], [0, 3], [0, 5], [1, 1], [1, 3], [1, 5], [2, 1], [2, 3], [2, 5], [3, 1], [3, 3], [3, 5]]</td>
<td style="user-select: auto !important;">[3, 4]</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">[[0, 0], [0, 1], [1, 1], [1, 0]]</td>
<td style="user-select: auto !important;">[0, 0]</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">[[2, 0], [1, 3], [3, 2], [0, 1]]</td>
<td style="user-select: auto !important;">[0, 2]</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;"><strong style="user-select: auto !important;">입출력 예 #1</strong></p>

<p style="user-select: auto !important;">아래 그림은 <code style="user-select: auto !important;">4</code> × <code style="user-select: auto !important;">5</code> 크기의 지도 격자입니다. 각 칸의 큰 숫자는 빗방울이 떨어지는 순서를, 작은 숫자는 좌표를 나타냅니다.</p>

<p style="user-select: auto !important;"><img src="https://grepp-programmers.s3.ap-northeast-2.amazonaws.com/production/presigned_urls/ee647a0c-6d56-433f-88e5-a4de759e437e/trs_ex1_1.png" title="" alt="trs_ex1_1.png" style="user-select: auto !important;"></p>

<p style="user-select: auto !important;">노란색으로 표시된 구역을 선인장 구역으로 두면, 6번째로 비가 떨어질 때 선인장이 처음 비를 맞게 되며, 이보다 더 늦게 젖도록 하는 배치는 존재하지 않습니다. 따라서 노란색 구역의 가장 왼쪽 위 좌표인 <code style="user-select: auto !important;">[2, 2]</code>를 return 해야 합니다.</p>

<p style="user-select: auto !important;"><strong style="user-select: auto !important;">입출력 예 #2</strong></p>

<p style="user-select: auto !important;">아래 그림은 <code style="user-select: auto !important;">3</code> × <code style="user-select: auto !important;">3</code> 크기의 지도 격자입니다. 각 칸의 큰 숫자는 빗방울이 떨어지는 순서를, 작은 숫자는 좌표를 나타냅니다.</p>

<p style="user-select: auto !important;"><img src="https://grepp-programmers.s3.ap-northeast-2.amazonaws.com/production/presigned_urls/617cd348-ee36-437f-b6dc-c86e86135277/trs_ex2.png" title="" alt="trs_ex2.png" style="user-select: auto !important;"></p>

<p style="user-select: auto !important;">모든 빗방울이 떨어질 때까지 좌표가 (1, 1), (1, 2), (2, 0), (2, 1), (2, 2)인 칸은 젖지 않습니다. 이 5칸 어디에나 <code style="user-select: auto !important;">1</code> × <code style="user-select: auto !important;">1</code> 크기의 선인장 구역을 놓을 수 있지만, 그중 가장 위쪽 행, 그리고 가장 왼쪽 열에 해당하는 좌표는 (1, 1)입니다. 따라서 <code style="user-select: auto !important;">[1, 1]</code>을 return 해야 합니다.</p>

<p style="user-select: auto !important;"><strong style="user-select: auto !important;">입출력 예 #3</strong></p>

<p style="user-select: auto !important;">아래 그림은 <code style="user-select: auto !important;">4</code> × <code style="user-select: auto !important;">6</code> 크기의 지도 격자입니다. 각 칸의 큰 숫자는 빗방울이 떨어지는 순서를, 작은 숫자는 좌표를 나타냅니다.</p>

<p style="user-select: auto !important;"><img src="https://grepp-programmers.s3.ap-northeast-2.amazonaws.com/production/presigned_urls/34650a98-15ea-46a5-a24b-9c6b65c41683/trs_ex3.png" title="" alt="trs_ex3.png" style="user-select: auto !important;"></p>

<p style="user-select: auto !important;">선인장 구역을 어디에 배치하더라도 첫 번째 빗방울만에 구역이 젖습니다. 따라서 가장 위쪽 행, 그중에서도 가장 왼쪽 열에 위치하는 좌표인 <code style="user-select: auto !important;">[0, 0]</code>을 return 해야 합니다.</p>

<p style="user-select: auto !important;"><strong style="user-select: auto !important;">입출력 예 #4</strong></p>

<p style="user-select: auto !important;">아래 그림은 <code style="user-select: auto !important;">4</code> × <code style="user-select: auto !important;">6</code> 크기의 지도 격자입니다. 각 칸의 큰 숫자는 빗방울이 떨어지는 순서를, 작은 숫자는 좌표를 나타냅니다.</p>

<p style="user-select: auto !important;"><img src="https://grepp-programmers.s3.ap-northeast-2.amazonaws.com/production/presigned_urls/2b2d9522-116e-44d4-9e69-5204ed83d73b/trs_ex4.png" title="" alt="trs_ex4.png" style="user-select: auto !important;"></p>

<p style="user-select: auto !important;">따라서 <code style="user-select: auto !important;">[3, 4]</code>를 return 해야 합니다.</p>

<p style="user-select: auto !important;"><strong style="user-select: auto !important;">입출력 예 #5</strong></p>

<p style="user-select: auto !important;">아래 그림은 <code style="user-select: auto !important;">2</code> × <code style="user-select: auto !important;">2</code> 크기의 지도 격자입니다. 각 칸의 큰 숫자는 빗방울이 떨어지는 순서를, 작은 숫자는 좌표를 나타냅니다.</p>

<p style="user-select: auto !important;"><img src="https://grepp-programmers.s3.ap-northeast-2.amazonaws.com/production/presigned_urls/f7d5b500-dc06-43ec-999b-edfc6dfdd815/trs_ex5.png" title="" alt="trs_ex5.png" style="user-select: auto !important;"></p>

<p style="user-select: auto !important;">따라서 <code style="user-select: auto !important;">[0, 0]</code>을 return 해야 합니다.</p>

<p style="user-select: auto !important;"><strong style="user-select: auto !important;">입출력 예 #6</strong></p>

<p style="user-select: auto !important;">아래 그림은 <code style="user-select: auto !important;">4</code> × <code style="user-select: auto !important;">4</code> 크기의 지도 격자입니다. 각 칸의 큰 숫자는 빗방울이 떨어지는 순서를, 작은 숫자는 좌표를 나타냅니다.</p>

<p style="user-select: auto !important;"><img src="https://grepp-programmers.s3.ap-northeast-2.amazonaws.com/production/presigned_urls/ac8d15f6-05f6-4323-9daa-3fd8951e6ae2/trs_ex6.png" title="" alt="trs_ex6.png" style="user-select: auto !important;"></p>

<p style="user-select: auto !important;">따라서 <code style="user-select: auto !important;">[0, 2]</code>를 return 해야 합니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges