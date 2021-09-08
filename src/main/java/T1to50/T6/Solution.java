package T1to50.T6;

class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1){
            return  s;
        }
        int len = s.length();
        int size =2*numRows-2;
        int circleNum = (len%size == 0)? len/size : len/size+1;
        StringBuilder sb = new StringBuilder();

        for (int rows = 0; rows < numRows; rows++) {
            for (int i = 0; i < circleNum; i++) {//i表述 一个z字形单元
                if (i == circleNum-1){
                    if (rows == 0){
                        if (i*size < len){
                            sb.append(s.charAt(i*size));
                        }

                    }else if (rows == numRows-1){
                        if (i*size+rows < len){
                            sb.append(s.charAt(i*size+rows));
                        }

                    }else{
                        if (i*size+rows < len){
                            sb.append(s.charAt(i*size+rows));
                        }
                        if (i*size+size-rows < len){
                            sb.append(s.charAt(i*size+size-rows));
                        }

                    }
                }else {
                    if (rows == 0){
                        sb.append(s.charAt(i*size));
                    }else if (rows == numRows-1){
                        sb.append(s.charAt(i*size+rows));
                    }else{
                        sb.append(s.charAt(i*size+rows));
                        sb.append(s.charAt(i*size+size-rows));
                    }
                }

            }
        }

        return sb.toString();
    }
}