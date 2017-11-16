package com.tencent.mm.bu;

import android.content.ContentValues;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public final class h
{
  private aj euU;
  private BlockingQueue<a> vDJ;
  public g vDq;
  private String vmw;
  
  public h(g paramg, String paramString)
  {
    GMTrace.i(13559614406656L, 101027);
    this.vmw = null;
    this.euU = new aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(13564714680320L, 101065);
        if (!h.this.vDq.isOpen())
        {
          GMTrace.o(13564714680320L, 101065);
          return false;
        }
        h.this.bVl();
        GMTrace.o(13564714680320L, 101065);
        return false;
      }
    }, false);
    this.vDJ = new LinkedBlockingQueue();
    this.vDq = paramg;
    this.vmw = paramString;
    GMTrace.o(13559614406656L, 101027);
  }
  
  final int a(a parama)
  {
    GMTrace.i(13559882842112L, 101029);
    this.vDJ.add(parama);
    if (this.vDJ.size() >= 40) {
      bVl();
    }
    if (this.euU.bQn()) {
      this.euU.z(60000L, 60000L);
    }
    GMTrace.o(13559882842112L, 101029);
    return 0;
  }
  
  public final int bVl()
  {
    GMTrace.i(13559748624384L, 101028);
    w.d("MicroMsg.MemoryStorage.Holder", "appendAllToDisk table:%s trans:%b queue:%d", new Object[] { this.vmw, Boolean.valueOf(this.vDq.inTransaction()), Integer.valueOf(this.vDJ.size()) });
    if (this.vDJ.isEmpty())
    {
      GMTrace.o(13559748624384L, 101028);
      return 0;
    }
    long l;
    if (!this.vDq.inTransaction()) {
      l = this.vDq.cE(Thread.currentThread().getId());
    }
    for (;;)
    {
      if (!this.vDJ.isEmpty())
      {
        a locala = (a)this.vDJ.poll();
        if (locala == null) {
          w.w("MicroMsg.MemoryStorage.Holder", "appendToDisk Holder == null. table:%s", new Object[] { this.vmw });
        } else if ((this.vDq == null) || (!this.vDq.isOpen())) {
          w.e("MicroMsg.MemoryStorage.Holder", "appendToDisk diskDB already close. table:%s", new Object[] { this.vmw });
        } else if (locala.vkv == 2) {
          this.vDq.insert(this.vmw, locala.vms, locala.values);
        } else if (locala.vkv == 5) {
          this.vDq.delete(this.vmw, locala.vDL, locala.vDM);
        } else if (locala.vkv == 1) {
          this.vDq.eZ(this.vmw, locala.vmu);
        } else if (locala.vkv == 4) {
          this.vDq.replace(this.vmw, locala.vms, locala.values);
        } else if (locala.vkv == 3) {
          this.vDq.update(this.vmw, locala.values, locala.vDL, locala.vDM);
        }
      }
      else
      {
        if (l > 0L) {
          this.vDq.aL(l);
        }
        GMTrace.o(13559748624384L, 101028);
        return 0;
        l = 0L;
      }
    }
  }
  
  public static final class a
  {
    public String vDL;
    public String[] vDM;
    public ContentValues values;
    public int vkv;
    public String vms;
    public String vmu;
    
    public a()
    {
      GMTrace.i(13564983115776L, 101067);
      GMTrace.o(13564983115776L, 101067);
    }
    
    public final void H(String[] paramArrayOfString)
    {
      GMTrace.i(13565117333504L, 101068);
      if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
      {
        GMTrace.o(13565117333504L, 101068);
        return;
      }
      this.vDM = new String[paramArrayOfString.length];
      int i = 0;
      while (i < paramArrayOfString.length)
      {
        this.vDM[i] = new String(paramArrayOfString[i]);
        i += 1;
      }
      GMTrace.o(13565117333504L, 101068);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bu\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */