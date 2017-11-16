package com.tencent.mm.plugin.ipcall.a;

import android.database.Cursor;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.ipcall.a.g.b;
import com.tencent.mm.plugin.ipcall.a.g.d;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class a
{
  private static a miv;
  public long endTime;
  ae handler;
  public boolean jRF;
  public ArrayList<a> miu;
  public long startTime;
  
  static
  {
    GMTrace.i(11588358635520L, 86340);
    miv = null;
    GMTrace.o(11588358635520L, 86340);
  }
  
  private a()
  {
    GMTrace.i(11587284893696L, 86332);
    this.jRF = false;
    this.miu = new ArrayList();
    this.startTime = -1L;
    this.endTime = -1L;
    this.handler = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(11600304013312L, 86429);
        long l1 = System.currentTimeMillis();
        Object localObject1 = i.aIu();
        Object localObject2 = (ArrayList)paramAnonymousMessage.obj;
        if ((localObject2 != null) && (((List)localObject2).size() > 0))
        {
          long l2 = ((d)localObject1).cE(Thread.currentThread().getId());
          w.i("MicroMsg.IPCallAddressStorage", "getContactIdMap start");
          Object localObject3 = ((d)localObject1).fTZ.a("IPCallAddressItem", new String[] { "contactId" }, null, null, null, null, null, 2);
          paramAnonymousMessage = new HashMap();
          if ((localObject3 != null) && (((Cursor)localObject3).moveToFirst())) {
            do
            {
              String str = ((Cursor)localObject3).getString(0);
              if (!paramAnonymousMessage.containsKey(str)) {
                paramAnonymousMessage.put(str, Boolean.valueOf(true));
              }
            } while (((Cursor)localObject3).moveToNext());
          }
          if (localObject3 != null) {
            ((Cursor)localObject3).close();
          }
          w.i("MicroMsg.IPCallAddressStorage", "getContactIdMap end");
          localObject2 = ((List)localObject2).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject3 = (com.tencent.mm.plugin.ipcall.a.g.c)((Iterator)localObject2).next();
            if (!paramAnonymousMessage.containsKey(((com.tencent.mm.plugin.ipcall.a.g.c)localObject3).field_contactId)) {
              ((d)localObject1).b((com.tencent.mm.sdk.e.c)localObject3);
            }
          }
          ((d)localObject1).cF(l2);
        }
        w.d("MicroMsg.IPCallAddressBookLoader", "batchInsert, used %dms", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
        a.this.endTime = System.currentTimeMillis();
        w.d("MicroMsg.IPCallAddressBookLoader", "loadAllAddressItem, used: %dms", new Object[] { Long.valueOf(a.this.endTime - a.this.startTime) });
        a.this.jRF = false;
        a.this.endTime = -1L;
        a.this.startTime = -1L;
        paramAnonymousMessage = a.this.miu.iterator();
        while (paramAnonymousMessage.hasNext())
        {
          localObject1 = (a.a)paramAnonymousMessage.next();
          if (localObject1 != null) {
            ((a.a)localObject1).aEg();
          }
        }
        a.this.miu.clear();
        GMTrace.o(11600304013312L, 86429);
      }
    };
    GMTrace.o(11587284893696L, 86332);
  }
  
  public static a aHY()
  {
    GMTrace.i(11587419111424L, 86333);
    if (miv == null) {
      miv = new a();
    }
    a locala = miv;
    GMTrace.o(11587419111424L, 86333);
    return locala;
  }
  
  public final void a(a parama, boolean paramBoolean)
  {
    GMTrace.i(11587553329152L, 86334);
    if (parama != null) {
      this.miu.add(parama);
    }
    if (this.jRF)
    {
      w.d("MicroMsg.IPCallAddressBookLoader", "loadAllAddressItem, isLoading is true, ignore");
      GMTrace.o(11587553329152L, 86334);
      return;
    }
    this.startTime = System.currentTimeMillis();
    if ((b.aIV().size() == 0) || (!paramBoolean))
    {
      w.d("MicroMsg.IPCallAddressBookLoader", "loadFromSystemAddressBook");
      long l = System.currentTimeMillis();
      new b();
      parama = b.aIU();
      w.d("MicroMsg.IPCallAddressBookLoader", "getAllAddressItemFromSystemPhoneBook, used %dms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      Message localMessage = this.handler.obtainMessage();
      localMessage.obj = parama;
      this.handler.sendMessage(localMessage);
      this.jRF = true;
      GMTrace.o(11587553329152L, 86334);
      return;
    }
    GMTrace.o(11587553329152L, 86334);
  }
  
  public static abstract interface a
  {
    public abstract void aEg();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */