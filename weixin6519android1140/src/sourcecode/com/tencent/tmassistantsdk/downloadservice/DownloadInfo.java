package com.tencent.tmassistantsdk.downloadservice;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.tmassistantsdk.storage.DBManager;
import com.tencent.tmassistantsdk.storage.TMAssistantFile;
import com.tencent.tmassistantsdk.util.TMLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public class DownloadInfo
{
  public static final String CONTENTTYPE = "contentType";
  public static final String DOWNLOADFAILEDERRCODE = "downloadFailedErrCode";
  public static final String DOWNLOADFAILEDTIME = "downloadFailedTime";
  public static final String FILENAME = "fileName";
  public static final String FINALURL = "finalUrl";
  public static final String HEADERPARAMS = "headerParams";
  public static final String NETTYPE = "netType";
  public static final String PRIORITY = "priority";
  public static final String RECEIVEDBYTES = "receivedBytes";
  public static final String REDIRECTCNT = "redirectCnt";
  public static final String REQUESTFILESIZE = "requestFileSize";
  public static final String RETRYCNT = "retryCnt";
  public static final String SECONDARYURL = "secondaryUrl";
  public static final String STATUS = "status";
  public static final String TAG = "_DownloadInfo";
  public static final String TASKID = "taskId";
  public static final String TASKURL = "taskUrl";
  public static final String TOTALBYTES = "totalBytes";
  public static final String UID = "uId";
  private boolean mAutoRetry = false;
  public String mContentType;
  public int mDownloadFailedErrCode;
  public long mDownloadFailedTime;
  public int mDownloadTaskId;
  public String mFileName;
  private String mHeaderParamString;
  private HashMap<String, String> mHeaderParams;
  public String mNetType;
  public int mPriority;
  public long mReceivedBytes;
  public int mRedirectCnt;
  public Long mRequestFileSize;
  public String mRequestURL;
  public int mRetryCnt;
  public String mSecondaryUrl;
  public int mStatus;
  boolean mTaskIsRunning;
  protected String mTempFileName;
  protected long mTotalBytes;
  public String mURL;
  public String mUUID;
  
  public DownloadInfo()
  {
    this.mTaskIsRunning = false;
  }
  
  public DownloadInfo(String paramString1, String paramString2, long paramLong, int paramInt, String paramString3)
  {
    this.mURL = paramString1;
    this.mSecondaryUrl = paramString2;
    this.mRequestURL = DownloadHelper.correctURL(paramString1);
    this.mRequestFileSize = Long.valueOf(paramLong);
    this.mUUID = UUID.randomUUID().toString();
    this.mPriority = paramInt;
    this.mStatus = 0;
    this.mDownloadFailedErrCode = 0;
    this.mTaskIsRunning = false;
    this.mContentType = paramString3;
    this.mNetType = DownloadHelper.getNetStatus();
    this.mDownloadFailedTime = 0L;
  }
  
  public static DownloadInfo readFromCursor(Cursor paramCursor)
  {
    DownloadInfo localDownloadInfo = new DownloadInfo();
    localDownloadInfo.mDownloadTaskId = paramCursor.getInt(paramCursor.getColumnIndex("taskId"));
    localDownloadInfo.mUUID = paramCursor.getString(paramCursor.getColumnIndex("uId"));
    localDownloadInfo.mRequestURL = paramCursor.getString(paramCursor.getColumnIndex("finalUrl"));
    localDownloadInfo.mURL = paramCursor.getString(paramCursor.getColumnIndex("taskUrl"));
    localDownloadInfo.mSecondaryUrl = paramCursor.getString(paramCursor.getColumnIndex("secondaryUrl"));
    localDownloadInfo.mRequestFileSize = Long.valueOf(paramCursor.getLong(paramCursor.getColumnIndex("requestFileSize")));
    localDownloadInfo.mFileName = paramCursor.getString(paramCursor.getColumnIndex("fileName"));
    localDownloadInfo.mContentType = paramCursor.getString(paramCursor.getColumnIndex("contentType"));
    localDownloadInfo.mRedirectCnt = paramCursor.getInt(paramCursor.getColumnIndex("redirectCnt"));
    localDownloadInfo.mRetryCnt = paramCursor.getInt(paramCursor.getColumnIndex("retryCnt"));
    localDownloadInfo.mTotalBytes = paramCursor.getLong(paramCursor.getColumnIndex("totalBytes"));
    localDownloadInfo.mStatus = paramCursor.getInt(paramCursor.getColumnIndex("status"));
    localDownloadInfo.mReceivedBytes = paramCursor.getLong(paramCursor.getColumnIndex("receivedBytes"));
    localDownloadInfo.mPriority = paramCursor.getInt(paramCursor.getColumnIndex("priority"));
    localDownloadInfo.mNetType = paramCursor.getString(paramCursor.getColumnIndex("netType"));
    localDownloadInfo.mDownloadFailedErrCode = paramCursor.getInt(paramCursor.getColumnIndex("downloadFailedErrCode"));
    localDownloadInfo.mDownloadFailedTime = paramCursor.getLong(paramCursor.getColumnIndex("downloadFailedTime"));
    localDownloadInfo.mHeaderParamString = paramCursor.getString(paramCursor.getColumnIndex("headerParams"));
    return localDownloadInfo;
  }
  
  public static DownloadInfo readFromSimpleCursor(Cursor paramCursor)
  {
    DownloadInfo localDownloadInfo = new DownloadInfo();
    localDownloadInfo.mDownloadTaskId = paramCursor.getInt(paramCursor.getColumnIndex("taskId"));
    localDownloadInfo.mUUID = paramCursor.getString(paramCursor.getColumnIndex("uId"));
    localDownloadInfo.mRequestURL = paramCursor.getString(paramCursor.getColumnIndex("finalUrl"));
    localDownloadInfo.mURL = paramCursor.getString(paramCursor.getColumnIndex("taskUrl"));
    localDownloadInfo.mSecondaryUrl = paramCursor.getString(paramCursor.getColumnIndex("secondaryUrl"));
    localDownloadInfo.mRequestFileSize = Long.valueOf(paramCursor.getLong(paramCursor.getColumnIndex("requestFileSize")));
    localDownloadInfo.mFileName = paramCursor.getString(paramCursor.getColumnIndex("fileName"));
    localDownloadInfo.mContentType = paramCursor.getString(paramCursor.getColumnIndex("contentType"));
    localDownloadInfo.mRedirectCnt = paramCursor.getInt(paramCursor.getColumnIndex("redirectCnt"));
    localDownloadInfo.mRetryCnt = paramCursor.getInt(paramCursor.getColumnIndex("retryCnt"));
    localDownloadInfo.mTotalBytes = paramCursor.getLong(paramCursor.getColumnIndex("totalBytes"));
    localDownloadInfo.mStatus = paramCursor.getInt(paramCursor.getColumnIndex("status"));
    localDownloadInfo.mReceivedBytes = paramCursor.getLong(paramCursor.getColumnIndex("receivedBytes"));
    localDownloadInfo.mPriority = paramCursor.getInt(paramCursor.getColumnIndex("priority"));
    localDownloadInfo.mNetType = null;
    localDownloadInfo.mDownloadFailedErrCode = 0;
    localDownloadInfo.mDownloadFailedTime = 0L;
    localDownloadInfo.mHeaderParamString = null;
    return localDownloadInfo;
  }
  
  public static void writeToContentValues(ContentValues paramContentValues, DownloadInfo paramDownloadInfo)
  {
    if ((paramDownloadInfo != null) && (paramContentValues != null))
    {
      paramContentValues.put("taskId", Integer.valueOf(paramDownloadInfo.mDownloadTaskId));
      paramContentValues.put("uId", paramDownloadInfo.mUUID);
      paramContentValues.put("finalUrl", paramDownloadInfo.mRequestURL);
      paramContentValues.put("taskUrl", paramDownloadInfo.mURL);
      paramContentValues.put("secondaryUrl", paramDownloadInfo.mSecondaryUrl);
      paramContentValues.put("requestFileSize", paramDownloadInfo.mRequestFileSize);
      paramContentValues.put("fileName", paramDownloadInfo.mFileName);
      paramContentValues.put("contentType", paramDownloadInfo.mContentType);
      paramContentValues.put("redirectCnt", Integer.valueOf(paramDownloadInfo.mRedirectCnt));
      paramContentValues.put("retryCnt", Integer.valueOf(paramDownloadInfo.mRetryCnt));
      paramContentValues.put("totalBytes", Long.valueOf(paramDownloadInfo.mTotalBytes));
      paramContentValues.put("status", Integer.valueOf(paramDownloadInfo.mStatus));
      paramContentValues.put("receivedBytes", Long.valueOf(paramDownloadInfo.mReceivedBytes));
      paramContentValues.put("priority", Integer.valueOf(paramDownloadInfo.mPriority));
      paramContentValues.put("netType", paramDownloadInfo.mNetType);
      paramContentValues.put("downloadFailedErrCode", Integer.valueOf(paramDownloadInfo.mDownloadFailedErrCode));
      paramContentValues.put("downloadFailedTime", Long.valueOf(paramDownloadInfo.mDownloadFailedTime));
      paramContentValues.put("headerParams", paramDownloadInfo.mHeaderParamString);
    }
  }
  
  public void dump(String paramString)
  {
    TMLog.i(paramString, "--------dump DownloadInfo-----------");
    TMLog.i(paramString, "mContentType: " + this.mContentType);
    TMLog.i(paramString, "mURL: " + this.mURL);
    TMLog.i(paramString, "mRequestURL: " + this.mRequestURL);
    TMLog.i(paramString, "mSecondaryUrl: " + this.mSecondaryUrl);
    TMLog.i(paramString, "mRequestFileSize: " + this.mRequestFileSize);
    TMLog.i(paramString, "mRetryCnt: " + this.mRetryCnt);
    TMLog.i(paramString, "mRedirectCnt: " + this.mRedirectCnt);
    TMLog.i(paramString, "mTotalBytes: " + this.mTotalBytes);
    TMLog.i(paramString, "mUUID: " + this.mUUID);
    TMLog.i(paramString, "mStatus: " + this.mStatus);
    TMLog.i(paramString, "mReceivedBytes: " + this.mReceivedBytes);
    TMLog.i(paramString, "mFileName: " + this.mFileName);
    TMLog.i(paramString, "mDownloadFailedErrCode: " + this.mDownloadFailedErrCode);
    TMLog.i(paramString, "mNetType:" + this.mNetType);
    TMLog.i(paramString, "mDownloadFailedTime:" + this.mDownloadFailedTime);
    TMLog.i(paramString, "mHeaderParamString:" + this.mHeaderParamString);
  }
  
  public HashMap<String, String> getHeaderParams()
  {
    return this.mHeaderParams;
  }
  
  public long getTotalSize()
  {
    return this.mTotalBytes;
  }
  
  boolean hasFinished()
  {
    return this.mStatus > 3;
  }
  
  boolean hasReceivedAllDataBytes()
  {
    TMLog.i("_DownloadInfo", "mTotalBytes = " + this.mTotalBytes + ", mReceivedBytes = " + this.mReceivedBytes);
    return (this.mTotalBytes != 0L) && (this.mReceivedBytes == this.mTotalBytes);
  }
  
  boolean hasRetryChance()
  {
    return this.mRetryCnt <= 5;
  }
  
  public void pauseDownload()
  {
    TMLog.i("_DownloadInfo", "DownloadInfo::pauseDownload url: " + this.mURL);
    DownloadThreadPool.getInstance().cancelDownloadTask(this.mDownloadTaskId);
    updateStatus(3, false);
  }
  
  public void setHeaderParams(HashMap<String, String> paramHashMap)
  {
    if ((paramHashMap != null) && (paramHashMap.size() > 0))
    {
      this.mHeaderParams = paramHashMap;
      this.mHeaderParamString = new JSONObject(paramHashMap).toString();
    }
  }
  
  public void setTotalSize(long paramLong)
  {
    if (0L == paramLong) {
      this.mReceivedBytes = 0L;
    }
    this.mTotalBytes = paramLong;
    DBManager.getInstance().addDownloadInfo(this);
  }
  
  public int startDownloadIfReady()
  {
    return startDownloadIfReady(false);
  }
  
  public int startDownloadIfReady(boolean paramBoolean)
  {
    TMLog.i("_DownloadInfo", "DownloadInfo::startDownloadIfReady url: " + this.mURL);
    if ((!TextUtils.isEmpty(this.mHeaderParamString)) && ((this.mHeaderParams == null) || (this.mHeaderParams.size() <= 0)))
    {
      HashMap localHashMap = new HashMap();
      try
      {
        JSONObject localJSONObject = new JSONObject(this.mHeaderParamString);
        Iterator localIterator = localJSONObject.keys();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          localHashMap.put(str, localJSONObject.getString(str));
          continue;
          if (!this.mTaskIsRunning) {
            break label163;
          }
        }
      }
      catch (JSONException localJSONException)
      {
        w.printErrStackTrace("_DownloadInfo", localJSONException, "", new Object[0]);
      }
    }
    for (;;)
    {
      return 5;
      if (localJSONException.size() > 0) {
        this.mHeaderParams = localJSONException;
      }
    }
    label163:
    this.mAutoRetry = paramBoolean;
    TMLog.i("_DownloadInfo", "autoRetry = " + this.mAutoRetry);
    if (this.mFileName == null) {
      this.mFileName = DownloadHelper.generateFileNameFromURL(this.mURL, this.mContentType);
    }
    if (this.mTempFileName == null) {
      this.mTempFileName = DownloadHelper.generateFileNameFromURL(this.mURL, this.mContentType);
    }
    if (this.mTotalBytes == 0L) {
      new TMAssistantFile(this.mTempFileName, this.mFileName).deleteTempFile();
    }
    TMLog.i("_DownloadInfo", "mFileName = " + this.mFileName);
    TMLog.i("_DownloadInfo", "mTempFileName = " + this.mTempFileName);
    TMLog.i("_DownloadInfo", "mTotalBytes = " + this.mTotalBytes + ", mStatus = " + this.mStatus);
    if (this.mStatus == 5) {
      this.mRequestURL = this.mURL;
    }
    Object localObject;
    if (!TextUtils.isEmpty(this.mFileName))
    {
      localObject = new TMAssistantFile(this.mTempFileName, this.mFileName);
      long l = ((TMAssistantFile)localObject).length();
      TMLog.i("_DownloadInfo", "FileLen: " + l + " filename: " + this.mFileName);
      if (l > this.mTotalBytes) {
        ((TMAssistantFile)localObject).deleteTempFile();
      }
      for (this.mReceivedBytes = 0L; hasReceivedAllDataBytes(); this.mReceivedBytes = l)
      {
        ((TMAssistantFile)localObject).moveFileToSavaPath();
        updateStatus(4, false);
        return 4;
      }
    }
    if (this.mStatus == 5)
    {
      this.mRedirectCnt = 0;
      this.mRetryCnt = 0;
      this.mStatus = 0;
      this.mDownloadFailedErrCode = 0;
    }
    TMLog.i("_DownloadInfo", "startDownloadIfReady...");
    dump("_DownloadInfo");
    if (DownloadThreadPool.getInstance().getDownloadTask(this.mURL) == null)
    {
      TMLog.i("_DownloadInfo", "dt is null");
      localObject = new DownloadTask(this);
      updateStatus(1, false);
      this.mDownloadTaskId = DownloadThreadPool.getInstance().addDownloadTask((DownloadTask)localObject);
    }
    return 0;
  }
  
  public void stopDownload()
  {
    TMLog.i("_DownloadInfo", "DownloadInfo::stopDownload url: " + this.mURL);
    DownloadThreadPool.getInstance().cancelDownloadTask(this.mDownloadTaskId);
    updateStatus(6, false);
  }
  
  public void updateReceivedSize(long paramLong)
  {
    this.mReceivedBytes += paramLong;
    DownloadListenerManager.getInstance().OnDownloadProgressChanged(this.mURL, this.mReceivedBytes, this.mTotalBytes);
  }
  
  public void updateStatus(int paramInt, boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        boolean bool = hasFinished();
        if (bool) {
          return;
        }
        this.mStatus = paramInt;
        if (this.mStatus != 6)
        {
          if (this.mStatus == 5) {
            this.mDownloadFailedTime = System.currentTimeMillis();
          }
          DBManager.getInstance().addDownloadInfo(this);
          DownloadListenerManager.getInstance().OnDownloadStateChanged(this.mURL, this.mStatus, this.mDownloadFailedErrCode, "", paramBoolean, this.mAutoRetry);
        }
        else
        {
          DBManager.getInstance().deleteDownloadInfo(this.mURL);
        }
      }
      finally {}
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\tmassistantsdk\downloadservice\DownloadInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */