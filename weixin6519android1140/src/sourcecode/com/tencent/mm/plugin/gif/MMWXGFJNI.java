package com.tencent.mm.plugin.gif;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.l;
import com.tencent.mm.compatible.loader.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;

public class MMWXGFJNI
{
  private static final String TAG = "MicroMsg.JNI.MMWXGF";
  static int mECode;
  static boolean mIsInit;
  
  static
  {
    GMTrace.i(20135611990016L, 150022);
    mIsInit = false;
    mECode = -1;
    w.i("MicroMsg.JNI.MMWXGF", "static MMWXGFJNI");
    if (!mIsInit)
    {
      int i = l.sK();
      w.i("MicroMsg.JNI.MMWXGF", "loadVoipCodecLib cpuFlag:" + i);
      String str;
      if ((i & 0x400) != 0)
      {
        d.u(ab.getContext(), "libvoipCodec_v7a.so");
        str = new File(ab.getContext().getDir("lib", 0), "libvoipCodec_v7a.so").getAbsolutePath();
        i = nativeInit(str);
        mECode = i;
        if (i < 0) {
          break label186;
        }
      }
      label186:
      for (boolean bool = true;; bool = false)
      {
        mIsInit = bool;
        w.i("MicroMsg.JNI.MMWXGF", "native init MMWXGF mECode:%d result:%b :%s", new Object[] { Integer.valueOf(mECode), Boolean.valueOf(mIsInit), str });
        GMTrace.o(20135611990016L, 150022);
        return;
        if ((i & 0x200) != 0)
        {
          d.u(ab.getContext(), "libvoipCodec.so");
          break;
        }
        d.u(ab.getContext(), "libvoipCodec_v5.so");
        break;
      }
    }
    w.d("MicroMsg.JNI.MMWXGF", "MMWXGF has init.");
    GMTrace.o(20135611990016L, 150022);
  }
  
  public MMWXGFJNI()
  {
    GMTrace.i(20134269812736L, 150012);
    GMTrace.o(20134269812736L, 150012);
  }
  
  public static int getErrorCode()
  {
    GMTrace.i(21066814586880L, 156960);
    int i = mECode;
    GMTrace.o(21066814586880L, 156960);
    return i;
  }
  
  public static native int nativeAV2Gif(String paramString1, String paramString2);
  
  public static native int nativeAV2Gif(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);
  
  public static native int nativeDecodeBufferFrame(long paramLong, byte[] paramArrayOfByte, int paramInt, Bitmap paramBitmap, int[] paramArrayOfInt);
  
  public static native int nativeDecodeBufferHeader(long paramLong, byte[] paramArrayOfByte, int paramInt);
  
  public static native int nativeGetOption(long paramLong, byte[] paramArrayOfByte, int paramInt, int[] paramArrayOfInt);
  
  public static native int nativeInit(String paramString);
  
  public static native long nativeInitWxAMDecoder();
  
  public static native boolean nativeIsWXGF(byte[] paramArrayOfByte, int paramInt);
  
  public static native int nativeRewindBuffer(long paramLong);
  
  public static native int nativeUninit(long paramLong);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\gif\MMWXGFJNI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */