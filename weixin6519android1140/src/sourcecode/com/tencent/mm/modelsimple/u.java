package com.tencent.mm.modelsimple;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.o;
import com.tencent.mm.ad.k.a;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.ad.v;
import com.tencent.mm.g.a.jd;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.c;
import com.tencent.mm.plugin.auth.PluginAuth;
import com.tencent.mm.protocal.ac;
import com.tencent.mm.protocal.c.ang;
import com.tencent.mm.protocal.c.anh;
import com.tencent.mm.protocal.c.ani;
import com.tencent.mm.protocal.c.ap;
import com.tencent.mm.protocal.c.apz;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bdz;
import com.tencent.mm.protocal.c.bhs;
import com.tencent.mm.protocal.c.bki;
import com.tencent.mm.protocal.c.bqp;
import com.tencent.mm.protocal.c.bqq;
import com.tencent.mm.protocal.c.bub;
import com.tencent.mm.protocal.c.buc;
import com.tencent.mm.protocal.c.du;
import com.tencent.mm.protocal.c.ep;
import com.tencent.mm.protocal.i.d;
import com.tencent.mm.protocal.i.e;
import com.tencent.mm.protocal.i.g;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.au;
import com.tencent.mm.y.bf;
import com.tencent.mm.y.bf.a;
import com.tencent.mm.y.y;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParserException;

public final class u
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private int errCode;
  private int errType;
  public com.tencent.mm.ad.e fUd;
  private String gUA;
  private boolean gUB;
  private boolean gUC;
  private int gUD;
  private int gUE;
  private boolean gUF;
  private String gUz;
  public final com.tencent.mm.network.q guL;
  private int gup;
  
  public u(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    this("", "", paramInt, paramString1, paramString2, paramString3, 0, "", false, false);
    GMTrace.i(13162329931776L, 98067);
    GMTrace.o(13162329931776L, 98067);
  }
  
  public u(String paramString1, String paramString2, int paramInt1, String paramString3, String paramString4, String paramString5, int paramInt2, String paramString6, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(13162598367232L, 98069);
    this.gUz = "";
    this.gUA = "";
    this.gUB = false;
    this.gUC = false;
    this.errType = 0;
    this.errCode = 0;
    this.gup = 3;
    this.gUD = 0;
    this.gUE = 0;
    this.gUF = false;
    Object localObject1 = new StringBuilder("summerauth NetSceneManualAuth this: ").append(this).append(" account: ").append(paramString1).append(" rawPsw len: ");
    int i;
    Object localObject2;
    label309:
    Object localObject3;
    if (paramString2 == null)
    {
      i = -1;
      w.d("MicroMsg.NetSceneManualAuth", i + " secCodetype: " + paramInt1 + " secCode: " + paramString3 + " sid: " + paramString4 + " encryptKey: " + paramString5 + " inputType: " + paramInt2 + " authTicket: " + paramString6 + " useRawPwd: " + paramBoolean1 + " isMobileAutoLogin: " + paramBoolean2 + " stack: " + bg.bQW());
      this.gUC = paramBoolean2;
      this.guL = new au(701);
      localObject2 = (i.d)this.guL.DC();
      i = au.AX().getInt("key_auth_update_version", 0);
      w.d("MicroMsg.NetSceneManualAuth", "summerauth updateVersion:%d, clientVersion:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(com.tencent.mm.protocal.d.tJC) });
      if (i != 0) {
        break label818;
      }
      ((k.d)localObject2).tKm = 1;
      com.tencent.mm.plugin.report.d.oqe.a(148L, 0L, 1L, false);
      ((i.d)localObject2).tKa = true;
      ((i.d)localObject2).dp(0);
      localObject1 = new ani();
      localObject3 = new ang();
      ((i.d)localObject2).tJZ.uCi = ((ani)localObject1);
      ((i.d)localObject2).tJZ.uCj = ((ang)localObject3);
      ((ang)localObject3).uCh = paramInt2;
      localObject2 = new ep();
      ((ang)localObject3).tSu = ((ep)localObject2);
      ((ep)localObject2).tSm = paramString6;
      ((ep)localObject2).tTw = 0;
      ((ep)localObject2).tSh = new azp().be(new byte[0]);
      ((ep)localObject2).tSg = new azp().be(new byte[0]);
      paramString6 = new bqp();
      ((ep)localObject2).tTu = paramString6;
      paramString6.tVf = "";
      paramString6.tVe = "";
      paramString6.vaA = "";
      localObject3 = new bub();
      ((ep)localObject2).tTv = ((bub)localObject3);
      ((bub)localObject3).utG = "";
      ((bub)localObject3).utF = "";
      if (paramInt1 != 1) {
        break label857;
      }
      paramString6.tVf = paramString3;
      paramString6.tVe = paramString4;
      paramString6.vaA = paramString5;
      ((bub)localObject3).utG = "";
      ((bub)localObject3).utF = "";
      label532:
      if ((!bg.nm(paramString1)) || (!h.xw().wL())) {
        break label908;
      }
      com.tencent.mm.plugin.report.d.oqe.a(148L, 2L, 1L, false);
      this.gUz = ((String)h.xy().xh().get(3, null));
      this.gUA = ((String)h.xy().xh().get(19, null));
      paramString1 = (i.e)this.guL.AZ();
      paramString2 = bg.nl((String)h.xy().xh().get(2, null));
      if (!bg.nm(paramString2)) {
        break label900;
      }
      paramString2 = new o(bg.a((Integer)h.xy().xh().get(9, null), 0)).toString();
      label667:
      ((ani)localObject1).jhi = paramString2;
      paramString4 = null;
      paramString1 = paramString4;
      if (paramInt1 != 1)
      {
        paramString1 = paramString4;
        if (paramInt1 != 3)
        {
          if (paramInt1 != 2) {
            break label960;
          }
          paramString1 = h.xw().fXT.c(bg.getLong(paramString2, 0L), paramString3);
        }
      }
      label714:
      if (paramString1 != null) {
        break label993;
      }
    }
    label818:
    label857:
    label900:
    label908:
    label960:
    label993:
    for (paramInt1 = -1;; paramInt1 = paramString1.length)
    {
      w.i("MicroMsg.NetSceneManualAuth", "summerauth loginbuf len:%d content:[%s]", new Object[] { Integer.valueOf(paramInt1), bg.SJ(bg.bp(paramString1)) });
      paramString3 = new azp();
      paramString2 = paramString1;
      if (bg.bq(paramString1)) {
        paramString2 = new byte[0];
      }
      ((ep)localObject2).tTt = paramString3.be(paramString2);
      ((ani)localObject1).tUR = this.gUA;
      ((ani)localObject1).tVd = this.gUz;
      GMTrace.o(13162598367232L, 98069);
      return;
      i = paramString2.length();
      break;
      if (i < com.tencent.mm.protocal.d.tJC)
      {
        ((k.d)localObject2).tKm = 16;
        com.tencent.mm.plugin.report.d.oqe.a(148L, 1L, 1L, false);
        break label309;
      }
      ((k.d)localObject2).tKm = 1;
      break label309;
      if (paramInt1 != 3) {
        break label532;
      }
      paramString6.tVf = "";
      paramString6.tVe = "";
      paramString6.vaA = "";
      ((bub)localObject3).utG = paramString3;
      ((bub)localObject3).utF = paramString4;
      break label532;
      paramString1.hgh = paramString2;
      break label667;
      if ((paramBoolean1) || (paramBoolean2))
      {
        this.gUz = paramString2;
        this.gUA = paramString2;
        paramString2 = paramString1;
        break label667;
      }
      this.gUz = bg.Sr(bg.nl(paramString2));
      this.gUA = bg.Ss(bg.nl(paramString2));
      paramString2 = paramString1;
      break label667;
      paramString1 = paramString4;
      if (!bg.Si(paramString2)) {
        break label714;
      }
      paramString1 = h.xw().fXT.a(bg.getLong(paramString2, 0L), this.gUA, true);
      break label714;
    }
  }
  
  public u(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    this(paramString1, paramString2, 0, "", "", "", paramInt, paramString3, false, false);
    GMTrace.i(13162464149504L, 98068);
    GMTrace.o(13162464149504L, 98068);
  }
  
  public final int HD()
  {
    GMTrace.i(13163672109056L, 98077);
    if (((i.e)this.guL.AZ()).tKc.uVc == null)
    {
      GMTrace.o(13163672109056L, 98077);
      return 3;
    }
    Object localObject = ((i.e)this.guL.AZ()).tKc.uVc.tSl;
    bhs localbhs;
    if ((localObject != null) && (((bdz)localObject).uPQ != null) && (((bdz)localObject).uPQ.size() > 0))
    {
      localObject = ((bdz)localObject).uPQ.iterator();
      do
      {
        if (!((Iterator)localObject).hasNext()) {
          break;
        }
        localbhs = (bhs)((Iterator)localObject).next();
      } while (localbhs.oqG != 6);
    }
    for (int i = bg.getInt(localbhs.uTC, 3);; i = 3)
    {
      GMTrace.o(13163672109056L, 98077);
      return i;
    }
  }
  
  public final byte[] HP()
  {
    GMTrace.i(13164074762240L, 98080);
    if (((i.e)this.guL.AZ()).tKc.uVc == null)
    {
      GMTrace.o(13164074762240L, 98080);
      return new byte[0];
    }
    int i = Lv();
    byte[] arrayOfByte;
    if (i == 3)
    {
      if (((i.e)this.guL.AZ()).tKc.uVc.tSf != null)
      {
        arrayOfByte = com.tencent.mm.platformtools.n.a(((i.e)this.guL.AZ()).tKc.uVc.tSf.utI, new byte[0]);
        GMTrace.o(13164074762240L, 98080);
        return arrayOfByte;
      }
    }
    else if (i == 1)
    {
      if (((i.e)this.guL.AZ()).tKc.uVc.tSe != null)
      {
        arrayOfByte = com.tencent.mm.platformtools.n.a(((i.e)this.guL.AZ()).tKc.uVc.tSe.tQa, new byte[0]);
        GMTrace.o(13164074762240L, 98080);
        return arrayOfByte;
      }
    }
    else if ((i == 2) && (((i.d)this.guL.DC()).tJZ.uCi != null))
    {
      h.xw().fXT.a(bg.getLong(((i.d)this.guL.DC()).tJZ.uCi.jhi, 0L), com.tencent.mm.platformtools.n.a(((i.e)this.guL.AZ()).tKc.uVc.tSd));
      arrayOfByte = h.xw().fXT.Y(bg.getLong(((i.d)this.guL.DC()).tJZ.uCi.jhi, 0L));
      GMTrace.o(13164074762240L, 98080);
      return arrayOfByte;
    }
    GMTrace.o(13164074762240L, 98080);
    return new byte[0];
  }
  
  public final String HQ()
  {
    GMTrace.i(13163940544512L, 98079);
    if (((i.e)this.guL.AZ()).tKc.uVc == null)
    {
      GMTrace.o(13163940544512L, 98079);
      return "";
    }
    int i = Lv();
    String str;
    if (i == 3)
    {
      if (((i.e)this.guL.AZ()).tKc.uVc.tSf != null)
      {
        str = bg.nl(((i.e)this.guL.AZ()).tKc.uVc.tSf.utF);
        GMTrace.o(13163940544512L, 98079);
        return str;
      }
    }
    else if ((i == 1) && (((i.e)this.guL.AZ()).tKc.uVc.tSe != null))
    {
      str = bg.nl(((i.e)this.guL.AZ()).tKc.uVc.tSe.tVe);
      GMTrace.o(13163940544512L, 98079);
      return str;
    }
    GMTrace.o(13163940544512L, 98079);
    return "";
  }
  
  public final String Hy()
  {
    GMTrace.i(13164477415424L, 98083);
    String str = ((i.e)this.guL.AZ()).tKc.uVc.tSm;
    GMTrace.o(13164477415424L, 98083);
    return str;
  }
  
  public final String LA()
  {
    GMTrace.i(13165014286336L, 98087);
    if (((i.e)this.guL.AZ()).tKc.uVc == null)
    {
      GMTrace.o(13165014286336L, 98087);
      return "";
    }
    Object localObject = ((i.e)this.guL.AZ()).tKc.uVc.tSl;
    if ((localObject != null) && (((bdz)localObject).uPQ != null) && (((bdz)localObject).uPQ.size() > 0))
    {
      localObject = ((bdz)localObject).uPQ.iterator();
      while (((Iterator)localObject).hasNext())
      {
        bhs localbhs = (bhs)((Iterator)localObject).next();
        if (localbhs.oqG == 16)
        {
          localObject = localbhs.uTC;
          GMTrace.o(13165014286336L, 98087);
          return (String)localObject;
        }
      }
    }
    GMTrace.o(13165014286336L, 98087);
    return "";
  }
  
  public final int LB()
  {
    GMTrace.i(13165148504064L, 98088);
    if (((i.e)this.guL.AZ()).tKc.uVc == null)
    {
      GMTrace.o(13165148504064L, 98088);
      return 0;
    }
    Object localObject = ((i.e)this.guL.AZ()).tKc.uVc.tSl;
    bhs localbhs;
    if ((localObject != null) && (((bdz)localObject).uPQ != null) && (((bdz)localObject).uPQ.size() > 0))
    {
      localObject = ((bdz)localObject).uPQ.iterator();
      do
      {
        if (!((Iterator)localObject).hasNext()) {
          break;
        }
        localbhs = (bhs)((Iterator)localObject).next();
      } while (localbhs.oqG != 13);
    }
    for (int i = bg.getInt(localbhs.uTC, 0);; i = 0)
    {
      GMTrace.o(13165148504064L, 98088);
      return i;
    }
  }
  
  public final boolean LC()
  {
    GMTrace.i(13165282721792L, 98089);
    if (((i.e)this.guL.AZ()).tKc.uVc == null)
    {
      GMTrace.o(13165282721792L, 98089);
      return true;
    }
    Object localObject = ((i.e)this.guL.AZ()).tKc.uVc.tSl;
    if ((localObject != null) && (((bdz)localObject).uPQ != null) && (((bdz)localObject).uPQ.size() > 0))
    {
      localObject = ((bdz)localObject).uPQ.iterator();
      while (((Iterator)localObject).hasNext())
      {
        bhs localbhs = (bhs)((Iterator)localObject).next();
        if (localbhs.oqG == 18) {
          if (bg.getInt(localbhs.uTC, 0) == 1)
          {
            GMTrace.o(13165282721792L, 98089);
            return false;
          }
        }
      }
    }
    GMTrace.o(13165282721792L, 98089);
    return true;
  }
  
  public final u Lt()
  {
    GMTrace.i(14605573160960L, 108820);
    this.gUF = true;
    GMTrace.o(14605573160960L, 108820);
    return this;
  }
  
  public final String Lu()
  {
    GMTrace.i(13163806326784L, 98078);
    if (((i.e)this.guL.AZ()).tKc.uVc == null)
    {
      GMTrace.o(13163806326784L, 98078);
      return "";
    }
    String str = ((i.e)this.guL.AZ()).tKc.uVc.tSk;
    GMTrace.o(13163806326784L, 98078);
    return str;
  }
  
  public final int Lv()
  {
    GMTrace.i(13164208979968L, 98081);
    if (((i.e)this.guL.AZ()).tKc.uVc == null)
    {
      w.e("MicroMsg.NetSceneManualAuth", "getSecCodeType ERROR AuthSectResp or WxVerifyCodeRespInfo is null");
      GMTrace.o(13164208979968L, 98081);
      return 0;
    }
    if (this.errType != 4)
    {
      w.e("MicroMsg.NetSceneManualAuth", "getSecCodeType ERROR errType :%d", new Object[] { Integer.valueOf(this.errType) });
      GMTrace.o(13164208979968L, 98081);
      return 0;
    }
    if (this.errCode == 65225)
    {
      GMTrace.o(13164208979968L, 98081);
      return 2;
    }
    if (this.errCode == -6)
    {
      GMTrace.o(13164208979968L, 98081);
      return 1;
    }
    if (this.errCode == 65226)
    {
      GMTrace.o(13164208979968L, 98081);
      return 3;
    }
    GMTrace.o(13164208979968L, 98081);
    return 0;
  }
  
  public final String Lw()
  {
    GMTrace.i(13164343197696L, 98082);
    if (((i.e)this.guL.AZ()).tKc.uVc == null)
    {
      GMTrace.o(13164343197696L, 98082);
      return "";
    }
    if ((Lv() == 1) && (((i.e)this.guL.AZ()).tKc.uVc.tSe != null))
    {
      if (((i.e)this.guL.AZ()).tKc.uVc.tSe.vaA != null)
      {
        String str = ((i.e)this.guL.AZ()).tKc.uVc.tSe.vaA;
        GMTrace.o(13164343197696L, 98082);
        return str;
      }
      GMTrace.o(13164343197696L, 98082);
      return null;
    }
    GMTrace.o(13164343197696L, 98082);
    return "";
  }
  
  public final String Lx()
  {
    GMTrace.i(13164611633152L, 98084);
    String str = ((i.e)this.guL.AZ()).tKc.uVd.tOu;
    GMTrace.o(13164611633152L, 98084);
    return str;
  }
  
  public final int Ly()
  {
    GMTrace.i(13164745850880L, 98085);
    if (((i.e)this.guL.AZ()).tKc.uVc == null)
    {
      GMTrace.o(13164745850880L, 98085);
      return 0;
    }
    Object localObject = ((i.e)this.guL.AZ()).tKc.uVc.tSl;
    bhs localbhs;
    if ((localObject != null) && (((bdz)localObject).uPQ != null) && (((bdz)localObject).uPQ.size() > 0))
    {
      localObject = ((bdz)localObject).uPQ.iterator();
      do
      {
        if (!((Iterator)localObject).hasNext()) {
          break;
        }
        localbhs = (bhs)((Iterator)localObject).next();
      } while (localbhs.oqG != 11);
    }
    for (int i = bg.getInt(localbhs.uTC, 0);; i = 0)
    {
      GMTrace.o(13164745850880L, 98085);
      return i;
    }
  }
  
  public final BindWordingContent Lz()
  {
    GMTrace.i(13164880068608L, 98086);
    if (((i.e)this.guL.AZ()).tKc.uVc == null)
    {
      GMTrace.o(13164880068608L, 98086);
      return null;
    }
    Object localObject1 = ((i.e)this.guL.AZ()).tKc.uVc.tSl;
    bhs localbhs;
    if ((localObject1 != null) && (((bdz)localObject1).uPQ != null) && (((bdz)localObject1).uPQ.size() > 0))
    {
      localObject1 = ((bdz)localObject1).uPQ.iterator();
      do
      {
        if (!((Iterator)localObject1).hasNext()) {
          break;
        }
        localbhs = (bhs)((Iterator)localObject1).next();
      } while (localbhs.oqG != 12);
    }
    Object localObject3;
    for (localObject1 = localbhs.uTC;; localObject3 = null)
    {
      if (localObject1 != null) {
        new a();
      }
      for (;;)
      {
        try
        {
          localObject1 = a.lk((String)localObject1);
          GMTrace.o(13164880068608L, 98086);
          return (BindWordingContent)localObject1;
        }
        catch (XmlPullParserException localXmlPullParserException)
        {
          w.printErrStackTrace("MicroMsg.NetSceneManualAuth", localXmlPullParserException, "", new Object[0]);
          Object localObject2 = null;
          continue;
        }
        catch (IOException localIOException)
        {
          w.printErrStackTrace("MicroMsg.NetSceneManualAuth", localIOException, "", new Object[0]);
        }
        localObject3 = null;
      }
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(13163403673600L, 98075);
    this.fUd = parame1;
    int i = a(parame, this.guL, this);
    GMTrace.o(13163403673600L, 98075);
    return i;
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    GMTrace.i(13163135238144L, 98073);
    int i = k.b.gum;
    GMTrace.o(13163135238144L, 98073);
    return i;
  }
  
  public final void a(final int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(13163537891328L, 98076);
    paramArrayOfByte = (i.d)paramq.DC();
    final i.e locale = (i.e)paramq.AZ();
    this.errType = paramInt2;
    this.errCode = paramInt3;
    bki localbki = locale.tKc;
    if (localbki == null)
    {
      w.w("MicroMsg.NetSceneManualAuth", "summerauth error unifyAuthResp is null!");
      this.fUd.a(4, -1, "", this);
      com.tencent.mm.plugin.report.d.oqe.a(148L, 3L, 1L, false);
      GMTrace.o(13163537891328L, 98076);
      return;
    }
    paramInt1 = localbki.uVb;
    w.i("MicroMsg.NetSceneManualAuth", "summerauth errType:%d, errCode:%d, errMsg:%s unifyAuthResp:%s, unifyFlag:%d, auth:%s, acct:%s, network:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, localbki, Integer.valueOf(paramInt1), localbki.uVc, localbki.uVd, localbki.uVe });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      if ((paramInt2 == 4) && (paramInt3 == 65235))
      {
        w.d("MicroMsg.NetSceneManualAuth", "summerauth RedirectIDC");
        com.tencent.mm.plugin.report.d.oqe.a(148L, 4L, 1L, false);
        if ((localbki != null) && (localbki.uVe != null)) {
          au.a(true, localbki.uVe.tUT, localbki.uVe.tUU, localbki.uVe.tUS);
        }
        for (;;)
        {
          this.gup -= 1;
          if (this.gup > 0) {
            break;
          }
          w.w("MicroMsg.NetSceneManualAuth", "summerauth err and return with no try!");
          this.fUd.a(3, -1, "", this);
          GMTrace.o(13163537891328L, 98076);
          return;
          w.w("MicroMsg.NetSceneManualAuth", "summerauth RedirectIDC but NetworkSectResp is null");
        }
        w.d("MicroMsg.NetSceneManualAuth", "summerauth RedirectIDC do scene again redirectCount:%d", new Object[] { Integer.valueOf(this.gup) });
        a(this.gtW, this.fUd);
        GMTrace.o(13163537891328L, 98076);
        return;
      }
      if ((!this.gUF) && (paramInt2 == 4) && (paramInt3 == -102))
      {
        com.tencent.mm.plugin.report.d.oqe.a(148L, 5L, 1L, false);
        paramInt1 = paramq.DC().tKq.ver;
        w.i("MicroMsg.NetSceneManualAuth", "summerauth auth MM_ERR_CERT_EXPIRED  getcert now  old ver:%d", new Object[] { Integer.valueOf(paramInt1) });
        h.xB().A(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(13157363875840L, 98030);
            new m().a(u.this.gtW, new com.tencent.mm.ad.e()
            {
              public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, com.tencent.mm.ad.k paramAnonymous2k)
              {
                GMTrace.i(13156827004928L, 98026);
                w.d("MicroMsg.NetSceneManualAuth", "summerauth dkcert getcert type:%d ret [%d,%d]", new Object[] { Integer.valueOf(paramAnonymous2k.getType()), Integer.valueOf(paramAnonymous2Int1), Integer.valueOf(paramAnonymous2Int2) });
                if ((paramAnonymous2Int1 != 0) || (paramAnonymous2Int2 != 0))
                {
                  u.this.fUd.a(paramAnonymous2Int1, paramAnonymous2Int2, "", u.this);
                  GMTrace.o(13156827004928L, 98026);
                  return;
                }
                u.this.a(u.this.gtW, u.this.fUd);
                GMTrace.o(13156827004928L, 98026);
              }
            });
            GMTrace.o(13157363875840L, 98030);
          }
          
          public final String toString()
          {
            GMTrace.i(13157498093568L, 98031);
            String str = super.toString() + "|onGYNetEnd1";
            GMTrace.o(13157498093568L, 98031);
            return str;
          }
        });
        GMTrace.o(13163537891328L, 98076);
        return;
      }
      if ((paramInt2 == 4) && (paramInt3 == 65319))
      {
        this.fUd.a(paramInt2, paramInt3, paramString, this);
        com.tencent.mm.plugin.report.d.oqe.a(148L, 47L, 1L, false);
        GMTrace.o(13163537891328L, 98076);
        return;
      }
      if ((paramInt2 == 4) && (paramInt3 == 65318))
      {
        this.fUd.a(paramInt2, paramInt3, paramString, this);
        com.tencent.mm.plugin.report.d.oqe.a(148L, 53L, 1L, false);
        GMTrace.o(13163537891328L, 98076);
        return;
      }
      w.w("MicroMsg.NetSceneManualAuth", "summerauth Failed. callback and return now ! [%d ,%d ,%s]", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(paramInt2), paramString });
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      com.tencent.mm.plugin.report.d.oqe.a(148L, 6L, 1L, false);
      GMTrace.o(13163537891328L, 98076);
      return;
    }
    if ((paramInt1 & 0x2) != 0)
    {
      ap localap = localbki.uVd;
      if ((localap == null) || (bg.nm(localap.jhi)))
      {
        w.w("MicroMsg.NetSceneManualAuth", "summerauth UserName is null and return false!");
        this.fUd.a(4, -1, "", this);
        GMTrace.o(13163537891328L, 98076);
      }
    }
    else
    {
      w.w("MicroMsg.NetSceneManualAuth", "summerauth acct resp is null and return false!");
      this.fUd.a(4, -1, "", this);
      GMTrace.o(13163537891328L, 98076);
      return;
    }
    if (au.b(paramq) == 2)
    {
      com.tencent.mm.plugin.report.d.oqe.a(148L, 7L, 1L, false);
      w.d("MicroMsg.NetSceneManualAuth", "summerauth decode faild loginDecodeFailedTry:%d", new Object[] { Integer.valueOf(this.gUE) });
      this.gUE += 1;
      if (this.gUE > 1)
      {
        this.fUd.a(4, -1, "", this);
        GMTrace.o(13163537891328L, 98076);
        return;
      }
      ((i.d)this.gud.DC()).tJZ.uCj.tSu.tTw = 1;
      a(this.gtW, this.fUd);
      GMTrace.o(13163537891328L, 98076);
      return;
    }
    w.d("MicroMsg.NetSceneManualAuth", "summerauth decode succeed!");
    h.xB().bQf();
    w.d("MicroMsg.NetSceneManualAuth", "summerauth dkidc setAccUin Begin thread:[%s,%d]", new Object[] { Thread.currentThread().getName(), Integer.valueOf(Process.getThreadPriority(Process.myTid())) });
    y.a(locale.tKc, false);
    ((PluginAuth)h.j(PluginAuth.class)).getHandleAuthResponseCallbacks().a(paramArrayOfByte, locale, false);
    if (this.gUC) {
      h.xy().xh().set(2, paramArrayOfByte.tJZ.uCi.jhi);
    }
    h.xx().fYr.a(new bf(new bf.a()
    {
      public final void a(com.tencent.mm.network.e paramAnonymouse)
      {
        GMTrace.i(13159779794944L, 98048);
        if ((paramAnonymouse == null) || (paramAnonymouse.DY() == null) || (locale.hge == null) || (locale.tKc == null) || (locale.tKc.uVc == null))
        {
          com.tencent.mm.plugin.report.d.oqe.a(148L, 8L, 1L, false);
          w.e("MicroMsg.NetSceneManualAuth", "[arthurdan.NetSceneManualAuthCrash] fatal error dispatcher == null || null == dispatcher.getAccInfo() || null == resp.getSession() || null == resp.rImpl || null == resp.rImpl.AuthSectResp !!!");
          GMTrace.o(13159779794944L, 98048);
          return;
        }
        w.d("MicroMsg.NetSceneManualAuth", "summerauth NetSceneLocalProxy setSessionInfo session:%s, uin:%d", new Object[] { bg.SJ(bg.bp(locale.hge)), Integer.valueOf(locale.tKc.uVc.kAW) });
        paramAnonymouse.DY().i(locale.hge, locale.tKc.uVc.kAW);
        GMTrace.o(13159779794944L, 98048);
      }
    }), 0);
    if (bg.e((Integer)h.xy().xh().get(15, null)) != 0) {
      ((com.tencent.mm.plugin.zero.b.b)h.h(com.tencent.mm.plugin.zero.b.b.class)).JF().gE(10);
    }
    paramInt1 = localbki.uVc.tSp;
    if ((paramInt1 & 0x8) == 0)
    {
      paramq = com.tencent.mm.y.q.zE();
      if (!TextUtils.isEmpty(paramq))
      {
        paramq = new r(paramq);
        h.xx().fYr.a(paramq, 0);
      }
      paramInt1 = 4;
      if ((paramArrayOfByte.tJZ.uCj.tSu.tTt == null) || (paramArrayOfByte.tJZ.uCj.tSu.tTt.uNN <= 0)) {
        break label1353;
      }
      paramInt1 = 1;
      label1122:
      com.tencent.mm.plugin.report.b.d.p(1, paramInt1, paramArrayOfByte.tJZ.uCi.jhi);
      if ((paramInt2 == 0) && (paramInt3 == 0))
      {
        paramq = ((i.e)this.guL.AZ()).tKc.uVc.tSl;
        if ((paramq == null) || (paramq.uPQ == null) || (paramq.uPQ.size() <= 0)) {
          break label1373;
        }
        paramq = paramq.uPQ.iterator();
        do
        {
          if (!paramq.hasNext()) {
            break;
          }
          paramArrayOfByte = (bhs)paramq.next();
        } while (paramArrayOfByte.oqG != 1);
      }
    }
    label1353:
    label1373:
    for (paramInt1 = bg.getInt(paramArrayOfByte.uTC, 0);; paramInt1 = 0)
    {
      com.tencent.mm.plugin.c.b.hI(paramInt1);
      w.i("MicroMsg.NetSceneManualAuth", "publishManualAuthEvent");
      paramq = new jd();
      paramq.eMD.eAO = true;
      com.tencent.mm.sdk.b.a.vgX.m(paramq);
      h.xB().bQh();
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(13163537891328L, 98076);
      return;
      w.i("MicroMsg.NetSceneManualAuth", "summerauth not need getProfile authResultFlag:%d", new Object[] { Integer.valueOf(paramInt1) });
      com.tencent.mm.plugin.report.d.oqe.a(148L, 9L, 1L, false);
      break;
      if (paramArrayOfByte.tJZ.uCj.uCh != 1) {
        break label1122;
      }
      paramInt1 = 2;
      break label1122;
    }
  }
  
  protected final void a(k.a parama)
  {
    GMTrace.i(13163269455872L, 98074);
    GMTrace.o(13163269455872L, 98074);
  }
  
  public final int getType()
  {
    GMTrace.i(13162866802688L, 98071);
    GMTrace.o(13162866802688L, 98071);
    return 701;
  }
  
  public final void lp(String paramString)
  {
    GMTrace.i(13162732584960L, 98070);
    i.d locald = (i.d)this.guL.DC();
    locald.tJZ.uCi.tUR = paramString;
    locald.tJZ.uCi.tVd = paramString;
    locald.tJZ.uCj.tSu.tTt = new azp().be(new byte[0]);
    this.gUz = paramString;
    this.gUA = paramString;
    GMTrace.o(13162732584960L, 98070);
  }
  
  protected final int vB()
  {
    GMTrace.i(13163001020416L, 98072);
    GMTrace.o(13163001020416L, 98072);
    return 5;
  }
  
  public static final class a
  {
    public String eEU;
    public String eLQ;
    public String gUJ;
    public Bundle gUK;
    public int type;
    public String username;
    
    public a()
    {
      GMTrace.i(13160987754496L, 98057);
      GMTrace.o(13160987754496L, 98057);
    }
    
    public final String toString()
    {
      GMTrace.i(13161121972224L, 98058);
      String str = String.format("AuthBioInfo hash[%d], type[%d]. username[%s], ticket[%s], helpUrlp[%s], wording[%s], extra[%s]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(this.type), this.username, bg.SJ(this.eEU), this.gUJ, this.eLQ, this.gUK });
      GMTrace.o(13161121972224L, 98058);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsimple\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */