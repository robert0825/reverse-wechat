package com.tencent.mm.plugin.accountsync.model;

import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.jh;
import com.tencent.mm.modelfriend.a.b;
import com.tencent.mm.modelfriend.aa;
import com.tencent.mm.modelfriend.af;
import com.tencent.mm.modelfriend.b;
import com.tencent.mm.modelfriend.m;
import com.tencent.mm.modelfriend.v;
import com.tencent.mm.modelsimple.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class a
  implements e
{
  public a.b gBZ;
  public boolean gVi;
  public Set<String> htn;
  public com.tencent.mm.sdk.b.c hto;
  public ae htp;
  
  public a()
  {
    GMTrace.i(7835496742912L, 58379);
    this.htn = Collections.synchronizedSet(new HashSet());
    this.gVi = false;
    this.hto = new com.tencent.mm.sdk.b.c() {};
    this.htp = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(7831604428800L, 58350);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(7831604428800L, 58350);
          return;
          a.this.gVi = true;
          boolean bool = com.tencent.mm.modelfriend.a.a(a.this.gBZ);
          if (!bool) {
            a.this.gVi = false;
          }
          w.i("MicroMsg.ContactsAutoSyncLogic ", "sync result %b", new Object[] { Boolean.valueOf(bool) });
        }
      }
    };
    this.gBZ = new a.b()
    {
      public final void bu(boolean paramAnonymousBoolean)
      {
        GMTrace.i(7834825654272L, 58374);
        w.i("MicroMsg.ContactsAutoSyncLogic ", "performSync end, succ:%b", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
        if (!paramAnonymousBoolean)
        {
          GMTrace.o(7834825654272L, 58374);
          return;
        }
        if (m.Hv().size() > 0)
        {
          w.i("MicroMsg.ContactsAutoSyncLogic ", "start to upload mobile list");
          at.wS().a(133, a.this);
          System.currentTimeMillis();
          localObject = new aa(m.Hv(), m.Hu());
          at.wS().a((k)localObject, 0);
          GMTrace.o(7834825654272L, 58374);
          return;
        }
        w.i("MicroMsg.ContactsAutoSyncLogic ", "update mobile friend list");
        Object localObject = (String[])a.this.htn.toArray(new String[0]);
        a.this.htn.clear();
        ArrayList localArrayList = new ArrayList();
        int j = localObject.length;
        int i = 0;
        if (i < j)
        {
          String str = localObject[i];
          b localb = af.If().jJ(str);
          if ((localb != null) && (!bg.nm(localb.Ha())))
          {
            localArrayList.add(localb.Ha());
            w.i("MicroMsg.ContactsAutoSyncLogic ", "find mobile %s username %s", new Object[] { localb.Ha(), str });
          }
          for (;;)
          {
            i += 1;
            break;
            w.i("MicroMsg.ContactsAutoSyncLogic ", "not find mobile username %s", new Object[] { str });
          }
        }
        at.wS().a(32, a.this);
        if (localArrayList.size() == 0)
        {
          w.i("MicroMsg.ContactsAutoSyncLogic ", "sync mobile list is zero");
          localObject = new v();
          at.wS().a((k)localObject, 0);
          GMTrace.o(7834825654272L, 58374);
          return;
        }
        w.i("MicroMsg.ContactsAutoSyncLogic ", "sync mobile list is %d", new Object[] { Integer.valueOf(localArrayList.size()) });
        localObject = new v(localArrayList, null);
        at.wS().a((k)localObject, 0);
        GMTrace.o(7834825654272L, 58374);
      }
    };
    com.tencent.mm.sdk.b.a.vgX.b(this.hto);
    GMTrace.o(7835496742912L, 58379);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7835630960640L, 58380);
    if (paramk.getType() == 133)
    {
      at.wS().b(133, this);
      if ((paramInt1 == 0) && (paramInt2 == 0)) {
        break label143;
      }
      w.e("MicroMsg.ContactsAutoSyncLogic ", "MMFunc_UploadMContact onSceneEnd: errType = " + paramInt1 + ", errCode = " + paramInt2);
      this.gVi = false;
    }
    while (paramk.getType() == 32)
    {
      this.gVi = false;
      at.wS().b(32, this);
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        w.e("MicroMsg.ContactsAutoSyncLogic ", "rtGETMFRIEND onSceneEnd: errType = " + paramInt1 + ", errCode = " + paramInt2);
        GMTrace.o(7835630960640L, 58380);
        return;
        label143:
        at.wS().a(32, this);
        paramString = (aa)paramk;
        paramString = new v(paramString.gDI, paramString.gDJ);
        at.wS().a(paramString, 0);
      }
      else
      {
        w.i("MicroMsg.ContactsAutoSyncLogic ", "update All Contact");
        d.bm(ab.getContext());
      }
    }
    GMTrace.o(7835630960640L, 58380);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\accountsync\model\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */