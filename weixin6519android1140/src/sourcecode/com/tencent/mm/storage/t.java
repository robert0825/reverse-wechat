package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.at.b;
import com.tencent.mm.sdk.platformtools.at.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import junit.framework.Assert;

public final class t
  extends m
  implements at.c<Object, Object>
{
  public static final String[] fTX;
  private long gZd;
  private g goN;
  private at<Object, Object> vpv;
  private at<Object, Object> vpw;
  private BlockingQueue<Integer> vpx;
  private BlockingQueue<String> vpy;
  
  static
  {
    GMTrace.i(13541897666560L, 100895);
    fTX = new String[] { "CREATE TABLE IF NOT EXISTS userinfo ( id INTEGER PRIMARY KEY, type INT, value TEXT )", "CREATE TABLE IF NOT EXISTS userinfo2 ( sid TEXT PRIMARY KEY, type INT, value TEXT )" };
    GMTrace.o(13541897666560L, 100895);
  }
  
  public t(g paramg)
  {
    GMTrace.i(13539481747456L, 100877);
    this.vpx = new LinkedBlockingQueue();
    this.vpy = new LinkedBlockingQueue();
    this.goN = paramg;
    this.vpv = new at(this, h.xB().ngv.getLooper(), 100, 20, 60000L, 100L);
    this.vpv.setTag(Integer.valueOf(1));
    this.vpw = new at(this, h.xB().ngv.getLooper(), 100, 20, 60000L, 100L);
    this.vpw.setTag(Integer.valueOf(3));
    GMTrace.o(13539481747456L, 100877);
  }
  
  private static boolean a(String paramString, Object paramObject, boolean paramBoolean)
  {
    GMTrace.i(13540287053824L, 100883);
    if ((paramObject == null) && (paramBoolean))
    {
      GMTrace.o(13540287053824L, 100883);
      return true;
    }
    if ((paramString.equals("INT")) && ((paramObject instanceof Integer)))
    {
      GMTrace.o(13540287053824L, 100883);
      return true;
    }
    if ((paramString.equals("LONG")) && ((paramObject instanceof Long)))
    {
      GMTrace.o(13540287053824L, 100883);
      return true;
    }
    if ((paramString.equals("STRING")) && ((paramObject instanceof String)))
    {
      GMTrace.o(13540287053824L, 100883);
      return true;
    }
    if ((paramString.equals("BOOLEAN")) && ((paramObject instanceof Boolean)))
    {
      GMTrace.o(13540287053824L, 100883);
      return true;
    }
    if ((paramString.equals("FLOAT")) && ((paramObject instanceof Float)))
    {
      GMTrace.o(13540287053824L, 100883);
      return true;
    }
    if ((paramString.equals("DOUBLE")) && ((paramObject instanceof Double)))
    {
      GMTrace.o(13540287053824L, 100883);
      return true;
    }
    if ((paramObject != null) && (b.bPq())) {
      Assert.assertTrue("checkType failed, input type and value[" + paramString + ", " + paramObject + "] are not match", false);
    }
    if (paramBoolean) {
      w.e("MicroMsg.ConfigStorage", "checkType failed, input type and value[%s, %s] are not match", new Object[] { paramString, paramObject });
    }
    GMTrace.o(13540287053824L, 100883);
    return false;
  }
  
  private static int bJ(Object paramObject)
  {
    GMTrace.i(13540421271552L, 100884);
    if ((paramObject instanceof Integer))
    {
      GMTrace.o(13540421271552L, 100884);
      return 1;
    }
    if ((paramObject instanceof Long))
    {
      GMTrace.o(13540421271552L, 100884);
      return 2;
    }
    if ((paramObject instanceof String))
    {
      GMTrace.o(13540421271552L, 100884);
      return 3;
    }
    if ((paramObject instanceof Boolean))
    {
      GMTrace.o(13540421271552L, 100884);
      return 4;
    }
    if ((paramObject instanceof Float))
    {
      GMTrace.o(13540421271552L, 100884);
      return 5;
    }
    if ((paramObject instanceof Double))
    {
      GMTrace.o(13540421271552L, 100884);
      return 6;
    }
    w.e("MicroMsg.ConfigStorage", "unresolve failed, unknown type=" + paramObject.getClass().toString());
    GMTrace.o(13540421271552L, 100884);
    return -1;
  }
  
  private static Object h(int paramInt, String paramString)
  {
    GMTrace.i(13540555489280L, 100885);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(13540555489280L, 100885);
      return null;
      try
      {
        paramString = Integer.valueOf(paramString);
        GMTrace.o(13540555489280L, 100885);
        return paramString;
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.ConfigStorage", "exception:%s", new Object[] { bg.f(paramString) });
      }
      paramString = Long.valueOf(paramString);
      GMTrace.o(13540555489280L, 100885);
      return paramString;
      GMTrace.o(13540555489280L, 100885);
      return paramString;
      paramString = Boolean.valueOf(paramString);
      GMTrace.o(13540555489280L, 100885);
      return paramString;
      paramString = Float.valueOf(paramString);
      GMTrace.o(13540555489280L, 100885);
      return paramString;
      paramString = Double.valueOf(paramString);
      GMTrace.o(13540555489280L, 100885);
      return paramString;
    }
  }
  
  public final long As(int paramInt)
  {
    GMTrace.i(13541763448832L, 100894);
    Long localLong = (Long)get(paramInt, null);
    if (localLong == null)
    {
      GMTrace.o(13541763448832L, 100894);
      return 0L;
    }
    long l = localLong.longValue();
    GMTrace.o(13541763448832L, 100894);
    return l;
  }
  
  protected final boolean Hf()
  {
    GMTrace.i(13540689707008L, 100886);
    if ((this.goN == null) || (this.goN.bRk()))
    {
      if (this.goN == null) {}
      for (Object localObject = "null";; localObject = Boolean.valueOf(this.goN.bRk()))
      {
        w.w("MicroMsg.ConfigStorage", "shouldProcessEvent db is close :%s", new Object[] { localObject });
        GMTrace.o(13540689707008L, 100886);
        return false;
      }
    }
    GMTrace.o(13540689707008L, 100886);
    return true;
  }
  
  public final boolean Mp()
  {
    GMTrace.i(13540823924736L, 100887);
    if (this.goN.inTransaction())
    {
      w.i("MicroMsg.ConfigStorage", "summer preAppend inTransaction return false");
      GMTrace.o(13540823924736L, 100887);
      return false;
    }
    this.gZd = this.goN.cE(Thread.currentThread().getId());
    if (this.gZd <= 0L)
    {
      w.i("MicroMsg.ConfigStorage", "summer preAppend ticket: " + this.gZd + " return false");
      GMTrace.o(13540823924736L, 100887);
      return false;
    }
    GMTrace.o(13540823924736L, 100887);
    return true;
  }
  
  public final void Mq()
  {
    GMTrace.i(13541092360192L, 100889);
    if (this.gZd > 0L) {
      this.goN.aL(this.gZd);
    }
    GMTrace.o(13541092360192L, 100889);
  }
  
  public final void a(at<Object, Object> paramat, at.b<Object, Object> paramb)
  {
    GMTrace.i(13540958142464L, 100888);
    Object localObject1 = paramb.tGT;
    Object localObject2 = paramb.values;
    int i = paramb.vkv;
    switch (((Integer)paramat.getTag()).intValue())
    {
    }
    for (;;)
    {
      GMTrace.o(13540958142464L, 100888);
      return;
      if (i == 1)
      {
        if ((localObject2 != null) && ((localObject2 instanceof a)))
        {
          paramat = (a)localObject2;
          if (paramat.type != -1)
          {
            localObject1 = new ContentValues();
            ((ContentValues)localObject1).put("id", (Integer)paramb.tGT);
            ((ContentValues)localObject1).put("type", Integer.valueOf(paramat.type));
            ((ContentValues)localObject1).put("value", paramat.goY.toString());
            this.goN.replace("userinfo", "id", (ContentValues)localObject1);
          }
          GMTrace.o(13540958142464L, 100888);
        }
      }
      else if (i == 2)
      {
        this.goN.delete("userinfo", "id=" + localObject1, null);
        GMTrace.o(13540958142464L, 100888);
        return;
        if (i == 1)
        {
          if ((localObject2 != null) && ((localObject2 instanceof a)))
          {
            paramat = (a)localObject2;
            if (paramat.type != -1)
            {
              localObject1 = new ContentValues();
              ((ContentValues)localObject1).put("sid", (String)paramb.tGT);
              ((ContentValues)localObject1).put("type", Integer.valueOf(paramat.type));
              ((ContentValues)localObject1).put("value", paramat.goY.toString());
              this.goN.replace("userinfo2", "id", (ContentValues)localObject1);
            }
            GMTrace.o(13540958142464L, 100888);
          }
        }
        else if (i == 2) {
          this.goN.delete("userinfo2", "sid= ?", new String[] { localObject1.toString() });
        }
      }
    }
  }
  
  public final void a(w.a parama, Object paramObject)
  {
    GMTrace.i(13540152836096L, 100882);
    if (parama == null)
    {
      GMTrace.o(13540152836096L, 100882);
      return;
    }
    Object localObject = parama.name();
    if (bg.nm((String)localObject))
    {
      GMTrace.o(13540152836096L, 100882);
      return;
    }
    String[] arrayOfString = ((String)localObject).split("_");
    String str = arrayOfString[(arrayOfString.length - 1)];
    if (str.equals("SYNC")) {
      str = arrayOfString[(arrayOfString.length - 2)];
    }
    for (int i = 1;; i = 0)
    {
      if (!a(str, paramObject, true))
      {
        GMTrace.o(13540152836096L, 100882);
        return;
      }
      int j = ((String)localObject).lastIndexOf(str);
      str = ((String)localObject).substring(0, str.length() + j);
      boolean bool2;
      boolean bool1;
      if (paramObject == null)
      {
        bool2 = this.vpw.s(str, null);
        bool1 = bool2;
        if (bool2)
        {
          bool1 = bool2;
          if (!this.vpy.contains(str))
          {
            this.vpy.add(str);
            bool1 = bool2;
          }
        }
        if (bool1) {
          if (paramObject != null) {
            break label338;
          }
        }
      }
      label338:
      for (j = 5;; j = 4)
      {
        b(j, this, parama);
        if (i != 0) {
          kL(true);
        }
        GMTrace.o(13540152836096L, 100882);
        return;
        localObject = new a();
        ((a)localObject).type = bJ(paramObject);
        if (((a)localObject).type == -1)
        {
          GMTrace.o(13540152836096L, 100882);
          return;
        }
        ((a)localObject).goY = paramObject.toString();
        bool2 = this.vpw.s(str, localObject);
        bool1 = bool2;
        if (!bool2) {
          break;
        }
        bool1 = bool2;
        if (!this.vpy.contains(str)) {
          break;
        }
        this.vpy.remove(str);
        bool1 = bool2;
        break;
      }
    }
  }
  
  public final Object get(int paramInt, Object paramObject)
  {
    GMTrace.i(13539615965184L, 100878);
    if (this.goN != null) {}
    Object localObject2;
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue("db is null", bool);
      localObject2 = this.vpv.get(Integer.valueOf(paramInt));
      if ((localObject2 != null) || (this.vpx.contains(Integer.valueOf(paramInt)))) {
        break;
      }
      localObject1 = new a();
      localObject2 = this.goN.a("userinfo", null, "id=" + paramInt, null, null, null, null, 2);
      if (((Cursor)localObject2).moveToFirst())
      {
        ((a)localObject1).type = ((Cursor)localObject2).getInt(1);
        ((a)localObject1).goY = ((Cursor)localObject2).getString(2);
      }
      ((Cursor)localObject2).close();
      localObject2 = h(((a)localObject1).type, ((a)localObject1).goY);
      this.vpv.s(Integer.valueOf(paramInt), localObject1);
      localObject1 = localObject2;
      if (localObject2 != null) {
        break label254;
      }
      GMTrace.o(13539615965184L, 100878);
      return paramObject;
    }
    Object localObject1 = localObject2;
    if ((localObject2 instanceof a))
    {
      localObject1 = (a)localObject2;
      localObject2 = h(((a)localObject1).type, ((a)localObject1).goY);
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        GMTrace.o(13539615965184L, 100878);
        return paramObject;
      }
    }
    label254:
    GMTrace.o(13539615965184L, 100878);
    return localObject1;
  }
  
  public final Object get(w.a parama, Object paramObject)
  {
    GMTrace.i(13539750182912L, 100879);
    if (parama == null)
    {
      GMTrace.o(13539750182912L, 100879);
      return paramObject;
    }
    parama = parama.name();
    if (bg.nm(parama))
    {
      GMTrace.o(13539750182912L, 100879);
      return paramObject;
    }
    Object localObject = parama.split("_");
    String str = localObject[(localObject.length - 1)];
    if (str.equals("SYNC")) {
      str = localObject[(localObject.length - 2)];
    }
    for (;;)
    {
      parama = parama.substring(0, parama.lastIndexOf(str) + str.length());
      boolean bool;
      if (this.goN != null)
      {
        bool = true;
        Assert.assertTrue("db is null", bool);
        localObject = this.vpw.get(parama);
        if ((localObject != null) || (this.vpy.contains(parama))) {
          break label291;
        }
        a locala = new a();
        localObject = this.goN.a("userinfo2", null, "sid=?", new String[] { parama }, null, null, null, 2);
        if (((Cursor)localObject).moveToFirst())
        {
          locala.type = ((Cursor)localObject).getInt(1);
          locala.goY = ((Cursor)localObject).getString(2);
        }
        ((Cursor)localObject).close();
        localObject = h(locala.type, locala.goY);
        this.vpw.s(parama, locala);
        parama = (w.a)localObject;
        if (localObject == null) {
          parama = (w.a)paramObject;
        }
      }
      for (;;)
      {
        if (a(str, parama, false)) {
          break label334;
        }
        GMTrace.o(13539750182912L, 100879);
        return paramObject;
        bool = false;
        break;
        label291:
        parama = (w.a)localObject;
        if ((localObject instanceof a))
        {
          parama = (a)localObject;
          localObject = h(parama.type, parama.goY);
          parama = (w.a)localObject;
          if (localObject == null) {
            parama = (w.a)paramObject;
          }
        }
      }
      label334:
      GMTrace.o(13539750182912L, 100879);
      return parama;
    }
  }
  
  public final boolean getBoolean(w.a parama, boolean paramBoolean)
  {
    GMTrace.i(13539884400640L, 100880);
    parama = get(parama, Boolean.valueOf(paramBoolean));
    if ((parama != null) && ((parama instanceof Boolean)))
    {
      paramBoolean = ((Boolean)parama).booleanValue();
      GMTrace.o(13539884400640L, 100880);
      return paramBoolean;
    }
    GMTrace.o(13539884400640L, 100880);
    return paramBoolean;
  }
  
  public final int getInt(int paramInt1, int paramInt2)
  {
    GMTrace.i(13541495013376L, 100892);
    Integer localInteger = (Integer)get(paramInt1, null);
    if (localInteger == null)
    {
      GMTrace.o(13541495013376L, 100892);
      return paramInt2;
    }
    paramInt1 = localInteger.intValue();
    GMTrace.o(13541495013376L, 100892);
    return paramInt1;
  }
  
  public final void kL(boolean paramBoolean)
  {
    GMTrace.i(13541226577920L, 100890);
    long l = System.currentTimeMillis();
    this.vpv.kI(paramBoolean);
    this.vpw.kI(paramBoolean);
    w.i("MicroMsg.ConfigStorage", "summer config appendAllToDisk force[%b] end takes[%d]ms ", new Object[] { Boolean.valueOf(paramBoolean), Long.valueOf(System.currentTimeMillis() - l) });
    GMTrace.o(13541226577920L, 100890);
  }
  
  public final void set(int paramInt, Object paramObject)
  {
    GMTrace.i(13540018618368L, 100881);
    boolean bool1;
    boolean bool2;
    if (this.goN != null)
    {
      bool1 = true;
      Assert.assertTrue("db is null", bool1);
      if (paramObject != null) {
        break label129;
      }
      bool2 = this.vpv.s(Integer.valueOf(paramInt), null);
      bool1 = bool2;
      if (bool2)
      {
        bool1 = bool2;
        if (!this.vpx.contains(Integer.valueOf(paramInt)))
        {
          this.vpx.add(Integer.valueOf(paramInt));
          bool1 = bool2;
        }
      }
      label92:
      if (bool1) {
        if (paramObject != null) {
          break label230;
        }
      }
    }
    label129:
    label230:
    for (int i = 5;; i = 4)
    {
      b(i, this, Integer.valueOf(paramInt));
      a locala;
      do
      {
        GMTrace.o(13540018618368L, 100881);
        return;
        bool1 = false;
        break;
        locala = new a();
        locala.type = bJ(paramObject);
      } while (locala.type == -1);
      locala.goY = paramObject.toString();
      bool2 = this.vpv.s(Integer.valueOf(paramInt), locala);
      bool1 = bool2;
      if (!bool2) {
        break label92;
      }
      bool1 = bool2;
      if (!this.vpx.contains(Integer.valueOf(paramInt))) {
        break label92;
      }
      this.vpx.remove(Integer.valueOf(paramInt));
      bool1 = bool2;
      break label92;
    }
  }
  
  public final void setInt(int paramInt1, int paramInt2)
  {
    GMTrace.i(13541360795648L, 100891);
    set(paramInt1, Integer.valueOf(paramInt2));
    GMTrace.o(13541360795648L, 100891);
  }
  
  public final void setLong(int paramInt, long paramLong)
  {
    GMTrace.i(13541629231104L, 100893);
    set(paramInt, Long.valueOf(paramLong));
    GMTrace.o(13541629231104L, 100893);
  }
  
  static final class a
  {
    public String goY;
    public int type;
    
    a()
    {
      GMTrace.i(13542031884288L, 100896);
      this.type = -1;
      this.goY = null;
      GMTrace.o(13542031884288L, 100896);
    }
    
    public final boolean equals(Object paramObject)
    {
      GMTrace.i(13542166102016L, 100897);
      if (paramObject == null)
      {
        GMTrace.o(13542166102016L, 100897);
        return false;
      }
      if (!(paramObject instanceof a))
      {
        GMTrace.o(13542166102016L, 100897);
        return false;
      }
      paramObject = (a)paramObject;
      if (this.type != ((a)paramObject).type)
      {
        GMTrace.o(13542166102016L, 100897);
        return false;
      }
      if (this.goY == null)
      {
        if (((a)paramObject).goY == null)
        {
          GMTrace.o(13542166102016L, 100897);
          return true;
        }
        GMTrace.o(13542166102016L, 100897);
        return false;
      }
      boolean bool = this.goY.equals(((a)paramObject).goY);
      GMTrace.o(13542166102016L, 100897);
      return bool;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */