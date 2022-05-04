package Quiz;

public class OddNumber {

    public static int fun(int arr[], int n)

    {

        int x = arr[0];

        for (int i = 1; i < n; i++)

            x = x ^ arr[i];

        return x;

    }

}
