package DownloadFile;

public class Result {
    int fileId;
    String threadName;
    int duration;
    String status;

    public Result(int fileId, String threadName, int duration, String status) {
        this.fileId = fileId;
        this.threadName = threadName;
        this.duration = duration;
        this.status = status;
    }
}
