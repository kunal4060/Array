class maxsubarraysum{
    public static void main(String arg[]){
        int num[] = { 1 , -2 , -5 ,6 , 8};
        int max = 0 ;

        for ( int i = 0 ; i < num.length ; i++){
            for ( int j = i ; j < num.length ; j++){
                int sum = 0 ;

                for( int k = i ; k < j ; k++){
                    sum = num[k] + sum ;
                    System.out.println(sum);


                }
                if (sum > max){
                    sum = max ;
                }


            }
        }
        System.out.println("sum is " + max);
    }

}