package com.tencent.mm.plugin.mmsight.segment;

import com.tencent.gmtrace.GMTrace;
import java.nio.ByteBuffer;

public final class MP4MuxerJNI
{
  public static final int SEGMENT_COLOR_FORMAT_YUV420P = 2;
  public static final int SEGMENT_COLOR_FORMAT_YUV420SP = 1;
  
  public MP4MuxerJNI()
  {
    GMTrace.i(7477269626880L, 55710);
    GMTrace.o(7477269626880L, 55710);
  }
  
  public static native boolean ffmpegCheckIfReachEndTimestamp();
  
  public static native byte[] ffmpegGetNextVideoFrameData(byte[] paramArrayOfByte);
  
  public static native int ffmpegGetVideoHeight();
  
  public static native int ffmpegGetVideoWidth();
  
  public static native int ffmpegOpenAndSeekFile(String paramString, double paramDouble1, double paramDouble2);
  
  public static native byte[] getVideoThumb(String paramString, int paramInt1, int paramInt2);
  
  public static native int initDataBuf(int paramInt);
  
  public static native int initH264Encoder(int paramInt1, int paramInt2, float paramFloat1, int paramInt3, int paramInt4, int paramInt5, int paramInt6, float paramFloat2);
  
  public static native int muxing(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString, float paramFloat, byte[] paramArrayOfByte, int paramInt6);
  
  public static native int muxingForX264(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString, float paramFloat, int paramInt5, byte[] paramArrayOfByte, int paramInt6);
  
  public static native void releaseDataBuf(int paramInt);
  
  public static native int triggerEncodeForSegment(int paramInt, boolean paramBoolean);
  
  public static native void writeAACData(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2);
  
  public static native void writeH264Data(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2);
  
  public static native int writeYuvDataForSegment(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7);
  
  public static native void yuv420pTo420XXAndScale(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\segment\MP4MuxerJNI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */