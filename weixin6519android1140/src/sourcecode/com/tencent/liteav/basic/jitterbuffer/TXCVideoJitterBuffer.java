package com.tencent.liteav.basic.jitterbuffer;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TXCVideoJitterBuffer
{
  public long mBufferFrames = 0L;
  private long mCacheTimeMS = 200L;
  private long mFPS = 15L;
  private long mFPSCount = 0L;
  private long mFixTime = 0L;
  public long mInterval = 20L;
  private long mLastFrameTS = 0L;
  private long mLastPlayTime = 0L;
  public TXIVideoJitterBufferListener mListener = null;
  public LinkedList<TXSNALPacket> mNALList = new LinkedList();
  private ReadWriteLock mRWlock = new ReentrantReadWriteLock();
  private long mSpeedTimeMS = 10L;
  private long mTotalFPS = 0L;
  private Handler mWorkHandler = null;
  private HandlerThread mWorkThread = null;
  public boolean mWorking = false;
  
  public TXCVideoJitterBuffer()
  {
    this.mWorkThread.start();
    this.mRWlock.writeLock().lock();
    this.mWorkHandler = new Handler(this.mWorkThread.getLooper());
    this.mRWlock.writeLock().unlock();
  }
  
  private long getVideoFrameRenderInterval()
  {
    long l2 = 0L;
    if (this.mListener != null) {}
    for (long l1 = this.mListener.onRequestAudioBufferDuration();; l1 = 0L)
    {
      long l3 = getBufferFrames();
      if (0L == l1)
      {
        if (l3 * 1000L / this.mFPS < this.mCacheTimeMS) {
          l1 = 1000L / this.mFPS;
        }
        do
        {
          return l1;
          l3 = 1000L / this.mFPS - this.mSpeedTimeMS;
          l1 = l2;
        } while (l3 < 0L);
        return l3;
      }
      if (l3 == 0L) {
        return 1000L / this.mFPS;
      }
      return l1 / l3;
    }
  }
  
  private TXSNALPacket queryNAL()
  {
    TXSNALPacket localTXSNALPacket = null;
    if (!this.mNALList.isEmpty())
    {
      localTXSNALPacket = (TXSNALPacket)this.mNALList.getFirst();
      this.mNALList.removeFirst();
    }
    return localTXSNALPacket;
  }
  
  public void calcFPS(long paramLong)
  {
    if (this.mLastFrameTS != 0L)
    {
      if (this.mFPSCount < 5L) {
        break label84;
      }
      this.mFPS = (this.mTotalFPS / this.mFPSCount);
      if (this.mFPS <= 200L) {
        break label67;
      }
      this.mFPS = 200L;
      this.mTotalFPS = 0L;
      this.mFPSCount = 0L;
    }
    for (;;)
    {
      this.mLastFrameTS = paramLong;
      return;
      label67:
      if (this.mFPS >= 1L) {
        break;
      }
      this.mFPS = 1L;
      break;
      label84:
      long l1 = paramLong - this.mLastFrameTS;
      if (l1 > 0L)
      {
        long l2 = this.mTotalFPS;
        this.mTotalFPS = (1000L / l1 + l2);
        this.mFPSCount += 1L;
      }
    }
  }
  
  public void clear()
  {
    this.mNALList.clear();
    this.mBufferFrames = 0L;
    this.mFPS = 15L;
    this.mLastPlayTime = 0L;
    this.mTotalFPS = 0L;
    this.mFPSCount = 0L;
    this.mLastFrameTS = 0L;
  }
  
  protected void finalize()
  {
    super.finalize();
    try
    {
      stop();
      return;
    }
    catch (Exception localException) {}
  }
  
  public long getBufferDuration()
  {
    if (this.mFPS > 0L) {
      return this.mBufferFrames * 1000L / this.mFPS;
    }
    return this.mBufferFrames * 1000L / 15L;
  }
  
  public long getBufferFrames()
  {
    return this.mBufferFrames;
  }
  
  public long getDecoderFrames()
  {
    long l = this.mNALList.size();
    if (this.mBufferFrames > l) {
      return this.mBufferFrames - l;
    }
    return 0L;
  }
  
  public void nalConsumed(final int paramInt)
  {
    this.mRWlock.readLock().lock();
    if (this.mWorkHandler != null) {
      this.mWorkHandler.post(new Runnable()
      {
        public void run()
        {
          if (TXCVideoJitterBuffer.this.mBufferFrames > paramInt)
          {
            TXCVideoJitterBuffer.this.mBufferFrames -= paramInt;
            return;
          }
          TXCVideoJitterBuffer.this.mBufferFrames = 0L;
        }
      });
    }
    this.mRWlock.readLock().unlock();
  }
  
  public TXSNALPacket pullNAL()
  {
    long l1 = TXCTimeUtil.getTimeTick() - this.mLastPlayTime;
    long l2 = getVideoFrameRenderInterval();
    if (this.mFixTime + l1 < l2) {
      return null;
    }
    if (this.mLastPlayTime != 0L) {
      this.mFixTime = (l1 + this.mFixTime - l2);
    }
    TXSNALPacket localTXSNALPacket = queryNAL();
    if (localTXSNALPacket != null)
    {
      this.mLastPlayTime = TXCTimeUtil.getTimeTick();
      return localTXSNALPacket;
    }
    this.mFixTime = 0L;
    return localTXSNALPacket;
  }
  
  public void pushNAL(final TXSNALPacket paramTXSNALPacket)
  {
    if (paramTXSNALPacket == null) {
      return;
    }
    this.mRWlock.readLock().lock();
    if (this.mWorkHandler != null) {
      this.mWorkHandler.post(new Runnable()
      {
        public void run()
        {
          TXCVideoJitterBuffer.this.mNALList.add(paramTXSNALPacket);
          TXCVideoJitterBuffer localTXCVideoJitterBuffer = TXCVideoJitterBuffer.this;
          localTXCVideoJitterBuffer.mBufferFrames += 1L;
          TXCVideoJitterBuffer.this.calcFPS(paramTXSNALPacket.dts);
        }
      });
    }
    this.mRWlock.readLock().unlock();
  }
  
  public void scheduleQuery()
  {
    this.mRWlock.readLock().lock();
    if (this.mWorkHandler != null) {
      this.mWorkHandler.postDelayed(new Runnable()
      {
        public void run()
        {
          TXSNALPacket localTXSNALPacket = TXCVideoJitterBuffer.this.pullNAL();
          if ((localTXSNALPacket != null) && (TXCVideoJitterBuffer.this.mListener != null)) {
            TXCVideoJitterBuffer.this.mListener.onNALAvaliable(localTXSNALPacket);
          }
          if (TXCVideoJitterBuffer.this.mWorking) {
            TXCVideoJitterBuffer.this.scheduleQuery();
          }
        }
      }, this.mInterval);
    }
    this.mRWlock.readLock().unlock();
  }
  
  public void setCacheTimeMS(long paramLong)
  {
    this.mCacheTimeMS = paramLong;
  }
  
  public void setInterval(final long paramLong)
  {
    this.mRWlock.readLock().lock();
    if (this.mWorkHandler != null) {
      this.mWorkHandler.post(new Runnable()
      {
        public void run()
        {
          TXCVideoJitterBuffer.this.mInterval = paramLong;
        }
      });
    }
    this.mRWlock.readLock().unlock();
  }
  
  public void setListener(final TXIVideoJitterBufferListener paramTXIVideoJitterBufferListener)
  {
    this.mRWlock.readLock().lock();
    if (this.mWorkHandler != null) {
      this.mWorkHandler.post(new Runnable()
      {
        public void run()
        {
          TXCVideoJitterBuffer.this.mListener = paramTXIVideoJitterBufferListener;
        }
      });
    }
    this.mRWlock.readLock().unlock();
  }
  
  public void start()
  {
    this.mRWlock.readLock().lock();
    if (this.mWorkHandler != null) {
      this.mWorkHandler.post(new Runnable()
      {
        public void run()
        {
          TXCVideoJitterBuffer.this.mWorking = true;
        }
      });
    }
    this.mRWlock.readLock().unlock();
    scheduleQuery();
  }
  
  public void stop()
  {
    this.mRWlock.writeLock().lock();
    if (this.mWorkHandler != null) {
      this.mWorkHandler.post(new Runnable()
      {
        public void run()
        {
          TXCVideoJitterBuffer.this.mWorking = false;
          TXCVideoJitterBuffer.this.clear();
          try
          {
            Looper.myLooper().quit();
            return;
          }
          catch (Exception localException) {}
        }
      });
    }
    this.mWorkHandler = null;
    this.mRWlock.writeLock().unlock();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\basic\jitterbuffer\TXCVideoJitterBuffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */