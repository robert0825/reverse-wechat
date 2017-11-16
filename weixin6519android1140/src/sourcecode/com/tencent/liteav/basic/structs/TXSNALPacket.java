package com.tencent.liteav.basic.structs;

import android.media.MediaCodec.BufferInfo;
import java.nio.ByteBuffer;

public class TXSNALPacket
{
  public ByteBuffer buffer = null;
  public long dts = 0L;
  public long frameIndex = 0L;
  public long gopFrameIndex = 0L;
  public long gopIndex = 0L;
  public MediaCodec.BufferInfo info = null;
  public byte[] nalData = null;
  public int nalType = -1;
  public long pts = 0L;
  public long refFremeIndex = 0L;
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\basic\structs\TXSNALPacket.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */