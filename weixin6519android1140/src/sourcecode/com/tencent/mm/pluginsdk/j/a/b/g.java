package com.tencent.mm.pluginsdk.j.a.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.j.a.d.a;
import com.tencent.mm.pluginsdk.j.a.d.a.a;
import com.tencent.mm.pluginsdk.j.a.d.q;
import com.tencent.mm.sdk.platformtools.bg;

final class g
  extends a
{
  final int eCs;
  final int eCt;
  private final boolean eCv;
  final boolean eCy;
  final long fileSize;
  private final String tpG;
  final int tpH;
  private final byte[] tpI;
  final String tpJ;
  final long tpL;
  private final String tpM;
  final byte[] tql;
  final boolean tqm;
  final boolean tqn;
  private final int tqo;
  
  public g(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, long paramLong1, String paramString3, int paramInt4, int paramInt5, long paramLong2, String paramString4, byte[] paramArrayOfByte1, String paramString5, boolean paramBoolean1, boolean paramBoolean2, String paramString6, int paramInt6, int paramInt7, byte[] paramArrayOfByte2, long paramLong3, boolean paramBoolean3, boolean paramBoolean4, int paramInt8) {}
  
  protected final int OI(String paramString)
  {
    GMTrace.i(857785499648L, 6391);
    int i = bg.getInt(this.tqW, 0);
    int j = bg.getInt(paramString, 0);
    GMTrace.o(857785499648L, 6391);
    return i - j;
  }
  
  public final q bKc()
  {
    GMTrace.i(857651281920L, 6390);
    q localq = super.bKc();
    localq.field_fileUpdated = this.eCv;
    localq.field_resType = this.eCs;
    localq.field_subType = this.eCt;
    localq.field_reportId = this.tpL;
    localq.field_sampleId = this.tpM;
    localq.field_eccSignature = this.tpI;
    localq.field_originalMd5 = this.tpJ;
    localq.field_fileCompress = this.tqm;
    localq.field_fileEncrypt = this.tqn;
    localq.field_encryptKey = this.tpG;
    localq.field_keyVersion = this.tpH;
    localq.field_fileSize = this.fileSize;
    localq.field_EID = this.tqo;
    GMTrace.o(857651281920L, 6390);
    return localq;
  }
  
  public final String toString()
  {
    GMTrace.i(857517064192L, 6389);
    String str = "CheckResUpdateRequest | fileUpdated=" + this.eCv + ", resType=" + this.eCs + ", subType=" + this.eCt + ", reportId=" + this.tpL + ", sampleId='" + this.tpM + '\'' + ", originalMd5='" + this.tpJ + '\'' + ", fileCompress=" + this.tqm + ", fileEncrypt=" + this.tqn + ", encryptKey='" + this.tpG + '\'' + ", keyVersion=" + this.tpH + ", EID=" + this.tqo + ", fileSize=" + this.fileSize + ", fromNewXml=" + this.eCy + " | " + super.toString();
    GMTrace.o(857517064192L, 6389);
    return str;
  }
  
  public static final class a
    extends a.a<g>
  {
    int eCs;
    int eCt;
    int eCu;
    boolean eCv;
    boolean eCy;
    long fileSize;
    String tpG;
    int tpH;
    byte[] tpI;
    String tpJ;
    long tpL;
    String tpM;
    byte[] tql;
    boolean tqm;
    boolean tqn;
    int tqo;
    
    public a(String paramString)
    {
      super();
      GMTrace.i(853624750080L, 6360);
      this.fileSize = 0L;
      GMTrace.o(853624750080L, 6360);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\j\a\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */