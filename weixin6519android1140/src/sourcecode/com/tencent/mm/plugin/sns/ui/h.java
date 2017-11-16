package com.tencent.mm.plugin.sns.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.g.a;
import com.tencent.mm.protocal.c.agq;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.cc;
import com.tencent.mm.protocal.c.do;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class h
  extends e<anu>
{
  private List<anu> ePZ;
  private String mwK;
  private int pNX;
  private int pNY;
  private do pOo;
  private cc pOp;
  private a pOq;
  private String path;
  
  public h(a parama)
  {
    GMTrace.i(8396526845952L, 62559);
    this.ePZ = new ArrayList();
    this.pNX = 0;
    this.pNY = 0;
    this.mwK = "";
    this.path = "";
    this.pOq = parama;
    GMTrace.o(8396526845952L, 62559);
  }
  
  public final void bC(List<anu> paramList)
  {
    GMTrace.i(8396661063680L, 62560);
    if (this.pOq != null)
    {
      if (paramList != null)
      {
        HashMap localHashMap1 = new HashMap();
        HashMap localHashMap2 = new HashMap();
        localHashMap1.clear();
        localHashMap2.clear();
        int n = paramList.size();
        w.d("MicroMsg.ArtistAdapterHelper", "initFixType " + n);
        int j = 0;
        int k = 0;
        int m = 0;
        if (j < n)
        {
          String str = ((anu)paramList.get(j)).lPj;
          int i;
          if (j + 1 < n)
          {
            if (str.equals(((anu)paramList.get(j + 1)).lPj)) {
              break label202;
            }
            i = 1;
          }
          for (;;)
          {
            localHashMap1.put(Integer.valueOf(k), Integer.valueOf(m));
            localHashMap2.put(Integer.valueOf(k), Integer.valueOf(i));
            m += i;
            k += 1;
            j = i + j;
            break;
            i = 1;
            continue;
            label202:
            if (j + 2 < n)
            {
              if (!str.equals(((anu)paramList.get(j + 2)).lPj)) {
                i = 2;
              }
            }
            else
            {
              i = 2;
              continue;
            }
            i = 3;
          }
        }
        this.pNX = (k + 1);
        this.pNY = paramList.size();
        w.d("MicroMsg.ArtistAdapterHelper", "icount " + this.pNX);
        this.ePZ = paramList;
        this.pOq.a(this.ePZ, localHashMap1, localHashMap2, this.pNY, this.pNX, this.pOo);
        GMTrace.o(8396661063680L, 62560);
        return;
      }
      this.pOq.bmD();
    }
    GMTrace.o(8396661063680L, 62560);
  }
  
  public final List<anu> bmC()
  {
    GMTrace.i(8396795281408L, 62561);
    ArrayList localArrayList = new ArrayList();
    try
    {
      localArrayList.clear();
      this.pOp = null;
      Object localObject1 = this.path + this.mwK + "_ARTISTF.mm";
      Object localObject2;
      if (FileOp.aZ((String)localObject1))
      {
        localObject2 = FileOp.c((String)localObject1, 0, -1);
        this.pOp = ((cc)new cc().aD((byte[])localObject2));
      }
      if (this.pOp == null)
      {
        localObject2 = this.path + this.mwK + "_ARTIST.mm";
        this.pOp = a.HZ(new String(FileOp.c((String)localObject2, 0, (int)FileOp.kX((String)localObject2))));
        if (this.pOp == null)
        {
          FileOp.deleteFile((String)localObject2);
          GMTrace.o(8396795281408L, 62561);
          return null;
        }
        FileOp.deleteFile((String)localObject1);
        FileOp.j((String)localObject1, this.pOp.toByteArray());
      }
      localObject1 = this.pOp;
      if (localObject1 == null)
      {
        GMTrace.o(8396795281408L, 62561);
        return null;
      }
      localObject1 = this.pOp.tQs.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject3 = (agq)((Iterator)localObject1).next();
        localObject2 = ((agq)localObject3).lPi;
        localObject3 = ((agq)localObject3).ueW.iterator();
        while (((Iterator)localObject3).hasNext())
        {
          anu localanu = (anu)((Iterator)localObject3).next();
          localanu.lPj = ((String)localObject2);
          localArrayList.add(localanu);
        }
      }
      this.pOo = this.pOp.tQr;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.ArtistAdapterHelper", localException, "loadData failed.", new Object[0]);
      GMTrace.o(8396795281408L, 62561);
      return null;
    }
    GMTrace.o(8396795281408L, 62561);
    return localException;
  }
  
  public final void dQ(String paramString1, String paramString2)
  {
    GMTrace.i(8396929499136L, 62562);
    this.mwK = paramString1;
    this.path = paramString2;
    fL(true);
    GMTrace.o(8396929499136L, 62562);
  }
  
  public static abstract interface a
  {
    public abstract void a(List<anu> paramList, Map<Integer, Integer> paramMap1, Map<Integer, Integer> paramMap2, int paramInt1, int paramInt2, do paramdo);
    
    public abstract void bmD();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */