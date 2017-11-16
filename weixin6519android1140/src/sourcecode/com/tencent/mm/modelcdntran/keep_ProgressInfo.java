package com.tencent.mm.modelcdntran;

import com.tencent.gmtrace.GMTrace;

public class keep_ProgressInfo
{
  public int field_finishedLength;
  public boolean field_mtlnotify;
  public int field_status;
  public int field_toltalLength;
  public String mediaId;
  
  public keep_ProgressInfo()
  {
    GMTrace.i(592571269120L, 4415);
    GMTrace.o(592571269120L, 4415);
  }
  
  public String toString()
  {
    GMTrace.i(592705486848L, 4416);
    String str = String.format("id:%s total:%d finLen:%d status:%d,mtl:%b", new Object[] { this.mediaId, Integer.valueOf(this.field_toltalLength), Integer.valueOf(this.field_finishedLength), Integer.valueOf(this.field_status), Boolean.valueOf(this.field_mtlnotify) });
    GMTrace.o(592705486848L, 4416);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelcdntran\keep_ProgressInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */