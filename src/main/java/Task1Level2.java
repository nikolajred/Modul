public class Task1Level2 {
        public boolean isValid(String s) {
            boolean result = false;
            if(s.equals("")){
                result = true;
            }else if(s.length()==1){
                result = false;
            }else{

                char[] ch = s.toCharArray();
                boolean[] bl = new boolean[ch.length - 1];


                for (int k = 0; k < ch.length; k++) {
                    System.out.print(ch[k] + " ");
                }
                for (int i = 0; i < ch.length - 1; i++) {
                    for (int j = i + 1; j < ch.length; j += 2) {
                        if (ch[i] == '(' && ch[j] == ')') {
                            bl[i] = true;
                            break;
                        } else if (ch[i] == '[' && ch[j] == ']') {
                            bl[i] = true;
                            break;
                        } else if (ch[i] == '{' && ch[j] == '}') {
                            bl[i] = true;
                            break;
                        }
                    }
                }


                if (bl.length > 1) {
                    int countTrue = 0;
                    int countFalse = 0;
                    for (int k = 0; k < bl.length; k++) {
                        if (bl[k] == true) {
                            countTrue++;
                        } else {
                            countFalse++;
                        }

                    }
                    if (countTrue > countFalse) {
                        result = true;
                    } else {
                        result = false;
                    }

                } else {
                    result = bl[0];
                }
            }
            System.out.println(result);
            return result;

        }
    }
