package com.tencent.mm.ad;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.storage.au;
import java.util.HashMap;

public abstract interface d
{
  public abstract b b(a parama);
  
  public abstract void h(au paramau);
  
  public static final class a
  {
    public bu gtM;
    public boolean gtN;
    public boolean gtO;
    public boolean gtP;
    
    public a(bu parambu, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
    {
      GMTrace.i(13242994786304L, 98668);
      this.gtN = false;
      this.gtO = false;
      this.gtP = false;
      this.gtM = parambu;
      this.gtN = paramBoolean1;
      this.gtO = paramBoolean2;
      this.gtP = paramBoolean3;
      GMTrace.o(13242994786304L, 98668);
    }
    
    public final String toString()
    {
      GMTrace.i(13243129004032L, 98669);
      String str = String.format("AddMsgInfo(%d), get[%b], fault[%b], up[%b]", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(this.gtN), Boolean.valueOf(this.gtO), Boolean.valueOf(this.gtP) });
      GMTrace.o(13243129004032L, 98669);
      return str;
    }
  }
  
  public static final class b
  {
    public au eAH;
    public boolean gtQ;
    
    public b(au paramau, boolean paramBoolean)
    {
      GMTrace.i(13242592133120L, 98665);
      this.eAH = paramau;
      this.gtQ = paramBoolean;
      GMTrace.o(13242592133120L, 98665);
    }
  }
  
  public static final class c
  {
    private static HashMap<Object, d> gtR;
    
    static
    {
      GMTrace.i(13242457915392L, 98664);
      gtR = new HashMap();
      GMTrace.o(13242457915392L, 98664);
    }
    
    public static void a(Object paramObject, d paramd)
    {
      GMTrace.i(13242055262208L, 98661);
      gtR.put(paramObject, paramd);
      GMTrace.o(13242055262208L, 98661);
    }
    
    public static void aE(Object paramObject)
    {
      GMTrace.i(13242189479936L, 98662);
      gtR.remove(paramObject);
      GMTrace.o(13242189479936L, 98662);
    }
    
    public static d aF(Object paramObject)
    {
      GMTrace.i(13242323697664L, 98663);
      paramObject = (d)gtR.get(paramObject);
      GMTrace.o(13242323697664L, 98663);
      return (d)paramObject;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ad\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */