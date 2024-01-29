class RomanToInteger {
    public int romanToInt(String s) {
        int [] num = new int[s.length()];
        int sum=0;
        for(int i=0;i<=s.length()-1;i++)
        {
            switch(s.charAt(i))
            {
                case 'M':
                {num[i]=1000;
                    break;
                }
                case 'D':
                {num[i]=500;
                    break;
                }
                case 'C':
                {num[i]=100;
                    break;
                }
                case 'L':
                {num[i]=50;
                    break;
                }
                case 'X':
                {num[i]=10;
                    break;
                }
                case 'V':
                {num[i]=5;
                    break;
                }
                case 'I':
                {num[i]=1;
                    break;
                }
            }
        }

        for(int i=0;i<num.length-1;i++)
        {
            if(num[i]<num[i+1])
                sum=sum-num[i];
            else{
                sum+=num[i];
            }
        }
        sum+=num[num.length-1];
        return sum;
    }
}