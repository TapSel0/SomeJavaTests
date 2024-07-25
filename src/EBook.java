public class EBook extends Book{
    private double fileSize;
    
    public EBook(String title, String author, int year, double fileSize){
        super(title, author, year);
        this.fileSize = fileSize;
    }


    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public double getFileSize() {
        return fileSize;
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Размер файла - " + fileSize);
    }
}
