package com.tencent.mm.plugin.gif;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.f.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.emoji.PluginEmoji;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;

public class b
{
  private static b mfc;
  public com.tencent.mm.a.f<String, WeakReference<d>> mfd;
  com.tencent.mm.a.f<String, WeakReference<a>> mfe;
  
  public b()
  {
    GMTrace.i(20144067706880L, 150085);
    this.mfd = new com.tencent.mm.a.f(10);
    this.mfe = new com.tencent.mm.a.f(10, new f.b() {});
    GMTrace.o(20144067706880L, 150085);
  }
  
  /* Error */
  public static b aHd()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc2_w 48
    //   6: ldc 50
    //   8: invokestatic 26	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: getstatic 52	com/tencent/mm/plugin/gif/b:mfc	Lcom/tencent/mm/plugin/gif/b;
    //   14: ifnonnull +25 -> 39
    //   17: ldc 2
    //   19: monitorenter
    //   20: getstatic 52	com/tencent/mm/plugin/gif/b:mfc	Lcom/tencent/mm/plugin/gif/b;
    //   23: ifnonnull +13 -> 36
    //   26: new 2	com/tencent/mm/plugin/gif/b
    //   29: dup
    //   30: invokespecial 53	com/tencent/mm/plugin/gif/b:<init>	()V
    //   33: putstatic 52	com/tencent/mm/plugin/gif/b:mfc	Lcom/tencent/mm/plugin/gif/b;
    //   36: ldc 2
    //   38: monitorexit
    //   39: getstatic 52	com/tencent/mm/plugin/gif/b:mfc	Lcom/tencent/mm/plugin/gif/b;
    //   42: astore_0
    //   43: ldc2_w 48
    //   46: ldc 50
    //   48: invokestatic 44	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   51: ldc 2
    //   53: monitorexit
    //   54: aload_0
    //   55: areturn
    //   56: astore_0
    //   57: ldc 2
    //   59: monitorexit
    //   60: aload_0
    //   61: athrow
    //   62: astore_0
    //   63: ldc 2
    //   65: monitorexit
    //   66: aload_0
    //   67: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   42	13	0	localb	b
    //   56	5	0	localObject1	Object
    //   62	5	0	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   20	36	56	finally
    //   36	39	56	finally
    //   57	60	56	finally
    //   3	20	62	finally
    //   39	51	62	finally
    //   60	62	62	finally
  }
  
  public final a cx(String paramString1, String paramString2)
  {
    GMTrace.i(20144470360064L, 150088);
    a locala = null;
    if (this.mfe.get(paramString1) != null) {
      locala = (a)((WeakReference)this.mfe.get(paramString1)).get();
    }
    Object localObject = locala;
    long l;
    if (locala == null)
    {
      l = System.currentTimeMillis();
      if (!o.RI(paramString2)) {
        break label123;
      }
    }
    label123:
    for (paramString2 = new f(paramString2);; paramString2 = new c(paramString2))
    {
      w.d("MicroMsg.GIF.MMAnimateDrawableCacheMgr", "new MMAnimateDrawable use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      this.mfe.put(paramString1, new WeakReference(paramString2));
      localObject = paramString2;
      GMTrace.o(20144470360064L, 150088);
      return (a)localObject;
    }
  }
  
  public final a o(String paramString, byte[] paramArrayOfByte)
  {
    a locala = null;
    GMTrace.i(20144604577792L, 150089);
    if (paramArrayOfByte == null)
    {
      GMTrace.o(20144604577792L, 150089);
      return null;
    }
    if (this.mfe.get(paramString) != null) {
      locala = (a)((WeakReference)this.mfe.get(paramString)).get();
    }
    Object localObject = locala;
    if (locala == null) {
      if ((!o.bk(paramArrayOfByte)) || (!((PluginEmoji)h.j(PluginEmoji.class)).getEmojiMgr().aqK())) {
        break label139;
      }
    }
    label139:
    for (paramArrayOfByte = new f(paramArrayOfByte);; paramArrayOfByte = new c(paramArrayOfByte))
    {
      this.mfe.put(paramString, new WeakReference(paramArrayOfByte));
      localObject = paramArrayOfByte;
      if (!((a)localObject).isRunning()) {
        ((a)localObject).reset();
      }
      GMTrace.o(20144604577792L, 150089);
      return (a)localObject;
    }
  }
  
  public final a zY(String paramString)
  {
    GMTrace.i(20144336142336L, 150087);
    a locala = null;
    if (this.mfe.get(paramString) != null) {
      locala = (a)((WeakReference)this.mfe.get(paramString)).get();
    }
    GMTrace.o(20144336142336L, 150087);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\gif\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */