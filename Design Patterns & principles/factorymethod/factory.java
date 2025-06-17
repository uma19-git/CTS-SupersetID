interface document {
    void write();
}

// Concrete Classes
class Word implements document {
    public void write() {
        System.out.println("WordDocument is written!!");
    }
}

class Pdf implements document {
    public void write() {
        System.out.println("PDFDocument is written!!");
    }
}

class Excel implements document {
    public void write() {
        System.out.println("ExcelDocument is written!!");
    }
}

// Abstract Factory
abstract class DocumentFactory {
    public abstract document createDocument();
}

// Concrete Factories
class WordDocFactory extends DocumentFactory {
    public document createDocument() {
        return new Word();
    }
}

class PdfDocFactory extends DocumentFactory {
    public document createDocument() {
        return new Pdf();
    }
}

class ExcelDocFactory extends DocumentFactory {
    public document createDocument() {
        return new Excel();
    }
}