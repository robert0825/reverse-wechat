package com.tencent.e;

import com.tencent.e.b.d;
import java.util.HashMap;

public final class f
{
  private static f yjE;
  private HashMap<String, g> yjF = new HashMap();
  HashMap<String, Object> yjG = new HashMap();
  private Object yjH = new Object();
  Object yjI = new Object();
  private a yjJ = new a();
  
  private boolean N(String[] paramArrayOfString)
  {
    if (paramArrayOfString != null)
    {
      int j = paramArrayOfString.length;
      int i = 0;
      while (i < j)
      {
        Object localObject2 = paramArrayOfString[i];
        if (localObject2 != null)
        {
          synchronized (this.yjH)
          {
            localObject2 = (g)this.yjF.get(localObject2);
            if (localObject2 == null) {
              return false;
            }
          }
          a((g)localObject2);
          if (((g)localObject2).mState != 32) {
            return false;
          }
          ((g)localObject2).mReferenceCount += 1;
          com.tencent.pb.common.c.c.d("reference_count", new Object[] { "addReferenceCount|", ((g)localObject2).yjN.yjX, "|refcount=", Integer.valueOf(((g)localObject2).mReferenceCount) });
        }
        i += 1;
      }
    }
    return true;
  }
  
  public static Object YN(String paramString)
  {
    return cqY().YO(paramString);
  }
  
  private Object YO(String paramString)
  {
    if (paramString == null) {
      throw new h("TpfServiceCenter|getService|service name should not be null");
    }
    synchronized (this.yjI)
    {
      ??? = this.yjG.get(paramString);
      if (??? != null) {
        return ???;
      }
    }
    g localg;
    synchronized (this.yjH)
    {
      localg = (g)this.yjF.get(paramString);
      if (localg == null) {
        return ???;
      }
      if (localg.yjN.yjZ)
      {
        return c(localg);
        paramString = finally;
        throw paramString;
      }
    }
    if (4 == localg.mState) {}
    try
    {
      a(localg);
      synchronized (this.yjI)
      {
        paramString = this.yjG.get(paramString);
        return paramString;
      }
      return ???;
    }
    catch (com.tencent.e.b.c paramString)
    {
      com.tencent.pb.common.c.c.k("service", new Object[] { paramString });
      return null;
    }
  }
  
  public static com.tencent.e.b.b a(d paramd)
  {
    return cqY().b(paramd);
  }
  
  private com.tencent.e.b.b b(d paramd)
  {
    int j = 1;
    if ((paramd == null) || (paramd.yjX == null)) {
      return null;
    }
    String str = paramd.yjX;
    this.yjJ.fG("install_", str);
    for (;;)
    {
      try
      {
        synchronized (this.yjH)
        {
          g localg = (g)this.yjF.get(str);
          if (localg == null)
          {
            localg = new g(this, paramd);
            localg.mState = 2;
            com.tencent.pb.common.c.c.d("service", new Object[] { "service [", str, "] installed!" });
            this.yjF.put(str, localg);
            i = 1;
            if (i != 0)
            {
              if (paramd.yjW == null) {
                break label258;
              }
              i = j;
              if (i != 0)
              {
                localg.mState = 4;
                com.tencent.pb.common.c.c.d("service", new Object[] { "service [", str, "] resolved!" });
              }
            }
            else
            {
              return localg;
            }
          }
          else
          {
            com.tencent.pb.common.c.c.d("service", new Object[] { "service [", str, "] had been installed!" });
            i = 0;
          }
        }
        throw new com.tencent.e.b.c("resolve service [" + str + "] failed.");
      }
      finally
      {
        this.yjJ.fH("install_", str);
      }
      label258:
      int i = 0;
    }
  }
  
  private static boolean b(g paramg)
  {
    if (!paramg.yjN.yjZ) {
      try
      {
        b localb = (b)Class.forName(paramg.yjN.yjW).newInstance();
        paramg.yjO = localb;
        a locala = new a(paramg);
        paramg.yjP = locala;
        localb.a(locala);
        return true;
      }
      catch (Exception paramg)
      {
        com.tencent.pb.common.c.c.k("service", new Object[] { paramg });
      }
    }
    return false;
  }
  
  private static Object c(g paramg)
  {
    try
    {
      c localc = (c)Class.forName(paramg.yjN.yjW).newInstance();
      paramg.yjP = new a(paramg);
      paramg.mState = 32;
      paramg = localc.cqV();
      return paramg;
    }
    catch (Exception paramg)
    {
      com.tencent.pb.common.c.c.k("service", new Object[] { paramg });
    }
    return null;
  }
  
  static f cqY()
  {
    if (yjE == null) {}
    try
    {
      if (yjE == null) {
        yjE = new f();
      }
      return yjE;
    }
    finally {}
  }
  
  final boolean a(g paramg)
  {
    int j = 0;
    d locald = paramg.yjN;
    String str = locald.yjX;
    this.yjJ.fG("service_", str);
    try
    {
      int i = paramg.mState;
      if (i == 32) {
        i = 1;
      }
      for (;;)
      {
        this.yjJ.fH("service_", str);
        if (i != 0) {
          break;
        }
        throw new com.tencent.e.b.c("startService [" + str + "] failed");
        i = j;
        if (paramg.mState == 4)
        {
          paramg.mState = 8;
          com.tencent.pb.common.c.c.d("service", new Object[] { "service [", str, "] starting..." });
          if (locald.yjY != null) {
            N(locald.yjY);
          }
          i = j;
          if (b(paramg))
          {
            paramg.mState = 32;
            com.tencent.pb.common.c.c.d("service", new Object[] { "service [", str, "] active..." });
            i = 1;
          }
        }
      }
      return true;
    }
    finally
    {
      this.yjJ.fH("service_", str);
    }
  }
  
  final class a
  {
    private final Object mLock = new Object();
    private final HashMap<String, Object> yjK = new HashMap();
    
    a() {}
    
    final void fG(String arg1, String paramString2)
    {
      String str = ??? + paramString2;
      synchronized (this.mLock)
      {
        for (;;)
        {
          Object localObject = this.yjK.get(str);
          if (localObject != null) {
            try
            {
              this.mLock.wait();
            }
            catch (InterruptedException paramString2)
            {
              throw new com.tencent.e.b.c("install fail,lock interrupted!");
            }
          }
        }
      }
      this.yjK.put(str, paramString2);
    }
    
    final void fH(String arg1, String paramString2)
    {
      paramString2 = ??? + paramString2;
      synchronized (this.mLock)
      {
        this.yjK.remove(paramString2);
        this.mLock.notifyAll();
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\e\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */