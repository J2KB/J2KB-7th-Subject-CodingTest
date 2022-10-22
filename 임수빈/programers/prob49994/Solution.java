package 임수빈.programers.prob49994;
//30분
import java.util.*;

class Solution {
    public int solution(String dirs) {
        char[] dirArray = dirs.toCharArray();
        List<Roads> roadsSet = new ArrayList<>();
        Road now = new Road(0,0);
        for (char c: dirArray) {
            if(c == 'R'){
                if (now.x==5) {
                    continue;
                }
                Road next = new Road(now.x+1,now.y);
                Roads roads = new Roads(now,next);
                if(!roadsSet.contains(roads)){
                    roadsSet.add(roads);
                }
                now = next ;
            }else if(c=='L'){
                if (now.x==-5) {
                    continue;
                }
                Road next = new Road(now.x-1,now.y);
                Roads roads = new Roads(now,next);
                if(!roadsSet.contains(roads)){
                    roadsSet.add(roads);
                }
                now = next ;
            }else if(c=='U'){
                if (now.y==5) {
                    continue;
                }
                Road next = new Road(now.x,now.y+1);
                Roads roads = new Roads(now,next);
                if(!roadsSet.contains(roads)){
                    roadsSet.add(roads);
                }
                now = next ;

            }else if(c=='D'){
                if (now.y==-5) {
                    continue;
                }
                Road next = new Road(now.x,now.y-1);
                Roads roads = new Roads(now,next);
                if(!roadsSet.contains(roads)){
                    roadsSet.add(roads);
                }
                now = next ;
            }
        }
        return roadsSet.size();
    }

    class Road{
        int x;
        int y;
        Road(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public boolean equals(Object obj) {
            Road o = (Road)obj;
            if(x==o.x && y ==o.y)return true;
            else return false;
        }
    }
    class Roads{
        Road a;
        Road b;

        public Roads(Road a, Road b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object obj) {
            Roads o = (Roads)obj;
            if(o.a.equals(a) && o.b.equals(b)){
                return true;
            } else if (o.a.equals(b) && o.b.equals(a)) {
                return true;
            }else return false;
        }

    }
}