package com.tencent.mm.plugin.multi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.pb.common.c.c;
import com.tencent.pb.common.c.d;
import com.tencent.wecall.talkroom.model.i;
import java.util.concurrent.atomic.AtomicInteger;

public class talk
{
  public static int nlR;
  public static int nlS;
  public byte[] field_capInfo;
  public int field_localImgHeight;
  public int field_localImgWidth;
  public int field_remoteImgChannel;
  public int field_remoteImgHeight;
  public int field_remoteImgLength;
  public int field_remoteImgWidth;
  
  static
  {
    GMTrace.i(14018236383232L, 104444);
    nlR = 8000;
    nlS = 20;
    try
    {
      if ((com.tencent.pb.common.a.a.xJW) && (com.tencent.pb.common.a.a.xKn))
      {
        com.tencent.pb.common.c.a.l("stlport_shared", d.qNP);
        com.tencent.pb.common.c.a.l("wechatxlog", d.qNP);
        com.tencent.pb.common.c.a.l("voipMain", d.qNP);
      }
      GMTrace.o(14018236383232L, 104444);
      return;
    }
    catch (Throwable localThrowable)
    {
      c.k("loadLibrary: ", new Object[] { localThrowable });
      GMTrace.o(14018236383232L, 104444);
    }
  }
  
  public talk()
  {
    GMTrace.i(14015552028672L, 104424);
    this.field_capInfo = null;
    this.field_remoteImgWidth = 0;
    this.field_remoteImgHeight = 0;
    this.field_remoteImgLength = 0;
    this.field_remoteImgChannel = 0;
    this.field_localImgWidth = 0;
    this.field_localImgHeight = 0;
    GMTrace.o(14015552028672L, 104424);
  }
  
  public native int GetAudioData(byte[] paramArrayOfByte, int paramInt, AtomicInteger paramAtomicInteger1, AtomicInteger paramAtomicInteger2);
  
  public native int GetVoiceActivity(int paramInt);
  
  public native int IsSilenceFrame();
  
  public native void OnMembersChanged(int[] paramArrayOfInt);
  
  public native int Open(a parama, i parami, int paramInt1, int paramInt2, int paramInt3, long paramLong, int[] paramArrayOfInt1, short[] paramArrayOfShort1, int paramInt4, int[] paramArrayOfInt2, byte[] paramArrayOfByte, boolean paramBoolean, int paramInt5, int[] paramArrayOfInt3, short[] paramArrayOfShort2, int paramInt6);
  
  public native int SendAudio(byte[] paramArrayOfByte, short paramShort, int paramInt);
  
  public native int SendVideo(byte[] paramArrayOfByte, short paramShort, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public native int SetCurrentMicId(int paramInt);
  
  public native int close();
  
  public final int cw(int paramInt1, int paramInt2)
  {
    GMTrace.i(14018102165504L, 104443);
    byte[] arrayOfByte = new byte[1];
    arrayOfByte[0] = 0;
    arrayOfByte[0] = ((byte)paramInt2);
    paramInt1 = setAppCmd(paramInt1, arrayOfByte, 1);
    GMTrace.o(14018102165504L, 104443);
    return paramInt1;
  }
  
  public native int getChannelBytes(AtomicInteger paramAtomicInteger1, AtomicInteger paramAtomicInteger2);
  
  public native int getSampleRate(AtomicInteger paramAtomicInteger1, AtomicInteger paramAtomicInteger2);
  
  public native int init(int paramInt1, int paramInt2, String paramString);
  
  public native int onNetworkChange(int paramInt);
  
  public final int qZ(int paramInt)
  {
    GMTrace.i(14017967947776L, 104442);
    paramInt = setAppCmd(paramInt, new byte[] { 5 }, 1);
    GMTrace.o(14017967947776L, 104442);
    return paramInt;
  }
  
  public native int setAppCmd(int paramInt1, byte[] paramArrayOfByte, int paramInt2);
  
  public native int uninit();
  
  public native int videoDecode(int[] paramArrayOfInt);
  
  public native int videoTrans(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt);
  
  public static abstract interface a
  {
    public abstract void keep_OnError(int paramInt);
    
    public abstract void keep_OnNotify(int paramInt);
    
    public abstract void keep_OnOpenSuccess();
    
    public abstract void keep_OnReportChannel(String paramString);
    
    public abstract void keep_OnReportEngineRecv(String paramString, int paramInt);
    
    public abstract void keep_OnReportEngineSend(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\multi\talk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */