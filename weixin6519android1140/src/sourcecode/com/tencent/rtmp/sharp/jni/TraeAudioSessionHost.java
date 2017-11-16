package com.tencent.rtmp.sharp.jni;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class TraeAudioSessionHost
{
  private ArrayList<SessionInfo> _sessionInfoList = new ArrayList();
  private ReentrantLock mLock = new ReentrantLock();
  
  public void add(long paramLong, Context paramContext)
  {
    if (find(paramLong) != null) {
      return;
    }
    paramContext = new SessionInfo();
    paramContext.sessionId = paramLong;
    this.mLock.lock();
    this._sessionInfoList.add(paramContext);
    this.mLock.unlock();
  }
  
  public SessionInfo find(long paramLong)
  {
    this.mLock.lock();
    int i = 0;
    SessionInfo localSessionInfo;
    if (i < this._sessionInfoList.size())
    {
      localSessionInfo = (SessionInfo)this._sessionInfoList.get(i);
      if (localSessionInfo.sessionId != paramLong) {}
    }
    for (;;)
    {
      this.mLock.unlock();
      return localSessionInfo;
      i += 1;
      break;
      localSessionInfo = null;
    }
  }
  
  public void remove(long paramLong)
  {
    this.mLock.lock();
    int i = 0;
    for (;;)
    {
      if (i < this._sessionInfoList.size())
      {
        if (((SessionInfo)this._sessionInfoList.get(i)).sessionId == paramLong) {
          this._sessionInfoList.remove(i);
        }
      }
      else
      {
        this.mLock.unlock();
        return;
      }
      i += 1;
    }
  }
  
  public class SessionInfo
  {
    public long sessionId;
    
    public SessionInfo() {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\rtmp\sharp\jni\TraeAudioSessionHost.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */