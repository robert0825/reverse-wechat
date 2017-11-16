package com.tencent.mm.pluginsdk.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.aen;
import com.tencent.mm.protocal.c.aeo;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Iterator;
import java.util.LinkedList;

public final class l
  extends com.tencent.mm.pluginsdk.model.app.w
{
  public String tmY;
  
  public l(String paramString, LinkedList<String> paramLinkedList)
  {
    GMTrace.i(752961454080L, 5610);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneGetUserInfoInApp", "appID: %s", new Object[] { paramString });
    this.tmY = paramString;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new aen();
    ((b.a)localObject).gtG = new aeo();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getuserinfoinapp";
    ((b.a)localObject).gtE = 452;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.kzP = ((b.a)localObject).DA();
    localObject = (aen)this.kzP.gtC.gtK;
    ((aen)localObject).lPg = paramString;
    paramString = new LinkedList();
    Iterator localIterator = paramLinkedList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (!bg.nm(str)) {
        paramString.add(n.ni(str));
      }
    }
    ((aen)localObject).tTO = paramString;
    ((aen)localObject).uqd = paramLinkedList.size();
    GMTrace.o(752961454080L, 5610);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(753095671808L, 5611);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneGetUserInfoInApp", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneGetUserInfoInApp", "errType = " + paramInt2 + ", errCode = " + paramInt3);
      GMTrace.o(753095671808L, 5611);
      return;
    }
    GMTrace.o(753095671808L, 5611);
  }
  
  public final byte[] aFZ()
  {
    GMTrace.i(753229889536L, 5612);
    try
    {
      byte[] arrayOfByte = ((b.b)this.kzP.DC()).Ba();
      GMTrace.o(753229889536L, 5612);
      return arrayOfByte;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneGetUserInfoInApp", localException.getMessage());
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.NetSceneGetUserInfoInApp", localException, "", new Object[0]);
      GMTrace.o(753229889536L, 5612);
    }
    return null;
  }
  
  public final void au(byte[] paramArrayOfByte)
  {
    GMTrace.i(753364107264L, 5613);
    if (paramArrayOfByte == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneGetUserInfoInApp", "buf is null");
      GMTrace.o(753364107264L, 5613);
      return;
    }
    b.c localc = this.kzP.gtD;
    try
    {
      localc.y(paramArrayOfByte);
      GMTrace.o(753364107264L, 5613);
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneGetUserInfoInApp", paramArrayOfByte.getMessage());
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.NetSceneGetUserInfoInApp", paramArrayOfByte, "", new Object[0]);
      GMTrace.o(753364107264L, 5613);
    }
  }
  
  public final int getType()
  {
    GMTrace.i(753498324992L, 5614);
    GMTrace.o(753498324992L, 5614);
    return 14;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\pluginsdk\model\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */