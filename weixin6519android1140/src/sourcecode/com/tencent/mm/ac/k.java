package com.tencent.mm.ac;

import android.content.ContentValues;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.protocal.c.aap;
import com.tencent.mm.protocal.c.aaq;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.x;
import java.io.IOException;
import java.io.OutputStream;

final class k
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private String gsE;
  private int gsI;
  private String gsK;
  private int gta;
  private OutputStream gtb;
  private String gtc;
  private String username;
  
  public k(String paramString)
  {
    GMTrace.i(384533790720L, 2865);
    this.gtb = null;
    this.username = paramString;
    if (x.fw(paramString)) {
      this.username = x.Tt(paramString);
    }
    w.i("MicroMsg.NetSceneGetHDHeadImg", "init Headimage in_username:" + paramString + " out_username" + this.username);
    this.gsI = 480;
    this.gta = 480;
    this.gsK = "jpg";
    GMTrace.o(384533790720L, 2865);
  }
  
  private void Dr()
  {
    GMTrace.i(385741750272L, 2874);
    try
    {
      if (this.gtb != null)
      {
        this.gtb.flush();
        this.gtb.close();
        this.gtb = null;
      }
      GMTrace.o(385741750272L, 2874);
      return;
    }
    catch (IOException localIOException)
    {
      w.e("MicroMsg.NetSceneGetHDHeadImg", "exception:%s", new Object[] { bg.f(localIOException) });
      GMTrace.o(385741750272L, 2874);
    }
  }
  
  public static void U(String paramString1, String paramString2)
  {
    GMTrace.i(385204879360L, 2870);
    n.Dh().T(paramString1, paramString2);
    GMTrace.o(385204879360L, 2870);
  }
  
  private int z(byte[] paramArrayOfByte)
  {
    GMTrace.i(385607532544L, 2873);
    try
    {
      if (this.gtb == null) {
        this.gtb = FileOp.hA(this.gtc);
      }
      this.gtb.write(paramArrayOfByte);
      int i = paramArrayOfByte.length;
      GMTrace.o(385607532544L, 2873);
      return i;
    }
    catch (IOException paramArrayOfByte)
    {
      w.e("MicroMsg.NetSceneGetHDHeadImg", "exception:%s", new Object[] { bg.f(paramArrayOfByte) });
      GMTrace.o(385607532544L, 2873);
    }
    return -1;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(384668008448L, 2866);
    this.fUd = parame1;
    if ((this.username == null) || (this.username.length() == 0))
    {
      w.e("MicroMsg.NetSceneGetHDHeadImg", "username is null");
      GMTrace.o(384668008448L, 2866);
      return -1;
    }
    if (this.username.endsWith("@qqim"))
    {
      w.e("MicroMsg.NetSceneGetHDHeadImg", "never try get qq user hd.");
      GMTrace.o(384668008448L, 2866);
      return -1;
    }
    Object localObject1 = n.Du();
    n.Dh();
    this.gsE = d.t(this.username, true);
    if (FileOp.aZ(this.gsE))
    {
      w.i("MicroMsg.NetSceneGetHDHeadImg", "The HDAvatar of " + this.username + " is already exists");
      GMTrace.o(384668008448L, 2866);
      return 0;
    }
    this.gtc = (this.gsE + ".tmp");
    parame1 = ((g)localObject1).jdMethod_if(this.username);
    Object localObject2;
    if (parame1 == null)
    {
      FileOp.deleteFile(this.gtc);
      parame1 = new f();
      parame1.username = this.username;
      parame1.gsK = this.gsK;
      parame1.gsI = this.gsI;
      parame1.gsJ = this.gta;
      parame1.eQl = -1;
      localObject2 = parame1.qL();
      ((g)localObject1).goN.insert("hdheadimginfo", "username", (ContentValues)localObject2);
      localObject1 = new b.a();
      ((b.a)localObject1).gtF = new aap();
      ((b.a)localObject1).gtG = new aaq();
      ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/gethdheadimg";
      ((b.a)localObject1).gtE = 158;
      ((b.a)localObject1).gtH = 47;
      ((b.a)localObject1).gtI = 1000000047;
      localObject1 = ((b.a)localObject1).DA();
      localObject2 = (aap)((com.tencent.mm.ad.b)localObject1).gtC.gtK;
      if (x.fw(this.username)) {
        break label644;
      }
      ((aap)localObject2).jhi = this.username;
      ((aap)localObject2).uro = 1;
    }
    for (;;)
    {
      w.d("MicroMsg.NetSceneGetHDHeadImg", "inUser:" + this.username + " outUser:" + ((aap)localObject2).jhi + " outType:" + ((aap)localObject2).uro);
      ((aap)localObject2).urk = this.gsI;
      ((aap)localObject2).urm = this.gta;
      ((aap)localObject2).urn = this.gsK;
      ((aap)localObject2).tRC = parame1.gsL;
      ((aap)localObject2).tRD = parame1.gsM;
      int i = a(parame, (com.tencent.mm.network.q)localObject1, this);
      GMTrace.o(384668008448L, 2866);
      return i;
      localObject2 = this.gtc;
      if ((parame1 == null) || (localObject2 == null) || (((String)localObject2).length() == 0)) {
        i = 0;
      }
      for (;;)
      {
        if (i == 0)
        {
          FileOp.deleteFile(this.gtc);
          parame1.reset();
          parame1.username = this.username;
          parame1.gsK = this.gsK;
          parame1.gsI = this.gsI;
          parame1.gsJ = this.gta;
          ((g)localObject1).a(this.username, parame1);
        }
        break;
        if ((!parame1.Dm().equals(this.gsK)) || (parame1.gsI != this.gsI) || (parame1.gsJ != this.gta)) {
          i = 0;
        } else if (FileOp.kX((String)localObject2) == parame1.gsM) {
          i = 1;
        } else {
          i = 0;
        }
      }
      label644:
      if (this.username.equals(com.tencent.mm.y.q.zE() + "@bottle"))
      {
        ((aap)localObject2).jhi = com.tencent.mm.y.q.zE();
        ((aap)localObject2).uro = 2;
      }
      else
      {
        ((aap)localObject2).jhi = this.username;
        ((aap)localObject2).uro = 2;
      }
    }
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    GMTrace.i(384802226176L, 2867);
    if ((this.username == null) || (this.username.length() == 0))
    {
      i = k.b.gun;
      GMTrace.o(384802226176L, 2867);
      return i;
    }
    int i = k.b.gum;
    GMTrace.o(384802226176L, 2867);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(385070661632L, 2869);
    paramArrayOfByte = (aaq)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    w.d("MicroMsg.NetSceneGetHDHeadImg", "errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 4) && (paramInt3 != 0))
    {
      w.e("MicroMsg.NetSceneGetHDHeadImg", "errType:" + paramInt2 + " errCode:" + paramInt3);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      Dr();
      GMTrace.o(385070661632L, 2869);
      return;
    }
    if ((paramInt2 == 4) || (paramInt2 == 5))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      w.e("MicroMsg.NetSceneGetHDHeadImg", "ErrType:" + paramInt2);
      Dr();
      GMTrace.o(385070661632L, 2869);
      return;
    }
    paramInt1 = paramq.AZ().tKs;
    if ((paramInt1 == -4) || (paramInt1 == -54) || (paramInt1 == -55)) {
      w.e("MicroMsg.NetSceneGetHDHeadImg", "retcode == " + paramInt1);
    }
    for (paramInt1 = 1; paramInt1 != 0; paramInt1 = 0)
    {
      w.e("MicroMsg.NetSceneGetHDHeadImg", "handleCertainError");
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      Dr();
      GMTrace.o(385070661632L, 2869);
      return;
    }
    int i = -1;
    paramInt1 = i;
    if (paramArrayOfByte.ues != null)
    {
      paramInt1 = i;
      if (paramArrayOfByte.ues.uNP != null) {
        paramInt1 = z(paramArrayOfByte.ues.uNP.tJp);
      }
    }
    if (paramInt1 < 0)
    {
      w.e("MicroMsg.NetSceneGetHDHeadImg", "appendBuf fail");
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      Dr();
      GMTrace.o(385070661632L, 2869);
      return;
    }
    paramq = n.Du();
    f localf = paramq.jdMethod_if(this.username);
    localf.gsM = (paramInt1 + paramArrayOfByte.tRD);
    localf.gsL = paramArrayOfByte.tRC;
    paramq.a(this.username, localf);
    if (localf.gsM >= localf.gsL) {}
    for (paramInt1 = 1; paramInt1 == 0; paramInt1 = 0)
    {
      w.i("MicroMsg.NetSceneGetHDHeadImg", "%d doScene again info[%s %d %d]", new Object[] { Integer.valueOf(hashCode()), this.username, Integer.valueOf(localf.gsM), Integer.valueOf(localf.gsL) });
      if (a(this.gtW, this.fUd) < 0) {
        this.fUd.a(3, -1, "", this);
      }
      GMTrace.o(385070661632L, 2869);
      return;
    }
    FileOp.al(this.gtc, this.gsE);
    U(this.gsE, this.username);
    Dr();
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(385070661632L, 2869);
  }
  
  protected final void cancel()
  {
    GMTrace.i(385339097088L, 2871);
    super.cancel();
    Dr();
    GMTrace.o(385339097088L, 2871);
  }
  
  public final int getType()
  {
    GMTrace.i(385473314816L, 2872);
    GMTrace.o(385473314816L, 2872);
    return 158;
  }
  
  protected final int vB()
  {
    GMTrace.i(384936443904L, 2868);
    GMTrace.o(384936443904L, 2868);
    return 10;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ac\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */