import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFCell;
import java.io.FileOutputStream;


public class CreateXL {
    /** Excel �ļ�Ҫ��ŵ�λ�ã��ٶ���F����*/
    public static String outputFile = "F:\\test.xls";
    public static void main(String argv[]) {
        try {
            // �����µ�Excel ������
            HSSFWorkbook workbook = new HSSFWorkbook();
            // ��Excel�������н�һ����������Ϊȱʡֵ
            // ��Ҫ�½�һ��Ϊ"Ч��ָ��"�Ĺ����������Ϊ��
            HSSFSheet sheet = workbook.createSheet("ѧ���ɼ�");
            // ������0��λ�ô����У���˵��У�
            HSSFRow row = sheet.createRow((short)0);
			// ������1��λ�ô�����
			HSSFRow row1 = sheet.createRow((short)1);
			// ������2��λ�ô�����
			HSSFRow row2 = sheet.createRow((short)2);
			// ������3��λ�ô�����
			HSSFRow row3 = sheet.createRow((short)3);
            
			//������0��λ�ô�����Ԫ�����϶ˣ�
            HSSFCell cell01 = row.createCell((short)0);
			HSSFCell cell02 = row.createCell((short)1);

			//������1��λ�ô�����Ԫ��
			HSSFCell cell11 = row1.createCell((short)0);
			HSSFCell cell12 = row1.createCell((short)1);

			//������2��λ�ô�����Ԫ��
			HSSFCell cell21 = row2.createCell((short)0);
			HSSFCell cell22 = row2.createCell((short)1);

			//������2��λ�ô�����Ԫ��
			HSSFCell cell31 = row3.createCell((short)0);
			HSSFCell cell32 = row3.createCell((short)1);
            
            // �ڵ�Ԫ��������һЩ����
            cell01.setCellValue("��Ŀ");
			cell02.setCellValue("����");
			
			cell11.setCellValue("��ѧ");
			cell12.setCellValue("99");

			cell21.setCellValue("����");
			cell22.setCellValue("100");

			
			cell31.setCellValue("Ӣ��");
			cell32.setCellValue("120");

            // �½�һ����ļ���
            FileOutputStream fOut = new FileOutputStream(outputFile);
            // ����Ӧ��Excel ����������
            workbook.write(fOut);
            fOut.flush();
            // �����������ر��ļ�
            fOut.close();
            System.out.println("�ļ�����...");
        } catch (Exception e) {
            System.out.println("������ xlCreate() : " + e);
        }
    }
}