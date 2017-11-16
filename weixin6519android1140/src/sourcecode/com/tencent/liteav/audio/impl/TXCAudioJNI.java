package com.tencent.liteav.audio.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Environment;
import com.tencent.liteav.audio.TXIMixPlayListener;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCSystemUtil;
import java.io.File;
import java.lang.ref.WeakReference;

public class TXCAudioJNI
{
  public static final String JNI_LIB_NAME = "liteavsdk";
  static WeakReference<TXIMixPlayListener> mBGMNotify;
  
  static
  {
    TXCSystemUtil.loadLiteAVLibrary();
    nativeSetTempPath(Environment.getExternalStorageDirectory().getAbsolutePath());
  }
  
  private static void appendAACData(byte[] paramArrayOfByte, long paramLong)
  {
    TXCAudioRecorderWrapper.getInstance().appendAACData(paramArrayOfByte, paramLong);
  }
  
  public static native int getBGMDuration(String paramString);
  
  public static native long getCurBGMProgress();
  
  public static native void nativeAppendLibraryPath(String paramString);
  
  public static boolean nativeCheckTraeEngine(Context paramContext)
  {
    if (paramContext == null)
    {
      TXCLog.e("TXCAudioJNI", "nativeInitTraeEngine failed, context is null!");
      return false;
    }
    paramContext = paramContext.getApplicationInfo();
    String str2 = paramContext.nativeLibraryDir;
    String str3 = paramContext.dataDir + "/lib";
    String str4 = "/data/data/" + paramContext.packageName + "/lib";
    String str1 = TXCSystemUtil.getLibraryPath();
    paramContext = str1;
    if (str1 == null) {
      paramContext = "";
    }
    if (new File(str2 + "/libtraeimp-rtmp-armeabi-v7a.so").exists()) {
      return true;
    }
    if (new File(str3 + "/libtraeimp-rtmp-armeabi-v7a.so").exists()) {
      return true;
    }
    if (new File(str4 + "/libtraeimp-rtmp-armeabi-v7a.so").exists()) {
      return true;
    }
    if (new File(paramContext + "/libtraeimp-rtmp-armeabi-v7a.so").exists()) {
      return true;
    }
    if (new File(str2 + "/libtraeimp-rtmp-armeabi.so").exists()) {
      return true;
    }
    if (new File(str3 + "/libtraeimp-rtmp-armeabi.so").exists()) {
      return true;
    }
    if (new File(str4 + "/libtraeimp-rtmp-armeabi.so").exists()) {
      return true;
    }
    return new File(paramContext + "/libtraeimp-rtmp-armeabi.so").exists();
  }
  
  public static native long nativeCreatePlayProcessor(TXCAudioPlayerWrapper paramTXCAudioPlayerWrapper);
  
  public static native long nativeCreateRecordProcessor();
  
  public static native void nativeDestoryPlayProcessor(long paramLong);
  
  public static native void nativeDestoryRecordProcessor(long paramLong);
  
  public static native byte[] nativeGetAacHeader(int paramInt1, int paramInt2, int paramInt3);
  
  public static native long nativeGetCacheDuration(long paramLong);
  
  public static native long nativeGetCacheSize(long paramLong);
  
  public static native int nativeGetPlayChannel(long paramLong);
  
  public static native TXAudioJitterBufferReportInfo nativeGetPlayLoadingInfo(long paramLong);
  
  public static native int nativeGetPlaySamplerate(long paramLong);
  
  public static native float nativeGetPlaySpeed(long paramLong);
  
  public static void nativeInitTraeEngine(Context paramContext)
  {
    if (paramContext == null)
    {
      TXCLog.e("TXCAudioJNI", "nativeInitTraeEngine failed, context is null!");
      return;
    }
    try
    {
      paramContext = paramContext.getApplicationInfo();
      String str2 = paramContext.nativeLibraryDir;
      String str3 = paramContext.dataDir + "/lib";
      String str4 = "/data/data/" + paramContext.packageName + "/lib";
      String str1 = TXCSystemUtil.getLibraryPath();
      paramContext = str1;
      if (str1 == null) {
        paramContext = "";
      }
      nativeAppendLibraryPath("add_libpath:" + str2);
      nativeAppendLibraryPath("add_libpath:" + str3);
      nativeAppendLibraryPath("add_libpath:" + str4);
      nativeAppendLibraryPath("add_libpath:" + paramContext);
      return;
    }
    catch (UnsatisfiedLinkError paramContext) {}
  }
  
  public static void nativePlayPorcessorInit(long paramLong, Context paramContext, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1) {
      nativeInitTraeEngine(paramContext);
    }
    nativePlayProcessorInitInternal(paramLong, paramContext, paramInt, paramBoolean1, paramBoolean2);
  }
  
  public static native byte[] nativePlayProcess(long paramLong1, byte[] paramArrayOfByte, int paramInt, long paramLong2);
  
  private static native void nativePlayProcessorInitInternal(long paramLong, Context paramContext, int paramInt, boolean paramBoolean1, boolean paramBoolean2);
  
  public static native void nativePlayProcessorSetAudioInfo(long paramLong, int paramInt1, int paramInt2, int paramInt3);
  
  public static native byte[] nativeQueryData(long paramLong);
  
  public static native byte[] nativeRecordPorcess(long paramLong, byte[] paramArrayOfByte);
  
  public static void nativeRecordProcessorInit(long paramLong, Context paramContext, int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramBoolean) {
      nativeInitTraeEngine(paramContext);
    }
    nativeRecordProcessorInitInternal(paramLong, paramContext, paramInt1, paramBoolean, paramInt2, paramInt3, paramInt4);
  }
  
  private static native void nativeRecordProcessorInitInternal(long paramLong, Context paramContext, int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4);
  
  public static native void nativeSetAutoAdjust(long paramLong, boolean paramBoolean);
  
  public static native void nativeSetAutoAdjustMaxCache(long paramLong, float paramFloat);
  
  public static native void nativeSetAutoAdjustMinCache(long paramLong, float paramFloat);
  
  public static native void nativeSetCacheTime(long paramLong, float paramFloat);
  
  public static native void nativeSetRealTimePlay(long paramLong, boolean paramBoolean);
  
  public static native void nativeSetTempPath(String paramString);
  
  public static native void nativeSetTraeConfig(String paramString);
  
  public static native void nativeTraeRecordSetMute(boolean paramBoolean);
  
  public static native void nativeTraeSetReverb(int paramInt);
  
  public static void onBGMNotify(int paramInt, long paramLong1, long paramLong2)
  {
    for (;;)
    {
      try
      {
        Object localObject1 = mBGMNotify;
        if (localObject1 == null) {
          return;
        }
        localObject1 = (TXIMixPlayListener)mBGMNotify.get();
        if (localObject1 == null) {
          continue;
        }
        switch (paramInt)
        {
        case 0: 
          ((TXIMixPlayListener)localObject1).onMixPlayBegin();
          break;
        case 1: 
          ((TXIMixPlayListener)localObject2).onMixPlayProgress(paramLong1, paramLong2);
        }
      }
      finally {}
      continue;
      ((TXIMixPlayListener)localObject2).onMixPlayComplete((int)paramLong1);
    }
  }
  
  public static void onBgmPcm(byte[] paramArrayOfByte)
  {
    if (mBGMNotify == null) {}
    TXIMixPlayListener localTXIMixPlayListener;
    do
    {
      return;
      localTXIMixPlayListener = (TXIMixPlayListener)mBGMNotify.get();
    } while (localTXIMixPlayListener == null);
    localTXIMixPlayListener.onPCMData(paramArrayOfByte);
  }
  
  public static void onMixPcm(byte[] paramArrayOfByte)
  {
    if (mBGMNotify == null) {}
    TXIMixPlayListener localTXIMixPlayListener;
    do
    {
      return;
      localTXIMixPlayListener = (TXIMixPlayListener)mBGMNotify.get();
    } while (localTXIMixPlayListener == null);
    localTXIMixPlayListener.onMixPcmData(paramArrayOfByte);
  }
  
  public static native void pauseBGM();
  
  public static native boolean playBGM(String paramString, int paramInt1, int paramInt2, int paramInt3);
  
  public static native void resumeBGM();
  
  public static native void seekBGM(int paramInt1, int paramInt2);
  
  public static native void seekBGMWithBytes(int paramInt1, int paramInt2);
  
  public static void setBGMNotify(TXIMixPlayListener paramTXIMixPlayListener)
  {
    try
    {
      mBGMNotify = new WeakReference(paramTXIMixPlayListener);
      return;
    }
    finally
    {
      paramTXIMixPlayListener = finally;
      throw paramTXIMixPlayListener;
    }
  }
  
  public static native void setBgmPlayRate(float paramFloat);
  
  public static native void setBgmVolume(float paramFloat);
  
  public static native void setHeadsetOn(boolean paramBoolean);
  
  public static native void setMicVolume(float paramFloat);
  
  public static native void setMixPlayRate(float paramFloat);
  
  public static native void stopBGM();
  
  public static native int webrtcAgcCreate(int paramInt);
  
  public static native void webrtcAgcFree(int paramInt);
  
  public static native void webrtcAgcProcess(int paramInt, short[] paramArrayOfShort1, short[] paramArrayOfShort2);
  
  public static native void webrtcAgcProcessBytes(int paramInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);
  
  public static native void writeToFile(byte[] paramArrayOfByte);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\audio\impl\TXCAudioJNI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */