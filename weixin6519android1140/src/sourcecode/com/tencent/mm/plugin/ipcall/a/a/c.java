package com.tencent.mm.plugin.ipcall.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import com.tencent.mm.protocal.c.aur;
import java.util.Iterator;
import java.util.LinkedList;

public final class c
{
  public String eCQ;
  public String eTy;
  public String eVo;
  public LinkedList<aur> iYB;
  public int idN;
  public int kBk;
  public String kBl;
  public int mjF;
  public long mjG;
  public long mjH;
  public int mjI;
  public int mjJ;
  public int mjK;
  public int mjL;
  public String mjM;
  public int mjN;
  public int mjO;
  public int mjP;
  public int mjQ;
  public boolean mjR;
  public boolean mjS;
  public boolean mjT;
  public boolean mjU;
  public int mjV;
  public int mjW;
  public int mjX;
  public int mjY;
  public b mjZ;
  public int mka;
  public int mkb;
  public b mkc;
  public LinkedList<aur> mkd;
  public int mke;
  public LinkedList<d> mkf;
  public String mkg;
  public String mkh;
  public String mki;
  public int mkj;
  public boolean mkk;
  
  public c()
  {
    GMTrace.i(11617349664768L, 86556);
    this.mjR = false;
    this.mjS = false;
    this.mjT = false;
    this.mjU = true;
    this.mjV = 0;
    this.iYB = new LinkedList();
    this.mkd = new LinkedList();
    this.mke = 999;
    this.mkf = new LinkedList();
    this.mkk = false;
    GMTrace.o(11617349664768L, 86556);
  }
  
  public final int aIF()
  {
    GMTrace.i(11617483882496L, 86557);
    if ((this.mkf != null) && (this.mkf.size() > 0))
    {
      i = ((d)this.mkf.get(0)).mjO;
      GMTrace.o(11617483882496L, 86557);
      return i;
    }
    int i = this.mjO;
    GMTrace.o(11617483882496L, 86557);
    return i;
  }
  
  public final int aIG()
  {
    GMTrace.i(11617618100224L, 86558);
    if ((this.mkf != null) && (this.mkf.size() > 0))
    {
      i = ((d)this.mkf.get(0)).fYb;
      GMTrace.o(11617618100224L, 86558);
      return i;
    }
    int i = this.idN;
    GMTrace.o(11617618100224L, 86558);
    return i;
  }
  
  public final String toString()
  {
    GMTrace.i(11617752317952L, 86559);
    Object localObject1 = new StringBuilder("");
    ((StringBuilder)localObject1).append("IPCallInfo: ");
    ((StringBuilder)localObject1).append(String.format("[roomId: %d, roomKey: %d, callSeq: %d, inviteId: %d, roomMemberId: %d, syncKey: %d, syncInterval: %d, currentStatus: %d, ErrMsg: %s, ErrCode：%d, ErrLevel：%d]\n", new Object[] { Integer.valueOf(this.mjF), Long.valueOf(this.mjG), Long.valueOf(this.mjH), Integer.valueOf(this.mjI), Integer.valueOf(this.mjN), Integer.valueOf(this.mjO), Integer.valueOf(this.mjP), Integer.valueOf(this.idN), this.kBl, Integer.valueOf(this.kBk), Integer.valueOf(this.mjL) }));
    ((StringBuilder)localObject1).append(String.format("[toUsername: %s, toPhoneNumber: %s]\n", new Object[] { this.eTy, this.mkh }));
    ((StringBuilder)localObject1).append("[addrList: ");
    Iterator localIterator = this.iYB.iterator();
    Object localObject2;
    while (localIterator.hasNext())
    {
      localObject2 = (aur)localIterator.next();
      ((StringBuilder)localObject1).append(String.format("{IP: %s, port: %d}", new Object[] { ((aur)localObject2).uBe, Integer.valueOf(((aur)localObject2).uKd) }));
    }
    ((StringBuilder)localObject1).append("]");
    ((StringBuilder)localObject1).append("\n");
    if ((this.mkf != null) && (this.mkf.size() > 0))
    {
      ((StringBuilder)localObject1).append("[userInfoList: ");
      localIterator = this.mkf.iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (d)localIterator.next();
        ((StringBuilder)localObject1).append("{");
        ((StringBuilder)localObject1).append(((d)localObject2).toString());
        ((StringBuilder)localObject1).append("}");
      }
      ((StringBuilder)localObject1).append("]");
    }
    for (;;)
    {
      localObject1 = ((StringBuilder)localObject1).toString();
      GMTrace.o(11617752317952L, 86559);
      return (String)localObject1;
      ((StringBuilder)localObject1).append("userInfoList is empty");
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */