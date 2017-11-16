package com.tencent.mm.ad;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.network.a.b;
import com.tencent.mm.network.c;
import com.tencent.mm.network.e;
import com.tencent.mm.network.f;
import com.tencent.mm.network.h;
import com.tencent.mm.network.i;
import com.tencent.mm.network.l;
import com.tencent.mm.network.r;
import com.tencent.mm.protocal.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.List;

public final class p
  implements e
{
  public final f guI;
  private o guJ;
  
  public p(f paramf)
  {
    GMTrace.i(13392513335296L, 99782);
    this.guI = paramf;
    GMTrace.o(13392513335296L, 99782);
  }
  
  public final boolean DO()
  {
    GMTrace.i(13393855512576L, 99792);
    try
    {
      boolean bool = this.guI.DO();
      GMTrace.o(13393855512576L, 99792);
      return bool;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.RDispatcher", "core service down, guess network stable, %s", new Object[] { localException });
      w.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bg.f(localException) });
      GMTrace.o(13393855512576L, 99792);
    }
    return true;
  }
  
  public final c DY()
  {
    GMTrace.i(13393452859392L, 99789);
    try
    {
      if (this.guJ == null) {
        this.guJ = new o(this.guI.Oz());
      }
      o localo = this.guJ;
      GMTrace.o(13393452859392L, 99789);
      return localo;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.RDispatcher", "getAccInfo failed, core service down, %s", new Object[] { localException });
      w.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bg.f(localException) });
      GMTrace.o(13393452859392L, 99789);
    }
    return null;
  }
  
  public final i DZ()
  {
    GMTrace.i(13393989730304L, 99793);
    try
    {
      i locali = this.guI.OB();
      GMTrace.o(13393989730304L, 99793);
      return locali;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bg.f(localException) });
      GMTrace.o(13393989730304L, 99793);
    }
    return null;
  }
  
  public final void Ea()
  {
    GMTrace.i(13396271431680L, 99810);
    try
    {
      this.guI.Ea();
      GMTrace.o(13396271431680L, 99810);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bg.f(localException) });
      GMTrace.o(13396271431680L, 99810);
    }
  }
  
  public final void Eb()
  {
    GMTrace.i(21014738108416L, 156572);
    try
    {
      this.guI.Eb();
      GMTrace.o(21014738108416L, 156572);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bg.f(localException) });
      GMTrace.o(21014738108416L, 156572);
    }
  }
  
  public final int a(r paramr, l paraml)
  {
    GMTrace.i(13392647553024L, 99783);
    try
    {
      int i = this.guI.a(paramr, paraml);
      GMTrace.o(13392647553024L, 99783);
      return i;
    }
    catch (Exception paramr)
    {
      w.e("MicroMsg.RDispatcher", "remote dispatcher lost, send failed, %s", new Object[] { paramr });
      w.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bg.f(paramr) });
      GMTrace.o(13392647553024L, 99783);
    }
    return -1;
  }
  
  public final int a(String paramString, boolean paramBoolean, List<String> paramList)
  {
    GMTrace.i(13394526601216L, 99797);
    try
    {
      int i = this.guI.a(paramString, paramBoolean, paramList);
      GMTrace.o(13394526601216L, 99797);
      return i;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bg.f(paramString) });
      GMTrace.o(13394526601216L, 99797);
    }
    return -1;
  }
  
  public final void a(int paramInt1, String paramString, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(13394795036672L, 99799);
    try
    {
      this.guI.a(paramInt1, paramString, paramInt2, paramBoolean);
      GMTrace.o(13394795036672L, 99799);
      return;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bg.f(paramString) });
      GMTrace.o(13394795036672L, 99799);
    }
  }
  
  public final void a(b paramb)
  {
    GMTrace.i(13393587077120L, 99790);
    try
    {
      this.guI.a(paramb);
      GMTrace.o(13393587077120L, 99790);
      return;
    }
    catch (Exception paramb)
    {
      w.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bg.f(paramb) });
      GMTrace.o(13393587077120L, 99790);
    }
  }
  
  public final void a(h paramh)
  {
    GMTrace.i(21014603890688L, 156571);
    try
    {
      this.guI.a(paramh);
      GMTrace.o(21014603890688L, 156571);
      return;
    }
    catch (Exception paramh)
    {
      w.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bg.f(paramh) });
      GMTrace.o(21014603890688L, 156571);
    }
  }
  
  public final void a(com.tencent.mm.network.o paramo)
  {
    GMTrace.i(13395466125312L, 99804);
    try
    {
      this.guI.a(paramo);
      GMTrace.o(13395466125312L, 99804);
      return;
    }
    catch (Exception paramo)
    {
      w.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bg.f(paramo) });
      GMTrace.o(13395466125312L, 99804);
    }
  }
  
  public final void a(ab paramab)
  {
    GMTrace.i(13394123948032L, 99794);
    try
    {
      this.guI.a(paramab);
      GMTrace.o(13394123948032L, 99794);
      return;
    }
    catch (Exception paramab)
    {
      w.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bg.f(paramab) });
      GMTrace.o(13394123948032L, 99794);
    }
  }
  
  public final void a(boolean paramBoolean, String paramString1, String paramString2, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, String paramString3, String paramString4)
  {
    GMTrace.i(13393318641664L, 99788);
    try
    {
      this.guI.a(paramBoolean, paramString1, paramString2, paramArrayOfInt1, paramArrayOfInt2, paramInt1, paramInt2, paramString3, paramString4);
      GMTrace.o(13393318641664L, 99788);
      return;
    }
    catch (Exception paramString1)
    {
      w.e("MicroMsg.RDispatcher", "dkidc setIDCHostInfo ip failed, core service down, %s", new Object[] { paramString1 });
      w.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bg.f(paramString1) });
      GMTrace.o(13393318641664L, 99788);
    }
  }
  
  public final void bm(boolean paramBoolean)
  {
    GMTrace.i(13393721294848L, 99791);
    try
    {
      this.guI.bm(paramBoolean);
      GMTrace.o(13393721294848L, 99791);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.RDispatcher", "change active status failed, core service down, %s", new Object[] { localException });
      w.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bg.f(localException) });
      GMTrace.o(13393721294848L, 99791);
    }
  }
  
  public final void bn(boolean paramBoolean)
  {
    GMTrace.i(13395868778496L, 99807);
    try
    {
      this.guI.bn(paramBoolean);
      GMTrace.o(13395868778496L, 99807);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bg.f(localException) });
      GMTrace.o(13395868778496L, 99807);
    }
  }
  
  public final void bo(boolean paramBoolean)
  {
    GMTrace.i(13396002996224L, 99808);
    try
    {
      this.guI.bo(paramBoolean);
      GMTrace.o(13396002996224L, 99808);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bg.f(localException) });
      GMTrace.o(13396002996224L, 99808);
    }
  }
  
  public final void bp(boolean paramBoolean)
  {
    GMTrace.i(13396137213952L, 99809);
    try
    {
      this.guI.bp(paramBoolean);
      GMTrace.o(13396137213952L, 99809);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bg.f(localException) });
      GMTrace.o(13396137213952L, 99809);
    }
  }
  
  public final void cancel(int paramInt)
  {
    GMTrace.i(13393050206208L, 99786);
    try
    {
      this.guI.cancel(paramInt);
      GMTrace.o(13393050206208L, 99786);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.RDispatcher", "cancel remote rr failed, netid=%d, %s", new Object[] { Integer.valueOf(paramInt), localException });
      w.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bg.f(localException) });
      GMTrace.o(13393050206208L, 99786);
    }
  }
  
  public final int getHostByName(String paramString, List<String> paramList)
  {
    GMTrace.i(13394392383488L, 99796);
    try
    {
      int i = this.guI.getHostByName(paramString, paramList);
      GMTrace.o(13394392383488L, 99796);
      return i;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bg.f(paramString) });
      GMTrace.o(13394392383488L, 99796);
    }
    return -1;
  }
  
  public final String[] getIPsString(boolean paramBoolean)
  {
    GMTrace.i(13392915988480L, 99785);
    try
    {
      String[] arrayOfString = this.guI.getIPsString(paramBoolean);
      GMTrace.o(13392915988480L, 99785);
      return arrayOfString;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.RDispatcher", "query remote network server ip failed, %s", new Object[] { localException });
      w.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bg.f(localException) });
      GMTrace.o(13392915988480L, 99785);
    }
    return null;
  }
  
  public final String getIspId()
  {
    GMTrace.i(13394929254400L, 99800);
    try
    {
      String str = this.guI.getIspId();
      GMTrace.o(13394929254400L, 99800);
      return str;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bg.f(localException) });
      GMTrace.o(13394929254400L, 99800);
    }
    return null;
  }
  
  public final String getNetworkServerIp()
  {
    GMTrace.i(13392781770752L, 99784);
    try
    {
      String str = this.guI.getNetworkServerIp();
      GMTrace.o(13392781770752L, 99784);
      return str;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.RDispatcher", "query remote network server ip failed, %s", new Object[] { localException });
      w.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bg.f(localException) });
      GMTrace.o(13392781770752L, 99784);
    }
    return null;
  }
  
  public final void ij(String paramString)
  {
    GMTrace.i(13394258165760L, 99795);
    try
    {
      this.guI.ij(paramString);
      GMTrace.o(13394258165760L, 99795);
      return;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.RDispatcher", "ipxxStatistics remote call error, %s", new Object[] { paramString });
      w.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bg.f(paramString) });
      GMTrace.o(13394258165760L, 99795);
    }
  }
  
  public final void ik(String paramString)
  {
    GMTrace.i(13395734560768L, 99806);
    try
    {
      this.guI.ik(paramString);
      GMTrace.o(13395734560768L, 99806);
      return;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bg.f(paramString) });
      GMTrace.o(13395734560768L, 99806);
    }
  }
  
  public final void keepSignalling()
  {
    GMTrace.i(13395197689856L, 99802);
    try
    {
      this.guI.keepSignalling();
      GMTrace.o(13395197689856L, 99802);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bg.f(localException) });
      GMTrace.o(13395197689856L, 99802);
    }
  }
  
  public final void reportFailIp(String paramString)
  {
    GMTrace.i(13395600343040L, 99805);
    try
    {
      this.guI.reportFailIp(paramString);
      GMTrace.o(13395600343040L, 99805);
      return;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bg.f(paramString) });
      GMTrace.o(13395600343040L, 99805);
    }
  }
  
  public final void reset()
  {
    GMTrace.i(13393184423936L, 99787);
    try
    {
      this.guI.reset();
      GMTrace.o(13393184423936L, 99787);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.RDispatcher", "reset failed, core service down, %s", new Object[] { localException });
      w.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bg.f(localException) });
      GMTrace.o(13393184423936L, 99787);
    }
  }
  
  public final void setHostInfo(String[] paramArrayOfString1, String[] paramArrayOfString2, int[] paramArrayOfInt)
  {
    GMTrace.i(13394660818944L, 99798);
    try
    {
      this.guI.setHostInfo(paramArrayOfString1, paramArrayOfString2, paramArrayOfInt);
      GMTrace.o(13394660818944L, 99798);
      return;
    }
    catch (Exception paramArrayOfString1)
    {
      w.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bg.f(paramArrayOfString1) });
      GMTrace.o(13394660818944L, 99798);
    }
  }
  
  public final void setSignallingStrategy(long paramLong1, long paramLong2)
  {
    GMTrace.i(13395063472128L, 99801);
    try
    {
      this.guI.setSignallingStrategy(paramLong1, paramLong2);
      GMTrace.o(13395063472128L, 99801);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bg.f(localException) });
      GMTrace.o(13395063472128L, 99801);
    }
  }
  
  public final void stopSignalling()
  {
    GMTrace.i(13395331907584L, 99803);
    try
    {
      this.guI.stopSignalling();
      GMTrace.o(13395331907584L, 99803);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bg.f(localException) });
      GMTrace.o(13395331907584L, 99803);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ad\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */