package c.t.m.g;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.Deflater;

public final class u
{
  private final int a = a("black_list_refresh_gap", 60000, 86400000, 3600000);
  private String b = "";
  private List<m> c = new ArrayList();
  private List<m> d = new ArrayList();
  private List<a> e = new ArrayList();
  
  public u(String paramString)
  {
    this.b = paramString;
    bz.a(paramString, "");
    aa.a().b(new v(this), this.a);
  }
  
  public static int a(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      String str2 = a(paramString, l.b());
      String str1 = str2;
      if (TextUtils.isEmpty(str2)) {
        str1 = a(paramString, 0);
      }
      i = Integer.parseInt(str1);
    }
    catch (Throwable paramString)
    {
      for (;;)
      {
        int i = paramInt3;
      }
    }
    return ce.a(i, paramInt1, paramInt2, paramInt3);
  }
  
  private static String a(String paramString, int paramInt)
  {
    String str1 = bc.a().a(o.b());
    String str2 = bz.a(o.g());
    return bv.c().d().a(paramString, paramInt, l.e(), l.a, str1, str2);
  }
  
  public static byte[] a(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      return paramArrayOfByte;
    }
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    Deflater localDeflater = new Deflater();
    localDeflater.setInput(paramArrayOfByte);
    localDeflater.finish();
    paramArrayOfByte = new byte['Ā'];
    while (!localDeflater.finished()) {
      localByteArrayOutputStream.write(paramArrayOfByte, 0, localDeflater.deflate(paramArrayOfByte));
    }
    localDeflater.finish();
    localDeflater.end();
    return localByteArrayOutputStream.toByteArray();
  }
  
  /* Error */
  private void c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 161	java/lang/StringBuilder
    //   5: dup
    //   6: invokespecial 162	java/lang/StringBuilder:<init>	()V
    //   9: astore_1
    //   10: aload_0
    //   11: getfield 44	c/t/m/g/u:e	Ljava/util/List;
    //   14: invokeinterface 168 1 0
    //   19: astore_2
    //   20: aload_2
    //   21: invokeinterface 173 1 0
    //   26: ifeq +58 -> 84
    //   29: aload_2
    //   30: invokeinterface 177 1 0
    //   35: checkcast 6	c/t/m/g/u$a
    //   38: astore_3
    //   39: aload_1
    //   40: aload_3
    //   41: getfield 180	c/t/m/g/u$a:a	Lc/t/m/g/m;
    //   44: invokevirtual 184	c/t/m/g/m:a	()Ljava/lang/String;
    //   47: invokevirtual 188	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: ldc -66
    //   52: invokevirtual 188	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: aload_3
    //   56: getfield 193	c/t/m/g/u$a:b	J
    //   59: invokevirtual 196	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   62: ldc -58
    //   64: invokevirtual 188	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: pop
    //   68: goto -48 -> 20
    //   71: astore_1
    //   72: aload_0
    //   73: getfield 35	c/t/m/g/u:b	Ljava/lang/String;
    //   76: ldc 33
    //   78: invokestatic 49	c/t/m/g/bz:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   81: aload_0
    //   82: monitorexit
    //   83: return
    //   84: aload_0
    //   85: getfield 35	c/t/m/g/u:b	Ljava/lang/String;
    //   88: aload_1
    //   89: invokevirtual 201	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   92: invokestatic 49	c/t/m/g/bz:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   95: goto -14 -> 81
    //   98: astore_1
    //   99: aload_0
    //   100: monitorexit
    //   101: aload_1
    //   102: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	103	0	this	u
    //   9	31	1	localStringBuilder	StringBuilder
    //   71	18	1	localThrowable	Throwable
    //   98	4	1	localObject	Object
    //   19	11	2	localIterator	Iterator
    //   38	18	3	locala	a
    // Exception table:
    //   from	to	target	type
    //   2	20	71	java/lang/Throwable
    //   20	68	71	java/lang/Throwable
    //   84	95	71	java/lang/Throwable
    //   2	20	98	finally
    //   20	68	98	finally
    //   72	81	98	finally
    //   84	95	98	finally
  }
  
  final void a()
  {
    int i = 0;
    try
    {
      this.d.clear();
      this.e.clear();
      localObject1 = bz.b(this.b, "");
      boolean bool = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool) {
        break label48;
      }
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        Object localObject1;
        int j;
        int k;
        bz.a(this.b, "");
      }
    }
    finally {}
    return;
    label48:
    j = a("black_list_outofdate", 60000, 86400000, 7200000);
    localObject1 = ((String)localObject1).split(";");
    k = localObject1.length;
    for (;;)
    {
      if (i < k)
      {
        Object localObject3 = localObject1[i].split("-");
        a locala = localObject3[0];
        long l = Long.parseLong(localObject3[1]);
        if (System.currentTimeMillis() - l < j)
        {
          localObject3 = locala.split(":");
          localObject3 = new m(localObject3[0], Integer.parseInt(localObject3[1]));
          locala = new a((m)localObject3, l);
          this.d.add(localObject3);
          this.e.add(locala);
        }
      }
      else
      {
        c();
        break;
      }
      i += 1;
    }
  }
  
  public final void a(m paramm)
  {
    for (;;)
    {
      try
      {
        Iterator localIterator = this.c.iterator();
        int i;
        if (localIterator.hasNext())
        {
          if (paramm.a((m)localIterator.next()))
          {
            i = 1;
            if (i != 0)
            {
              this.d.add(paramm);
              this.e.add(new a(paramm, System.currentTimeMillis()));
              c();
              return;
            }
            this.c.add(paramm);
          }
        }
        else {
          i = 0;
        }
      }
      finally {}
    }
  }
  
  public final List<m> b()
  {
    try
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = this.d.iterator();
      while (localIterator.hasNext())
      {
        m localm = (m)localIterator.next();
        localArrayList.add(new m(localm.a, localm.b));
      }
    }
    finally {}
    return localList;
  }
  
  public final void b(m paramm)
  {
    for (;;)
    {
      try
      {
        Iterator localIterator = this.c.iterator();
        if (localIterator.hasNext())
        {
          m localm = (m)localIterator.next();
          if (!paramm.a(localm)) {
            continue;
          }
          paramm = localm;
          if (paramm != null) {
            this.c.remove(paramm);
          }
          return;
        }
      }
      finally {}
      paramm = null;
    }
  }
  
  static final class a
  {
    m a;
    long b;
    
    public a(m paramm, long paramLong)
    {
      this.a = paramm;
      this.b = paramLong;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */