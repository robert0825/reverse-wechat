package com.tencent.mm.modelsimple;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.n;
import com.tencent.mm.ad.i;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.protocal.o.a;
import com.tencent.mm.protocal.o.b;
import com.tencent.mm.sdk.platformtools.w;
import java.util.List;
import junit.framework.Assert;

public final class j
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public byte[] content;
  private com.tencent.mm.ad.e fUd;
  public String gTN;
  private q guL;
  
  public j(k.e parame)
  {
    GMTrace.i(1344190545920L, 10015);
    this.gTN = "";
    parame = (o.b)parame;
    this.gTN = parame.gTN;
    this.content = parame.content;
    GMTrace.o(1344190545920L, 10015);
  }
  
  public j(List<String> paramList, byte[] paramArrayOfByte)
  {
    GMTrace.i(1344056328192L, 10014);
    this.gTN = "";
    if ((paramList.size() > 0) && (paramArrayOfByte != null)) {}
    int j;
    String str;
    for (boolean bool1 = true;; bool1 = false)
    {
      Assert.assertTrue(bool1);
      j = (int)(System.currentTimeMillis() / 1000L);
      str = (String)paramList.get(0);
      int i = 1;
      while (i < paramList.size())
      {
        str = str + "," + ((String)paramList.get(i)).trim();
        i += 1;
      }
    }
    this.guL = new a();
    paramList = (o.a)this.guL.DC();
    paramList.eHJ = 111;
    paramList.eQl = 0;
    paramList.gVC = j;
    if (str != null)
    {
      bool1 = true;
      Assert.assertTrue(bool1);
      paramList.tKD = str;
      if (paramArrayOfByte == null) {
        break label287;
      }
    }
    label287:
    for (bool1 = bool2;; bool1 = false)
    {
      Assert.assertTrue(bool1);
      paramList.tKE = paramArrayOfByte;
      w.d("MicroMsg.NetSceneDirectSend", "NetSceneDirectSend: cmdId=111" + " seq=" + j);
      w.d("MicroMsg.NetSceneDirectSend", "NetSceneDirectSend: lstReceiver=" + str + " status = " + n.c(paramArrayOfByte, 0));
      GMTrace.o(1344056328192L, 10014);
      return;
      bool1 = false;
      break;
    }
  }
  
  public final boolean DE()
  {
    GMTrace.i(1344593199104L, 10018);
    GMTrace.o(1344593199104L, 10018);
    return true;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1344324763648L, 10016);
    this.fUd = parame1;
    int i = a(parame, this.guL, this);
    GMTrace.o(1344324763648L, 10016);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(1344727416832L, 10019);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(1344727416832L, 10019);
  }
  
  public final int getType()
  {
    GMTrace.i(1344458981376L, 10017);
    GMTrace.o(1344458981376L, 10017);
    return 10;
  }
  
  public static final class a
    extends i
  {
    private final o.a gTO;
    private final o.b gTP;
    
    public a()
    {
      GMTrace.i(1351438303232L, 10069);
      this.gTO = new o.a();
      this.gTP = new o.b();
      GMTrace.o(1351438303232L, 10069);
    }
    
    protected final k.d AY()
    {
      GMTrace.i(1351572520960L, 10070);
      o.a locala = this.gTO;
      GMTrace.o(1351572520960L, 10070);
      return locala;
    }
    
    public final k.e AZ()
    {
      GMTrace.i(1351706738688L, 10071);
      o.b localb = this.gTP;
      GMTrace.o(1351706738688L, 10071);
      return localb;
    }
    
    public final int getType()
    {
      GMTrace.i(1351840956416L, 10072);
      GMTrace.o(1351840956416L, 10072);
      return 10;
    }
    
    public final String getUri()
    {
      GMTrace.i(1351975174144L, 10073);
      GMTrace.o(1351975174144L, 10073);
      return null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsimple\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */