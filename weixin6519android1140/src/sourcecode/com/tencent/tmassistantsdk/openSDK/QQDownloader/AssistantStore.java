package com.tencent.tmassistantsdk.openSDK.QQDownloader;

import android.net.Uri;
import android.provider.BaseColumns;

public class AssistantStore
{
  public static final String AUTHORITY = "com.tencent.android.qqdownloader.provider";
  
  public static final class DownloadInfos
    implements BaseColumns
  {
    public static final Uri CONTENT_URI = Uri.parse("content://com.tencent.android.qqdownloader.provider/downloadsinfo?notify=true");
    
    public static abstract interface DownloadInfoColumns
    {
      public static final String APKID = "apkId";
      public static final String APPURLS = "apkUrl";
      public static final String CHANNELID = "channelId";
      public static final String FILEPATH = "filePath";
      public static final String PACKAGENAME = "packageName";
      public static final String RECEIVEDLENGTH = "received_length";
      public static final String STATE = "state";
      public static final String TOTALLENGTH = "total_length";
      public static final String VERSIONCODE = "versionCode";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\tmassistantsdk\openSDK\QQDownloader\AssistantStore.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */