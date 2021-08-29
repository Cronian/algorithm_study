function solution(table, languages, preference) {

            //분리 [["SI","JAVA","JAVASCRIPT","SQL","PYTHON","C#"] ... ]
    return table.map((t)=> t.split(' '))
    // 첫번째꺼 따로 분리 [SI, ["JAVA","JAVASCRIPT","SQL","PYTHON","C#"]]
        .map((value)=> [...value.splice(0,1), value])
    // 	SI [ 'JAVA', 'JAVASCRIPT', 'SQL', 'PYTHON', 'C#' ] 분할로 반복 languages 수만큼 
        .map(([value, arr])=> [value, languages.reduce((acc,l,index)=> {
        //언어 선호도 및 직업군 언어 점수 계산 해당 배열에 언어 없으면 -5 해서 0점 처리
        acc += (5-(arr.indexOf(l) === -1 ? 5 : arr.indexOf(l))) * preference[index];
        return acc;
        // [["SI",29],["CONTENTS",36] ... 이런식으로 배열 나옴 숫자로 오름차순 정렬 하고 다음 이름으로 오름차순 정렬 값
    }, 0)]).sort((a,b)=> b[1] - a[1] - (a[0] < b[0]))[0][0];
}
