package com.tencent.mm.plugin.sns.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class au
  extends e<m>
{
  private boolean eHl;
  List<m> ePZ;
  private String kNA;
  private int pNX;
  private int pNY;
  private Comparator<m> pqK;
  private boolean qeP;
  private b qeQ;
  private a qeR;
  private String userName;
  
  public au(b paramb, String paramString, boolean paramBoolean)
  {
    GMTrace.i(8345926762496L, 62182);
    this.userName = "";
    this.ePZ = new ArrayList();
    this.eHl = false;
    this.pNX = 0;
    this.pNY = 0;
    this.kNA = "";
    this.qeP = false;
    this.pqK = new Comparator() {};
    this.qeQ = paramb;
    this.userName = paramString;
    this.eHl = paramBoolean;
    GMTrace.o(8345926762496L, 62182);
  }
  
  private void b(boolean paramBoolean, List<m> paramList)
  {
    GMTrace.i(8346732068864L, 62188);
    this.qeR = new a();
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    HashMap localHashMap3 = new HashMap();
    long l = System.currentTimeMillis();
    Object localObject;
    if ((paramBoolean) && (this.eHl))
    {
      localObject = new m((byte)0);
      ((m)localObject).field_snsId = 0L;
      ((m)localObject).pMe = -1;
      ((m)localObject).gl((int)(System.currentTimeMillis() / 1000L));
      paramList.add(0, localObject);
    }
    int i3 = paramList.size();
    w.d("MicroMsg.SnsSelfHelper", "initFixType " + i3);
    int i1 = 0;
    int j = 0;
    int n = 0;
    int m = 0;
    if (n < i3)
    {
      localObject = this.qeR;
      ((a)localObject).qeU = -1;
      ((a)localObject).qfe = -1;
      ((a)localObject).qeT = -1;
      ((a)localObject).qeY = "";
      ((a)localObject).qeZ = "";
      ((a)localObject).qfa = "";
      ((a)localObject).qfd = false;
      ((a)localObject).qeV = false;
      ((a)localObject).qff = false;
      ((a)localObject).qfg = -1;
      ((a)localObject).qeW = -1;
      ((a)localObject).qfb = -1;
      ((a)localObject).qfc = 0;
      ((a)localObject).qeX = 0;
      ((a)localObject).qfh = 0;
      int i;
      label269:
      int i2;
      if ((this.eHl) && (n == 0))
      {
        i = 1;
        localHashMap1.put(Integer.valueOf(m), Integer.valueOf(j));
        localHashMap2.put(Integer.valueOf(m), Integer.valueOf(i));
        i2 = j + i;
        localHashMap3.put(Integer.valueOf(m), Integer.valueOf(i1));
        if ((!this.eHl) || (n != 0)) {
          break label1043;
        }
        j = 0;
      }
      for (;;)
      {
        i1 += j;
        n += i;
        m += 1;
        j = i2;
        break;
        biz localbiz;
        if (n + 1 < i3)
        {
          localObject = (m)paramList.get(n + 1);
          this.qeR.qeU = ((m)localObject).field_head;
          localbiz = ((m)localObject).blD();
          this.qeR.qeY = localbiz.uTZ;
          this.qeR.qeV = ai.F(((m)localObject).field_localPrivate, this.eHl);
          this.qeR.qeW = ((m)localObject).field_type;
          if (localbiz.uUc != null) {
            this.qeR.qeX = localbiz.uUc.ueW.size();
          }
        }
        else
        {
          label481:
          if (n + 2 < i3)
          {
            localObject = (m)paramList.get(n + 2);
            this.qeR.qfe = ((m)localObject).field_head;
            localbiz = ((m)localObject).blD();
            this.qeR.qeZ = localbiz.uTZ;
            this.qeR.qff = ai.F(((m)localObject).field_localPrivate, this.eHl);
            this.qeR.qfg = ((m)localObject).field_type;
            if (localbiz.uUc == null) {
              break label731;
            }
            this.qeR.qfh = localbiz.uUc.ueW.size();
          }
          label593:
          localObject = (m)paramList.get(n);
          this.qeR.qeT = ((m)localObject).field_head;
          localbiz = ((m)localObject).blD();
          this.qeR.qfa = localbiz.uTZ;
          this.qeR.qfb = ((m)localObject).field_type;
          this.qeR.qfd = ai.F(((m)localObject).field_localPrivate, this.eHl);
          if (localbiz.uUc == null) {
            break label742;
          }
          this.qeR.qfc = localbiz.uUc.ueW.size();
          label694:
          localObject = this.qeR;
          if (((a)localObject).qfb != 2) {
            break label753;
          }
          i = 1;
        }
        for (;;)
        {
          if (i == 0) {
            break label915;
          }
          i = 1;
          break;
          this.qeR.qeX = 0;
          break label481;
          label731:
          this.qeR.qfh = 0;
          break label593;
          label742:
          this.qeR.qfc = 0;
          break label694;
          label753:
          if (((a)localObject).qeU == -1) {
            i = 1;
          } else if (((a)localObject).qfb != ((a)localObject).qeW) {
            i = 1;
          } else if (a.vv(((a)localObject).qfb)) {
            i = 1;
          } else if (a.vv(((a)localObject).qeW)) {
            i = 1;
          } else if ((((a)localObject).qfc > 1) || (((a)localObject).qeX > 1)) {
            i = 1;
          } else if ((((a)localObject).qfa != null) && (!((a)localObject).qfa.equals(""))) {
            i = 1;
          } else if ((((a)localObject).qeY != null) && (!((a)localObject).qeY.equals(""))) {
            i = 1;
          } else if (((a)localObject).qeT != ((a)localObject).qeU) {
            i = 1;
          } else {
            i = 0;
          }
        }
        label915:
        localObject = this.qeR;
        if (((a)localObject).qfe == -1) {
          i = 1;
        }
        for (;;)
        {
          if (i == 0) {
            break label1038;
          }
          i = 2;
          break;
          if (((a)localObject).qeW != ((a)localObject).qfg) {
            i = 1;
          } else if (a.vv(((a)localObject).qfg)) {
            i = 1;
          } else if (((a)localObject).qfh > 1) {
            i = 1;
          } else if ((((a)localObject).qeZ != null) && (!((a)localObject).qeZ.equals(""))) {
            i = 1;
          } else if (((a)localObject).qeU != ((a)localObject).qfe) {
            i = 1;
          } else {
            i = 0;
          }
        }
        label1038:
        i = 3;
        break label269;
        label1043:
        int k = 0;
        j = k;
        if (i > 0)
        {
          j = k;
          if (this.qeR.qfb == 1) {
            j = 1;
          }
        }
        k = j;
        if (i >= 2)
        {
          k = j;
          if (this.qeR.qeW == 1) {
            k = j + 1;
          }
        }
        j = k;
        if (i >= 3)
        {
          j = k;
          if (this.qeR.qfg == 1) {
            j = k + 1;
          }
        }
      }
    }
    this.pNX = m;
    this.pNY = paramList.size();
    w.d("MicroMsg.SnsSelfHelper", "icount " + this.pNX);
    this.ePZ = paramList;
    i.U("SnsphotoAdapter initFixType ", l);
    this.qeQ.a(this.ePZ, localHashMap1, localHashMap2, localHashMap3, this.pNY, this.pNX);
    GMTrace.o(8346732068864L, 62188);
  }
  
  public final void bC(List<m> paramList)
  {
    GMTrace.i(8346060980224L, 62183);
    if (this.qeQ != null)
    {
      if (paramList != null) {
        b(true, paramList);
      }
      this.qeQ.bpq();
    }
    GMTrace.o(8346060980224L, 62183);
  }
  
  public final List<m> bmC()
  {
    GMTrace.i(8346195197952L, 62184);
    List localList = ai.a(this.userName, this.eHl, this.kNA, this.qeP);
    w.i("MicroMsg.SnsSelfHelper", "loadData thread: %d count: %d", new Object[] { Long.valueOf(Thread.currentThread().getId()), Integer.valueOf(localList.size()) });
    GMTrace.o(8346195197952L, 62184);
    return localList;
  }
  
  public final void bpr()
  {
    GMTrace.i(8346329415680L, 62185);
    Collections.sort(this.ePZ, this.pqK);
    GMTrace.o(8346329415680L, 62185);
  }
  
  final void bps()
  {
    GMTrace.i(8346463633408L, 62186);
    b(false, this.ePZ);
    GMTrace.o(8346463633408L, 62186);
  }
  
  public final void e(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(8346597851136L, 62187);
    w.d("MicroMsg.SnsSelfHelper", "limitSeq " + paramString);
    this.kNA = paramString;
    this.qeP = paramBoolean1;
    fL(paramBoolean2);
    GMTrace.o(8346597851136L, 62187);
  }
  
  final class a
  {
    public int qeT;
    public int qeU;
    public boolean qeV;
    public int qeW;
    public int qeX;
    public String qeY;
    public String qeZ;
    public String qfa;
    public int qfb;
    public int qfc;
    public boolean qfd;
    public int qfe;
    public boolean qff;
    public int qfg;
    public int qfh;
    
    a()
    {
      GMTrace.i(8505645858816L, 63372);
      this.qeT = -1;
      this.qeU = -1;
      this.qeV = false;
      this.qeW = -1;
      this.qeX = 0;
      this.qeY = "";
      this.qeZ = "";
      this.qfa = "";
      this.qfb = -1;
      this.qfc = 0;
      this.qfd = false;
      this.qfe = -1;
      this.qff = false;
      this.qfg = -1;
      this.qfh = 0;
      GMTrace.o(8505645858816L, 63372);
    }
    
    public static boolean vv(int paramInt)
    {
      GMTrace.i(8505780076544L, 63373);
      switch (paramInt)
      {
      default: 
        GMTrace.o(8505780076544L, 63373);
        return false;
      }
      GMTrace.o(8505780076544L, 63373);
      return true;
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(List<m> paramList, Map<Integer, Integer> paramMap1, Map<Integer, Integer> paramMap2, Map<Integer, Integer> paramMap3, int paramInt1, int paramInt2);
    
    public abstract void bpq();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */