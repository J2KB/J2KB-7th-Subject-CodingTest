package 임수빈.programers.kakao2022_prob92334;

public class Main {
    public static void main(String[] args){
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k =2;
        for(int a : new Solution().solution(id_list,report,k)){
            System.out.print(a+",");
        }
        System.out.println();
        id_list = new String[]{"con", "ryan"};
        report = new String[]{"ryan con", "ryan con", "ryan con", "ryan con"};
        k = 3;
        for(int a : new Solution().solution(id_list,report,k)){
            System.out.print(a+",");
        }
    }
}
