package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.storage.r;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bfa;
import com.tencent.mm.protocal.c.bfb;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.io.OutputStream;

public final class o
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.b fUa;
  public com.tencent.mm.ad.e fUd;
  private String filename;
  private OutputStream gtb;
  String mediaId;
  private String psh;
  private int psi;
  int psj;
  private boolean psk;
  private String psl;
  private anu psm;
  
  public o(anu paramanu, String paramString1, String paramString2, int paramInt1, boolean paramBoolean, int paramInt2, String paramString3)
  {
    GMTrace.i(8039105036288L, 59896);
    this.mediaId = "";
    this.gtb = null;
    this.psi = -1;
    this.psj = -1;
    this.psk = true;
    this.psl = null;
    this.mediaId = paramString1;
    this.psm = paramanu;
    this.psk = paramBoolean;
    this.psi = paramInt1;
    this.psj = paramInt2;
    this.psl = paramString3;
    this.psh = am.dE(ae.getAccSnsPath(), paramString1);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bfa();
    ((b.a)localObject).gtG = new bfb();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnsdownload";
    ((b.a)localObject).gtE = 208;
    ((b.a)localObject).gtH = 96;
    ((b.a)localObject).gtI = 1000000096;
    this.fUa = ((b.a)localObject).DA();
    bfa localbfa = (bfa)this.fUa.gtC.gtK;
    com.tencent.mm.plugin.sns.storage.q localq = ae.biS().IH(paramString1);
    localObject = localq;
    if (localq == null) {
      localObject = new com.tencent.mm.plugin.sns.storage.q();
    }
    ((com.tencent.mm.plugin.sns.storage.q)localObject).pMN = paramString1;
    ((com.tencent.mm.plugin.sns.storage.q)localObject).offset = 0;
    ae.biS().a(paramString1, (com.tencent.mm.plugin.sns.storage.q)localObject);
    if (paramBoolean) {}
    for (this.filename = i.n(paramanu);; this.filename = i.m(paramanu))
    {
      FileOp.la(this.psh);
      FileOp.deleteFile(am.dE(ae.getAccSnsPath(), paramString1) + this.filename);
      localbfa.uQI = paramString2;
      localbfa.uQJ = 0;
      localbfa.tRD = 0;
      localbfa.tRC = 0;
      localbfa.jib = this.psi;
      w.d("MicroMsg.NetSceneSnsDownload", "requestKey " + paramString3);
      GMTrace.o(8039105036288L, 59896);
      return;
    }
  }
  
  private void Dr()
  {
    GMTrace.i(8040178778112L, 59904);
    try
    {
      if (this.gtb != null)
      {
        this.gtb.flush();
        this.gtb.close();
        this.gtb = null;
      }
      GMTrace.o(8040178778112L, 59904);
      return;
    }
    catch (IOException localIOException)
    {
      w.printErrStackTrace("MicroMsg.NetSceneSnsDownload", localIOException, "", new Object[0]);
      GMTrace.o(8040178778112L, 59904);
    }
  }
  
  private void onError()
  {
    GMTrace.i(8039507689472L, 59899);
    ae.biY().Hh(this.psl);
    GMTrace.o(8039507689472L, 59899);
  }
  
  private int z(byte[] paramArrayOfByte)
  {
    GMTrace.i(8040044560384L, 59903);
    if (!i.GY(ae.zo()))
    {
      GMTrace.o(8040044560384L, 59903);
      return 0;
    }
    try
    {
      if (this.gtb == null)
      {
        FileOp.la(this.psh);
        this.gtb = FileOp.hA(this.psh + this.filename);
      }
      w.d("MicroMsg.NetSceneSnsDownload", "appendBuf " + paramArrayOfByte.length);
      this.gtb.write(paramArrayOfByte);
      Dr();
      int i = paramArrayOfByte.length;
      GMTrace.o(8040044560384L, 59903);
      return i;
    }
    catch (IOException paramArrayOfByte)
    {
      w.printErrStackTrace("MicroMsg.NetSceneSnsDownload", paramArrayOfByte, "appendBuf failed: " + this.filename, new Object[0]);
      Dr();
      GMTrace.o(8040044560384L, 59903);
      return -1;
    }
    finally
    {
      Dr();
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(8039239254016L, 59897);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(8039239254016L, 59897);
    return i;
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    GMTrace.i(8039776124928L, 59901);
    int i = k.b.gum;
    GMTrace.o(8039776124928L, 59901);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(8039373471744L, 59898);
    w.d("MicroMsg.NetSceneSnsDownload", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    paramArrayOfByte = (b.c)paramq.AZ();
    paramq = (bfb)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    if (paramArrayOfByte.tKs != 0)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      ae.biY().Hh(this.psl);
      GMTrace.o(8039373471744L, 59898);
      return;
    }
    paramArrayOfByte = ae.biS().IH(this.mediaId);
    if (paramq.tRC <= 0)
    {
      w.e("MicroMsg.NetSceneSnsDownload", "error 1");
      onError();
      GMTrace.o(8039373471744L, 59898);
      return;
    }
    if (paramq.tTe == null)
    {
      w.e("MicroMsg.NetSceneSnsDownload", "error 2");
      onError();
      GMTrace.o(8039373471744L, 59898);
      return;
    }
    if ((paramq.tRD < 0) || (paramq.tRD + paramq.tTe.uNP.tJp.length > paramq.tRC))
    {
      w.e("MicroMsg.NetSceneSnsDownload", "error 3");
      onError();
      GMTrace.o(8039373471744L, 59898);
      return;
    }
    if (paramq.tRD != paramArrayOfByte.offset)
    {
      w.e("MicroMsg.NetSceneSnsDownload", "error 4");
      onError();
      GMTrace.o(8039373471744L, 59898);
      return;
    }
    paramInt1 = z(paramq.tTe.uNP.toByteArray());
    if (paramInt1 < 0)
    {
      w.e("MicroMsg.NetSceneSnsDownload", "error 5");
      onError();
      GMTrace.o(8039373471744L, 59898);
      return;
    }
    paramArrayOfByte.offset += paramInt1;
    paramArrayOfByte.pMJ = paramq.tRC;
    w.d("MicroMsg.NetSceneSnsDownload", "byteLen " + paramInt1 + "  totalLen " + paramq.tRC);
    ae.biS().a(this.mediaId, paramArrayOfByte);
    if ((paramArrayOfByte.offset == paramArrayOfByte.pMJ) && (paramArrayOfByte.pMJ != 0))
    {
      paramInt1 = 1;
      if (paramInt1 == 0) {
        break label689;
      }
      w.d("MicroMsg.NetSceneSnsDownload", "downLoad ok");
      if (this.psj != 1) {
        break label576;
      }
      paramq = i.e(this.psm);
      label463:
      paramArrayOfByte = am.dE(ae.getAccSnsPath(), this.mediaId);
      FileOp.deleteFile(paramArrayOfByte + paramq);
      FileOp.g(paramArrayOfByte, this.filename, paramq);
      if (!this.psk) {
        break label588;
      }
      r.b(paramArrayOfByte, paramq, i.f(this.psm), ae.bjl());
    }
    for (;;)
    {
      ae.biY().Hh(this.psl);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8039373471744L, 59898);
      return;
      paramInt1 = 0;
      break;
      label576:
      paramq = i.l(this.psm);
      break label463;
      label588:
      String str = i.e(this.psm);
      if (!FileOp.aZ(paramArrayOfByte + str)) {
        r.a(paramArrayOfByte, paramq, str, ae.bjm());
      }
      str = i.f(this.psm);
      if (!FileOp.aZ(paramArrayOfByte + str)) {
        r.b(paramArrayOfByte, paramq, str, ae.bjl());
      }
    }
    label689:
    a(this.gtW, this.fUd);
    GMTrace.o(8039373471744L, 59898);
  }
  
  public final int getType()
  {
    GMTrace.i(8039641907200L, 59900);
    GMTrace.o(8039641907200L, 59900);
    return 208;
  }
  
  protected final int vB()
  {
    GMTrace.i(8039910342656L, 59902);
    GMTrace.o(8039910342656L, 59902);
    return 100;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */