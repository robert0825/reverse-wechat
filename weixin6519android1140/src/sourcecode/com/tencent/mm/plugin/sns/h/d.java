package com.tencent.mm.plugin.sns.h;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.s;
import java.util.HashMap;
import java.util.Map;

public final class d
{
  public static d pBQ;
  public s fJJ;
  public int fUO;
  public HashMap<String, Integer> pBR;
  public HashMap<String, String> pBS;
  public int pBT;
  public int pBU;
  
  static
  {
    GMTrace.i(8882529239040L, 66180);
    pBQ = new d();
    GMTrace.o(8882529239040L, 66180);
  }
  
  private d()
  {
    GMTrace.i(8882260803584L, 66178);
    this.pBT = 200;
    this.pBU = 86400;
    this.fUO = 0;
    Object localObject1 = com.tencent.mm.y.c.c.Ct().er("100077");
    if (((com.tencent.mm.storage.c)localObject1).isValid())
    {
      localObject1 = ((com.tencent.mm.storage.c)localObject1).bSg();
      this.pBT = bg.getInt((String)((Map)localObject1).get("maxCacheFeedCount"), 200);
      this.pBU = bg.getInt((String)((Map)localObject1).get("maxCacheSeconds"), 86400);
      this.fUO = bg.getInt((String)((Map)localObject1).get("needUploadData"), 0);
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SnsReportHelper", "initAbtestArg maxCacheFeedCount:%d, maxCacheSeconds:%d, needUploadData:%d", new Object[] { Integer.valueOf(this.pBT), Integer.valueOf(this.pBU), Integer.valueOf(this.fUO) });
    this.fJJ = new s(com.tencent.mm.storage.w.ghv + "snsreport.cfg");
    localObject1 = this.fJJ.get(3, new HashMap());
    Object localObject2 = this.fJJ.get(4, new HashMap());
    if ((!(localObject1 instanceof HashMap)) || (!(localObject2 instanceof HashMap)))
    {
      FileOp.deleteFile(com.tencent.mm.storage.w.ghv + "snsreport.cfg");
      this.pBR = new HashMap();
      this.pBS = new HashMap();
      GMTrace.o(8882260803584L, 66178);
      return;
    }
    this.pBR = ((HashMap)localObject1);
    this.pBS = ((HashMap)localObject2);
    GMTrace.o(8882260803584L, 66178);
  }
  
  public final void Id(String paramString)
  {
    GMTrace.i(8882395021312L, 66179);
    if (this.fUO == 0)
    {
      GMTrace.o(8882395021312L, 66179);
      return;
    }
    HashMap localHashMap = this.pBR;
    if (this.pBR.containsKey(paramString)) {}
    for (int i = ((Integer)this.pBR.get(paramString)).intValue() + 1;; i = 1)
    {
      localHashMap.put(paramString, Integer.valueOf(i));
      GMTrace.o(8882395021312L, 66179);
      return;
    }
  }
  
  public final void dK(String paramString1, String paramString2)
  {
    GMTrace.i(20844550029312L, 155304);
    if ((this.fUO == 0) || (bg.nm(paramString1)) || (bg.nm(paramString2)))
    {
      GMTrace.o(20844550029312L, 155304);
      return;
    }
    this.pBS.put(paramString1, paramString2);
    GMTrace.o(20844550029312L, 155304);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\h\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */