public class VideoConsumingService{
    private Database database;
    public int seekTime(String UserId,String videoID){
        WatchedVideo wv=database.getWatchedVideo(UserId,videoID);
        return wv.getSeekTime();
    }

}

class VideoService{
    private FileSystem fs;

    public Frame getFrame(String videoID,int timestamp){
        Video video=FileSystem.getVideo(videoID);
        return video.getFrame(timestamp)
    }
     
}

class FileSystem{
    public Video getVideo(String videoID){
        return null;
    }
}



class Database{
    public WatchedVideo getWatchedVideo(String UserId,videoID){
        return null;
    }
}


class Video{
    String id;
    Frame[] frames;
    String Metadata;
    public getFrame(int timestamp){
        for(int i=0;i<frames.length;i++){
            if(frames.timestamp<=timestamp && timestamp< frames[i].endTimestamp){
                return frames[i];
            }
        }
        throw new indexOfBoundsException();
    }

}

class Frame{
    byte[] bytes;
    int startTimestamp;
    int endTimestamp;
    public static int frameTime=10;
}

class Users{
    String id;
    String name;
    String Metadata;
    public String getId(){
        return id;
    }


}
class WatchedVideo{
    String id;
    String videoId;
    String UserId;
    int seekTime;
    public int getSeekTime(){
        return seekTime;
    }
}



