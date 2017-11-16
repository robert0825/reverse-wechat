package com.tencent.mm.plugin.sight.base;

import android.graphics.Bitmap;
import android.view.Surface;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class SightVideoJNI
{
  public static final int MMSIGHT_YUV420P = 2;
  public static final int MMSIGHT_YUV420SP = 1;
  private static final String TAG = "MicroMsg.SightVideoJNI";
  public static final int TYPE_BITMAP = 1;
  public static final int TYPE_SURFACE = 0;
  
  public SightVideoJNI()
  {
    GMTrace.i(9374302994432L, 69844);
    GMTrace.o(9374302994432L, 69844);
  }
  
  public static native void NV21ToYUV420P(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2);
  
  public static native void NV21ToYUV420PAndRotate(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2, int paramInt3);
  
  public static native void NV21ToYUV420PAndScaleRotate(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, int paramInt6);
  
  public static native void NV21ToYUV420SP(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2);
  
  public static native void NV21ToYUV420SPAndRotate(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2, int paramInt3);
  
  public static native void NV21ToYUV420SPAndScaleRotate(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, int paramInt6);
  
  public static native void NV21ToYUV420XXAndScaleRotate(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean1, boolean paramBoolean2);
  
  public static native void YUV420SPScale(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public static native void YUV420SPScaleCtxRelease();
  
  public static native void blendYuvFrame(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2);
  
  public static native void cropCameraData(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2, int paramInt3);
  
  public static native void cropCameraDataLongEdge(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2, int paramInt3);
  
  public static native int drawFrame(int paramInt1, Bitmap paramBitmap1, int paramInt2, Bitmap paramBitmap2, boolean paramBoolean1, boolean paramBoolean2);
  
  public static native int drawScaledFrame(int paramInt1, Bitmap paramBitmap, int paramInt2, int paramInt3);
  
  public static native int drawSurfaceColor(Surface paramSurface, int paramInt);
  
  public static native int drawSurfaceFrame(int paramInt1, Surface paramSurface, int paramInt2, Bitmap paramBitmap, boolean paramBoolean);
  
  public static native int drawSurfaceThumb(Surface paramSurface, Bitmap paramBitmap1, Bitmap paramBitmap2);
  
  public static native int freeAll();
  
  public static native int freeObj(int paramInt);
  
  public static native int[] getBlurThumbData(int paramInt);
  
  public static native int[] getBlurThumbDataFromBmp(Bitmap paramBitmap);
  
  public static native int getHeight(int paramInt);
  
  private static native byte[] getMP4RecordInfo(String paramString);
  
  public static String getMp4RecordInfo(String paramString)
  {
    GMTrace.i(9383429799936L, 69912);
    if (bg.nm(paramString))
    {
      GMTrace.o(9383429799936L, 69912);
      return null;
    }
    paramString = getMP4RecordInfo(paramString);
    int i;
    if ((paramString != null) && (paramString.length > 0))
    {
      i = 0;
      if (i >= paramString.length) {
        break label138;
      }
      if (paramString[i] != -60) {}
    }
    for (;;)
    {
      w.i("MicroMsg.SightVideoJNI", "getMp4RecordInfo, index: %s", new Object[] { Integer.valueOf(i) });
      if (i + 1 < paramString.length)
      {
        try
        {
          byte[] arrayOfByte = new byte[paramString.length - (i + 1)];
          System.arraycopy(paramString, i + 1, arrayOfByte, 0, arrayOfByte.length);
          paramString = new String(arrayOfByte);
          GMTrace.o(9383429799936L, 69912);
          return paramString;
        }
        catch (Exception paramString) {}
        i += 1;
        break;
      }
      GMTrace.o(9383429799936L, 69912);
      return null;
      label138:
      i = 0;
    }
  }
  
  public static native int getMp4Rotate(String paramString);
  
  public static native String getSimpleMp4Info(String paramString);
  
  public static native byte[] getThumbData(int paramInt);
  
  public static native double getVideoDuration(int paramInt);
  
  public static native int getVideoHeight(int paramInt);
  
  public static native String getVideoInfo(int paramInt);
  
  public static native double getVideoPlayTime(int paramInt);
  
  public static native double getVideoRate(int paramInt);
  
  public static native double getVideoStartTime(int paramInt);
  
  public static native int getVideoWidth(int paramInt);
  
  public static native int getWidth(int paramInt);
  
  public static native int handleThumb(Bitmap paramBitmap1, Bitmap paramBitmap2, Bitmap paramBitmap3);
  
  public static native int initBlurBuffer(int paramInt1, int paramInt2, int paramInt3);
  
  public static native int initDataBuffer(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, float paramFloat1, int paramInt8, int paramInt9, int paramInt10, int paramInt11, float paramFloat2, int paramInt12);
  
  public static native int initDataBufferForMMSight(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, float paramFloat1, int paramInt6, int paramInt7, int paramInt8, int paramInt9, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2, int paramInt10, boolean paramBoolean3);
  
  public static int initDataBufferRef(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, float paramFloat1, int paramInt8, int paramInt9, int paramInt10, int paramInt11, float paramFloat2, int paramInt12)
  {
    GMTrace.i(9378195308544L, 69873);
    paramInt1 = initDataBuffer(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramFloat1, paramInt8, paramInt9, paramInt10, paramInt11, paramFloat2, paramInt12);
    w.d("MicroMsg.SightVideoJNI", "ashutest::call initDataBuffer, ret %d", new Object[] { Integer.valueOf(paramInt1) });
    GMTrace.o(9378195308544L, 69873);
    return paramInt1;
  }
  
  public static native void initScaleAndRoateBuffer(int paramInt);
  
  public static native int isSightOk(String paramString, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int[] paramArrayOfInt3, int[] paramArrayOfInt4, int[] paramArrayOfInt5, int paramInt);
  
  public static native byte[] loadAACData(int paramInt);
  
  public static native void mirrorCameraData(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean);
  
  public static native int muxing(int paramInt1, String paramString1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong, String paramString2, float paramFloat1, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, float paramFloat2, byte[] paramArrayOfByte, int paramInt11, boolean paramBoolean);
  
  public static native int openFile(String paramString, int paramInt1, int paramInt2, boolean paramBoolean);
  
  public static native void optimizeMP4(String paramString);
  
  public static native void paddingYuvData16(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2, int paramInt3);
  
  public static native void registerALL();
  
  public static native void releaseBigSightDataBuffer(int paramInt);
  
  public static native void releaseDataBuffer(int paramInt);
  
  public static void releaseDataBufferRef(int paramInt)
  {
    GMTrace.i(9378463744000L, 69875);
    w.d("MicroMsg.SightVideoJNI", "ashutest::call release dataBufferRef %d", new Object[] { Integer.valueOf(paramInt) });
    releaseDataBuffer(paramInt);
    GMTrace.o(9378463744000L, 69875);
  }
  
  public static native int releaseRecorderBuffer();
  
  public static void releaseRecorderBufferRef(String paramString)
  {
    GMTrace.i(9378329526272L, 69874);
    w.d("MicroMsg.SightVideoJNI", "ashutest::call release recorder buffer, %s", new Object[] { paramString });
    releaseRecorderBuffer();
    GMTrace.o(9378329526272L, 69874);
  }
  
  public static native void releaseScaleAndRoateBuffer(int paramInt);
  
  public static native int remuxing(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, float paramFloat1, float paramFloat2, byte[] paramArrayOfByte, int paramInt7, boolean paramBoolean);
  
  public static native int seekStream(double paramDouble, int paramInt);
  
  public static native int seekStreamWithFlag(double paramDouble, int paramInt1, int paramInt2);
  
  public static native void setRotateForBufId(int paramInt1, int paramInt2);
  
  public static native int shouldRemuxing(String paramString, int paramInt1, int paramInt2, int paramInt3, double paramDouble, int paramInt4);
  
  public static void tagMP4Dscp(String paramString, byte[] paramArrayOfByte)
  {
    GMTrace.i(9383564017664L, 69913);
    if ((bg.nm(paramString)) || (paramArrayOfByte == null))
    {
      GMTrace.o(9383564017664L, 69913);
      return;
    }
    long l = bg.Pw();
    ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(paramArrayOfByte.length + 2);
    localByteBuffer.order(ByteOrder.nativeOrder());
    localByteBuffer.put(new byte[] { 85, -60 });
    localByteBuffer.put(paramArrayOfByte);
    paramArrayOfByte = localByteBuffer.array();
    tagMP4Dscp(paramString, paramArrayOfByte, paramArrayOfByte.length);
    w.i("MicroMsg.SightVideoJNI", "tagMP4Dscp used %sms", new Object[] { Long.valueOf(bg.aI(l)) });
    GMTrace.o(9383564017664L, 69913);
  }
  
  private static native void tagMP4Dscp(String paramString, byte[] paramArrayOfByte, int paramInt);
  
  private static native void tagMP4RecordInfo(String paramString, byte[] paramArrayOfByte, int paramInt);
  
  public static void tagMp4RecordInfo(String paramString1, String paramString2)
  {
    GMTrace.i(9383295582208L, 69911);
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)))
    {
      GMTrace.o(9383295582208L, 69911);
      return;
    }
    long l = bg.Pw();
    paramString2 = paramString2.getBytes();
    ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(paramString2.length + 2);
    localByteBuffer.order(ByteOrder.nativeOrder());
    localByteBuffer.put(new byte[] { 85, -60 });
    localByteBuffer.put(paramString2);
    paramString2 = localByteBuffer.array();
    tagMP4RecordInfo(paramString1, paramString2, paramString2.length);
    w.i("MicroMsg.SightVideoJNI", "tagMP4RecordInfo used %sms", new Object[] { Long.valueOf(bg.aI(l)) });
    GMTrace.o(9383295582208L, 69911);
  }
  
  public static native void tagRotateVideo(String paramString1, String paramString2, int paramInt);
  
  public static native int triggerEncode(int paramInt1, int paramInt2, boolean paramBoolean);
  
  public static native int triggerEncodeForBigSight(int paramInt1, int paramInt2, int paramInt3);
  
  public static native void writeAACData(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2);
  
  public static native void writeBlurData(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, int paramInt4);
  
  public static native void writeH264Data(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2);
  
  public static native void writeThumbData(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, int paramInt4);
  
  public static native void writeYuvData(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, int paramInt4);
  
  public static native void writeYuvDataForMMSight(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2, int paramInt5, int paramInt6);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\sight\base\SightVideoJNI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */