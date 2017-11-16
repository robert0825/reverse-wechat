package com.tencent.liteav.audio.impl.Encoder;

import android.os.Environment;
import com.tencent.liteav.audio.TXIAudioRecordListener;
import com.tencent.liteav.audio.impl.TXCAudioJNI;
import com.tencent.liteav.basic.util.TXCSystemUtil;
import java.io.File;
import java.lang.ref.WeakReference;

public class TXCAudioSoftEncoder
  implements TXIAudioEncoder
{
  public static final String TAG = "TXCAudioSoftEncoder";
  private WeakReference<TXIAudioRecordListener> mListener;
  private long mNativeContext = 0L;
  private int mSampleRate = 48000;
  private long mTimestamp = 0L;
  
  static
  {
    TXCSystemUtil.loadLiteAVLibrary();
    TXCAudioJNI.nativeSetTempPath(Environment.getExternalStorageDirectory().getAbsolutePath());
  }
  
  private native byte[] nativeEncode(long paramLong, byte[] paramArrayOfByte);
  
  private native float nativeGetMicPlayRate();
  
  private native long nativeInit(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  private native byte[] nativeQuerry(long paramLong);
  
  private native void nativeUnInit(long paramLong);
  
  private void onEncData(byte[] paramArrayOfByte, long paramLong)
  {
    if ((this.mListener != null) && (paramArrayOfByte != null))
    {
      TXIAudioRecordListener localTXIAudioRecordListener = (TXIAudioRecordListener)this.mListener.get();
      if (localTXIAudioRecordListener != null) {
        localTXIAudioRecordListener.onRecordEncData(paramArrayOfByte, paramLong);
      }
    }
  }
  
  private void onEncError(int paramInt, String paramString)
  {
    if (this.mListener != null)
    {
      TXIAudioRecordListener localTXIAudioRecordListener = (TXIAudioRecordListener)this.mListener.get();
      if (localTXIAudioRecordListener != null) {
        localTXIAudioRecordListener.onRecordError(paramInt, paramString);
      }
    }
  }
  
  public void doEncodec(byte[] paramArrayOfByte, long paramLong)
  {
    if (paramArrayOfByte != null)
    {
      nativeEncode(this.mNativeContext, paramArrayOfByte);
      long l = paramLong;
      paramArrayOfByte = nativeQuerry(this.mNativeContext);
      if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0))
      {
        if (this.mTimestamp == l) {
          paramLong = l + (1024000 / this.mSampleRate * nativeGetMicPlayRate());
        }
        for (;;)
        {
          onEncData(paramArrayOfByte, paramLong);
          this.mTimestamp = paramLong;
          l = paramLong;
          break;
          paramLong = l;
          if (this.mTimestamp >= l) {
            paramLong = this.mTimestamp + 1L;
          }
        }
      }
    }
  }
  
  public byte[] encode(byte[] paramArrayOfByte)
  {
    return nativeEncode(this.mNativeContext, paramArrayOfByte);
  }
  
  public void init(int paramInt1, int paramInt2, int paramInt3, int paramInt4, WeakReference<TXIAudioRecordListener> paramWeakReference)
  {
    this.mSampleRate = paramInt2;
    this.mNativeContext = nativeInit(paramInt1, paramInt2, paramInt3, paramInt4);
    this.mListener = paramWeakReference;
  }
  
  public native void setReverbType(int paramInt);
  
  public void unInit()
  {
    nativeUnInit(this.mNativeContext);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\audio\impl\Encoder\TXCAudioSoftEncoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */