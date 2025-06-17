
public class Main1 {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocFactory();
        document wordDoc = wordFactory.createDocument();
        wordDoc.write();

        DocumentFactory pdfFactory = new PdfDocFactory();
        document pdfDoc = pdfFactory.createDocument();
        pdfDoc.write();

        DocumentFactory excelFactory = new ExcelDocFactory();
        document excelDoc = excelFactory.createDocument();
        excelDoc.write();
    }
}
