package boj.step46;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

//Trie에 대한 Node 값
class Node{
    int[] child;
    //Node 생성자
    Node(){
        //Bit는 0, 1이기 때문에 [2]로 배열 초기화
        child = new int[2];
        //자식 노드가 없으면 -1로 표시
        Arrays.fill(child, -1);
    }
}
//Trie 관한 클래스
class Trie{
    //노드에 정보 저장하는 List
    List<Node> nodes;
    Trie(){
        nodes = new ArrayList<>();
    }
    //노드 생성 및 Index 반환하는 함수
    int init(){
        Node newNode = new Node();
        nodes.add(newNode);
        return nodes.size() - 1;
    }
    //Bit의 수를 추가하는 함수
    void insert(int cur, int idx, int val){
        if(idx == -1){
            return;
        }
        //현재 비트의 값
        int c = (val & (1 << idx)) == 0 ? 0 : 1;
        //해당 자식 노드가 없을 때 노드 생성
        if(nodes.get(cur).child[c] == -1){
            int nxtIdx = init();
            nodes.get(cur).child[c] = nxtIdx;
        }
        //다음 Bit값으로 이동
        insert(nodes.get(cur).child[c], idx - 1, val);
    }
    //XOR 비교하는 함수
    int search(int cur, int idx, int val, int sum){
        if(idx == -1){
            return sum;
        }
        //0 → 1, 1 → 0으로 변환
        int c = 1 - ((val & (1 << idx)) == 0 ? 0 : 1);
        //해당 자식 노드가 없으면 다시 원상태로 변환
        if(nodes.get(cur).child[c] == -1){
            c = 1 - c;
        }
        //다음 Bit 값 비교
        return search(nodes.get(cur).child[c], idx - 1, val, sum + (c << idx));
    }
}
public class BOJ13505 {
    public static void main(String[] args) throws IOException {
        //입력값 처리하는 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //결과값 출력하는 BufferedWriter
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int ans = Integer.MIN_VALUE;
        //Tire 생성
        Trie trie = new Trie();
        //Root Node 생성
        trie.init();
        //첫 번째 수 Trie에 저장
        trie.insert(0, 30, Integer.parseInt(st.nextToken()));
        //2 ~ N번째 수 Trie 저장 및 XOR 비교
        for(int i=1;i<N;i++){
            int val = Integer.parseInt(st.nextToken());
            //현재 수 Trie 저장
            trie.insert(0, 30, val);
            //XOR비교를 통해 최대값 비교
            ans = Math.max(ans, trie.search(0, 30, val, 0) ^ val);
        }
        //최대값 BufferedWriter 저장
        bw.write(String.valueOf(ans));
        bw.flush();		//결과 출력
        bw.close();
        br.close();
    }
}
