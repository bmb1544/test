package com.test;

public class test3 {
	public static void main(String[] args) {
	int[] nums = new int[] { 61, 23, 4, 74, 13, 148, 20 };
    
	int max = nums[0]; // �ٶ����ֵΪ�����еĵ�һ��Ԫ��
	int min = nums[0]; // �ٶ���СֵΪ�����еĵ�һ��Ԫ��
	double sum = 0;// �ۼ�ֵ
	double avg = 0;// ƽ��ֵ
    
	for (int i = 0; i < nums.length; i++) { // ѭ�����������е�Ԫ��
    // �����ǰֵ����max�����滻max��ֵ
	    if(nums[i]>max){
	        max=nums[i];
	    }
        if(nums[i]<min){
            min=nums[i];
        }
        sum=sum+nums[i];
    // �����ǰֵС��min�����滻min��ֵ
    
    
    
    // �ۼ����
    
       avg=sum/nums.length;
    // ��ƽ��ֵ
   
    
	System.out.println("�����е����ֵ��" + max);
	System.out.println("�����е���Сֵ��" + min);
	System.out.println("�����е�ƽ��ֵ��" + avg);
	}
}