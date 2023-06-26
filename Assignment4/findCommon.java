import java.io.*;
class FindCommon {
    // This function prints common elements in ar1
    public static void  findCommon(int ar1[], int ar2[], int ar3[])
    {
        int i = 0, j = 0, k = 0;
        while (i < ar1.length && j < ar2.length
               && k < ar3.length) {
            if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) {
                System.out.print(ar1[i] + " ");
                i++;
                j++;
                k++;
            }
            else if (ar1[i] < ar2[j])
                i++;
            else if (ar2[j] < ar3[k])
                j++;
            else
                k++;
        }
    }
    public static void main(String args[])
    {
        int ar1[] = { 1,2,3,4,5};
        int ar2[] = { 1,2,5,7,9 };
        int ar3[] = { 1,3,4,5,8 };
        System.out.print("Common elements are ");
        findCommon(ar1, ar2, ar3);
    }
}