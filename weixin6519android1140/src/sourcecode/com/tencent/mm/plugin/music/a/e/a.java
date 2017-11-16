package com.tencent.mm.plugin.music.a.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ab.d;
import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import com.tencent.qqmusic.mediaplayer.util.Logger;

public final class a
  implements IDataSource
{
  public d grU;
  
  public a(d paramd)
  {
    GMTrace.i(20505381830656L, 152777);
    this.grU = paramd;
    GMTrace.o(20505381830656L, 152777);
  }
  
  public final void close()
  {
    GMTrace.i(20506052919296L, 152782);
    Logger.i("MicroMsg.InputStreamDataSource", "close");
    if (this.grU != null) {
      this.grU.close();
    }
    GMTrace.o(20506052919296L, 152782);
  }
  
  public final AudioFormat.AudioType getAudioType()
  {
    GMTrace.i(20505918701568L, 152781);
    if (this.grU == null)
    {
      Logger.e("MicroMsg.InputStreamDataSource", "[getAudioType] unsupport");
      localAudioType = AudioFormat.AudioType.UNSUPPORT;
      GMTrace.o(20505918701568L, 152781);
      return localAudioType;
    }
    Logger.i("MicroMsg.InputStreamDataSource", "getAudioType:" + this.grU.getAudioType());
    switch (this.grU.getAudioType())
    {
    default: 
      Logger.e("MicroMsg.InputStreamDataSource", "[getAudioType] unsupport");
      localAudioType = AudioFormat.AudioType.UNSUPPORT;
      GMTrace.o(20505918701568L, 152781);
      return localAudioType;
    case 0: 
      localAudioType = AudioFormat.AudioType.UNSUPPORT;
      GMTrace.o(20505918701568L, 152781);
      return localAudioType;
    case 1: 
      localAudioType = AudioFormat.AudioType.AAC;
      GMTrace.o(20505918701568L, 152781);
      return localAudioType;
    }
    AudioFormat.AudioType localAudioType = AudioFormat.AudioType.MP3;
    GMTrace.o(20505918701568L, 152781);
    return localAudioType;
  }
  
  public final long getSize()
  {
    GMTrace.i(20505784483840L, 152780);
    if (this.grU != null)
    {
      long l = this.grU.getSize();
      GMTrace.o(20505784483840L, 152780);
      return l;
    }
    GMTrace.o(20505784483840L, 152780);
    return 0L;
  }
  
  public final void open()
  {
    GMTrace.i(20505516048384L, 152778);
    Logger.i("MicroMsg.InputStreamDataSource", "open");
    if (this.grU != null) {
      this.grU.open();
    }
    GMTrace.o(20505516048384L, 152778);
  }
  
  public final int readAt(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    GMTrace.i(20505650266112L, 152779);
    if (this.grU == null)
    {
      Logger.e("MicroMsg.InputStreamDataSource", "[readAt]audioDataSource is null");
      GMTrace.o(20505650266112L, 152779);
      return -1;
    }
    paramInt1 = this.grU.readAt(paramLong, paramArrayOfByte, paramInt1, paramInt2);
    GMTrace.o(20505650266112L, 152779);
    return paramInt1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\a\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */