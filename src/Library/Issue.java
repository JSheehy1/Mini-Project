package Library;

import java.io.Serializable;

public class Issue extends Books implements Serializable {

    private int issueID;
    private int userID;
    private int bookID;
    private String issueDate;
    private String period;
    private String returnDate;
    private int fine;

    public Issue(int issueID, int userID, int bookID, String issueDate, String period, String returnDate, int fine) {
        setIssueID(issueID);
        setUserID(userID);
        setBookID(bookID);
        setIssueDate(issueDate);
        setPeriod(period);
        setReturnDate(returnDate);
        setFine(fine);
    }

    public void setIssueID(int issueID) {
        this.issueID = issueID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public int getIssueID() {
        return issueID;
    }

    public int getUserID() {
        return userID;
    }

    public int getBookID() {
        return bookID;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getPeriod() {
        return period;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public int getFine() {
        return fine;
    }

    @Override
    public String toString() {
        return String.format("Issue ID: %s\nUser ID: %s\nBook ID: %s\nIssue Date: %s\nPeriod: %s\nReturn Date: %s\nFine: %.2f\n",getIssueID(),getUserID(),getBookID(),getIssueDate(),getPeriod(),getReturnDate(),getFine());
    }
}
